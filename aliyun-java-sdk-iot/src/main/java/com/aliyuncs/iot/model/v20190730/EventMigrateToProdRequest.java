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
public class EventMigrateToProdRequest extends RpcAcsRequest<EventMigrateToProdResponse> {
	
	public EventMigrateToProdRequest() {
		super("Iot", "2019-07-30", "EventMigrateToProd", "Iot");
	}

	private String identifier;

	private List<ArgsDTO> argsDTOs;

	private String description;

	private String productKey;

	private String type;

	private String deviceType;

	private Boolean required;

	private String iotInstanceId;

	private String name;

	private String categoryName;

	private List<Tag> tags;

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

	public List<ArgsDTO> getArgsDTOs() {
		return this.argsDTOs;
	}

	public void setArgsDTOs(List<ArgsDTO> argsDTOs) {
		this.argsDTOs = argsDTOs;	
		if (argsDTOs != null) {
			for (int depth1 = 0; depth1 < argsDTOs.size(); depth1++) {
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".Identifier" , argsDTOs.get(depth1).getIdentifier());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".InteractionId" , argsDTOs.get(depth1).getInteractionId());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".InteractionType" , argsDTOs.get(depth1).getInteractionType());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".DataType" , argsDTOs.get(depth1).getDataType());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".Name" , argsDTOs.get(depth1).getName());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".Definition" , argsDTOs.get(depth1).getDefinition());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".ParaOrder" , argsDTOs.get(depth1).getParaOrder());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".DataSpecsId" , argsDTOs.get(depth1).getDataSpecsId());
				putQueryParameter("ArgsDTO." + (depth1 + 1) + ".Direction" , argsDTOs.get(depth1).getDirection());
			}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".TagValue" , tags.get(depth1).getTagValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".TagKey" , tags.get(depth1).getTagKey());
			}
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

	public static class ArgsDTO {

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

	public static class Tag {

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
	public Class<EventMigrateToProdResponse> getResponseClass() {
		return EventMigrateToProdResponse.class;
	}

}
