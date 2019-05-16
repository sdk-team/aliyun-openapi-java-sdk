/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ams.transform.v20160201;

import com.aliyuncs.ams.model.v20160201.QueryAppInfoResponse;
import com.aliyuncs.ams.model.v20160201.QueryAppInfoResponse.AppInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppInfoResponseUnmarshaller {

	public static QueryAppInfoResponse unmarshall(QueryAppInfoResponse queryAppInfoResponse, UnmarshallerContext context) {
		
		queryAppInfoResponse.setRequestId(context.stringValue("QueryAppInfoResponse.RequestId"));
		queryAppInfoResponse.setCode(context.stringValue("QueryAppInfoResponse.Code"));

		AppInfos appInfos = new AppInfos();
		appInfos.setProductId(context.longValue("QueryAppInfoResponse.AppInfos.ProductId"));
		appInfos.setAppId(context.longValue("QueryAppInfoResponse.AppInfos.AppId"));
		appInfos.setUserId(context.longValue("QueryAppInfoResponse.AppInfos.UserId"));
		appInfos.setTaobaoUserId(context.longValue("QueryAppInfoResponse.AppInfos.TaobaoUserId"));
		appInfos.setName(context.stringValue("QueryAppInfoResponse.AppInfos.Name"));
		appInfos.setDescription(context.stringValue("QueryAppInfoResponse.AppInfos.Description"));
		appInfos.setAppKey(context.longValue("QueryAppInfoResponse.AppInfos.AppKey"));
		appInfos.setAppSecret(context.stringValue("QueryAppInfoResponse.AppInfos.AppSecret"));
		appInfos.setBizName(context.stringValue("QueryAppInfoResponse.AppInfos.BizName"));
		appInfos.setStatus(context.integerValue("QueryAppInfoResponse.AppInfos.Status"));
		appInfos.setType(context.integerValue("QueryAppInfoResponse.AppInfos.Type"));
		appInfos.setBundleId(context.stringValue("QueryAppInfoResponse.AppInfos.BundleId"));
		appInfos.setPackageName(context.stringValue("QueryAppInfoResponse.AppInfos.PackageName"));
		appInfos.setCreateTime(context.stringValue("QueryAppInfoResponse.AppInfos.CreateTime"));
		appInfos.setModifyTime(context.stringValue("QueryAppInfoResponse.AppInfos.ModifyTime"));
		queryAppInfoResponse.setAppInfos(appInfos);
	 
	 	return queryAppInfoResponse;
	}
}