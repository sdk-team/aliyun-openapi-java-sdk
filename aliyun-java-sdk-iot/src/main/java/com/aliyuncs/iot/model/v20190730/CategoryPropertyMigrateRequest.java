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
public class CategoryPropertyMigrateRequest extends RpcAcsRequest<CategoryPropertyMigrateResponse> {
	
	public CategoryPropertyMigrateRequest() {
		super("Iot", "2019-07-30", "CategoryPropertyMigrate");
		setMethod(MethodType.POST);
	}

	private String categoryKey;

	private String iotInstanceId;

	private String namespace;

	private List<Property> propertys;

	private String bizTenantId;

	public String getCategoryKey() {
		return this.categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
		if(categoryKey != null){
			putQueryParameter("CategoryKey", categoryKey);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public List<Property> getPropertys() {
		return this.propertys;
	}

	public void setPropertys(List<Property> propertys) {
		this.propertys = propertys;	
		if (propertys != null) {
			for (int depth1 = 0; depth1 < propertys.size(); depth1++) {
				putQueryParameter("Property." + (depth1 + 1) + ".Identifier" , propertys.get(depth1).getIdentifier());
				putQueryParameter("Property." + (depth1 + 1) + ".Creator" , propertys.get(depth1).getCreator());
				putQueryParameter("Property." + (depth1 + 1) + ".ThingTemplateKey" , propertys.get(depth1).getThingTemplateKey());
				putQueryParameter("Property." + (depth1 + 1) + ".Modifier" , propertys.get(depth1).getModifier());
				putQueryParameter("Property." + (depth1 + 1) + ".Description" , propertys.get(depth1).getDescription());
				putQueryParameter("Property." + (depth1 + 1) + ".DeviceType" , propertys.get(depth1).getDeviceType());
				putQueryParameter("Property." + (depth1 + 1) + ".Required" , propertys.get(depth1).getRequired());
				putQueryParameter("Property." + (depth1 + 1) + ".DataSpecsId" , propertys.get(depth1).getDataSpecsId());
				putQueryParameter("Property." + (depth1 + 1) + ".ThingTemplateName" , propertys.get(depth1).getThingTemplateName());
				putQueryParameter("Property." + (depth1 + 1) + ".DataType" , propertys.get(depth1).getDataType());
				putQueryParameter("Property." + (depth1 + 1) + ".TemplateType" , propertys.get(depth1).getTemplateType());
				putQueryParameter("Property." + (depth1 + 1) + ".Name" , propertys.get(depth1).getName());
				putQueryParameter("Property." + (depth1 + 1) + ".Namespace" , propertys.get(depth1).getNamespace());
				putQueryParameter("Property." + (depth1 + 1) + ".CategoryName" , propertys.get(depth1).getCategoryName());
				putQueryParameter("Property." + (depth1 + 1) + ".Definition" , propertys.get(depth1).getDefinition());
				putQueryParameter("Property." + (depth1 + 1) + ".State" , propertys.get(depth1).getState());
				if (propertys.get(depth1).getTags() != null) {
					for (int depth2 = 0; depth2 < propertys.get(depth1).getTags().size(); depth2++) {
						putQueryParameter("Property." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".TagValue" , propertys.get(depth1).getTags().get(depth2).getTagValue());
						putQueryParameter("Property." + (depth1 + 1) + ".Tag." + (depth2 + 1) + ".TagKey" , propertys.get(depth1).getTags().get(depth2).getTagKey());
					}
				}
				putQueryParameter("Property." + (depth1 + 1) + ".AccessMode" , propertys.get(depth1).getAccessMode());
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

	public static class Property {

		private String identifier;

		private String creator;

		private String thingTemplateKey;

		private String modifier;

		private String description;

		private String deviceType;

		private Boolean required;

		private String dataSpecsId;

		private String thingTemplateName;

		private String dataType;

		private String templateType;

		private String name;

		private String namespace;

		private String categoryName;

		private String definition;

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

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
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

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
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
	public Class<CategoryPropertyMigrateResponse> getResponseClass() {
		return CategoryPropertyMigrateResponse.class;
	}

}
