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
public class ServiceMigrateToProdRequest extends RpcAcsRequest<ServiceMigrateToProdResponse> {
	
	public ServiceMigrateToProdRequest() {
		super("Iot", "2019-07-30", "ServiceMigrateToProd", "iot");
	}

	private String identifier;

	private String description;

	private String productKey;

	private Boolean required;

	private List<Tags> tagss;

	private List<InputData> inputDatas;

	private List<OutputData> outputDatas;

	private String iotInstanceId;

	private String name;

	private String categoryName;

	private String callType;

	private String bizTenantId;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Boolean getRequired() {
		return this.required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
		if(required != null){
			putQueryParameter("Required", required.toString());
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

	public List<InputData> getInputDatas() {
		return this.inputDatas;
	}

	public void setInputDatas(List<InputData> inputDatas) {
		this.inputDatas = inputDatas;	
		if (inputDatas != null) {
			for (int depth1 = 0; depth1 < inputDatas.size(); depth1++) {
				putQueryParameter("InputData." + (depth1 + 1) + ".Identifier" , inputDatas.get(depth1).getIdentifier());
				putQueryParameter("InputData." + (depth1 + 1) + ".InteractionId" , inputDatas.get(depth1).getInteractionId());
				putQueryParameter("InputData." + (depth1 + 1) + ".InteractionType" , inputDatas.get(depth1).getInteractionType());
				putQueryParameter("InputData." + (depth1 + 1) + ".DataType" , inputDatas.get(depth1).getDataType());
				putQueryParameter("InputData." + (depth1 + 1) + ".Name" , inputDatas.get(depth1).getName());
				putQueryParameter("InputData." + (depth1 + 1) + ".Definition" , inputDatas.get(depth1).getDefinition());
				putQueryParameter("InputData." + (depth1 + 1) + ".ParaOrder" , inputDatas.get(depth1).getParaOrder());
				putQueryParameter("InputData." + (depth1 + 1) + ".DataSpecsId" , inputDatas.get(depth1).getDataSpecsId());
				putQueryParameter("InputData." + (depth1 + 1) + ".Direction" , inputDatas.get(depth1).getDirection());
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
				putQueryParameter("OutputData." + (depth1 + 1) + ".InteractionId" , outputDatas.get(depth1).getInteractionId());
				putQueryParameter("OutputData." + (depth1 + 1) + ".InteractionType" , outputDatas.get(depth1).getInteractionType());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataType" , outputDatas.get(depth1).getDataType());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Name" , outputDatas.get(depth1).getName());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Definition" , outputDatas.get(depth1).getDefinition());
				putQueryParameter("OutputData." + (depth1 + 1) + ".ParaOrder" , outputDatas.get(depth1).getParaOrder());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataSpecsId" , outputDatas.get(depth1).getDataSpecsId());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Direction" , outputDatas.get(depth1).getDirection());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putQueryParameter("CategoryName", categoryName);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType);
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

	public static class InputData {

		private String identifier;

		private Long interactionId;

		private String interactionType;

		private String dataType;

		private String name;

		private String definition;

		private Integer paraOrder;

		private String dataSpecsId;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public Long getInteractionId() {
			return this.interactionId;
		}

		public void setInteractionId(Long interactionId) {
			this.interactionId = interactionId;
		}

		public String getInteractionType() {
			return this.interactionType;
		}

		public void setInteractionType(String interactionType) {
			this.interactionType = interactionType;
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

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public Integer getParaOrder() {
			return this.paraOrder;
		}

		public void setParaOrder(Integer paraOrder) {
			this.paraOrder = paraOrder;
		}

		public String getDataSpecsId() {
			return this.dataSpecsId;
		}

		public void setDataSpecsId(String dataSpecsId) {
			this.dataSpecsId = dataSpecsId;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
	}

	public static class OutputData {

		private String identifier;

		private Long interactionId;

		private String interactionType;

		private String dataType;

		private String name;

		private String definition;

		private Integer paraOrder;

		private String dataSpecsId;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public Long getInteractionId() {
			return this.interactionId;
		}

		public void setInteractionId(Long interactionId) {
			this.interactionId = interactionId;
		}

		public String getInteractionType() {
			return this.interactionType;
		}

		public void setInteractionType(String interactionType) {
			this.interactionType = interactionType;
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

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public Integer getParaOrder() {
			return this.paraOrder;
		}

		public void setParaOrder(Integer paraOrder) {
			this.paraOrder = paraOrder;
		}

		public String getDataSpecsId() {
			return this.dataSpecsId;
		}

		public void setDataSpecsId(String dataSpecsId) {
			this.dataSpecsId = dataSpecsId;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
	}

	@Override
	public Class<ServiceMigrateToProdResponse> getResponseClass() {
		return ServiceMigrateToProdResponse.class;
	}

}
