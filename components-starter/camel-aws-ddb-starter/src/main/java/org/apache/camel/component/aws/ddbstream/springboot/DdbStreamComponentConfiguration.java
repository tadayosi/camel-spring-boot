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
package org.apache.camel.component.aws.ddbstream.springboot;

import javax.annotation.Generated;
import com.amazonaws.Protocol;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams;
import com.amazonaws.services.dynamodbv2.model.ShardIteratorType;
import org.apache.camel.component.aws.ddbstream.SequenceNumberProvider;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-ddbstream component is used for working with Amazon DynamoDB Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-ddbstream")
public class DdbStreamComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-ddbstream component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS DDB stream default configuration
     */
    private DdbStreamConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Amazon AWS Region
     */
    private String region;
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

    public DdbStreamConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            DdbStreamConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public static class DdbStreamConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration.class;
        /**
         * The region in which DDBStreams client needs to work
         */
        private String region;
        /**
         * To define a proxy port when instantiating the DDBStreams client
         */
        private Integer proxyPort;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * To define a proxy host when instantiating the DDBStreams client
         */
        private String proxyHost;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * To define a proxy protocol when instantiating the DDBStreams client
         */
        private Protocol proxyProtocol = Protocol.HTTPS;
        /**
         * Amazon DynamoDB client to use for all requests for this endpoint
         */
        private AmazonDynamoDBStreams amazonDynamoDbStreamsClient;
        /**
         * Maximum number of records that will be fetched in each poll
         */
        private Integer maxResultsPerRequest;
        /**
         * Name of the dynamodb table
         */
        private String tableName;
        /**
         * Defines where in the DynaboDB stream to start getting records. Note
         * that using TRIM_HORIZON can cause a significant delay before the
         * stream has caught up to real-time. if {AT,AFTER}_SEQUENCE_NUMBER are
         * used, then a sequenceNumberProvider MUST be supplied.
         */
        private ShardIteratorType iteratorType = ShardIteratorType.LATEST;
        /**
         * Provider for the sequence number when using one of the two
         * ShardIteratorType.{AT,AFTER}_SEQUENCE_NUMBER iterator types. Can be a
         * registry reference or a literal sequence number.
         */
        private SequenceNumberProvider sequenceNumberProvider;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public Protocol getProxyProtocol() {
            return proxyProtocol;
        }

        public void setProxyProtocol(Protocol proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
        }

        public AmazonDynamoDBStreams getAmazonDynamoDbStreamsClient() {
            return amazonDynamoDbStreamsClient;
        }

        public void setAmazonDynamoDbStreamsClient(
                AmazonDynamoDBStreams amazonDynamoDbStreamsClient) {
            this.amazonDynamoDbStreamsClient = amazonDynamoDbStreamsClient;
        }

        public Integer getMaxResultsPerRequest() {
            return maxResultsPerRequest;
        }

        public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
            this.maxResultsPerRequest = maxResultsPerRequest;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public ShardIteratorType getIteratorType() {
            return iteratorType;
        }

        public void setIteratorType(ShardIteratorType iteratorType) {
            this.iteratorType = iteratorType;
        }

        public SequenceNumberProvider getSequenceNumberProvider() {
            return sequenceNumberProvider;
        }

        public void setSequenceNumberProvider(
                SequenceNumberProvider sequenceNumberProvider) {
            this.sequenceNumberProvider = sequenceNumberProvider;
        }
    }
}