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
public class AddThingTemplatePropertyForTmallGenieRequest extends RpcAcsRequest<AddThingTemplatePropertyForTmallGenieResponse> {
	
	public AddThingTemplatePropertyForTmallGenieRequest() {
		super("Iot", "2019-07-30", "AddThingTemplatePropertyForTmallGenie", "Iot");
	}

	private String identifier;

	private String dataSpecs;

	private Long tmallFunctionId;

	private String rwType;

	private String dataType;

	private String iotInstanceId;

	private String name;

	private String description;

	private String dataSpecsList;

	private List<Tags> tagss;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
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

	public Long getTmallFunctionId() {
		return this.tmallFunctionId;
	}

	public void setTmallFunctionId(Long tmallFunctionId) {
		this.tmallFunctionId = tmallFunctionId;
		if(tmallFunctionId != null){
			putQueryParameter("TmallFunctionId", tmallFunctionId.toString());
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

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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
	public Class<AddThingTemplatePropertyForTmallGenieResponse> getResponseClass() {
		return AddThingTemplatePropertyForTmallGenieResponse.class;
	}

}
