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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * 过滤属性的 key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤属性的 values 值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤属性的 key 
     * @return Key 过滤属性的 key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤属性的 key
     * @param Key 过滤属性的 key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤属性的 values 值 
     * @return Values 过滤属性的 values 值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤属性的 values 值
     * @param Values 过滤属性的 values 值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

