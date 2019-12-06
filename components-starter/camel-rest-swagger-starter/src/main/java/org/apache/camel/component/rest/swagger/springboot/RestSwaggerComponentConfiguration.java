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
package org.apache.camel.component.rest.swagger.springboot;

import java.net.URI;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * An awesome REST endpoint backed by Swagger specifications.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.rest-swagger")
public class RestSwaggerComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the rest-swagger component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * API basePath, for example /v2. Default is unset, if set overrides the
     * value present in Swagger specification.
     */
    private String basePath;
    /**
     * Name of the Camel component that will perform the requests. The component
     * must be present in Camel registry and it must implement
     * RestProducerFactory service provider interface. If not set CLASSPATH is
     * searched for single component that implements RestProducerFactory SPI.
     * Can be overridden in endpoint configuration.
     */
    private String componentName;
    /**
     * What payload type this component capable of consuming. Could be one type,
     * like application/json or multiple types as application/json,
     * application/xml; q=0.5 according to the RFC7231. This equates to the
     * value of Accept HTTP header. If set overrides any value found in the
     * Swagger specification. Can be overridden in endpoint configuration
     */
    private String consumes;
    /**
     * Scheme hostname and port to direct the HTTP requests to in the form of
     * https://hostname:port. Can be configured at the endpoint, component or in
     * the corresponding REST configuration in the Camel Context. If you give
     * this component a name (e.g. petstore) that REST configuration is
     * consulted first, rest-swagger next, and global configuration last. If set
     * overrides any value found in the Swagger specification,
     * RestConfiguration. Can be overridden in endpoint configuration.
     */
    private String host;
    /**
     * What payload type this component is producing. For example
     * application/json according to the RFC7231. This equates to the value of
     * Content-Type HTTP header. If set overrides any value present in the
     * Swagger specification. Can be overridden in endpoint configuration.
     */
    private String produces;
    /**
     * Path to the Swagger specification file. The scheme, host base path are
     * taken from this specification, but these can be overridden with
     * properties on the component or endpoint level. If not given the component
     * tries to load swagger.json resource. Note that the host defined on the
     * component and endpoint of this Component should contain the scheme,
     * hostname and optionally the port in the URI syntax (i.e.
     * https://api.example.com:8080). Can be overridden in endpoint
     * configuration.
     */
    private URI specificationUri;
    /**
     * Customize TLS parameters used by the component. If not set defaults to
     * the TLS parameters set in the Camel context. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
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

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getConsumes() {
        return consumes;
    }

    public void setConsumes(String consumes) {
        this.consumes = consumes;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProduces() {
        return produces;
    }

    public void setProduces(String produces) {
        this.produces = produces;
    }

    public URI getSpecificationUri() {
        return specificationUri;
    }

    public void setSpecificationUri(URI specificationUri) {
        this.specificationUri = specificationUri;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
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