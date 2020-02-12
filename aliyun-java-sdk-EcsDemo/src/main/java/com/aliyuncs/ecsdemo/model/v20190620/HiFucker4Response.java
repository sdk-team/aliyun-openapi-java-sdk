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

package com.aliyuncs.ecsdemo.model.v20190620;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsdemo.transform.v20190620.HiFucker4ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HiFucker4Response extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ResourceType> resourceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ResourceType> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<ResourceType> resourceTypes) {
		this.resourceTypes = resourceTypes;
	}

	public static class ResourceType {

		private String product;

		private String resourceTypeCode;

		private String resourceTypeVersion;

		private String title;

		private String uniqueIdentifier;

		private String description;

		private String deliveryScope;

		private Boolean resourceIdField;

		private Map<Object,Object> definitions;

		private String schemaRef;

		private List<State> states;

		private OperationAPI operationAPI;

		private ResourceTypeAttributeMappings resourceTypeAttributeMappings;

		private CommonAttributeMark commonAttributeMark;

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

		public String getDeliveryScope() {
			return this.deliveryScope;
		}

		public void setDeliveryScope(String deliveryScope) {
			this.deliveryScope = deliveryScope;
		}

		public Boolean getResourceIdField() {
			return this.resourceIdField;
		}

		public void setResourceIdField(Boolean resourceIdField) {
			this.resourceIdField = resourceIdField;
		}

		public Map<Object,Object> getDefinitions() {
			return this.definitions;
		}

		public void setDefinitions(Map<Object,Object> definitions) {
			this.definitions = definitions;
		}

		public String getSchemaRef() {
			return this.schemaRef;
		}

		public void setSchemaRef(String schemaRef) {
			this.schemaRef = schemaRef;
		}

		public List<State> getStates() {
			return this.states;
		}

		public void setStates(List<State> states) {
			this.states = states;
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

		public CommonAttributeMark getCommonAttributeMark() {
			return this.commonAttributeMark;
		}

		public void setCommonAttributeMark(CommonAttributeMark commonAttributeMark) {
			this.commonAttributeMark = commonAttributeMark;
		}

		public static class State {

			private String stateCode;

			private String description;

			public String getStateCode() {
				return this.stateCode;
			}

			public void setStateCode(String stateCode) {
				this.stateCode = stateCode;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class OperationAPI {

			private List<CreateAPI> createAPIs;

			private List<GetAPI> getAPIs;

			private List<ListAPI> listAPIs;

			private List<UpdateAPI> updateAPIs;

			private List<DeleteAPI> deleteAPIs;

			private List<EstablishRelationAPI> establishRelationAPIs;

			private List<DestroyRelationAPI> destroyRelationAPIs;

			public List<CreateAPI> getCreateAPIs() {
				return this.createAPIs;
			}

			public void setCreateAPIs(List<CreateAPI> createAPIs) {
				this.createAPIs = createAPIs;
			}

			public List<GetAPI> getGetAPIs() {
				return this.getAPIs;
			}

			public void setGetAPIs(List<GetAPI> getAPIs) {
				this.getAPIs = getAPIs;
			}

			public List<ListAPI> getListAPIs() {
				return this.listAPIs;
			}

			public void setListAPIs(List<ListAPI> listAPIs) {
				this.listAPIs = listAPIs;
			}

			public List<UpdateAPI> getUpdateAPIs() {
				return this.updateAPIs;
			}

			public void setUpdateAPIs(List<UpdateAPI> updateAPIs) {
				this.updateAPIs = updateAPIs;
			}

			public List<DeleteAPI> getDeleteAPIs() {
				return this.deleteAPIs;
			}

			public void setDeleteAPIs(List<DeleteAPI> deleteAPIs) {
				this.deleteAPIs = deleteAPIs;
			}

			public List<EstablishRelationAPI> getEstablishRelationAPIs() {
				return this.establishRelationAPIs;
			}

			public void setEstablishRelationAPIs(List<EstablishRelationAPI> establishRelationAPIs) {
				this.establishRelationAPIs = establishRelationAPIs;
			}

			public List<DestroyRelationAPI> getDestroyRelationAPIs() {
				return this.destroyRelationAPIs;
			}

			public void setDestroyRelationAPIs(List<DestroyRelationAPI> destroyRelationAPIs) {
				this.destroyRelationAPIs = destroyRelationAPIs;
			}

			public static class CreateAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class GetAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class ListAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class UpdateAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class DeleteAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class EstablishRelationAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}

			public static class DestroyRelationAPI {

				private String gatewayProduct;

				private String gatewayVersion;

				private String apiName;

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
			}
		}

		public static class ResourceTypeAttributeMappings {

			private String enableAttributeMapping;

			private OptionalConfig optionalConfig;

			private OperationGet operationGet;

			private OperationCreate operationCreate;

			private OperationUpdate operationUpdate;

			private OperationDelete operationDelete;

			private OperationList operationList;

			public String getEnableAttributeMapping() {
				return this.enableAttributeMapping;
			}

			public void setEnableAttributeMapping(String enableAttributeMapping) {
				this.enableAttributeMapping = enableAttributeMapping;
			}

			public OptionalConfig getOptionalConfig() {
				return this.optionalConfig;
			}

			public void setOptionalConfig(OptionalConfig optionalConfig) {
				this.optionalConfig = optionalConfig;
			}

			public OperationGet getOperationGet() {
				return this.operationGet;
			}

			public void setOperationGet(OperationGet operationGet) {
				this.operationGet = operationGet;
			}

			public OperationCreate getOperationCreate() {
				return this.operationCreate;
			}

			public void setOperationCreate(OperationCreate operationCreate) {
				this.operationCreate = operationCreate;
			}

			public OperationUpdate getOperationUpdate() {
				return this.operationUpdate;
			}

			public void setOperationUpdate(OperationUpdate operationUpdate) {
				this.operationUpdate = operationUpdate;
			}

			public OperationDelete getOperationDelete() {
				return this.operationDelete;
			}

			public void setOperationDelete(OperationDelete operationDelete) {
				this.operationDelete = operationDelete;
			}

			public OperationList getOperationList() {
				return this.operationList;
			}

			public void setOperationList(OperationList operationList) {
				this.operationList = operationList;
			}

			public static class OptionalConfig {

				private String prePaidValue;

				public String getPrePaidValue() {
					return this.prePaidValue;
				}

				public void setPrePaidValue(String prePaidValue) {
					this.prePaidValue = prePaidValue;
				}
			}

			public static class OperationGet {

				private Map<Object,Object> attributeMappings;

				private List<ResourceTypeOperationDetail> apiInfos;

				public Map<Object,Object> getAttributeMappings() {
					return this.attributeMappings;
				}

				public void setAttributeMappings(Map<Object,Object> attributeMappings) {
					this.attributeMappings = attributeMappings;
				}

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

					private List<SupplementParameter> supplementParameters;

					private Paging paging;

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

					public List<SupplementParameter> getSupplementParameters() {
						return this.supplementParameters;
					}

					public void setSupplementParameters(List<SupplementParameter> supplementParameters) {
						this.supplementParameters = supplementParameters;
					}

					public Paging getPaging() {
						return this.paging;
					}

					public void setPaging(Paging paging) {
						this.paging = paging;
					}

					public RequiredAttributeMappings getRequiredAttributeMappings() {
						return this.requiredAttributeMappings;
					}

					public void setRequiredAttributeMappings(RequiredAttributeMappings requiredAttributeMappings) {
						this.requiredAttributeMappings = requiredAttributeMappings;
					}

					public static class SupplementParameter {

						private String mappingType;

						private String position;

						private String in;

						private String path;

						private String value;

						public String getMappingType() {
							return this.mappingType;
						}

						public void setMappingType(String mappingType) {
							this.mappingType = mappingType;
						}

						public String getPosition() {
							return this.position;
						}

						public void setPosition(String position) {
							this.position = position;
						}

						public String getIn() {
							return this.in;
						}

						public void setIn(String in) {
							this.in = in;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class Paging {

						private String type;

						private NextTokenConfig nextTokenConfig;

						private PageNumberConfig pageNumberConfig;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public NextTokenConfig getNextTokenConfig() {
							return this.nextTokenConfig;
						}

						public void setNextTokenConfig(NextTokenConfig nextTokenConfig) {
							this.nextTokenConfig = nextTokenConfig;
						}

						public PageNumberConfig getPageNumberConfig() {
							return this.pageNumberConfig;
						}

						public void setPageNumberConfig(PageNumberConfig pageNumberConfig) {
							this.pageNumberConfig = pageNumberConfig;
						}

						public static class NextTokenConfig {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}

						public static class PageNumberConfig {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}
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

			public static class OperationCreate {

				private Map<Object,Object> attributeMappings;

				private List<ResourceTypeOperationDetail2> apiInfos1;

				public Map<Object,Object> getAttributeMappings() {
					return this.attributeMappings;
				}

				public void setAttributeMappings(Map<Object,Object> attributeMappings) {
					this.attributeMappings = attributeMappings;
				}

				public List<ResourceTypeOperationDetail2> getApiInfos1() {
					return this.apiInfos1;
				}

				public void setApiInfos1(List<ResourceTypeOperationDetail2> apiInfos1) {
					this.apiInfos1 = apiInfos1;
				}

				public static class ResourceTypeOperationDetail2 {

					private String gatewaySource;

					private String gatewayProduct;

					private String gatewayVersion;

					private String apiName;

					private List<SupplementParameter6> supplementParameters5;

					private Paging3 paging3;

					private RequiredAttributeMappings4 requiredAttributeMappings4;

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

					public List<SupplementParameter6> getSupplementParameters5() {
						return this.supplementParameters5;
					}

					public void setSupplementParameters5(List<SupplementParameter6> supplementParameters5) {
						this.supplementParameters5 = supplementParameters5;
					}

					public Paging3 getPaging3() {
						return this.paging3;
					}

					public void setPaging3(Paging3 paging3) {
						this.paging3 = paging3;
					}

					public RequiredAttributeMappings4 getRequiredAttributeMappings4() {
						return this.requiredAttributeMappings4;
					}

					public void setRequiredAttributeMappings4(RequiredAttributeMappings4 requiredAttributeMappings4) {
						this.requiredAttributeMappings4 = requiredAttributeMappings4;
					}

					public static class SupplementParameter6 {

						private String mappingType;

						private String position;

						private String in;

						private String path;

						private String value;

						public String getMappingType() {
							return this.mappingType;
						}

						public void setMappingType(String mappingType) {
							this.mappingType = mappingType;
						}

						public String getPosition() {
							return this.position;
						}

						public void setPosition(String position) {
							this.position = position;
						}

						public String getIn() {
							return this.in;
						}

						public void setIn(String in) {
							this.in = in;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class Paging3 {

						private String type;

						private NextTokenConfig7 nextTokenConfig7;

						private PageNumberConfig8 pageNumberConfig8;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public NextTokenConfig7 getNextTokenConfig7() {
							return this.nextTokenConfig7;
						}

						public void setNextTokenConfig7(NextTokenConfig7 nextTokenConfig7) {
							this.nextTokenConfig7 = nextTokenConfig7;
						}

						public PageNumberConfig8 getPageNumberConfig8() {
							return this.pageNumberConfig8;
						}

						public void setPageNumberConfig8(PageNumberConfig8 pageNumberConfig8) {
							this.pageNumberConfig8 = pageNumberConfig8;
						}

						public static class NextTokenConfig7 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}

						public static class PageNumberConfig8 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}
					}

					public static class RequiredAttributeMappings4 {

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

			public static class OperationUpdate {

				private Map<Object,Object> attributeMappings;

				private List<ResourceTypeOperationDetail10> apiInfos9;

				public Map<Object,Object> getAttributeMappings() {
					return this.attributeMappings;
				}

				public void setAttributeMappings(Map<Object,Object> attributeMappings) {
					this.attributeMappings = attributeMappings;
				}

				public List<ResourceTypeOperationDetail10> getApiInfos9() {
					return this.apiInfos9;
				}

				public void setApiInfos9(List<ResourceTypeOperationDetail10> apiInfos9) {
					this.apiInfos9 = apiInfos9;
				}

				public static class ResourceTypeOperationDetail10 {

					private String gatewaySource;

					private String gatewayProduct;

					private String gatewayVersion;

					private String apiName;

					private List<SupplementParameter14> supplementParameters13;

					private Paging11 paging11;

					private RequiredAttributeMappings12 requiredAttributeMappings12;

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

					public List<SupplementParameter14> getSupplementParameters13() {
						return this.supplementParameters13;
					}

					public void setSupplementParameters13(List<SupplementParameter14> supplementParameters13) {
						this.supplementParameters13 = supplementParameters13;
					}

					public Paging11 getPaging11() {
						return this.paging11;
					}

					public void setPaging11(Paging11 paging11) {
						this.paging11 = paging11;
					}

					public RequiredAttributeMappings12 getRequiredAttributeMappings12() {
						return this.requiredAttributeMappings12;
					}

					public void setRequiredAttributeMappings12(RequiredAttributeMappings12 requiredAttributeMappings12) {
						this.requiredAttributeMappings12 = requiredAttributeMappings12;
					}

					public static class SupplementParameter14 {

						private String mappingType;

						private String position;

						private String in;

						private String path;

						private String value;

						public String getMappingType() {
							return this.mappingType;
						}

						public void setMappingType(String mappingType) {
							this.mappingType = mappingType;
						}

						public String getPosition() {
							return this.position;
						}

						public void setPosition(String position) {
							this.position = position;
						}

						public String getIn() {
							return this.in;
						}

						public void setIn(String in) {
							this.in = in;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class Paging11 {

						private String type;

						private NextTokenConfig15 nextTokenConfig15;

						private PageNumberConfig16 pageNumberConfig16;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public NextTokenConfig15 getNextTokenConfig15() {
							return this.nextTokenConfig15;
						}

						public void setNextTokenConfig15(NextTokenConfig15 nextTokenConfig15) {
							this.nextTokenConfig15 = nextTokenConfig15;
						}

						public PageNumberConfig16 getPageNumberConfig16() {
							return this.pageNumberConfig16;
						}

						public void setPageNumberConfig16(PageNumberConfig16 pageNumberConfig16) {
							this.pageNumberConfig16 = pageNumberConfig16;
						}

						public static class NextTokenConfig15 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}

						public static class PageNumberConfig16 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}
					}

					public static class RequiredAttributeMappings12 {

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

			public static class OperationDelete {

				private Map<Object,Object> attributeMappings;

				private List<ResourceTypeOperationDetail18> apiInfos17;

				public Map<Object,Object> getAttributeMappings() {
					return this.attributeMappings;
				}

				public void setAttributeMappings(Map<Object,Object> attributeMappings) {
					this.attributeMappings = attributeMappings;
				}

				public List<ResourceTypeOperationDetail18> getApiInfos17() {
					return this.apiInfos17;
				}

				public void setApiInfos17(List<ResourceTypeOperationDetail18> apiInfos17) {
					this.apiInfos17 = apiInfos17;
				}

				public static class ResourceTypeOperationDetail18 {

					private String gatewaySource;

					private String gatewayProduct;

					private String gatewayVersion;

					private String apiName;

					private List<SupplementParameter22> supplementParameters21;

					private Paging19 paging19;

					private RequiredAttributeMappings20 requiredAttributeMappings20;

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

					public List<SupplementParameter22> getSupplementParameters21() {
						return this.supplementParameters21;
					}

					public void setSupplementParameters21(List<SupplementParameter22> supplementParameters21) {
						this.supplementParameters21 = supplementParameters21;
					}

					public Paging19 getPaging19() {
						return this.paging19;
					}

					public void setPaging19(Paging19 paging19) {
						this.paging19 = paging19;
					}

					public RequiredAttributeMappings20 getRequiredAttributeMappings20() {
						return this.requiredAttributeMappings20;
					}

					public void setRequiredAttributeMappings20(RequiredAttributeMappings20 requiredAttributeMappings20) {
						this.requiredAttributeMappings20 = requiredAttributeMappings20;
					}

					public static class SupplementParameter22 {

						private String mappingType;

						private String position;

						private String in;

						private String path;

						private String value;

						public String getMappingType() {
							return this.mappingType;
						}

						public void setMappingType(String mappingType) {
							this.mappingType = mappingType;
						}

						public String getPosition() {
							return this.position;
						}

						public void setPosition(String position) {
							this.position = position;
						}

						public String getIn() {
							return this.in;
						}

						public void setIn(String in) {
							this.in = in;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class Paging19 {

						private String type;

						private NextTokenConfig23 nextTokenConfig23;

						private PageNumberConfig24 pageNumberConfig24;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public NextTokenConfig23 getNextTokenConfig23() {
							return this.nextTokenConfig23;
						}

						public void setNextTokenConfig23(NextTokenConfig23 nextTokenConfig23) {
							this.nextTokenConfig23 = nextTokenConfig23;
						}

						public PageNumberConfig24 getPageNumberConfig24() {
							return this.pageNumberConfig24;
						}

						public void setPageNumberConfig24(PageNumberConfig24 pageNumberConfig24) {
							this.pageNumberConfig24 = pageNumberConfig24;
						}

						public static class NextTokenConfig23 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}

						public static class PageNumberConfig24 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}
					}

					public static class RequiredAttributeMappings20 {

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

			public static class OperationList {

				private Map<Object,Object> attributeMappings;

				private List<ResourceTypeOperationDetail26> apiInfos25;

				public Map<Object,Object> getAttributeMappings() {
					return this.attributeMappings;
				}

				public void setAttributeMappings(Map<Object,Object> attributeMappings) {
					this.attributeMappings = attributeMappings;
				}

				public List<ResourceTypeOperationDetail26> getApiInfos25() {
					return this.apiInfos25;
				}

				public void setApiInfos25(List<ResourceTypeOperationDetail26> apiInfos25) {
					this.apiInfos25 = apiInfos25;
				}

				public static class ResourceTypeOperationDetail26 {

					private String gatewaySource;

					private String gatewayProduct;

					private String gatewayVersion;

					private String apiName;

					private List<SupplementParameter30> supplementParameters29;

					private Paging27 paging27;

					private RequiredAttributeMappings28 requiredAttributeMappings28;

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

					public List<SupplementParameter30> getSupplementParameters29() {
						return this.supplementParameters29;
					}

					public void setSupplementParameters29(List<SupplementParameter30> supplementParameters29) {
						this.supplementParameters29 = supplementParameters29;
					}

					public Paging27 getPaging27() {
						return this.paging27;
					}

					public void setPaging27(Paging27 paging27) {
						this.paging27 = paging27;
					}

					public RequiredAttributeMappings28 getRequiredAttributeMappings28() {
						return this.requiredAttributeMappings28;
					}

					public void setRequiredAttributeMappings28(RequiredAttributeMappings28 requiredAttributeMappings28) {
						this.requiredAttributeMappings28 = requiredAttributeMappings28;
					}

					public static class SupplementParameter30 {

						private String mappingType;

						private String position;

						private String in;

						private String path;

						private String value;

						public String getMappingType() {
							return this.mappingType;
						}

						public void setMappingType(String mappingType) {
							this.mappingType = mappingType;
						}

						public String getPosition() {
							return this.position;
						}

						public void setPosition(String position) {
							this.position = position;
						}

						public String getIn() {
							return this.in;
						}

						public void setIn(String in) {
							this.in = in;
						}

						public String getPath() {
							return this.path;
						}

						public void setPath(String path) {
							this.path = path;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class Paging27 {

						private String type;

						private NextTokenConfig31 nextTokenConfig31;

						private PageNumberConfig32 pageNumberConfig32;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public NextTokenConfig31 getNextTokenConfig31() {
							return this.nextTokenConfig31;
						}

						public void setNextTokenConfig31(NextTokenConfig31 nextTokenConfig31) {
							this.nextTokenConfig31 = nextTokenConfig31;
						}

						public PageNumberConfig32 getPageNumberConfig32() {
							return this.pageNumberConfig32;
						}

						public void setPageNumberConfig32(PageNumberConfig32 pageNumberConfig32) {
							this.pageNumberConfig32 = pageNumberConfig32;
						}

						public static class NextTokenConfig31 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}

						public static class PageNumberConfig32 {

							private Map<Object,Object> requestParameterMappings;

							private Map<Object,Object> responseParameterMappings;

							public Map<Object,Object> getRequestParameterMappings() {
								return this.requestParameterMappings;
							}

							public void setRequestParameterMappings(Map<Object,Object> requestParameterMappings) {
								this.requestParameterMappings = requestParameterMappings;
							}

							public Map<Object,Object> getResponseParameterMappings() {
								return this.responseParameterMappings;
							}

							public void setResponseParameterMappings(Map<Object,Object> responseParameterMappings) {
								this.responseParameterMappings = responseParameterMappings;
							}
						}
					}

					public static class RequiredAttributeMappings28 {

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

		public static class CommonAttributeMark {

			private String billingMethod;

			private List<String> uids;

			public String getBillingMethod() {
				return this.billingMethod;
			}

			public void setBillingMethod(String billingMethod) {
				this.billingMethod = billingMethod;
			}

			public List<String> getUids() {
				return this.uids;
			}

			public void setUids(List<String> uids) {
				this.uids = uids;
			}
		}
	}

	@Override
	public HiFucker4Response getInstance(UnmarshallerContext context) {
		return	HiFucker4ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
