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

/**
 * @author auto create
 * @version 
 */
public class GetThingTemplateFunctionForTmallGenieRequest extends RpcAcsRequest<GetThingTemplateFunctionForTmallGenieResponse> {
	
	public GetThingTemplateFunctionForTmallGenieRequest() {
		super("Iot", "2019-07-30", "GetThingTemplateFunctionForTmallGenie", "Iot");
	}

	private String identifier;

	private String thingTemplateKey;

	private Long tmallFunctionId;

	private String iotInstanceId;

	private String tmallFunctionType;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getThingTemplateKey() {
		return this.thingTemplateKey;
	}

	public void setThingTemplateKey(String thingTemplateKey) {
		this.thingTemplateKey = thingTemplateKey;
		if(thingTemplateKey != null){
			putQueryParameter("ThingTemplateKey", thingTemplateKey);
		}
	}

	public Long getTmallFunctionId() {
		return this.tmallFunctionId;
	}

	public void setTmallFunctionId(Long tmallFunctionId) {
		this.tmallFunctionId = tmallFunctionId;
		if(tmallFunctionId != null){
			putQueryParameter("TmallFunctionId", tmallFunctionId.toString());
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

	public String getTmallFunctionType() {
		return this.tmallFunctionType;
	}

	public void setTmallFunctionType(String tmallFunctionType) {
		this.tmallFunctionType = tmallFunctionType;
		if(tmallFunctionType != null){
			putQueryParameter("TmallFunctionType", tmallFunctionType);
		}
	}

	@Override
	public Class<GetThingTemplateFunctionForTmallGenieResponse> getResponseClass() {
		return GetThingTemplateFunctionForTmallGenieResponse.class;
	}

}
