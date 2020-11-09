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
package com.tencentcloudapi.ame.v20190916;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ame.v20190916.models.*;

public class AmeClient extends AbstractClient{
    private static String endpoint = "ame.tencentcloudapi.com";
    private static String service = "ame";
    private static String version = "2019-09-16";

    public AmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AmeClient(Credential credential, String region, ClientProfile profile) {
        super(AmeClient.endpoint, AmeClient.version, credential, region, profile);
    }

    /**
     *根据歌曲ID查询歌曲信息
     * @param req DescribeItemByIdRequest
     * @return DescribeItemByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemByIdResponse DescribeItemById(DescribeItemByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeItemByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeItemByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeItemById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分类内容下歌曲列表获取，根据CategoryID或CategoryCode
     * @param req DescribeItemsRequest
     * @return DescribeItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemsResponse DescribeItems(DescribeItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据接口的模式及歌曲ID来取得歌词信息。
     * @param req DescribeLyricRequest
     * @return DescribeLyricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLyricResponse DescribeLyric(DescribeLyricRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLyricResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLyricResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLyric");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据接口的模式及歌曲ID来取得对应权限的歌曲播放地址等信息。
     * @param req DescribeMusicRequest
     * @return DescribeMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMusicResponse DescribeMusic(DescribeMusicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMusicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMusicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMusic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询曲库包已核验歌曲列表接口
     * @param req DescribePackageItemsRequest
     * @return DescribePackageItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageItemsResponse DescribePackageItems(DescribePackageItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackageItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackageItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePackageItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已购曲库包列表接口
     * @param req DescribePackagesRequest
     * @return DescribePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackagesResponse DescribePackages(DescribePackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取素材库列表时使用
     * @param req DescribeStationsRequest
     * @return DescribeStationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStationsResponse DescribeStations(DescribeStationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户上报用户数据功能，为了更好的为用户提供优质服务
     * @param req ReportDataRequest
     * @return ReportDataResponse
     * @throws TencentCloudSDKException
     */
    public ReportDataResponse ReportData(ReportDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReportDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
