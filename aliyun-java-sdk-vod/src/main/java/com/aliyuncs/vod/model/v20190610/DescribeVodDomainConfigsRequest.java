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

package com.aliyuncs.vod.model.v20190610;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainConfigsRequest extends RpcAcsRequest<DescribeVodDomainConfigsResponse> {
	   

	private String functionNames;

	private String domainName;

	private Long ownerId;

	private String securityToken;
	public DescribeVodDomainConfigsRequest() {
		super("vod", "2019-06-10", "DescribeVodDomainConfigs");
		setMethod(MethodType.POST);
	}

	public String getFunctionNames() {
		return this.functionNames;
	}

	public void setFunctionNames(String functionNames) {
		this.functionNames = functionNames;
		if(functionNames != null){
			putQueryParameter("FunctionNames", functionNames);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	@Override
	public Class<DescribeVodDomainConfigsResponse> getResponseClass() {
		return DescribeVodDomainConfigsResponse.class;
	}

}
