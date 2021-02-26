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

package com.aliyuncs.ft.model.v20180713;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.GetMigrateStrategyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMigrateStrategyResultResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String messageCN;

	private String requestId;

	private String nullValue;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageCN() {
		return this.messageCN;
	}

	public void setMessageCN(String messageCN) {
		this.messageCN = messageCN;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNullValue() {
		return this.nullValue;
	}

	public void setNullValue(String nullValue) {
		this.nullValue = nullValue;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalItem;

		private String testNull;

		private List<DataListItem> dataList;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalItem() {
			return this.totalItem;
		}

		public void setTotalItem(Integer totalItem) {
			this.totalItem = totalItem;
		}

		public String getTestNull() {
			return this.testNull;
		}

		public void setTestNull(String testNull) {
			this.testNull = testNull;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private Long id;

			private String createTime;

			private String modifiedTime;

			private Integer recordVersion;

			private String env;

			private String product;

			private String version;

			private String api;

			private String strategyName;

			private String parentName;

			private String type;

			private String flowSpecial;

			private Map<Object,Object> dataItem;

			private String status;

			private Modifier modifier;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Integer getRecordVersion() {
				return this.recordVersion;
			}

			public void setRecordVersion(Integer recordVersion) {
				this.recordVersion = recordVersion;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getApi() {
				return this.api;
			}

			public void setApi(String api) {
				this.api = api;
			}

			public String getStrategyName() {
				return this.strategyName;
			}

			public void setStrategyName(String strategyName) {
				this.strategyName = strategyName;
			}

			public String getParentName() {
				return this.parentName;
			}

			public void setParentName(String parentName) {
				this.parentName = parentName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFlowSpecial() {
				return this.flowSpecial;
			}

			public void setFlowSpecial(String flowSpecial) {
				this.flowSpecial = flowSpecial;
			}

			public Map<Object,Object> getDataItem() {
				return this.dataItem;
			}

			public void setDataItem(Map<Object,Object> dataItem) {
				this.dataItem = dataItem;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Modifier getModifier() {
				return this.modifier;
			}

			public void setModifier(Modifier modifier) {
				this.modifier = modifier;
			}

			public static class Modifier {

				private String id;

				private String name;

				private String bucId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getBucId() {
					return this.bucId;
				}

				public void setBucId(String bucId) {
					this.bucId = bucId;
				}
			}
		}
	}

	@Override
	public GetMigrateStrategyResultResponse getInstance(UnmarshallerContext context) {
		return	GetMigrateStrategyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
