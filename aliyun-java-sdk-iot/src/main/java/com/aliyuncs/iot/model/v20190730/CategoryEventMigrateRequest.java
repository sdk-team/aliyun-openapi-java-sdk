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
public class CategoryEventMigrateRequest extends RpcAcsRequest<CategoryEventMigrateResponse> {
	
	public CategoryEventMigrateRequest() {
		super("Iot", "2019-07-30", "CategoryEventMigrate", "Iot");
	}

	private String iotInstanceId;

	private String namespace;

	private String categoryKey;

	private List<Event> events;

	private String bizTenantId;

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getCategoryKey() {
		return this.categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
		if(categoryKey != null){
			putQueryParameter("CategoryKey", categoryKey);
		}
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;	
		if (events != null) {
			for (int depth1 = 0; depth1 < events.size(); depth1++) {
				putQueryParameter("Event." + (depth1 + 1) + ".Identifier" , events.get(depth1).getIdentifier());
				putQueryParameter("Event." + (depth1 + 1) + ".Creator" , events.get(depth1).getCreator());
				putQueryParameter("Event." + (depth1 + 1) + ".ThingTemplateKey" , events.get(depth1).getThingTemplateKey());
				if (events.get(depth1).getArgsDTOs() != null) {
					for (int depth2 = 0; depth2 < events.get(depth1).getArgsDTOs().size(); depth2++) {
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".Identifier" , events.get(depth1).getArgsDTOs().get(depth2).getIdentifier());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".InteractionId" , events.get(depth1).getArgsDTOs().get(depth2).getInteractionId());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".InteractionType" , events.get(depth1).getArgsDTOs().get(depth2).getInteractionType());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".DataType" , events.get(depth1).getArgsDTOs().get(depth2).getDataType());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".Name" , events.get(depth1).getArgsDTOs().get(depth2).getName());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".Definition" , events.get(depth1).getArgsDTOs().get(depth2).getDefinition());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".ParaOrder" , events.get(depth1).getArgsDTOs().get(depth2).getParaOrder());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".DataSpecsId" , events.get(depth1).getArgsDTOs().get(depth2).getDataSpecsId());
						putQueryParameter("Event." + (depth1 + 1) + ".ArgsDTO." + (depth2 + 1) + ".Direction" , events.get(depth1).getArgsDTOs().get(depth2).getDirection());
					}
				}
				putQueryParameter("Event." + (depth1 + 1) + ".Modifier" , events.get(depth1).getModifier());
				putQueryParameter("Event." + (depth1 + 1) + ".Description" , events.get(depth1).getDescription());
				putQueryParameter("Event." + (depth1 + 1) + ".Type" , events.get(depth1).getType());
				putQueryParameter("Event." + (depth1 + 1) + ".DeviceType" , events.get(depth1).getDeviceType());
				putQueryParameter("Event." + (depth1 + 1) + ".Required" , events.get(depth1).getRequired());
				putQueryParameter("Event." + (depth1 + 1) + ".DataSpecsId" , events.get(depth1).getDataSpecsId());
				putQueryParameter("Event." + (depth1 + 1) + ".ThingTemplateName" , events.get(depth1).getThingTemplateName());
				putQueryParameter("Event." + (depth1 + 1) + ".TemplateType" , events.get(depth1).getTemplateType());
				putQueryParameter("Event." + (depth1 + 1) + ".Name" , events.get(depth1).getName());
				putQueryParameter("Event." + (depth1 + 1) + ".Namespace" , events.get(depth1).getNamespace());
				putQueryParameter("Event." + (depth1 + 1) + ".CategoryName" , events.get(depth1).getCategoryName());
				putQueryParameter("Event." + (depth1 + 1) + ".State" , events.get(depth1).getState());
				if (events.get(depth1).getTags() != null) {
					for (int depth2 = 0; depth2 < events.get(depth1).getTags().size(); depth2++) {
						putQueryParameter("Event." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".TagValue" , events.get(depth1).getTags().get(depth2).getTagValue());
						putQueryParameter("Event." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".TagKey" , events.get(depth1).getTags().get(depth2).getTagKey());
					}
				}
				putQueryParameter("Event." + (depth1 + 1) + ".AccessMode" , events.get(depth1).getAccessMode());
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

	public static class Event {

		private String identifier;

		private String creator;

		private String thingTemplateKey;

		private List<ArgsDTO> argsDTOs;

		private String modifier;

		private String description;

		private String type;

		private String deviceType;

		private Boolean required;

		private String dataSpecsId;

		private String thingTemplateName;

		private String templateType;

		private String name;

		private String namespace;

		private String categoryName;

		private Integer state;

		private List<Tag> tags;

		private String accessMode;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getThingTemplateKey() {
			return this.thingTemplateKey;
		}

		public void setThingTemplateKey(String thingTemplateKey) {
			this.thingTemplateKey = thingTemplateKey;
		}

		public List<ArgsDTO> getArgsDTOs() {
			return this.argsDTOs;
		}

		public void setArgsDTOs(List<ArgsDTO> argsDTOs) {
			this.argsDTOs = argsDTOs;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getDataSpecsId() {
			return this.dataSpecsId;
		}

		public void setDataSpecsId(String dataSpecsId) {
			this.dataSpecsId = dataSpecsId;
		}

		public String getThingTemplateName() {
			return this.thingTemplateName;
		}

		public void setThingTemplateName(String thingTemplateName) {
			this.thingTemplateName = thingTemplateName;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public String getAccessMode() {
			return this.accessMode;
		}

		public void setAccessMode(String accessMode) {
			this.accessMode = accessMode;
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
	}

	@Override
	public Class<CategoryEventMigrateResponse> getResponseClass() {
		return CategoryEventMigrateResponse.class;
	}

}
