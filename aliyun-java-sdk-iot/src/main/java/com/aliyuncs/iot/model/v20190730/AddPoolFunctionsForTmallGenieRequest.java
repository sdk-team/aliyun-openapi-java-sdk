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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddPoolFunctionsForTmallGenieRequest extends RpcAcsRequest<AddPoolFunctionsForTmallGenieResponse> {
	   

	private String thingTemplateKey;

	private List<Long> tmallEventIdLists;

	private String iotInstanceId;

	private List<Long> tmallServiceIdLists;

	private String apiProduct;

	private String apiRevision;

	private List<Long> tmallPropertyIdLists;
	public AddPoolFunctionsForTmallGenieRequest() {
		super("Iot", "2019-07-30", "AddPoolFunctionsForTmallGenie");
		setMethod(MethodType.POST);
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

	public List<Long> getTmallEventIdLists() {
		return this.tmallEventIdLists;
	}

	public void setTmallEventIdLists(List<Long> tmallEventIdLists) {
		this.tmallEventIdLists = tmallEventIdLists;	
		if (tmallEventIdLists != null) {
			for (int i = 0; i < tmallEventIdLists.size(); i++) {
				putQueryParameter("TmallEventIdList." + (i + 1) , tmallEventIdLists.get(i));
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

	public List<Long> getTmallServiceIdLists() {
		return this.tmallServiceIdLists;
	}

	public void setTmallServiceIdLists(List<Long> tmallServiceIdLists) {
		this.tmallServiceIdLists = tmallServiceIdLists;	
		if (tmallServiceIdLists != null) {
			for (int i = 0; i < tmallServiceIdLists.size(); i++) {
				putQueryParameter("TmallServiceIdList." + (i + 1) , tmallServiceIdLists.get(i));
			}
		}	
	}

	public String getApiProduct() {
		return this.apiProduct;
	}

	public void setApiProduct(String apiProduct) {
		this.apiProduct = apiProduct;
		if(apiProduct != null){
			putBodyParameter("ApiProduct", apiProduct);
		}
	}

	public String getApiRevision() {
		return this.apiRevision;
	}

	public void setApiRevision(String apiRevision) {
		this.apiRevision = apiRevision;
		if(apiRevision != null){
			putBodyParameter("ApiRevision", apiRevision);
		}
	}

	public List<Long> getTmallPropertyIdLists() {
		return this.tmallPropertyIdLists;
	}

	public void setTmallPropertyIdLists(List<Long> tmallPropertyIdLists) {
		this.tmallPropertyIdLists = tmallPropertyIdLists;	
		if (tmallPropertyIdLists != null) {
			for (int i = 0; i < tmallPropertyIdLists.size(); i++) {
				putQueryParameter("TmallPropertyIdList." + (i + 1) , tmallPropertyIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<AddPoolFunctionsForTmallGenieResponse> getResponseClass() {
		return AddPoolFunctionsForTmallGenieResponse.class;
	}

}
