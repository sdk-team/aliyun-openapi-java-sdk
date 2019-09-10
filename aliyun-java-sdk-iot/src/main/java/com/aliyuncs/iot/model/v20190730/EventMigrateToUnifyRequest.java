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
public class EventMigrateToUnifyRequest extends RpcAcsRequest<EventMigrateToUnifyResponse> {
	
	public EventMigrateToUnifyRequest() {
		super("Iot", "2019-07-30", "EventMigrateToUnify");
		setMethod(MethodType.POST);
	}

	private String thingTemplateKey;

	private List<ArgsDTO> argsDTOs;

	private String modifier;

	private String categoryKey;

	private String description;

	private String type;

	private String deviceType;

	private Boolean required;

	private String templateType;

	private String iotInstanceId;

	private Integer state;

	private List<Tag> tags;

	private String identifier;

	private String creator;

	private String thingTemplateName;

	private String name;

	private String namespace;

	private String categoryName;

	private String bizTenantId;

	public String getThingTemplateKey() {
		return this.thingTemplateKey;
	}

	public void setThingTemplateKey(String thingTemplateKey) {
		this.thingTemplateKey = thingTemplateKey;
		if(thingTemplateKey != null){
			putQueryParameter("ThingTemplateKey", thingTemplateKey);
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

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putQueryParameter("Modifier", modifier);
		}
	}

	public String getCategoryKey() {
		return this.categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
		if(categoryKey != null){
			putQueryParameter("CategoryKey", categoryKey);
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

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType);
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

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state.toString());
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

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getThingTemplateName() {
		return this.thingTemplateName;
	}

	public void setThingTemplateName(String thingTemplateName) {
		this.thingTemplateName = thingTemplateName;
		if(thingTemplateName != null){
			putQueryParameter("ThingTemplateName", thingTemplateName);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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
	public Class<EventMigrateToUnifyResponse> getResponseClass() {
		return EventMigrateToUnifyResponse.class;
	}

}
