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

import com.aliyuncs.ams.model.v20160201.CreateAppResponse;
import com.aliyuncs.ams.model.v20160201.CreateAppResponse.AppInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext context) {
		
		createAppResponse.setRequestId(context.stringValue("CreateAppResponse.RequestId"));
		createAppResponse.setCode(context.stringValue("CreateAppResponse.Code"));

		AppInfos appInfos = new AppInfos();
		appInfos.setProductId(context.longValue("CreateAppResponse.AppInfos.ProductId"));
		appInfos.setAppId(context.longValue("CreateAppResponse.AppInfos.AppId"));
		appInfos.setUserId(context.longValue("CreateAppResponse.AppInfos.UserId"));
		appInfos.setTaobaoUserId(context.longValue("CreateAppResponse.AppInfos.TaobaoUserId"));
		appInfos.setName(context.stringValue("CreateAppResponse.AppInfos.Name"));
		appInfos.setDescription(context.stringValue("CreateAppResponse.AppInfos.Description"));
		appInfos.setAppKey(context.longValue("CreateAppResponse.AppInfos.AppKey"));
		appInfos.setAppSecret(context.stringValue("CreateAppResponse.AppInfos.AppSecret"));
		appInfos.setBizName(context.stringValue("CreateAppResponse.AppInfos.BizName"));
		appInfos.setStatus(context.integerValue("CreateAppResponse.AppInfos.Status"));
		appInfos.setType(context.integerValue("CreateAppResponse.AppInfos.Type"));
		appInfos.setBundleId(context.stringValue("CreateAppResponse.AppInfos.BundleId"));
		appInfos.setPackageName(context.stringValue("CreateAppResponse.AppInfos.PackageName"));
		appInfos.setCreateTime(context.stringValue("CreateAppResponse.AppInfos.CreateTime"));
		appInfos.setModifyTime(context.stringValue("CreateAppResponse.AppInfos.ModifyTime"));
		createAppResponse.setAppInfos(appInfos);
	 
	 	return createAppResponse;
	}
}