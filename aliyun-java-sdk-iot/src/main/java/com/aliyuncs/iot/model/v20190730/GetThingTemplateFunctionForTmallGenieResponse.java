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
import com.aliyuncs.iot.transform.v20190730.GetThingTemplateFunctionForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetThingTemplateFunctionForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private PropertyInfo propertyInfo;

	private ServiceInfo serviceInfo;

	private EventInfo eventInfo;

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

	public PropertyInfo getPropertyInfo() {
		return this.propertyInfo;
	}

	public void setPropertyInfo(PropertyInfo propertyInfo) {
		this.propertyInfo = propertyInfo;
	}

	public ServiceInfo getServiceInfo() {
		return this.serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public EventInfo getEventInfo() {
		return this.eventInfo;
	}

	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}

	public static class PropertyInfo {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String dataType;

		private String rwType;

		private String identifier;

		private String description;

		private String name;

		private String dataSpecs;

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

	public static class ServiceInfo {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String callType;

		private String name;

		private String identifier;

		private List<Argument> inputParams;

		private List<Argument2> outputParams;

		private List<Tag3> tags1;

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

		public List<Argument> getInputParams() {
			return this.inputParams;
		}

		public void setInputParams(List<Argument> inputParams) {
			this.inputParams = inputParams;
		}

		public List<Argument2> getOutputParams() {
			return this.outputParams;
		}

		public void setOutputParams(List<Argument2> outputParams) {
			this.outputParams = outputParams;
		}

		public List<Tag3> getTags1() {
			return this.tags1;
		}

		public void setTags1(List<Tag3> tags1) {
			this.tags1 = tags1;
		}

		public static class Argument {

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

		public static class Argument2 {

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

		public static class Tag3 {

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

	public static class EventInfo {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String eventType;

		private String name;

		private String identifier;

		private List<Argument5> outputData;

		private List<Tag6> tags4;

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

		public List<Argument5> getOutputData() {
			return this.outputData;
		}

		public void setOutputData(List<Argument5> outputData) {
			this.outputData = outputData;
		}

		public List<Tag6> getTags4() {
			return this.tags4;
		}

		public void setTags4(List<Tag6> tags4) {
			this.tags4 = tags4;
		}

		public static class Argument5 {

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

	@Override
	public GetThingTemplateFunctionForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	GetThingTemplateFunctionForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}
