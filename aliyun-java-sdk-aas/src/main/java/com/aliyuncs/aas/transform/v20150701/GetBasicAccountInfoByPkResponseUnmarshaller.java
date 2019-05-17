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

import com.aliyuncs.aas.model.v20150701.GetBasicAccountInfoByPkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicAccountInfoByPkResponseUnmarshaller {

	public static GetBasicAccountInfoByPkResponse unmarshall(GetBasicAccountInfoByPkResponse getBasicAccountInfoByPkResponse, UnmarshallerContext context) {
		
		getBasicAccountInfoByPkResponse.setRequestId(context.stringValue("GetBasicAccountInfoByPkResponse.RequestId"));
		getBasicAccountInfoByPkResponse.setPK(context.stringValue("GetBasicAccountInfoByPkResponse.PK"));
		getBasicAccountInfoByPkResponse.setHavanaId(context.stringValue("GetBasicAccountInfoByPkResponse.HavanaId"));
		getBasicAccountInfoByPkResponse.setParentPk(context.stringValue("GetBasicAccountInfoByPkResponse.ParentPk"));
		getBasicAccountInfoByPkResponse.setPartnerPk(context.stringValue("GetBasicAccountInfoByPkResponse.PartnerPk"));
		getBasicAccountInfoByPkResponse.setAccountStructure(context.stringValue("GetBasicAccountInfoByPkResponse.AccountStructure"));
		getBasicAccountInfoByPkResponse.setSymmetricAkLimit(context.integerValue("GetBasicAccountInfoByPkResponse.SymmetricAkLimit"));
		getBasicAccountInfoByPkResponse.setRSAAkLimit(context.integerValue("GetBasicAccountInfoByPkResponse.RSAAkLimit"));
		getBasicAccountInfoByPkResponse.setVirtualMFALimit(context.integerValue("GetBasicAccountInfoByPkResponse.VirtualMFALimit"));
		getBasicAccountInfoByPkResponse.setMulitiBidUser(context.booleanValue("GetBasicAccountInfoByPkResponse.MulitiBidUser"));
		getBasicAccountInfoByPkResponse.setLastLoginTime(context.stringValue("GetBasicAccountInfoByPkResponse.LastLoginTime"));
		getBasicAccountInfoByPkResponse.setCreateTime(context.stringValue("GetBasicAccountInfoByPkResponse.CreateTime"));
		getBasicAccountInfoByPkResponse.setAccountStatus(context.stringValue("GetBasicAccountInfoByPkResponse.AccountStatus"));
	 
	 	return getBasicAccountInfoByPkResponse;
	}
}