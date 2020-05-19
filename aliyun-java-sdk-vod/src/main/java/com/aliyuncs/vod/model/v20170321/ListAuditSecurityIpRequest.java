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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAuditSecurityIpRequest extends RpcAcsRequest<ListAuditSecurityIpResponse> {
	   

	private String securityGroupName;
	public ListAuditSecurityIpRequest() {
		super("vod", "2017-03-21", "ListAuditSecurityIp", "vod");
		setMethod(MethodType.POST);
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	@Override
	public Class<ListAuditSecurityIpResponse> getResponseClass() {
		return ListAuditSecurityIpResponse.class;
	}

}
