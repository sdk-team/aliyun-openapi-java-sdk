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

package com.aliyuncs.ecsdemo.model.v20190620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInstance002Request extends RpcAcsRequest<GetInstance002Response> {
	   

	private String authKey;

	private String extraParams;

	private String serverClientIp;

	private String requestId;

	private String clientIp;

	private String identityDTO;

	private Long id;
	public GetInstance002Request() {
		super("EcsDemo", "2019-06-20", "GetInstance002");
		setMethod(MethodType.GET);
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getServerClientIp() {
		return this.serverClientIp;
	}

	public void setServerClientIp(String serverClientIp) {
		this.serverClientIp = serverClientIp;
		if(serverClientIp != null){
			putQueryParameter("ServerClientIp", serverClientIp);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public String getIdentityDTO() {
		return this.identityDTO;
	}

	public void setIdentityDTO(String identityDTO) {
		this.identityDTO = identityDTO;
		if(identityDTO != null){
			putBodyParameter("IdentityDTO", identityDTO);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<GetInstance002Response> getResponseClass() {
		return GetInstance002Response.class;
	}

}
