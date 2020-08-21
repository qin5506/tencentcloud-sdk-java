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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel{

    /**
    * 要解绑的安全组ID，类似esg-efil73jd，只支持解绑单个安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 被解绑的实例ID，类似ein-lesecurk，支持指定多个实例 。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 要解绑的安全组ID，类似esg-efil73jd，只支持解绑单个安全组。 
     * @return SecurityGroupIds 要解绑的安全组ID，类似esg-efil73jd，只支持解绑单个安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 要解绑的安全组ID，类似esg-efil73jd，只支持解绑单个安全组。
     * @param SecurityGroupIds 要解绑的安全组ID，类似esg-efil73jd，只支持解绑单个安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 被解绑的实例ID，类似ein-lesecurk，支持指定多个实例 。 
     * @return InstanceIds 被解绑的实例ID，类似ein-lesecurk，支持指定多个实例 。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 被解绑的实例ID，类似ein-lesecurk，支持指定多个实例 。
     * @param InstanceIds 被解绑的实例ID，类似ein-lesecurk，支持指定多个实例 。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

