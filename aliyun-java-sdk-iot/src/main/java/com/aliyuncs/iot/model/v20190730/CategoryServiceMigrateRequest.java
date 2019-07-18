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
public class CategoryServiceMigrateRequest extends RpcAcsRequest<CategoryServiceMigrateResponse> {
	
	public CategoryServiceMigrateRequest() {
		super("Iot", "2019-07-30", "CategoryServiceMigrate", "Iot");
	}

	private List<Service> services;

	private String iotInstanceId;

	private String namespace;

	private String categoryKey;

	private String bizTenantId;

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;	
		if (services != null) {
			for (int depth1 = 0; depth1 < services.size(); depth1++) {
				putQueryParameter("Service." + (depth1 + 1) + ".Identifier" , services.get(depth1).getIdentifier());
				putQueryParameter("Service." + (depth1 + 1) + ".Creator" , services.get(depth1).getCreator());
				putQueryParameter("Service." + (depth1 + 1) + ".ThingTemplateKey" , services.get(depth1).getThingTemplateKey());
				putQueryParameter("Service." + (depth1 + 1) + ".ArgsDTO" , services.get(depth1).getArgsDTO());
				putQueryParameter("Service." + (depth1 + 1) + ".Modifier" , services.get(depth1).getModifier());
				putQueryParameter("Service." + (depth1 + 1) + ".Description" , services.get(depth1).getDescription());
				putQueryParameter("Service." + (depth1 + 1) + ".DeviceType" , services.get(depth1).getDeviceType());
				putQueryParameter("Service." + (depth1 + 1) + ".Required" , services.get(depth1).getRequired());
				putQueryParameter("Service." + (depth1 + 1) + ".DataSpecsId" , services.get(depth1).getDataSpecsId());
				putQueryParameter("Service." + (depth1 + 1) + ".ThingTemplateName" , services.get(depth1).getThingTemplateName());
				putQueryParameter("Service." + (depth1 + 1) + ".TemplateType" , services.get(depth1).getTemplateType());
				putQueryParameter("Service." + (depth1 + 1) + ".Name" , services.get(depth1).getName());
				putQueryParameter("Service." + (depth1 + 1) + ".Namespace" , services.get(depth1).getNamespace());
				putQueryParameter("Service." + (depth1 + 1) + ".CategoryName" , services.get(depth1).getCategoryName());
				putQueryParameter("Service." + (depth1 + 1) + ".State" , services.get(depth1).getState());
				putQueryParameter("Service." + (depth1 + 1) + ".Tag" , services.get(depth1).getTag());
				putQueryParameter("Service." + (depth1 + 1) + ".CallType" , services.get(depth1).getCallType());
				putQueryParameter("Service." + (depth1 + 1) + ".AccessMode" , services.get(depth1).getAccessMode());
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

	public String getBizTenantId() {
		return this.bizTenantId;
	}

	public void setBizTenantId(String bizTenantId) {
		this.bizTenantId = bizTenantId;
		if(bizTenantId != null){
			putQueryParameter("BizTenantId", bizTenantId);
		}
	}

	public static class Service {

		private String identifier;

		private String creator;

		private String thingTemplateKey;

		private String argsDTO;

		private String modifier;

		private String description;

		private String deviceType;

		private Boolean required;

		private String dataSpecsId;

		private String thingTemplateName;

		private String templateType;

		private String name;

		private String namespace;

		private String categoryName;

		private Integer state;

		private String tag;

		private String callType;

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

		public String getArgsDTO() {
			return this.argsDTO;
		}

		public void setArgsDTO(String argsDTO) {
			this.argsDTO = argsDTO;
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

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getCallType() {
			return this.callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getAccessMode() {
			return this.accessMode;
		}

		public void setAccessMode(String accessMode) {
			this.accessMode = accessMode;
		}
	}

	@Override
	public Class<CategoryServiceMigrateResponse> getResponseClass() {
		return CategoryServiceMigrateResponse.class;
	}

}
