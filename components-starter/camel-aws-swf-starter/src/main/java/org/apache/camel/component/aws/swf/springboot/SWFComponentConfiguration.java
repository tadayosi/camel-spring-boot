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
package org.apache.camel.component.aws.swf.springboot;

import java.util.Map;
import javax.annotation.Generated;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions;
import com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-swf component is used for managing workflows from Amazon Simple
 * Workflow.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-swf")
public class SWFComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-swf component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS SWF default configuration
     */
    private SWFConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key.
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key.
     */
    private String secretKey;
    /**
     * Amazon AWS Region.
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

    public SWFConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SWFConfigurationNestedConfiguration configuration) {
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

    public static class SWFConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.swf.SWFConfiguration.class;
        /**
         * Activity or workflow
         */
        private String type;
        /**
         * The workflow or activity event version to use.
         */
        private String version;
        /**
         * Amazon AWS Region. When using this parameter, the configuration will
         * expect the capitalized name of the region (for example AP_EAST_1)
         * You'll need to use the name Regions.EU_WEST_1.name()
         */
        private String region;
        /**
         * Maximum number of threads in work pool for activity.
         */
        private Integer activityThreadPoolSize = 100;
        /**
         * The name of the signal to send to the workflow.
         */
        private String signalName;
        /**
         * To use the given AmazonSimpleWorkflowClient as client
         */
        private AmazonSimpleWorkflow amazonSWClient;
        /**
         * To configure the StartWorkflowOptions using the key/values from the
         * Map.
         */
        private Map startWorkflowOptionsParameters;
        /**
         * The list name to consume activities from.
         */
        private String activityList;
        /**
         * The list name to consume workflows from.
         */
        private String workflowList;
        /**
         * An instance of
         * com.amazonaws.services.simpleworkflow.flow.DataConverter to use for
         * serializing/deserializing the data.
         */
        private DataConverter dataConverter;
        /**
         * To configure the ClientConfiguration using the key/values from the
         * Map.
         */
        private Map clientConfigurationParameters;
        /**
         * The reason for terminating a workflow.
         */
        private String terminationReason;
        /**
         * Details for terminating a workflow.
         */
        private String terminationDetails;
        /**
         * To configure the AmazonSimpleWorkflowClient using the key/values from
         * the Map.
         */
        private Map sWClientParameters;
        /**
         * Workflow registration options
         */
        private WorkflowTypeRegistrationOptions workflowTypeRegistrationOptions;
        /**
         * Activity execution options
         */
        private ActivityTypeExecutionOptions activityTypeExecutionOptions;
        /**
         * Set the execution start to close timeout.
         */
        private String executionStartToCloseTimeout = "3600";
        /**
         * Set the task start to close timeout.
         */
        private String taskStartToCloseTimeout = "600";
        /**
         * Amazon AWS Secret Key.
         */
        private String secretKey;
        /**
         * Workflow operation
         */
        private String operation = "START";
        /**
         * The workflow or activity event name to use.
         */
        private String eventName;
        /**
         * Activity scheduling options
         */
        private ActivitySchedulingOptions activitySchedulingOptions;
        /**
         * The type of the result when a workflow state is queried.
         */
        private String stateResultType;
        /**
         * The policy to use on child workflows when terminating a workflow.
         */
        private String childPolicy;
        /**
         * Activity registration options
         */
        private ActivityTypeRegistrationOptions activityTypeRegistrationOptions;
        /**
         * Amazon AWS Access Key.
         */
        private String accessKey;
        /**
         * The workflow domain to use.
         */
        private String domainName;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getActivityThreadPoolSize() {
            return activityThreadPoolSize;
        }

        public void setActivityThreadPoolSize(Integer activityThreadPoolSize) {
            this.activityThreadPoolSize = activityThreadPoolSize;
        }

        public String getSignalName() {
            return signalName;
        }

        public void setSignalName(String signalName) {
            this.signalName = signalName;
        }

        public AmazonSimpleWorkflow getAmazonSWClient() {
            return amazonSWClient;
        }

        public void setAmazonSWClient(AmazonSimpleWorkflow amazonSWClient) {
            this.amazonSWClient = amazonSWClient;
        }

        public Map getStartWorkflowOptionsParameters() {
            return startWorkflowOptionsParameters;
        }

        public void setStartWorkflowOptionsParameters(
                Map startWorkflowOptionsParameters) {
            this.startWorkflowOptionsParameters = startWorkflowOptionsParameters;
        }

        public String getActivityList() {
            return activityList;
        }

        public void setActivityList(String activityList) {
            this.activityList = activityList;
        }

        public String getWorkflowList() {
            return workflowList;
        }

        public void setWorkflowList(String workflowList) {
            this.workflowList = workflowList;
        }

        public DataConverter getDataConverter() {
            return dataConverter;
        }

        public void setDataConverter(DataConverter dataConverter) {
            this.dataConverter = dataConverter;
        }

        public Map getClientConfigurationParameters() {
            return clientConfigurationParameters;
        }

        public void setClientConfigurationParameters(
                Map clientConfigurationParameters) {
            this.clientConfigurationParameters = clientConfigurationParameters;
        }

        public String getTerminationReason() {
            return terminationReason;
        }

        public void setTerminationReason(String terminationReason) {
            this.terminationReason = terminationReason;
        }

        public String getTerminationDetails() {
            return terminationDetails;
        }

        public void setTerminationDetails(String terminationDetails) {
            this.terminationDetails = terminationDetails;
        }

        public Map getSWClientParameters() {
            return sWClientParameters;
        }

        public void setSWClientParameters(Map sWClientParameters) {
            this.sWClientParameters = sWClientParameters;
        }

        public WorkflowTypeRegistrationOptions getWorkflowTypeRegistrationOptions() {
            return workflowTypeRegistrationOptions;
        }

        public void setWorkflowTypeRegistrationOptions(
                WorkflowTypeRegistrationOptions workflowTypeRegistrationOptions) {
            this.workflowTypeRegistrationOptions = workflowTypeRegistrationOptions;
        }

        public ActivityTypeExecutionOptions getActivityTypeExecutionOptions() {
            return activityTypeExecutionOptions;
        }

        public void setActivityTypeExecutionOptions(
                ActivityTypeExecutionOptions activityTypeExecutionOptions) {
            this.activityTypeExecutionOptions = activityTypeExecutionOptions;
        }

        public String getExecutionStartToCloseTimeout() {
            return executionStartToCloseTimeout;
        }

        public void setExecutionStartToCloseTimeout(
                String executionStartToCloseTimeout) {
            this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        }

        public String getTaskStartToCloseTimeout() {
            return taskStartToCloseTimeout;
        }

        public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
            this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public ActivitySchedulingOptions getActivitySchedulingOptions() {
            return activitySchedulingOptions;
        }

        public void setActivitySchedulingOptions(
                ActivitySchedulingOptions activitySchedulingOptions) {
            this.activitySchedulingOptions = activitySchedulingOptions;
        }

        public String getStateResultType() {
            return stateResultType;
        }

        public void setStateResultType(String stateResultType) {
            this.stateResultType = stateResultType;
        }

        public String getChildPolicy() {
            return childPolicy;
        }

        public void setChildPolicy(String childPolicy) {
            this.childPolicy = childPolicy;
        }

        public ActivityTypeRegistrationOptions getActivityTypeRegistrationOptions() {
            return activityTypeRegistrationOptions;
        }

        public void setActivityTypeRegistrationOptions(
                ActivityTypeRegistrationOptions activityTypeRegistrationOptions) {
            this.activityTypeRegistrationOptions = activityTypeRegistrationOptions;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getDomainName() {
            return domainName;
        }

        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }
    }
}