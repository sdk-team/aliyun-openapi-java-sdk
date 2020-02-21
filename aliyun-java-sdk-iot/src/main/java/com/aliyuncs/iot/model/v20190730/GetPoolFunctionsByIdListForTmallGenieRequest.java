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
public class GetPoolFunctionsByIdListForTmallGenieRequest extends RpcAcsRequest<GetPoolFunctionsByIdListForTmallGenieResponse> {
	   

	private List<Long> tmallFunctionIdLists;

	private String thingTemplateKey;

	private List<String> identifierLists;

	private String iotInstanceId;

	private String tmallFunctionType;

	private String apiProduct;

	private String apiRevision;
	public GetPoolFunctionsByIdListForTmallGenieRequest() {
		super("Iot", "2019-07-30", "GetPoolFunctionsByIdListForTmallGenie");
		setMethod(MethodType.POST);
	}

	public List<Long> getTmallFunctionIdLists() {
		return this.tmallFunctionIdLists;
	}

	public void setTmallFunctionIdLists(List<Long> tmallFunctionIdLists) {
		this.tmallFunctionIdLists = tmallFunctionIdLists;	
		if (tmallFunctionIdLists != null) {
			for (int i = 0; i < tmallFunctionIdLists.size(); i++) {
				putQueryParameter("TmallFunctionIdList." + (i + 1) , tmallFunctionIdLists.get(i));
			}
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

	public List<String> getIdentifierLists() {
		return this.identifierLists;
	}

	public void setIdentifierLists(List<String> identifierLists) {
		this.identifierLists = identifierLists;	
		if (identifierLists != null) {
			for (int i = 0; i < identifierLists.size(); i++) {
				putQueryParameter("IdentifierList." + (i + 1) , identifierLists.get(i));
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

	public String getTmallFunctionType() {
		return this.tmallFunctionType;
	}

	public void setTmallFunctionType(String tmallFunctionType) {
		this.tmallFunctionType = tmallFunctionType;
		if(tmallFunctionType != null){
			putQueryParameter("TmallFunctionType", tmallFunctionType);
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

	@Override
	public Class<GetPoolFunctionsByIdListForTmallGenieResponse> getResponseClass() {
		return GetPoolFunctionsByIdListForTmallGenieResponse.class;
	}

}
