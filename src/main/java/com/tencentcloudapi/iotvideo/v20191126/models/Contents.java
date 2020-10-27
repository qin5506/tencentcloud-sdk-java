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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Contents extends AbstractModel{

    /**
    * 英文，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("En")
    @Expose
    private String En;

    /**
    * 中文简体，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cn")
    @Expose
    private String Cn;

    /**
    * 中文繁体(Traditional Chinese)，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tc")
    @Expose
    private String Tc;

    /**
     * Get 英文，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return En 英文，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEn() {
        return this.En;
    }

    /**
     * Set 英文，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param En 英文，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEn(String En) {
        this.En = En;
    }

    /**
     * Get 中文简体，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cn 中文简体，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCn() {
        return this.Cn;
    }

    /**
     * Set 中文简体，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cn 中文简体，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCn(String Cn) {
        this.Cn = Cn;
    }

    /**
     * Get 中文繁体(Traditional Chinese)，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tc 中文繁体(Traditional Chinese)，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTc() {
        return this.Tc;
    }

    /**
     * Set 中文繁体(Traditional Chinese)，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tc 中文繁体(Traditional Chinese)，长度不超过300个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTc(String Tc) {
        this.Tc = Tc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "En", this.En);
        this.setParamSimple(map, prefix + "Cn", this.Cn);
        this.setParamSimple(map, prefix + "Tc", this.Tc);

    }
}

