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
import com.aliyuncs.ft.transform.v20180713.DescribeResourceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceTypeResponse extends AcsResponse {

	private String requestId;

	private String product;

	private String resourceTypeCode;

	private String resourceTypeVersion;

	private String title;

	private String uniqueIdentifier;

	private String description;

	private String resourceIdField;

	private Map<Object,Object> definitions;

	private List<State> states;

	private Schema schema;

	private OperationAPI operationAPI;

	private ResourceTypeAttributeMappings resourceTypeAttributeMappings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getResourceTypeCode() {
		return this.resourceTypeCode;
	}

	public void setResourceTypeCode(String resourceTypeCode) {
		this.resourceTypeCode = resourceTypeCode;
	}

	public String getResourceTypeVersion() {
		return this.resourceTypeVersion;
	}

	public void setResourceTypeVersion(String resourceTypeVersion) {
		this.resourceTypeVersion = resourceTypeVersion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUniqueIdentifier() {
		return this.uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceIdField() {
		return this.resourceIdField;
	}

	public void setResourceIdField(String resourceIdField) {
		this.resourceIdField = resourceIdField;
	}

	public Map<Object,Object> getDefinitions() {
		return this.definitions;
	}

	public void setDefinitions(Map<Object,Object> definitions) {
		this.definitions = definitions;
	}

	public List<State> getStates() {
		return this.states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public Schema getSchema() {
		return this.schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}

	public OperationAPI getOperationAPI() {
		return this.operationAPI;
	}

	public void setOperationAPI(OperationAPI operationAPI) {
		this.operationAPI = operationAPI;
	}

	public ResourceTypeAttributeMappings getResourceTypeAttributeMappings() {
		return this.resourceTypeAttributeMappings;
	}

	public void setResourceTypeAttributeMappings(ResourceTypeAttributeMappings resourceTypeAttributeMappings) {
		this.resourceTypeAttributeMappings = resourceTypeAttributeMappings;
	}

	public static class State {

		private String code;

		private String description;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class Schema {

		private String ref;

		private String title;

		private String type;

		private String description;

		private Map<Object,Object> properties;

		private String itemName;

		private Map<Object,Object> items;

		public String getRef() {
			return this.ref;
		}

		public void setRef(String ref) {
			this.ref = ref;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Map<Object,Object> getProperties() {
			return this.properties;
		}

		public void setProperties(Map<Object,Object> properties) {
			this.properties = properties;
		}

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Map<Object,Object> getItems() {
			return this.items;
		}

		public void setItems(Map<Object,Object> items) {
			this.items = items;
		}
	}

	public static class OperationAPI {

		private List<APIIdentity> createAPIs;

		private List<APIIdentity> getAPIs;

		private List<APIIdentity> listAPIs;

		private List<APIIdentity> updateAPIs;

		private List<APIIdentity> deleteAPIs;

		private List<APIIdentity> establishRelationAPIs;

		private List<APIIdentity> destroyRelationAPIs;

		public List<APIIdentity> getCreateAPIs() {
			return this.createAPIs;
		}

		public void setCreateAPIs(List<APIIdentity> createAPIs) {
			this.createAPIs = createAPIs;
		}

		public List<APIIdentity> getGetAPIs() {
			return this.getAPIs;
		}

		public void setGetAPIs(List<APIIdentity> getAPIs) {
			this.getAPIs = getAPIs;
		}

		public List<APIIdentity> getListAPIs() {
			return this.listAPIs;
		}

		public void setListAPIs(List<APIIdentity> listAPIs) {
			this.listAPIs = listAPIs;
		}

		public List<APIIdentity> getUpdateAPIs() {
			return this.updateAPIs;
		}

		public void setUpdateAPIs(List<APIIdentity> updateAPIs) {
			this.updateAPIs = updateAPIs;
		}

		public List<APIIdentity> getDeleteAPIs() {
			return this.deleteAPIs;
		}

		public void setDeleteAPIs(List<APIIdentity> deleteAPIs) {
			this.deleteAPIs = deleteAPIs;
		}

		public List<APIIdentity> getEstablishRelationAPIs() {
			return this.establishRelationAPIs;
		}

		public void setEstablishRelationAPIs(List<APIIdentity> establishRelationAPIs) {
			this.establishRelationAPIs = establishRelationAPIs;
		}

		public List<APIIdentity> getDestroyRelationAPIs() {
			return this.destroyRelationAPIs;
		}

		public void setDestroyRelationAPIs(List<APIIdentity> destroyRelationAPIs) {
			this.destroyRelationAPIs = destroyRelationAPIs;
		}

		public static class APIIdentity {

			private String aPIGroup;

			private String aPIVersion;

			private String aPIName;

			public String getAPIGroup() {
				return this.aPIGroup;
			}

			public void setAPIGroup(String aPIGroup) {
				this.aPIGroup = aPIGroup;
			}

			public String getAPIVersion() {
				return this.aPIVersion;
			}

			public void setAPIVersion(String aPIVersion) {
				this.aPIVersion = aPIVersion;
			}

			public String getAPIName() {
				return this.aPIName;
			}

			public void setAPIName(String aPIName) {
				this.aPIName = aPIName;
			}
		}
	}

	public static class ResourceTypeAttributeMappings {

		private String prePaidValue;

		private String enableAttributeMapping;

		private OperationGet operationGet;

		public String getPrePaidValue() {
			return this.prePaidValue;
		}

		public void setPrePaidValue(String prePaidValue) {
			this.prePaidValue = prePaidValue;
		}

		public String getEnableAttributeMapping() {
			return this.enableAttributeMapping;
		}

		public void setEnableAttributeMapping(String enableAttributeMapping) {
			this.enableAttributeMapping = enableAttributeMapping;
		}

		public OperationGet getOperationGet() {
			return this.operationGet;
		}

		public void setOperationGet(OperationGet operationGet) {
			this.operationGet = operationGet;
		}

		public static class OperationGet {

			private List<ResourceTypeOperationDetail> apiInfos;

			public List<ResourceTypeOperationDetail> getApiInfos() {
				return this.apiInfos;
			}

			public void setApiInfos(List<ResourceTypeOperationDetail> apiInfos) {
				this.apiInfos = apiInfos;
			}

			public static class ResourceTypeOperationDetail {

				private String gatewaySource;

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

				private Map<Object,Object> attributeAsyncDetections;

				private RequiredAttributeMappings requiredAttributeMappings;

				public String getGatewaySource() {
					return this.gatewaySource;
				}

				public void setGatewaySource(String gatewaySource) {
					this.gatewaySource = gatewaySource;
				}

				public String getGatewayProduct() {
					return this.gatewayProduct;
				}

				public void setGatewayProduct(String gatewayProduct) {
					this.gatewayProduct = gatewayProduct;
				}

				public String getGatewayVersion() {
					return this.gatewayVersion;
				}

				public void setGatewayVersion(String gatewayVersion) {
					this.gatewayVersion = gatewayVersion;
				}

				public String getApiName() {
					return this.apiName;
				}

				public void setApiName(String apiName) {
					this.apiName = apiName;
				}

				public Map<Object,Object> getAttributeAsyncDetections() {
					return this.attributeAsyncDetections;
				}

				public void setAttributeAsyncDetections(Map<Object,Object> attributeAsyncDetections) {
					this.attributeAsyncDetections = attributeAsyncDetections;
				}

				public RequiredAttributeMappings getRequiredAttributeMappings() {
					return this.requiredAttributeMappings;
				}

				public void setRequiredAttributeMappings(RequiredAttributeMappings requiredAttributeMappings) {
					this.requiredAttributeMappings = requiredAttributeMappings;
				}

				public static class RequiredAttributeMappings {

					private Map<Object,Object> idMappings;

					public Map<Object,Object> getIdMappings() {
						return this.idMappings;
					}

					public void setIdMappings(Map<Object,Object> idMappings) {
						this.idMappings = idMappings;
					}
				}
			}
		}
	}

	@Override
	public DescribeResourceTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
