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

package com.aliyuncs.ams.model.v20160201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadAppCertRequest extends RpcAcsRequest<UploadAppCertResponse> {
	
	public UploadAppCertRequest() {
		super("AMS", "2016-02-01", "UploadAppCert");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String bizToken;

	private String password;

	private String bizName;

	private String encodedCert;

	private Long appKey;

	private String certMode;

	public String getBizToken() {
		return this.bizToken;
	}

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
		if(bizToken != null){
			putQueryParameter("BizToken", bizToken);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
		if(bizName != null){
			putQueryParameter("BizName", bizName);
		}
	}

	public String getEncodedCert() {
		return this.encodedCert;
	}

	public void setEncodedCert(String encodedCert) {
		this.encodedCert = encodedCert;
		if(encodedCert != null){
			putQueryParameter("EncodedCert", encodedCert);
		}
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey.toString());
		}
	}

	public String getCertMode() {
		return this.certMode;
	}

	public void setCertMode(String certMode) {
		this.certMode = certMode;
		if(certMode != null){
			putQueryParameter("CertMode", certMode);
		}
	}

	@Override
	public Class<UploadAppCertResponse> getResponseClass() {
		return UploadAppCertResponse.class;
	}

}
