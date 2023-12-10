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
package org.apache.camel.dataformat.parquet.avro.springboot;

import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Parquet Avro serialization and de-serialization.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.dataformat.parquet-avro")
public class ParquetAvroDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the parquetAvro data format. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Compression codec to use when marshalling.
     */
    private String compressionCodecName = "GZIP";
    /**
     * Class to use when (un)marshalling. If omitted, parquet files are
     * converted into Avro's GenericRecords for unmarshalling and input objects
     * are assumed as GenericRecords for marshalling.
     */
    private String unmarshalType;
    /**
     * Whether the unmarshalling should produce an iterator of records or read
     * all the records at once.
     */
    private Boolean lazyLoad = false;

    public String getCompressionCodecName() {
        return compressionCodecName;
    }

    public void setCompressionCodecName(String compressionCodecName) {
        this.compressionCodecName = compressionCodecName;
    }

    public String getUnmarshalType() {
        return unmarshalType;
    }

    public void setUnmarshalType(String unmarshalType) {
        this.unmarshalType = unmarshalType;
    }

    public Boolean getLazyLoad() {
        return lazyLoad;
    }

    public void setLazyLoad(Boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }
}