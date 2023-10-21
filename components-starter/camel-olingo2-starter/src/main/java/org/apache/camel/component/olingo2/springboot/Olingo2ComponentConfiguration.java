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
package org.apache.camel.component.olingo2.springboot;

import java.util.Map;
import org.apache.camel.component.olingo2.Olingo2Configuration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.olingo.odata2.api.ep.EntityProviderReadProperties;
import org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Communicate with OData 2.0 services using Apache Olingo.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.olingo2")
public class Olingo2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the olingo2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration. The option is a
     * org.apache.camel.component.olingo2.Olingo2Configuration type.
     */
    private Olingo2Configuration configuration;
    /**
     * HTTP connection creation timeout in milliseconds, defaults to 30,000 (30
     * seconds)
     */
    private Integer connectTimeout = 30000;
    /**
     * Content-Type header value can be used to specify JSON or XML message
     * format, defaults to application/json;charset=utf-8
     */
    private String contentType = "application/json;charset=utf-8";
    /**
     * Custom entity provider read properties applied to all read operations.
     * The option is a
     * org.apache.olingo.odata2.api.ep.EntityProviderReadProperties type.
     */
    private EntityProviderReadProperties entityProviderReadProperties;
    /**
     * Custom entity provider write properties applied to create, update, patch,
     * batch and merge operations. For instance users can skip the Json object
     * wrapper or enable content only mode when sending request data. A service
     * URI set in the properties will always be overwritten by the serviceUri
     * configuration parameter. Please consider to using the serviceUri
     * configuration parameter instead of setting the respective write property
     * here. The option is a
     * org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties type.
     */
    private EntityProviderWriteProperties entityProviderWriteProperties;
    /**
     * Set this to true to filter out results that have already been
     * communicated by this component.
     */
    private Boolean filterAlreadySeen = false;
    /**
     * Custom HTTP headers to inject into every request, this could include
     * OAuth tokens, etc.
     */
    private Map<String, String> httpHeaders;
    /**
     * HTTP proxy server configuration. The option is a org.apache.http.HttpHost
     * type.
     */
    private HttpHost proxy;
    /**
     * Target OData service base URI, e.g.
     * http://services.odata.org/OData/OData.svc
     */
    private String serviceUri;
    /**
     * HTTP request timeout in milliseconds, defaults to 30,000 (30 seconds)
     */
    private Integer socketTimeout = 30000;
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
     * For endpoints that return an array or collection, a consumer endpoint
     * will map every element to distinct messages, unless splitResult is set to
     * false.
     */
    private Boolean splitResult = true;
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
    /**
     * Custom HTTP async client builder for more complex HTTP client
     * configuration, overrides connectionTimeout, socketTimeout, proxy and
     * sslContext. Note that a socketTimeout MUST be specified in the builder,
     * otherwise OData requests could block indefinitely. The option is a
     * org.apache.http.impl.nio.client.HttpAsyncClientBuilder type.
     */
    private HttpAsyncClientBuilder httpAsyncClientBuilder;
    /**
     * Custom HTTP client builder for more complex HTTP client configuration,
     * overrides connectionTimeout, socketTimeout, proxy and sslContext. Note
     * that a socketTimeout MUST be specified in the builder, otherwise OData
     * requests could block indefinitely. The option is a
     * org.apache.http.impl.client.HttpClientBuilder type.
     */
    private HttpClientBuilder httpClientBuilder;
    /**
     * To configure security using SSLContextParameters. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private SSLContextParameters sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;

    public Olingo2Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Olingo2Configuration configuration) {
        this.configuration = configuration;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public EntityProviderReadProperties getEntityProviderReadProperties() {
        return entityProviderReadProperties;
    }

    public void setEntityProviderReadProperties(
            EntityProviderReadProperties entityProviderReadProperties) {
        this.entityProviderReadProperties = entityProviderReadProperties;
    }

    public EntityProviderWriteProperties getEntityProviderWriteProperties() {
        return entityProviderWriteProperties;
    }

    public void setEntityProviderWriteProperties(
            EntityProviderWriteProperties entityProviderWriteProperties) {
        this.entityProviderWriteProperties = entityProviderWriteProperties;
    }

    public Boolean getFilterAlreadySeen() {
        return filterAlreadySeen;
    }

    public void setFilterAlreadySeen(Boolean filterAlreadySeen) {
        this.filterAlreadySeen = filterAlreadySeen;
    }

    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public HttpHost getProxy() {
        return proxy;
    }

    public void setProxy(HttpHost proxy) {
        this.proxy = proxy;
    }

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getSplitResult() {
        return splitResult;
    }

    public void setSplitResult(Boolean splitResult) {
        this.splitResult = splitResult;
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

    public HttpAsyncClientBuilder getHttpAsyncClientBuilder() {
        return httpAsyncClientBuilder;
    }

    public void setHttpAsyncClientBuilder(
            HttpAsyncClientBuilder httpAsyncClientBuilder) {
        this.httpAsyncClientBuilder = httpAsyncClientBuilder;
    }

    public HttpClientBuilder getHttpClientBuilder() {
        return httpClientBuilder;
    }

    public void setHttpClientBuilder(HttpClientBuilder httpClientBuilder) {
        this.httpClientBuilder = httpClientBuilder;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }
}