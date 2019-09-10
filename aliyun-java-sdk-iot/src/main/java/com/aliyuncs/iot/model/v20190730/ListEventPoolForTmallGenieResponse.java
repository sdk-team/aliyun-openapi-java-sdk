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
import com.aliyuncs.iot.transform.v20190730.ListEventPoolForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventPoolForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Integer pageNo;

	private Integer total;

	private Integer pageSize;

	private List<Event> events;

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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public static class Event {

		private Long tmallFunctionId;

		private String thingTemplateKey;

		private String eventType;

		private String name;

		private String identifier;

		private List<Argument> outputData;

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

		public List<Argument> getOutputData() {
			return this.outputData;
		}

		public void setOutputData(List<Argument> outputData) {
			this.outputData = outputData;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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

	@Override
	public ListEventPoolForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	ListEventPoolForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}
