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
import com.google.gson.Gson;

/**
 * @author auto create
 * @version 
 */
public class AddPoolFunctionsForTmallGenieRequest extends RpcAcsRequest<AddPoolFunctionsForTmallGenieResponse> {
	
	public AddPoolFunctionsForTmallGenieRequest() {
		super("Iot", "2019-07-30", "AddPoolFunctionsForTmallGenie", "iot");
	}

	private List<Object> tmallServiceIdList;

	private String thingTemplateKey;

	private List<Object> tmallEventIdList;

	private String iotInstanceId;

	private List<Object> tmallPropertyIdList;

	public List<Object> getTmallServiceIdList() {
		return this.tmallServiceIdList;
	}

	public void setTmallServiceIdList(List<Object> tmallServiceIdList) {
		this.tmallServiceIdList = tmallServiceIdList;
		if(tmallServiceIdList != null){
			putQueryParameter("TmallServiceIdList", new Gson().toJson(tmallServiceIdList));
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

	public List<Object> getTmallEventIdList() {
		return this.tmallEventIdList;
	}

	public void setTmallEventIdList(List<Object> tmallEventIdList) {
		this.tmallEventIdList = tmallEventIdList;
		if(tmallEventIdList != null){
			putQueryParameter("TmallEventIdList", new Gson().toJson(tmallEventIdList));
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

	public List<Object> getTmallPropertyIdList() {
		return this.tmallPropertyIdList;
	}

	public void setTmallPropertyIdList(List<Object> tmallPropertyIdList) {
		this.tmallPropertyIdList = tmallPropertyIdList;
		if(tmallPropertyIdList != null){
			putQueryParameter("TmallPropertyIdList", new Gson().toJson(tmallPropertyIdList));
		}
	}

	@Override
	public Class<AddPoolFunctionsForTmallGenieResponse> getResponseClass() {
		return AddPoolFunctionsForTmallGenieResponse.class;
	}

}
