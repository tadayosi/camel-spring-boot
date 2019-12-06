/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sjms.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The sjms component (simple jms) allows messages to be sent to (or consumed
 * from) a JMS Queue or Topic (uses JMS 1.x API).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.sjms")
public class SjmsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the sjms component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * A ConnectionFactory is required to enable the SjmsComponent. It can be
     * set directly or set set as part of a ConnectionResource. The option is a
     * javax.jms.ConnectionFactory type.
     */
    private String connectionFactory;
    /**
     * A ConnectionResource is an interface that allows for customization and
     * container control of the ConnectionFactory. See Plugable Connection
     * Resource Management for further details. The option is a
     * org.apache.camel.component.sjms.jms.ConnectionResource type.
     */
    private String connectionResource;
    /**
     * The maximum number of connections available to endpoints started under
     * this component
     */
    private Integer connectionCount = 1;
    /**
     * Pluggable strategy for encoding and decoding JMS keys so they can be
     * compliant with the JMS specification. Camel provides one implementation
     * out of the box: default. The default strategy will safely marshal dots
     * and hyphens (. and -). Can be used for JMS brokers which do not care
     * whether JMS header keys contain illegal characters. You can provide your
     * own implementation of the
     * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using
     * the # notation. The option is a
     * org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy type.
     */
    private String jmsKeyFormatStrategy;
    /**
     * To configure which kind of commit strategy to use. Camel provides two
     * implementations out of the box, default and batch. The option is a
     * org.apache.camel.component.sjms.TransactionCommitStrategy type.
     */
    private String transactionCommitStrategy;
    /**
     * To use a custom DestinationCreationStrategy. The option is a
     * org.apache.camel.component.sjms.jms.DestinationCreationStrategy type.
     */
    private String destinationCreationStrategy;
    /**
     * To use a custom TimedTaskManager. The option is a
     * org.apache.camel.component.sjms.taskmanager.TimedTaskManager type.
     */
    private String timedTaskManager;
    /**
     * To use the given MessageCreatedStrategy which are invoked when Camel
     * creates new instances of javax.jms.Message objects when Camel is sending
     * a JMS message. The option is a
     * org.apache.camel.component.sjms.jms.MessageCreatedStrategy type.
     */
    private String messageCreatedStrategy;
    /**
     * When using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource then should
     * each javax.jms.Connection be tested (calling start) before returned from
     * the pool.
     */
    private Boolean connectionTestOnBorrow = true;
    /**
     * The username to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionUsername;
    /**
     * The password to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionPassword;
    /**
     * The client ID to use when creating javax.jms.Connection when using the
     * default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private String connectionClientId;
    /**
     * The max wait time in millis to block and wait on free connection when the
     * pool is exhausted when using the default
     * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
     */
    private Long connectionMaxWait = 5000L;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private String headerFilterStrategy;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public String getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(String connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public String getConnectionResource() {
        return connectionResource;
    }

    public void setConnectionResource(String connectionResource) {
        this.connectionResource = connectionResource;
    }

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public String getJmsKeyFormatStrategy() {
        return jmsKeyFormatStrategy;
    }

    public void setJmsKeyFormatStrategy(String jmsKeyFormatStrategy) {
        this.jmsKeyFormatStrategy = jmsKeyFormatStrategy;
    }

    public String getTransactionCommitStrategy() {
        return transactionCommitStrategy;
    }

    public void setTransactionCommitStrategy(String transactionCommitStrategy) {
        this.transactionCommitStrategy = transactionCommitStrategy;
    }

    public String getDestinationCreationStrategy() {
        return destinationCreationStrategy;
    }

    public void setDestinationCreationStrategy(
            String destinationCreationStrategy) {
        this.destinationCreationStrategy = destinationCreationStrategy;
    }

    public String getTimedTaskManager() {
        return timedTaskManager;
    }

    public void setTimedTaskManager(String timedTaskManager) {
        this.timedTaskManager = timedTaskManager;
    }

    public String getMessageCreatedStrategy() {
        return messageCreatedStrategy;
    }

    public void setMessageCreatedStrategy(String messageCreatedStrategy) {
        this.messageCreatedStrategy = messageCreatedStrategy;
    }

    public Boolean getConnectionTestOnBorrow() {
        return connectionTestOnBorrow;
    }

    public void setConnectionTestOnBorrow(Boolean connectionTestOnBorrow) {
        this.connectionTestOnBorrow = connectionTestOnBorrow;
    }

    public String getConnectionUsername() {
        return connectionUsername;
    }

    public void setConnectionUsername(String connectionUsername) {
        this.connectionUsername = connectionUsername;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }

    public String getConnectionClientId() {
        return connectionClientId;
    }

    public void setConnectionClientId(String connectionClientId) {
        this.connectionClientId = connectionClientId;
    }

    public Long getConnectionMaxWait() {
        return connectionMaxWait;
    }

    public void setConnectionMaxWait(Long connectionMaxWait) {
        this.connectionMaxWait = connectionMaxWait;
    }

    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(String headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }
}