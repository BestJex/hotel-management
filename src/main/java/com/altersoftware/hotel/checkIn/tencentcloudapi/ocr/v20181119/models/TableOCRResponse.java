/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.altersoftware.hotel.checkIn.tencentcloudapi.ocr.v20181119.models;

import java.util.HashMap;

import com.altersoftware.hotel.checkIn.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableOCRResponse extends AbstractModel {

    /**
     * 检测到的文本信息，具体内容请点击左侧链接。
     */
    @SerializedName("TextDetections")
    @Expose
    private TextTable[] TextDetections;

    /**
     * Base64 编码后的 Excel 数据。
     */
    @SerializedName("Data")
    @Expose
    private String      Data;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String      RequestId;

    /**
     * Get 检测到的文本信息，具体内容请点击左侧链接。
     *
     * @return TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextTable[] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set 检测到的文本信息，具体内容请点击左侧链接。
     *
     * @param TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setTextDetections(TextTable[] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * Get Base64 编码后的 Excel 数据。
     *
     * @return Data Base64 编码后的 Excel 数据。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Base64 编码后的 Excel 数据。
     *
     * @param Data Base64 编码后的 Excel 数据。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
