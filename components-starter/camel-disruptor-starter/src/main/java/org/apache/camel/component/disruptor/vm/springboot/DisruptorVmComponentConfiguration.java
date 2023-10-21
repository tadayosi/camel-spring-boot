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
package org.apache.camel.component.disruptor.vm.springboot;

import org.apache.camel.component.disruptor.DisruptorProducerType;
import org.apache.camel.component.disruptor.DisruptorWaitStrategy;
import org.apache.camel.component.disruptor.vm.DisruptorVmComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Provides asynchronous SEDA behavior using LMAX Disruptor.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.disruptor-vm")
public class DisruptorVmComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the disruptor-vm component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * To configure the ring buffer size
     */
    private Integer bufferSize = 1024;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * To configure the default number of concurrent consumers
     */
    private Integer defaultConcurrentConsumers = 1;
    /**
     * To configure the default value for multiple consumers
     */
    private Boolean defaultMultipleConsumers = false;
    /**
     * To configure the default value for DisruptorWaitStrategy The default
     * value is Blocking.
     */
    private DisruptorWaitStrategy defaultWaitStrategy = DisruptorWaitStrategy.Blocking;
    /**
     * To configure the default value for block when full The default value is
     * true.
     */
    private Boolean defaultBlockWhenFull = true;
    /**
     * To configure the default value for DisruptorProducerType The default
     * value is Multi.
     */
    private DisruptorProducerType defaultProducerType = DisruptorProducerType.Multi;
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
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Integer getDefaultConcurrentConsumers() {
        return defaultConcurrentConsumers;
    }

    public void setDefaultConcurrentConsumers(Integer defaultConcurrentConsumers) {
        this.defaultConcurrentConsumers = defaultConcurrentConsumers;
    }

    public Boolean getDefaultMultipleConsumers() {
        return defaultMultipleConsumers;
    }

    public void setDefaultMultipleConsumers(Boolean defaultMultipleConsumers) {
        this.defaultMultipleConsumers = defaultMultipleConsumers;
    }

    public DisruptorWaitStrategy getDefaultWaitStrategy() {
        return defaultWaitStrategy;
    }

    public void setDefaultWaitStrategy(DisruptorWaitStrategy defaultWaitStrategy) {
        this.defaultWaitStrategy = defaultWaitStrategy;
    }

    public Boolean getDefaultBlockWhenFull() {
        return defaultBlockWhenFull;
    }

    public void setDefaultBlockWhenFull(Boolean defaultBlockWhenFull) {
        this.defaultBlockWhenFull = defaultBlockWhenFull;
    }

    public DisruptorProducerType getDefaultProducerType() {
        return defaultProducerType;
    }

    public void setDefaultProducerType(DisruptorProducerType defaultProducerType) {
        this.defaultProducerType = defaultProducerType;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }
}