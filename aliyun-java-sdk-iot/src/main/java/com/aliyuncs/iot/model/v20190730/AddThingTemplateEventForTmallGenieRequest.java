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
public class AddThingTemplateEventForTmallGenieRequest extends RpcAcsRequest<AddThingTemplateEventForTmallGenieResponse> {
	   

	private Long tmallFunctionId;

	private String iotInstanceId;

	private String identifier;

	private List<Tags> tagss;

	private List<OutputData> outputDatas;

	private String apiProduct;

	private String name;

	private String apiRevision;

	private String eventType;
	public AddThingTemplateEventForTmallGenieRequest() {
		super("Iot", "2019-07-30", "AddThingTemplateEventForTmallGenie");
		setMethod(MethodType.POST);
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

	public List<OutputData> getOutputDatas() {
		return this.outputDatas;
	}

	public void setOutputDatas(List<OutputData> outputDatas) {
		this.outputDatas = outputDatas;	
		if (outputDatas != null) {
			for (int depth1 = 0; depth1 < outputDatas.size(); depth1++) {
				putQueryParameter("OutputData." + (depth1 + 1) + ".Identifier" , outputDatas.get(depth1).getIdentifier());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataSpecs" , outputDatas.get(depth1).getDataSpecs());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataType" , outputDatas.get(depth1).getDataType());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Name" , outputDatas.get(depth1).getName());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataSpecsList" , outputDatas.get(depth1).getDataSpecsList());
				putQueryParameter("OutputData." + (depth1 + 1) + ".ParaOrder" , outputDatas.get(depth1).getParaOrder());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Direction" , outputDatas.get(depth1).getDirection());
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

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
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

	public static class OutputData {

		private String identifier;

		private String dataSpecs;

		private String dataType;

		private String name;

		private String dataSpecsList;

		private Integer paraOrder;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDataSpecs() {
			return this.dataSpecs;
		}

		public void setDataSpecs(String dataSpecs) {
			this.dataSpecs = dataSpecs;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDataSpecsList() {
			return this.dataSpecsList;
		}

		public void setDataSpecsList(String dataSpecsList) {
			this.dataSpecsList = dataSpecsList;
		}

		public Integer getParaOrder() {
			return this.paraOrder;
		}

		public void setParaOrder(Integer paraOrder) {
			this.paraOrder = paraOrder;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
	}

	@Override
	public Class<AddThingTemplateEventForTmallGenieResponse> getResponseClass() {
		return AddThingTemplateEventForTmallGenieResponse.class;
	}

}
