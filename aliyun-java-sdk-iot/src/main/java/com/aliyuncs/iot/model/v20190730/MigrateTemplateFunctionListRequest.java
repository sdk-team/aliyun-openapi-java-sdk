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

package com.aliyuncs.iot.model.v20190730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MigrateTemplateFunctionListRequest extends RpcAcsRequest<MigrateTemplateFunctionListResponse> {
	
	public MigrateTemplateFunctionListRequest() {
		super("Iot", "2019-07-30", "MigrateTemplateFunctionList");
		setMethod(MethodType.POST);
	}

	private String packInfo;

	private String extension;

	private String iotInstanceId;

	private String templateName;

	private String bizTenantId;

	private String templateKey;

	public String getPackInfo() {
		return this.packInfo;
	}

	public void setPackInfo(String packInfo) {
		this.packInfo = packInfo;
		if(packInfo != null){
			putQueryParameter("PackInfo", packInfo);
		}
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
		if(extension != null){
			putQueryParameter("Extension", extension);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getBizTenantId() {
		return this.bizTenantId;
	}

	public void setBizTenantId(String bizTenantId) {
		this.bizTenantId = bizTenantId;
		if(bizTenantId != null){
			putQueryParameter("BizTenantId", bizTenantId);
		}
	}

	public String getTemplateKey() {
		return this.templateKey;
	}

	public void setTemplateKey(String templateKey) {
		this.templateKey = templateKey;
		if(templateKey != null){
			putQueryParameter("TemplateKey", templateKey);
		}
	}

	@Override
	public Class<MigrateTemplateFunctionListResponse> getResponseClass() {
		return MigrateTemplateFunctionListResponse.class;
	}

}
