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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20190730.QueryProductInfoForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductInfoForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private String dslString;

	private List<Property> properties;

	private List<Event> events;

	private List<Service> services;

	private ProductInfo productInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDslString() {
		return this.dslString;
	}

	public void setDslString(String dslString) {
		this.dslString = dslString;
	}

	public List<Property> getProperties() {
		return this.properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public static class Property {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String dataType;

		private String rwType;

		private String name;

		private String dataSpecs;

		private String identifier;

		private String description;

		private String dataSpecsList;

		private List<Tag> tags;

		public Long getTmallFunctionId() {
			return this.tmallFunctionId;
		}

		public void setTmallFunctionId(Long tmallFunctionId) {
			this.tmallFunctionId = tmallFunctionId;
		}

		public String getThingTemplateKey() {
			return this.thingTemplateKey;
		}

		public void setThingTemplateKey(String thingTemplateKey) {
			this.thingTemplateKey = thingTemplateKey;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getRwType() {
			return this.rwType;
		}

		public void setRwType(String rwType) {
			this.rwType = rwType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDataSpecs() {
			return this.dataSpecs;
		}

		public void setDataSpecs(String dataSpecs) {
			this.dataSpecs = dataSpecs;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDataSpecsList() {
			return this.dataSpecsList;
		}

		public void setDataSpecsList(String dataSpecsList) {
			this.dataSpecsList = dataSpecsList;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	public static class Event {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String eventType;

		private String name;

		private String identifier;

		private String description;

		private List<Argument> outputData;

		private List<Tag2> tags1;

		public Long getTmallFunctionId() {
			return this.tmallFunctionId;
		}

		public void setTmallFunctionId(Long tmallFunctionId) {
			this.tmallFunctionId = tmallFunctionId;
		}

		public String getThingTemplateKey() {
			return this.thingTemplateKey;
		}

		public void setThingTemplateKey(String thingTemplateKey) {
			this.thingTemplateKey = thingTemplateKey;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Argument> getOutputData() {
			return this.outputData;
		}

		public void setOutputData(List<Argument> outputData) {
			this.outputData = outputData;
		}

		public List<Tag2> getTags1() {
			return this.tags1;
		}

		public void setTags1(List<Tag2> tags1) {
			this.tags1 = tags1;
		}

		public static class Argument {

			private Long id;

			private String dataType;

			private String identifier;

			private String name;

			private Integer paraOrder;

			private String dataSpecs;

			private String dataSpecsList;

			private Long tmallFunctionId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getParaOrder() {
				return this.paraOrder;
			}

			public void setParaOrder(Integer paraOrder) {
				this.paraOrder = paraOrder;
			}

			public String getDataSpecs() {
				return this.dataSpecs;
			}

			public void setDataSpecs(String dataSpecs) {
				this.dataSpecs = dataSpecs;
			}

			public String getDataSpecsList() {
				return this.dataSpecsList;
			}

			public void setDataSpecsList(String dataSpecsList) {
				this.dataSpecsList = dataSpecsList;
			}

			public Long getTmallFunctionId() {
				return this.tmallFunctionId;
			}

			public void setTmallFunctionId(Long tmallFunctionId) {
				this.tmallFunctionId = tmallFunctionId;
			}
		}

		public static class Tag2 {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	public static class Service {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String callType;

		private String name;

		private String identifier;

		private String description;

		private List<Argument4> inputParams;

		private List<Argument5> outputParams;

		private List<Tag6> tags3;

		public Long getTmallFunctionId() {
			return this.tmallFunctionId;
		}

		public void setTmallFunctionId(Long tmallFunctionId) {
			this.tmallFunctionId = tmallFunctionId;
		}

		public String getThingTemplateKey() {
			return this.thingTemplateKey;
		}

		public void setThingTemplateKey(String thingTemplateKey) {
			this.thingTemplateKey = thingTemplateKey;
		}

		public String getCallType() {
			return this.callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Argument4> getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(List<Argument4> inputParams) {
			this.inputParams = inputParams;
		}

		public List<Argument5> getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(List<Argument5> outputParams) {
			this.outputParams = outputParams;
		}

		public List<Tag6> getTags3() {
			return this.tags3;
		}

		public void setTags3(List<Tag6> tags3) {
			this.tags3 = tags3;
		}

		public static class Argument4 {

			private Long id;

			private String dataType;

			private String identifier;

			private String name;

			private Integer paraOrder;

			private String direction;

			private String dataSpecs;

			private String dataSpecsList;

			private Long tmallFunctionId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getDataSpecs() {
				return this.dataSpecs;
			}

			public void setDataSpecs(String dataSpecs) {
				this.dataSpecs = dataSpecs;
			}

			public String getDataSpecsList() {
				return this.dataSpecsList;
			}

			public void setDataSpecsList(String dataSpecsList) {
				this.dataSpecsList = dataSpecsList;
			}

			public Long getTmallFunctionId() {
				return this.tmallFunctionId;
			}

			public void setTmallFunctionId(Long tmallFunctionId) {
				this.tmallFunctionId = tmallFunctionId;
			}
		}

		public static class Argument5 {

			private Long id;

			private String dataType;

			private String identifier;

			private Integer paraOrder;

			private String direction;

			private String name;

			private String dataSpecs;

			private String dataSpecsList;

			private Long tmallFunctionId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
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

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDataSpecs() {
				return this.dataSpecs;
			}

			public void setDataSpecs(String dataSpecs) {
				this.dataSpecs = dataSpecs;
			}

			public String getDataSpecsList() {
				return this.dataSpecsList;
			}

			public void setDataSpecsList(String dataSpecsList) {
				this.dataSpecsList = dataSpecsList;
			}

			public Long getTmallFunctionId() {
				return this.tmallFunctionId;
			}

			public void setTmallFunctionId(Long tmallFunctionId) {
				this.tmallFunctionId = tmallFunctionId;
			}
		}

		public static class Tag6 {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	public static class ProductInfo {

		private String gmtCreate;

		private Integer dataFormat;

		private String description;

		private Integer nodeType;

		private String productKey;

		private String productName;

		private String brand;

		private String productModel;

		private String productSecret;

		private String categoryName;

		private String categoryKey;

		private String aliyunCommodityCode;

		private Boolean id2;

		private String protocolType;

		private String productStatus;

		private Long scriptId;

		private Boolean owner;

		private Integer netType;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getDataFormat() {
			return this.dataFormat;
		}

		public void setDataFormat(Integer dataFormat) {
			this.dataFormat = dataFormat;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(Integer nodeType) {
			this.nodeType = nodeType;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getBrand() {
			return this.brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getProductModel() {
			return this.productModel;
		}

		public void setProductModel(String productModel) {
			this.productModel = productModel;
		}

		public String getProductSecret() {
			return this.productSecret;
		}

		public void setProductSecret(String productSecret) {
			this.productSecret = productSecret;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryKey() {
			return this.categoryKey;
		}

		public void setCategoryKey(String categoryKey) {
			this.categoryKey = categoryKey;
		}

		public String getAliyunCommodityCode() {
			return this.aliyunCommodityCode;
		}

		public void setAliyunCommodityCode(String aliyunCommodityCode) {
			this.aliyunCommodityCode = aliyunCommodityCode;
		}

		public Boolean getId2() {
			return this.id2;
		}

		public void setId2(Boolean id2) {
			this.id2 = id2;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getProductStatus() {
			return this.productStatus;
		}

		public void setProductStatus(String productStatus) {
			this.productStatus = productStatus;
		}

		public Long getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(Long scriptId) {
			this.scriptId = scriptId;
		}

		public Boolean getOwner() {
			return this.owner;
		}

		public void setOwner(Boolean owner) {
			this.owner = owner;
		}

		public Integer getNetType() {
			return this.netType;
		}

		public void setNetType(Integer netType) {
			this.netType = netType;
		}
	}

	@Override
	public QueryProductInfoForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	QueryProductInfoForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}
