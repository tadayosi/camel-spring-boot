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
package org.apache.camel.component.jooq.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.jooq.JooqOperation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.jooq.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The jooq component enables you to store and retrieve entities from databases
 * using JOOQ
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.jooq")
public class JooqComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the jooq component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Component configuration (database connection, database entity type, etc.)
     */
    private JooqConfigurationNestedConfiguration configuration;
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

    public JooqConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            JooqConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
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

    public static class JooqConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.jooq.JooqConfiguration.class;
        /**
         * To execute plain SQL query
         */
        private String query;
        /**
         * JOOQ entity class
         */
        private Class entityType;
        private Configuration databaseConfiguration;
        /**
         * Delete entity after it is consumed
         */
        private Boolean consumeDelete = true;
        /**
         * Type of operation to execute on query
         */
        private JooqOperation operation = JooqOperation.NONE;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public Class getEntityType() {
            return entityType;
        }

        public void setEntityType(Class entityType) {
            this.entityType = entityType;
        }

        public Configuration getDatabaseConfiguration() {
            return databaseConfiguration;
        }

        public void setDatabaseConfiguration(Configuration databaseConfiguration) {
            this.databaseConfiguration = databaseConfiguration;
        }

        public Boolean getConsumeDelete() {
            return consumeDelete;
        }

        public void setConsumeDelete(Boolean consumeDelete) {
            this.consumeDelete = consumeDelete;
        }

        public JooqOperation getOperation() {
            return operation;
        }

        public void setOperation(JooqOperation operation) {
            this.operation = operation;
        }
    }
}