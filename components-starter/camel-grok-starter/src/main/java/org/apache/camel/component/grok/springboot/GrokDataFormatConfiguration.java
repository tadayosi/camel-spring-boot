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
package org.apache.camel.component.grok.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Grok data format is used for unmarshalling unstructured data to objects
 * using Logstash based Grok patterns.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.grok")
public class GrokDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the grok data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The grok pattern to match lines of input
     */
    private String pattern;
    /**
     * Turns on flattened mode. In flattened mode the exception is thrown when
     * there are multiple pattern matches with same key.
     */
    private Boolean flattened = false;
    /**
     * If false, every line of input is matched for pattern only once. Otherwise
     * the line can be scanned multiple times when non-terminal pattern is used.
     */
    private Boolean allowMultipleMatchesPerLine = true;
    /**
     * Whether to capture named expressions only or not (i.e. %{IP:ip} but not
     * ${IP})
     */
    private Boolean namedOnly = false;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML, or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Boolean getFlattened() {
        return flattened;
    }

    public void setFlattened(Boolean flattened) {
        this.flattened = flattened;
    }

    public Boolean getAllowMultipleMatchesPerLine() {
        return allowMultipleMatchesPerLine;
    }

    public void setAllowMultipleMatchesPerLine(
            Boolean allowMultipleMatchesPerLine) {
        this.allowMultipleMatchesPerLine = allowMultipleMatchesPerLine;
    }

    public Boolean getNamedOnly() {
        return namedOnly;
    }

    public void setNamedOnly(Boolean namedOnly) {
        this.namedOnly = namedOnly;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}