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
package org.apache.camel.component.paho.mqtt5.springboot;

import java.util.Map;
import java.util.Properties;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Component;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Persistence;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.eclipse.paho.mqttv5.client.MqttClient;
import org.eclipse.paho.mqttv5.common.packet.MqttProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Communicate with MQTT message brokers using Eclipse Paho MQTT v5 Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.paho-mqtt5")
public class PahoMqtt5ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the paho-mqtt5 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets whether the client will automatically attempt to reconnect to the
     * server if the connection is lost. If set to false, the client will not
     * attempt to automatically reconnect to the server in the event that the
     * connection is lost. If set to true, in the event that the connection is
     * lost, the client will attempt to reconnect to the server. It will
     * initially wait 1 second before it attempts to reconnect, for every failed
     * reconnect attempt, the delay will double until it is at 2 minutes at
     * which point the delay will stay at 2 minutes.
     */
    private Boolean automaticReconnect = true;
    /**
     * The URL of the MQTT broker.
     */
    private String brokerUrl = "tcp://localhost:1883";
    /**
     * Sets whether the client and server should remember state across restarts
     * and reconnects. If set to false both the client and server will maintain
     * state across restarts of the client, the server and the connection. As
     * state is maintained: Message delivery will be reliable meeting the
     * specified QOS even if the client, server or connection are restarted. The
     * server will treat a subscription as durable. If set to true the client
     * and server will not maintain state across restarts of the client, the
     * server or the connection. This means Message delivery to the specified
     * QOS cannot be maintained if the client, server or connection are
     * restarted The server will treat a subscription as non-durable
     */
    private Boolean cleanStart = true;
    /**
     * MQTT client identifier. The identifier must be unique.
     */
    private String clientId;
    /**
     * To use the shared Paho configuration. The option is a
     * org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration type.
     */
    private PahoMqtt5Configuration configuration;
    /**
     * Sets the connection timeout value. This value, measured in seconds,
     * defines the maximum time interval the client will wait for the network
     * connection to the MQTT server to be established. The default timeout is
     * 30 seconds. A value of 0 disables timeout processing meaning the client
     * will wait until the network connection is made successfully or fails.
     */
    private Integer connectionTimeout = 30;
    /**
     * Base directory used by file persistence. Will by default use user
     * directory.
     */
    private String filePersistenceDirectory;
    /**
     * Sets the keep alive interval. This value, measured in seconds, defines
     * the maximum time interval between messages sent or received. It enables
     * the client to detect if the server is no longer available, without having
     * to wait for the TCP/IP timeout. The client will ensure that at least one
     * message travels across the network within each keep alive period. In the
     * absence of a data-related message during the time period, the client
     * sends a very small ping message, which the server will acknowledge. A
     * value of 0 disables keepalive processing in the client. The default value
     * is 60 seconds
     */
    private Integer keepAliveInterval = 60;
    /**
     * Get the maximum time (in millis) to wait between reconnects
     */
    private Integer maxReconnectDelay = 128000;
    /**
     * Client persistence to be used - memory or file.
     */
    private PahoMqtt5Persistence persistence = PahoMqtt5Persistence.MEMORY;
    /**
     * Client quality of service level (0-2).
     */
    private Integer qos = 2;
    /**
     * Sets the Receive Maximum. This value represents the limit of QoS 1 and
     * QoS 2 publications that the client is willing to process concurrently.
     * There is no mechanism to limit the number of QoS 0 publications that the
     * Server might try to send. The default value is 65535
     */
    private Integer receiveMaximum = 65535;
    /**
     * Retain option
     */
    private Boolean retained = false;
    /**
     * Set a list of one or more serverURIs the client may connect to. Multiple
     * servers can be separated by comma. Each serverURI specifies the address
     * of a server that the client may connect to. Two types of connection are
     * supported tcp:// for a TCP connection and ssl:// for a TCP connection
     * secured by SSL/TLS. For example: tcp://localhost:1883
     * ssl://localhost:8883 If the port is not specified, it will default to
     * 1883 for tcp:// URIs, and 8883 for ssl:// URIs. If serverURIs is set then
     * it overrides the serverURI parameter passed in on the constructor of the
     * MQTT client. When an attempt to connect is initiated the client will
     * start with the first serverURI in the list and work through the list
     * until a connection is established with a server. If a connection cannot
     * be made to any of the servers then the connect attempt fails. Specifying
     * a list of servers that a client may connect to has several uses: High
     * Availability and reliable message delivery Some MQTT servers support a
     * high availability feature where two or more equal MQTT servers share
     * state. An MQTT client can connect to any of the equal servers and be
     * assured that messages are reliably delivered and durable subscriptions
     * are maintained no matter which server the client connects to. The
     * cleansession flag must be set to false if durable subscriptions and/or
     * reliable message delivery is required. Hunt List A set of servers may be
     * specified that are not equal (as in the high availability option). As no
     * state is shared across the servers reliable message delivery and durable
     * subscriptions are not valid. The cleansession flag must be set to true if
     * the hunt list mode is used
     */
    private String serverURIs;
    /**
     * Sets the Session Expiry Interval. This value, measured in seconds,
     * defines the maximum time that the broker will maintain the session for
     * once the client disconnects. Clients should only connect with a long
     * Session Expiry interval if they intend to connect to the server at some
     * later point in time. By default this value is -1 and so will not be sent,
     * in this case, the session will not expire. If a 0 is sent, the session
     * will end immediately once the Network Connection is closed. When the
     * client has determined that it has no longer any use for the session, it
     * should disconnect with a Session Expiry Interval set to 0.
     */
    private Long sessionExpiryInterval = -1L;
    /**
     * Sets the Last Will and Testament (LWT) for the connection. In the event
     * that this client unexpectedly loses its connection to the server, the
     * server will publish a message to itself using the supplied details. The
     * MQTT properties set for the message. The option is a
     * org.eclipse.paho.mqttv5.common.packet.MqttProperties type.
     */
    private MqttProperties willMqttProperties;
    /**
     * Sets the Last Will and Testament (LWT) for the connection. In the event
     * that this client unexpectedly loses its connection to the server, the
     * server will publish a message to itself using the supplied details. The
     * byte payload for the message.
     */
    private String willPayload;
    /**
     * Sets the Last Will and Testament (LWT) for the connection. In the event
     * that this client unexpectedly loses its connection to the server, the
     * server will publish a message to itself using the supplied details. The
     * quality of service to publish the message at (0, 1 or 2).
     */
    private Integer willQos = 1;
    /**
     * Sets the Last Will and Testament (LWT) for the connection. In the event
     * that this client unexpectedly loses its connection to the server, the
     * server will publish a message to itself using the supplied details.
     * Whether or not the message should be retained.
     */
    private Boolean willRetained = false;
    /**
     * Sets the Last Will and Testament (LWT) for the connection. In the event
     * that this client unexpectedly loses its connection to the server, the
     * server will publish a message to itself using the supplied details. The
     * topic to publish to.
     */
    private String willTopic;
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
     * To use a shared Paho client. The option is a
     * org.eclipse.paho.mqttv5.client.MqttClient type.
     */
    private MqttClient client;
    /**
     * Sets the Custom WebSocket Headers for the WebSocket Connection.
     */
    private Map<String, String> customWebSocketHeaders;
    /**
     * Set the time in seconds that the executor service should wait when
     * terminating before forcefully terminating. It is not recommended to
     * change this value unless you are absolutely sure that you need to.
     */
    private Integer executorServiceTimeout = 1;
    /**
     * Whether SSL HostnameVerifier is enabled or not. The default value is
     * true.
     */
    private Boolean httpsHostnameVerificationEnabled = true;
    /**
     * Password to be used for authentication against the MQTT broker
     */
    private String password;
    /**
     * Sets the SocketFactory to use. This allows an application to apply its
     * own policies around the creation of network sockets. If using an SSL
     * connection, an SSLSocketFactory can be used to supply
     * application-specific security settings. The option is a
     * javax.net.SocketFactory type.
     */
    private SocketFactory socketFactory;
    /**
     * Sets the SSL properties for the connection. Note that these properties
     * are only valid if an implementation of the Java Secure Socket Extensions
     * (JSSE) is available. These properties are not used if a custom
     * SocketFactory has been set. The following properties can be used:
     * com.ibm.ssl.protocol One of: SSL, SSLv3, TLS, TLSv1, SSL_TLS.
     * com.ibm.ssl.contextProvider Underlying JSSE provider. For example
     * IBMJSSE2 or SunJSSE com.ibm.ssl.keyStore The name of the file that
     * contains the KeyStore object that you want the KeyManager to use. For
     * example /mydir/etc/key.p12 com.ibm.ssl.keyStorePassword The password for
     * the KeyStore object that you want the KeyManager to use. The password can
     * either be in plain-text, or may be obfuscated using the static method:
     * com.ibm.micro.security.Password.obfuscate(char password). This obfuscates
     * the password using a simple and insecure XOR and Base64 encoding
     * mechanism. Note that this is only a simple scrambler to obfuscate
     * clear-text passwords. com.ibm.ssl.keyStoreType Type of key store, for
     * example PKCS12, JKS, or JCEKS. com.ibm.ssl.keyStoreProvider Key store
     * provider, for example IBMJCE or IBMJCEFIPS. com.ibm.ssl.trustStore The
     * name of the file that contains the KeyStore object that you want the
     * TrustManager to use. com.ibm.ssl.trustStorePassword The password for the
     * TrustStore object that you want the TrustManager to use. The password can
     * either be in plain-text, or may be obfuscated using the static method:
     * com.ibm.micro.security.Password.obfuscate(char password). This obfuscates
     * the password using a simple and insecure XOR and Base64 encoding
     * mechanism. Note that this is only a simple scrambler to obfuscate
     * clear-text passwords. com.ibm.ssl.trustStoreType The type of KeyStore
     * object that you want the default TrustManager to use. Same possible
     * values as keyStoreType. com.ibm.ssl.trustStoreProvider Trust store
     * provider, for example IBMJCE or IBMJCEFIPS.
     * com.ibm.ssl.enabledCipherSuites A list of which ciphers are enabled.
     * Values are dependent on the provider, for example:
     * SSL_RSA_WITH_AES_128_CBC_SHA;SSL_RSA_WITH_3DES_EDE_CBC_SHA.
     * com.ibm.ssl.keyManager Sets the algorithm that will be used to
     * instantiate a KeyManagerFactory object instead of using the default
     * algorithm available in the platform. Example values: IbmX509 or
     * IBMJ9X509. com.ibm.ssl.trustManager Sets the algorithm that will be used
     * to instantiate a TrustManagerFactory object instead of using the default
     * algorithm available in the platform. Example values: PKIX or IBMJ9X509.
     * The option is a java.util.Properties type.
     */
    private Properties sslClientProps;
    /**
     * Sets the HostnameVerifier for the SSL connection. Note that it will be
     * used after handshake on a connection and you should do actions by
     * yourself when hostname is verified error. There is no default
     * HostnameVerifier. The option is a javax.net.ssl.HostnameVerifier type.
     */
    private HostnameVerifier sslHostnameVerifier;
    /**
     * Username to be used for authentication against the MQTT broker
     */
    private String userName;

    public Boolean getAutomaticReconnect() {
        return automaticReconnect;
    }

    public void setAutomaticReconnect(Boolean automaticReconnect) {
        this.automaticReconnect = automaticReconnect;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public Boolean getCleanStart() {
        return cleanStart;
    }

    public void setCleanStart(Boolean cleanStart) {
        this.cleanStart = cleanStart;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public PahoMqtt5Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(PahoMqtt5Configuration configuration) {
        this.configuration = configuration;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public String getFilePersistenceDirectory() {
        return filePersistenceDirectory;
    }

    public void setFilePersistenceDirectory(String filePersistenceDirectory) {
        this.filePersistenceDirectory = filePersistenceDirectory;
    }

    public Integer getKeepAliveInterval() {
        return keepAliveInterval;
    }

    public void setKeepAliveInterval(Integer keepAliveInterval) {
        this.keepAliveInterval = keepAliveInterval;
    }

    public Integer getMaxReconnectDelay() {
        return maxReconnectDelay;
    }

    public void setMaxReconnectDelay(Integer maxReconnectDelay) {
        this.maxReconnectDelay = maxReconnectDelay;
    }

    public PahoMqtt5Persistence getPersistence() {
        return persistence;
    }

    public void setPersistence(PahoMqtt5Persistence persistence) {
        this.persistence = persistence;
    }

    public Integer getQos() {
        return qos;
    }

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    public Integer getReceiveMaximum() {
        return receiveMaximum;
    }

    public void setReceiveMaximum(Integer receiveMaximum) {
        this.receiveMaximum = receiveMaximum;
    }

    public Boolean getRetained() {
        return retained;
    }

    public void setRetained(Boolean retained) {
        this.retained = retained;
    }

    public String getServerURIs() {
        return serverURIs;
    }

    public void setServerURIs(String serverURIs) {
        this.serverURIs = serverURIs;
    }

    public Long getSessionExpiryInterval() {
        return sessionExpiryInterval;
    }

    public void setSessionExpiryInterval(Long sessionExpiryInterval) {
        this.sessionExpiryInterval = sessionExpiryInterval;
    }

    public MqttProperties getWillMqttProperties() {
        return willMqttProperties;
    }

    public void setWillMqttProperties(MqttProperties willMqttProperties) {
        this.willMqttProperties = willMqttProperties;
    }

    public String getWillPayload() {
        return willPayload;
    }

    public void setWillPayload(String willPayload) {
        this.willPayload = willPayload;
    }

    public Integer getWillQos() {
        return willQos;
    }

    public void setWillQos(Integer willQos) {
        this.willQos = willQos;
    }

    public Boolean getWillRetained() {
        return willRetained;
    }

    public void setWillRetained(Boolean willRetained) {
        this.willRetained = willRetained;
    }

    public String getWillTopic() {
        return willTopic;
    }

    public void setWillTopic(String willTopic) {
        this.willTopic = willTopic;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
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

    public MqttClient getClient() {
        return client;
    }

    public void setClient(MqttClient client) {
        this.client = client;
    }

    public Map<String, String> getCustomWebSocketHeaders() {
        return customWebSocketHeaders;
    }

    public void setCustomWebSocketHeaders(
            Map<String, String> customWebSocketHeaders) {
        this.customWebSocketHeaders = customWebSocketHeaders;
    }

    public Integer getExecutorServiceTimeout() {
        return executorServiceTimeout;
    }

    public void setExecutorServiceTimeout(Integer executorServiceTimeout) {
        this.executorServiceTimeout = executorServiceTimeout;
    }

    public Boolean getHttpsHostnameVerificationEnabled() {
        return httpsHostnameVerificationEnabled;
    }

    public void setHttpsHostnameVerificationEnabled(
            Boolean httpsHostnameVerificationEnabled) {
        this.httpsHostnameVerificationEnabled = httpsHostnameVerificationEnabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SocketFactory getSocketFactory() {
        return socketFactory;
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    public Properties getSslClientProps() {
        return sslClientProps;
    }

    public void setSslClientProps(Properties sslClientProps) {
        this.sslClientProps = sslClientProps;
    }

    public HostnameVerifier getSslHostnameVerifier() {
        return sslHostnameVerifier;
    }

    public void setSslHostnameVerifier(HostnameVerifier sslHostnameVerifier) {
        this.sslHostnameVerifier = sslHostnameVerifier;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}