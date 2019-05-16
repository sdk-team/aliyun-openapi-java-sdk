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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ams.model.v20160201.ListAppsResponse;
import com.aliyuncs.ams.model.v20160201.ListAppsResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext context) {
		
		listAppsResponse.setRequestId(context.stringValue("ListAppsResponse.RequestId"));
		listAppsResponse.setCode(context.stringValue("ListAppsResponse.Code"));

		List<AppInfo> appInfos = new ArrayList<AppInfo>();
		for (int i = 0; i < context.lengthValue("ListAppsResponse.AppInfos.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setProductId(context.longValue("ListAppsResponse.AppInfos["+ i +"].ProductId"));
			appInfo.setAppId(context.longValue("ListAppsResponse.AppInfos["+ i +"].AppId"));
			appInfo.setUserId(context.longValue("ListAppsResponse.AppInfos["+ i +"].UserId"));
			appInfo.setTaobaoUserId(context.longValue("ListAppsResponse.AppInfos["+ i +"].TaobaoUserId"));
			appInfo.setName(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Name"));
			appInfo.setDescription(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Description"));
			appInfo.setAppKey(context.longValue("ListAppsResponse.AppInfos["+ i +"].AppKey"));
			appInfo.setAppSecret(context.stringValue("ListAppsResponse.AppInfos["+ i +"].AppSecret"));
			appInfo.setBizName(context.stringValue("ListAppsResponse.AppInfos["+ i +"].BizName"));
			appInfo.setStatus(context.integerValue("ListAppsResponse.AppInfos["+ i +"].Status"));
			appInfo.setType(context.integerValue("ListAppsResponse.AppInfos["+ i +"].Type"));
			appInfo.setBundleId(context.stringValue("ListAppsResponse.AppInfos["+ i +"].BundleId"));
			appInfo.setPackageName(context.stringValue("ListAppsResponse.AppInfos["+ i +"].PackageName"));
			appInfo.setCreateTime(context.stringValue("ListAppsResponse.AppInfos["+ i +"].CreateTime"));
			appInfo.setModifyTime(context.stringValue("ListAppsResponse.AppInfos["+ i +"].ModifyTime"));

			appInfos.add(appInfo);
		}
		listAppsResponse.setAppInfos(appInfos);
	 
	 	return listAppsResponse;
	}
}