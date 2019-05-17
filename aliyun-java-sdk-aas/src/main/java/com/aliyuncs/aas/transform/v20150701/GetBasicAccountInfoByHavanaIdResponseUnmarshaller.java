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

package com.aliyuncs.aas.transform.v20150701;

import com.aliyuncs.aas.model.v20150701.GetBasicAccountInfoByHavanaIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicAccountInfoByHavanaIdResponseUnmarshaller {

	public static GetBasicAccountInfoByHavanaIdResponse unmarshall(GetBasicAccountInfoByHavanaIdResponse getBasicAccountInfoByHavanaIdResponse, UnmarshallerContext context) {
		
		getBasicAccountInfoByHavanaIdResponse.setRequestId(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.RequestId"));
		getBasicAccountInfoByHavanaIdResponse.setPK(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.PK"));
		getBasicAccountInfoByHavanaIdResponse.setHavanaId(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.HavanaId"));
		getBasicAccountInfoByHavanaIdResponse.setParentPk(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.ParentPk"));
		getBasicAccountInfoByHavanaIdResponse.setPartnerPk(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.PartnerPk"));
		getBasicAccountInfoByHavanaIdResponse.setAccountStructure(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.AccountStructure"));
		getBasicAccountInfoByHavanaIdResponse.setSymmetricAkLimit(context.integerValue("GetBasicAccountInfoByHavanaIdResponse.SymmetricAkLimit"));
		getBasicAccountInfoByHavanaIdResponse.setRSAAkLimit(context.integerValue("GetBasicAccountInfoByHavanaIdResponse.RSAAkLimit"));
		getBasicAccountInfoByHavanaIdResponse.setVirtualMFALimit(context.integerValue("GetBasicAccountInfoByHavanaIdResponse.VirtualMFALimit"));
		getBasicAccountInfoByHavanaIdResponse.setMulitiBidUser(context.booleanValue("GetBasicAccountInfoByHavanaIdResponse.MulitiBidUser"));
		getBasicAccountInfoByHavanaIdResponse.setLastLoginTime(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.LastLoginTime"));
		getBasicAccountInfoByHavanaIdResponse.setCreateTime(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.CreateTime"));
		getBasicAccountInfoByHavanaIdResponse.setAccountStatus(context.stringValue("GetBasicAccountInfoByHavanaIdResponse.AccountStatus"));
	 
	 	return getBasicAccountInfoByHavanaIdResponse;
	}
}