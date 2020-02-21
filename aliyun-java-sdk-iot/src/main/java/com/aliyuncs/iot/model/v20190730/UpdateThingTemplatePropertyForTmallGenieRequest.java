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
public class UpdateThingTemplatePropertyForTmallGenieRequest extends RpcAcsRequest<UpdateThingTemplatePropertyForTmallGenieResponse> {
	   

	private String dataSpecs;

	private String thingTemplateKey;

	private String description;

	private String dataSpecsList;

	private Long tmallFunctionId;

	private String iotInstanceId;

	private String identifier;

	private List<Tags> tagss;

	private String rwType;

	private String apiProduct;

	private String name;

	private String apiRevision;
	public UpdateThingTemplatePropertyForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateThingTemplatePropertyForTmallGenie");
		setMethod(MethodType.POST);
	}

	public String getDataSpecs() {
		return this.dataSpecs;
	}

	public void setDataSpecs(String dataSpecs) {
		this.dataSpecs = dataSpecs;
		if(dataSpecs != null){
			putQueryParameter("DataSpecs", dataSpecs);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDataSpecsList() {
		return this.dataSpecsList;
	}

	public void setDataSpecsList(String dataSpecsList) {
		this.dataSpecsList = dataSpecsList;
		if(dataSpecsList != null){
			putQueryParameter("DataSpecsList", dataSpecsList);
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

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".TagValue" , tagss.get(depth1).getTagValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".TagKey" , tagss.get(depth1).getTagKey());
			}
		}	
	}

	public String getRwType() {
		return this.rwType;
	}

	public void setRwType(String rwType) {
		this.rwType = rwType;
		if(rwType != null){
			putQueryParameter("RwType", rwType);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public static class Tags {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public Class<UpdateThingTemplatePropertyForTmallGenieResponse> getResponseClass() {
		return UpdateThingTemplatePropertyForTmallGenieResponse.class;
	}

}
