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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RemoveThingTemplateFunctionForTmallGenieRequest extends RpcAcsRequest<RemoveThingTemplateFunctionForTmallGenieResponse> {
	
	public RemoveThingTemplateFunctionForTmallGenieRequest() {
		super("Iot", "2019-07-30", "RemoveThingTemplateFunctionForTmallGenie", "iot");
	}

	private String thingTemplateKey;

	private List<Long> tmallServiceFunctionIdss;

	private String iotInstanceId;

	private List<Long> tmallEventFunctionIdss;

	private List<Long> tmallPropertyFunctionIdss;

	public String getThingTemplateKey() {
		return this.thingTemplateKey;
	}

	public void setThingTemplateKey(String thingTemplateKey) {
		this.thingTemplateKey = thingTemplateKey;
		if(thingTemplateKey != null){
			putQueryParameter("ThingTemplateKey", thingTemplateKey);
		}
	}

	public List<Long> getTmallServiceFunctionIdss() {
		return this.tmallServiceFunctionIdss;
	}

	public void setTmallServiceFunctionIdss(List<Long> tmallServiceFunctionIdss) {
		this.tmallServiceFunctionIdss = tmallServiceFunctionIdss;	
		if (tmallServiceFunctionIdss != null) {
			for (int i = 0; i < tmallServiceFunctionIdss.size(); i++) {
				putQueryParameter("TmallServiceFunctionIds." + (i + 1) , tmallServiceFunctionIdss.get(i));
			}
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

	public List<Long> getTmallEventFunctionIdss() {
		return this.tmallEventFunctionIdss;
	}

	public void setTmallEventFunctionIdss(List<Long> tmallEventFunctionIdss) {
		this.tmallEventFunctionIdss = tmallEventFunctionIdss;	
		if (tmallEventFunctionIdss != null) {
			for (int i = 0; i < tmallEventFunctionIdss.size(); i++) {
				putQueryParameter("TmallEventFunctionIds." + (i + 1) , tmallEventFunctionIdss.get(i));
			}
		}	
	}

	public List<Long> getTmallPropertyFunctionIdss() {
		return this.tmallPropertyFunctionIdss;
	}

	public void setTmallPropertyFunctionIdss(List<Long> tmallPropertyFunctionIdss) {
		this.tmallPropertyFunctionIdss = tmallPropertyFunctionIdss;	
		if (tmallPropertyFunctionIdss != null) {
			for (int i = 0; i < tmallPropertyFunctionIdss.size(); i++) {
				putQueryParameter("TmallPropertyFunctionIds." + (i + 1) , tmallPropertyFunctionIdss.get(i));
			}
		}	
	}

	@Override
	public Class<RemoveThingTemplateFunctionForTmallGenieResponse> getResponseClass() {
		return RemoveThingTemplateFunctionForTmallGenieResponse.class;
	}

}
