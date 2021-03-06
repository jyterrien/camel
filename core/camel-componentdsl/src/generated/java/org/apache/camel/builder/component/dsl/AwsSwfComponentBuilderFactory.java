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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.swf.SWFComponent;

/**
 * Manage workflows in the AWS Simple Workflow service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsSwfComponentBuilderFactory {

    /**
     * AWS Simple Workflow (SWF) (camel-aws-swf)
     * Manage workflows in the AWS Simple Workflow service.
     * 
     * Category: cloud,workflow
     * Since: 2.13
     * Maven coordinates: org.apache.camel:camel-aws-swf
     */
    static AwsSwfComponentBuilder awsSwf() {
        return new AwsSwfComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Workflow (SWF) component.
     */
    interface AwsSwfComponentBuilder extends ComponentBuilder<SWFComponent> {
        /**
         * To use the given AmazonSimpleWorkflowClient as client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow</code> type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder amazonSWClient(
                com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow amazonSWClient) {
            doSetProperty("amazonSWClient", amazonSWClient);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.swf.SWFConfiguration</code>
         * type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder configuration(
                org.apache.camel.component.aws.swf.SWFConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * An instance of
         * com.amazonaws.services.simpleworkflow.flow.DataConverter to use for
         * serializing/deserializing the data.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.flow.DataConverter</code>
         * type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder dataConverter(
                com.amazonaws.services.simpleworkflow.flow.DataConverter dataConverter) {
            doSetProperty("dataConverter", dataConverter);
            return this;
        }
        /**
         * The workflow domain to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder domainName(java.lang.String domainName) {
            doSetProperty("domainName", domainName);
            return this;
        }
        /**
         * The workflow or activity event name to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder eventName(java.lang.String eventName) {
            doSetProperty("eventName", eventName);
            return this;
        }
        /**
         * Amazon AWS Region. When using this parameter, the configuration will
         * expect the capitalized name of the region (for example AP_EAST_1)
         * You'll need to use the name Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * The workflow or activity event version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSwfComponentBuilder version(java.lang.String version) {
            doSetProperty("version", version);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AwsSwfComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsSwfComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The list name to consume activities from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: activity
         */
        default AwsSwfComponentBuilder activityList(
                java.lang.String activityList) {
            doSetProperty("activityList", activityList);
            return this;
        }
        /**
         * Activity scheduling options.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions</code> type.
         * 
         * Group: activity
         */
        default AwsSwfComponentBuilder activitySchedulingOptions(
                com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions activitySchedulingOptions) {
            doSetProperty("activitySchedulingOptions", activitySchedulingOptions);
            return this;
        }
        /**
         * Maximum number of threads in work pool for activity.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 100
         * Group: activity
         */
        default AwsSwfComponentBuilder activityThreadPoolSize(
                int activityThreadPoolSize) {
            doSetProperty("activityThreadPoolSize", activityThreadPoolSize);
            return this;
        }
        /**
         * Activity execution options.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions</code> type.
         * 
         * Group: activity
         */
        default AwsSwfComponentBuilder activityTypeExecutionOptions(
                com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions activityTypeExecutionOptions) {
            doSetProperty("activityTypeExecutionOptions", activityTypeExecutionOptions);
            return this;
        }
        /**
         * Activity registration options.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions</code> type.
         * 
         * Group: activity
         */
        default AwsSwfComponentBuilder activityTypeRegistrationOptions(
                com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions activityTypeRegistrationOptions) {
            doSetProperty("activityTypeRegistrationOptions", activityTypeRegistrationOptions);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsSwfComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To configure the ClientConfiguration using the key/values from the
         * Map.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default AwsSwfComponentBuilder clientConfigurationParameters(
                java.util.Map<java.lang.String, java.lang.Object> clientConfigurationParameters) {
            doSetProperty("clientConfigurationParameters", clientConfigurationParameters);
            return this;
        }
        /**
         * To configure the StartWorkflowOptions using the key/values from the
         * Map.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default AwsSwfComponentBuilder startWorkflowOptionsParameters(
                java.util.Map<java.lang.String, java.lang.Object> startWorkflowOptionsParameters) {
            doSetProperty("startWorkflowOptionsParameters", startWorkflowOptionsParameters);
            return this;
        }
        /**
         * To configure the AmazonSimpleWorkflowClient using the key/values from
         * the Map.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default AwsSwfComponentBuilder sWClientParameters(
                java.util.Map<java.lang.String, java.lang.Object> sWClientParameters) {
            doSetProperty("sWClientParameters", sWClientParameters);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsSwfComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsSwfComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * The policy to use on child workflows when terminating a workflow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder childPolicy(java.lang.String childPolicy) {
            doSetProperty("childPolicy", childPolicy);
            return this;
        }
        /**
         * Set the execution start to close timeout.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: 3600
         * Group: workflow
         */
        default AwsSwfComponentBuilder executionStartToCloseTimeout(
                java.lang.String executionStartToCloseTimeout) {
            doSetProperty("executionStartToCloseTimeout", executionStartToCloseTimeout);
            return this;
        }
        /**
         * Workflow operation.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: START
         * Group: workflow
         */
        default AwsSwfComponentBuilder operation(java.lang.String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The name of the signal to send to the workflow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder signalName(java.lang.String signalName) {
            doSetProperty("signalName", signalName);
            return this;
        }
        /**
         * The type of the result when a workflow state is queried.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder stateResultType(
                java.lang.String stateResultType) {
            doSetProperty("stateResultType", stateResultType);
            return this;
        }
        /**
         * Set the task start to close timeout.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: 600
         * Group: workflow
         */
        default AwsSwfComponentBuilder taskStartToCloseTimeout(
                java.lang.String taskStartToCloseTimeout) {
            doSetProperty("taskStartToCloseTimeout", taskStartToCloseTimeout);
            return this;
        }
        /**
         * Details for terminating a workflow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder terminationDetails(
                java.lang.String terminationDetails) {
            doSetProperty("terminationDetails", terminationDetails);
            return this;
        }
        /**
         * The reason for terminating a workflow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder terminationReason(
                java.lang.String terminationReason) {
            doSetProperty("terminationReason", terminationReason);
            return this;
        }
        /**
         * The list name to consume workflows from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder workflowList(
                java.lang.String workflowList) {
            doSetProperty("workflowList", workflowList);
            return this;
        }
        /**
         * Workflow registration options.
         * 
         * The option is a:
         * <code>com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions</code> type.
         * 
         * Group: workflow
         */
        default AwsSwfComponentBuilder workflowTypeRegistrationOptions(
                com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions workflowTypeRegistrationOptions) {
            doSetProperty("workflowTypeRegistrationOptions", workflowTypeRegistrationOptions);
            return this;
        }
    }

    class AwsSwfComponentBuilderImpl
            extends
                AbstractComponentBuilder<SWFComponent>
            implements
                AwsSwfComponentBuilder {
        @Override
        protected SWFComponent buildConcreteComponent() {
            return new SWFComponent();
        }
        private org.apache.camel.component.aws.swf.SWFConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.swf.SWFComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.swf.SWFConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonSWClient": getOrCreateConfiguration((SWFComponent) component).setAmazonSWClient((com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow) value); return true;
            case "configuration": ((SWFComponent) component).setConfiguration((org.apache.camel.component.aws.swf.SWFConfiguration) value); return true;
            case "dataConverter": getOrCreateConfiguration((SWFComponent) component).setDataConverter((com.amazonaws.services.simpleworkflow.flow.DataConverter) value); return true;
            case "domainName": getOrCreateConfiguration((SWFComponent) component).setDomainName((java.lang.String) value); return true;
            case "eventName": getOrCreateConfiguration((SWFComponent) component).setEventName((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((SWFComponent) component).setRegion((java.lang.String) value); return true;
            case "version": getOrCreateConfiguration((SWFComponent) component).setVersion((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((SWFComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((SWFComponent) component).setLazyStartProducer((boolean) value); return true;
            case "activityList": getOrCreateConfiguration((SWFComponent) component).setActivityList((java.lang.String) value); return true;
            case "activitySchedulingOptions": getOrCreateConfiguration((SWFComponent) component).setActivitySchedulingOptions((com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions) value); return true;
            case "activityThreadPoolSize": getOrCreateConfiguration((SWFComponent) component).setActivityThreadPoolSize((int) value); return true;
            case "activityTypeExecutionOptions": getOrCreateConfiguration((SWFComponent) component).setActivityTypeExecutionOptions((com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions) value); return true;
            case "activityTypeRegistrationOptions": getOrCreateConfiguration((SWFComponent) component).setActivityTypeRegistrationOptions((com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions) value); return true;
            case "basicPropertyBinding": ((SWFComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "clientConfigurationParameters": getOrCreateConfiguration((SWFComponent) component).setClientConfigurationParameters((java.util.Map) value); return true;
            case "startWorkflowOptionsParameters": getOrCreateConfiguration((SWFComponent) component).setStartWorkflowOptionsParameters((java.util.Map) value); return true;
            case "sWClientParameters": getOrCreateConfiguration((SWFComponent) component).setSWClientParameters((java.util.Map) value); return true;
            case "accessKey": getOrCreateConfiguration((SWFComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((SWFComponent) component).setSecretKey((java.lang.String) value); return true;
            case "childPolicy": getOrCreateConfiguration((SWFComponent) component).setChildPolicy((java.lang.String) value); return true;
            case "executionStartToCloseTimeout": getOrCreateConfiguration((SWFComponent) component).setExecutionStartToCloseTimeout((java.lang.String) value); return true;
            case "operation": getOrCreateConfiguration((SWFComponent) component).setOperation((java.lang.String) value); return true;
            case "signalName": getOrCreateConfiguration((SWFComponent) component).setSignalName((java.lang.String) value); return true;
            case "stateResultType": getOrCreateConfiguration((SWFComponent) component).setStateResultType((java.lang.String) value); return true;
            case "taskStartToCloseTimeout": getOrCreateConfiguration((SWFComponent) component).setTaskStartToCloseTimeout((java.lang.String) value); return true;
            case "terminationDetails": getOrCreateConfiguration((SWFComponent) component).setTerminationDetails((java.lang.String) value); return true;
            case "terminationReason": getOrCreateConfiguration((SWFComponent) component).setTerminationReason((java.lang.String) value); return true;
            case "workflowList": getOrCreateConfiguration((SWFComponent) component).setWorkflowList((java.lang.String) value); return true;
            case "workflowTypeRegistrationOptions": getOrCreateConfiguration((SWFComponent) component).setWorkflowTypeRegistrationOptions((com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions) value); return true;
            default: return false;
            }
        }
    }
}