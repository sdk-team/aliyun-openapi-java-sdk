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

package com.aliyuncs.ecsdemo.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.CommonAttributeMark;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.CreateAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.DeleteAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.DestroyRelationAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.EstablishRelationAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.GetAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.ListAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.OperationAPI.UpdateAPI;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2.Paging3;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2.Paging3.NextTokenConfig7;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2.Paging3.PageNumberConfig8;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2.RequiredAttributeMappings4;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationCreate.ResourceTypeOperationDetail2.SupplementParameter6;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18.Paging19;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18.Paging19.NextTokenConfig23;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18.Paging19.PageNumberConfig24;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18.RequiredAttributeMappings20;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationDelete.ResourceTypeOperationDetail18.SupplementParameter22;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.Paging;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.Paging.NextTokenConfig;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.Paging.PageNumberConfig;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.RequiredAttributeMappings;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.SupplementParameter;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26.Paging27;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26.Paging27.NextTokenConfig31;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26.Paging27.PageNumberConfig32;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26.RequiredAttributeMappings28;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationList.ResourceTypeOperationDetail26.SupplementParameter30;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10.Paging11;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10.Paging11.NextTokenConfig15;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10.Paging11.PageNumberConfig16;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10.RequiredAttributeMappings12;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OperationUpdate.ResourceTypeOperationDetail10.SupplementParameter14;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.ResourceTypeAttributeMappings.OptionalConfig;
import com.aliyuncs.ecsdemo.model.v20190620.HiFucker4Response.ResourceType.State;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class HiFucker4ResponseUnmarshaller {

	public static HiFucker4Response unmarshall(HiFucker4Response hiFucker4Response, UnmarshallerContext _ctx) {
		
		hiFucker4Response.setRequestId(_ctx.stringValue("HiFucker4Response.RequestId"));
		hiFucker4Response.setPageNumber(_ctx.integerValue("HiFucker4Response.PageNumber"));
		hiFucker4Response.setPageSize(_ctx.integerValue("HiFucker4Response.PageSize"));
		hiFucker4Response.setTotalCount(_ctx.integerValue("HiFucker4Response.TotalCount"));

		List<ResourceType> resourceTypes = new ArrayList<ResourceType>();
		for (int i = 0; i < _ctx.lengthValue("HiFucker4Response.ResourceTypes.Length"); i++) {
			ResourceType resourceType = new ResourceType();
			resourceType.setProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].Product"));
			resourceType.setResourceTypeCode(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeCode"));
			resourceType.setResourceTypeVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeVersion"));
			resourceType.setTitle(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].Title"));
			resourceType.setUniqueIdentifier(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].UniqueIdentifier"));
			resourceType.setDescription(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].Description"));
			resourceType.setDeliveryScope(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].DeliveryScope"));
			resourceType.setResourceIdField(_ctx.booleanValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceIdField"));
			resourceType.setDefinitions(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].Definitions"));
			resourceType.setSchemaRef(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].SchemaRef"));

			OperationAPI operationAPI = new OperationAPI();

			List<CreateAPI> createAPIs = new ArrayList<CreateAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.CreateAPIs.Length"); j++) {
				CreateAPI createAPI = new CreateAPI();
				createAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.CreateAPIs["+ j +"].GatewayProduct"));
				createAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.CreateAPIs["+ j +"].GatewayVersion"));
				createAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.CreateAPIs["+ j +"].ApiName"));

				createAPIs.add(createAPI);
			}
			operationAPI.setCreateAPIs(createAPIs);

			List<GetAPI> getAPIs = new ArrayList<GetAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.GetAPIs.Length"); j++) {
				GetAPI getAPI = new GetAPI();
				getAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.GetAPIs["+ j +"].GatewayProduct"));
				getAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.GetAPIs["+ j +"].GatewayVersion"));
				getAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.GetAPIs["+ j +"].ApiName"));

				getAPIs.add(getAPI);
			}
			operationAPI.setGetAPIs(getAPIs);

			List<ListAPI> listAPIs = new ArrayList<ListAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.ListAPIs.Length"); j++) {
				ListAPI listAPI = new ListAPI();
				listAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.ListAPIs["+ j +"].GatewayProduct"));
				listAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.ListAPIs["+ j +"].GatewayVersion"));
				listAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.ListAPIs["+ j +"].ApiName"));

				listAPIs.add(listAPI);
			}
			operationAPI.setListAPIs(listAPIs);

			List<UpdateAPI> updateAPIs = new ArrayList<UpdateAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.UpdateAPIs.Length"); j++) {
				UpdateAPI updateAPI = new UpdateAPI();
				updateAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.UpdateAPIs["+ j +"].GatewayProduct"));
				updateAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.UpdateAPIs["+ j +"].GatewayVersion"));
				updateAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.UpdateAPIs["+ j +"].ApiName"));

				updateAPIs.add(updateAPI);
			}
			operationAPI.setUpdateAPIs(updateAPIs);

			List<DeleteAPI> deleteAPIs = new ArrayList<DeleteAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DeleteAPIs.Length"); j++) {
				DeleteAPI deleteAPI = new DeleteAPI();
				deleteAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DeleteAPIs["+ j +"].GatewayProduct"));
				deleteAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DeleteAPIs["+ j +"].GatewayVersion"));
				deleteAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DeleteAPIs["+ j +"].ApiName"));

				deleteAPIs.add(deleteAPI);
			}
			operationAPI.setDeleteAPIs(deleteAPIs);

			List<EstablishRelationAPI> establishRelationAPIs = new ArrayList<EstablishRelationAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.EstablishRelationAPIs.Length"); j++) {
				EstablishRelationAPI establishRelationAPI = new EstablishRelationAPI();
				establishRelationAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.EstablishRelationAPIs["+ j +"].GatewayProduct"));
				establishRelationAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.EstablishRelationAPIs["+ j +"].GatewayVersion"));
				establishRelationAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.EstablishRelationAPIs["+ j +"].ApiName"));

				establishRelationAPIs.add(establishRelationAPI);
			}
			operationAPI.setEstablishRelationAPIs(establishRelationAPIs);

			List<DestroyRelationAPI> destroyRelationAPIs = new ArrayList<DestroyRelationAPI>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DestroyRelationAPIs.Length"); j++) {
				DestroyRelationAPI destroyRelationAPI = new DestroyRelationAPI();
				destroyRelationAPI.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DestroyRelationAPIs["+ j +"].GatewayProduct"));
				destroyRelationAPI.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DestroyRelationAPIs["+ j +"].GatewayVersion"));
				destroyRelationAPI.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].OperationAPI.DestroyRelationAPIs["+ j +"].ApiName"));

				destroyRelationAPIs.add(destroyRelationAPI);
			}
			operationAPI.setDestroyRelationAPIs(destroyRelationAPIs);
			resourceType.setOperationAPI(operationAPI);

			ResourceTypeAttributeMappings resourceTypeAttributeMappings = new ResourceTypeAttributeMappings();
			resourceTypeAttributeMappings.setEnableAttributeMapping(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.EnableAttributeMapping"));

			OptionalConfig optionalConfig = new OptionalConfig();
			optionalConfig.setPrePaidValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OptionalConfig.PrePaidValue"));
			resourceTypeAttributeMappings.setOptionalConfig(optionalConfig);

			OperationGet operationGet = new OperationGet();
			operationGet.setAttributeMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.AttributeMappings"));

			List<ResourceTypeOperationDetail> apiInfos = new ArrayList<ResourceTypeOperationDetail>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos.Length"); j++) {
				ResourceTypeOperationDetail resourceTypeOperationDetail = new ResourceTypeOperationDetail();
				resourceTypeOperationDetail.setGatewaySource(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].GatewaySource"));
				resourceTypeOperationDetail.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].GatewayProduct"));
				resourceTypeOperationDetail.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].GatewayVersion"));
				resourceTypeOperationDetail.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].ApiName"));

				Paging paging = new Paging();
				paging.setType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].Paging.Type"));

				NextTokenConfig nextTokenConfig = new NextTokenConfig();
				nextTokenConfig.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].Paging.NextTokenConfig.RequestParameterMappings"));
				nextTokenConfig.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].Paging.NextTokenConfig.ResponseParameterMappings"));
				paging.setNextTokenConfig(nextTokenConfig);

				PageNumberConfig pageNumberConfig = new PageNumberConfig();
				pageNumberConfig.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].Paging.PageNumberConfig.RequestParameterMappings"));
				pageNumberConfig.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].Paging.PageNumberConfig.ResponseParameterMappings"));
				paging.setPageNumberConfig(pageNumberConfig);
				resourceTypeOperationDetail.setPaging(paging);

				RequiredAttributeMappings requiredAttributeMappings = new RequiredAttributeMappings();
				requiredAttributeMappings.setIdMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].RequiredAttributeMappings.IdMappings"));
				resourceTypeOperationDetail.setRequiredAttributeMappings(requiredAttributeMappings);

				List<SupplementParameter> supplementParameters = new ArrayList<SupplementParameter>();
				for (int k = 0; k < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters.Length"); k++) {
					SupplementParameter supplementParameter = new SupplementParameter();
					supplementParameter.setMappingType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters["+ k +"].MappingType"));
					supplementParameter.setPosition(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters["+ k +"].Position"));
					supplementParameter.setIn(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters["+ k +"].In"));
					supplementParameter.setPath(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters["+ k +"].Path"));
					supplementParameter.setValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ j +"].SupplementParameters["+ k +"].Value"));

					supplementParameters.add(supplementParameter);
				}
				resourceTypeOperationDetail.setSupplementParameters(supplementParameters);

				apiInfos.add(resourceTypeOperationDetail);
			}
			operationGet.setApiInfos(apiInfos);
			resourceTypeAttributeMappings.setOperationGet(operationGet);

			OperationCreate operationCreate = new OperationCreate();
			operationCreate.setAttributeMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.AttributeMappings"));

			List<ResourceTypeOperationDetail2> apiInfos1 = new ArrayList<ResourceTypeOperationDetail2>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos.Length"); j++) {
				ResourceTypeOperationDetail2 resourceTypeOperationDetail2 = new ResourceTypeOperationDetail2();
				resourceTypeOperationDetail2.setGatewaySource(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].GatewaySource"));
				resourceTypeOperationDetail2.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].GatewayProduct"));
				resourceTypeOperationDetail2.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].GatewayVersion"));
				resourceTypeOperationDetail2.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].ApiName"));

				Paging3 paging3 = new Paging3();
				paging3.setType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].Paging.Type"));

				NextTokenConfig7 nextTokenConfig7 = new NextTokenConfig7();
				nextTokenConfig7.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].Paging.NextTokenConfig.RequestParameterMappings"));
				nextTokenConfig7.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].Paging.NextTokenConfig.ResponseParameterMappings"));
				paging3.setNextTokenConfig7(nextTokenConfig7);

				PageNumberConfig8 pageNumberConfig8 = new PageNumberConfig8();
				pageNumberConfig8.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].Paging.PageNumberConfig.RequestParameterMappings"));
				pageNumberConfig8.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].Paging.PageNumberConfig.ResponseParameterMappings"));
				paging3.setPageNumberConfig8(pageNumberConfig8);
				resourceTypeOperationDetail2.setPaging3(paging3);

				RequiredAttributeMappings4 requiredAttributeMappings4 = new RequiredAttributeMappings4();
				requiredAttributeMappings4.setIdMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].RequiredAttributeMappings.IdMappings"));
				resourceTypeOperationDetail2.setRequiredAttributeMappings4(requiredAttributeMappings4);

				List<SupplementParameter6> supplementParameters5 = new ArrayList<SupplementParameter6>();
				for (int k = 0; k < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters.Length"); k++) {
					SupplementParameter6 supplementParameter6 = new SupplementParameter6();
					supplementParameter6.setMappingType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters["+ k +"].MappingType"));
					supplementParameter6.setPosition(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Position"));
					supplementParameter6.setIn(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters["+ k +"].In"));
					supplementParameter6.setPath(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Path"));
					supplementParameter6.setValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationCreate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Value"));

					supplementParameters5.add(supplementParameter6);
				}
				resourceTypeOperationDetail2.setSupplementParameters5(supplementParameters5);

				apiInfos1.add(resourceTypeOperationDetail2);
			}
			operationCreate.setApiInfos1(apiInfos1);
			resourceTypeAttributeMappings.setOperationCreate(operationCreate);

			OperationUpdate operationUpdate = new OperationUpdate();
			operationUpdate.setAttributeMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.AttributeMappings"));

			List<ResourceTypeOperationDetail10> apiInfos9 = new ArrayList<ResourceTypeOperationDetail10>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos.Length"); j++) {
				ResourceTypeOperationDetail10 resourceTypeOperationDetail10 = new ResourceTypeOperationDetail10();
				resourceTypeOperationDetail10.setGatewaySource(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].GatewaySource"));
				resourceTypeOperationDetail10.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].GatewayProduct"));
				resourceTypeOperationDetail10.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].GatewayVersion"));
				resourceTypeOperationDetail10.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].ApiName"));

				Paging11 paging11 = new Paging11();
				paging11.setType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].Paging.Type"));

				NextTokenConfig15 nextTokenConfig15 = new NextTokenConfig15();
				nextTokenConfig15.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].Paging.NextTokenConfig.RequestParameterMappings"));
				nextTokenConfig15.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].Paging.NextTokenConfig.ResponseParameterMappings"));
				paging11.setNextTokenConfig15(nextTokenConfig15);

				PageNumberConfig16 pageNumberConfig16 = new PageNumberConfig16();
				pageNumberConfig16.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].Paging.PageNumberConfig.RequestParameterMappings"));
				pageNumberConfig16.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].Paging.PageNumberConfig.ResponseParameterMappings"));
				paging11.setPageNumberConfig16(pageNumberConfig16);
				resourceTypeOperationDetail10.setPaging11(paging11);

				RequiredAttributeMappings12 requiredAttributeMappings12 = new RequiredAttributeMappings12();
				requiredAttributeMappings12.setIdMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].RequiredAttributeMappings.IdMappings"));
				resourceTypeOperationDetail10.setRequiredAttributeMappings12(requiredAttributeMappings12);

				List<SupplementParameter14> supplementParameters13 = new ArrayList<SupplementParameter14>();
				for (int k = 0; k < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters.Length"); k++) {
					SupplementParameter14 supplementParameter14 = new SupplementParameter14();
					supplementParameter14.setMappingType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters["+ k +"].MappingType"));
					supplementParameter14.setPosition(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Position"));
					supplementParameter14.setIn(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters["+ k +"].In"));
					supplementParameter14.setPath(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Path"));
					supplementParameter14.setValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationUpdate.ApiInfos["+ j +"].SupplementParameters["+ k +"].Value"));

					supplementParameters13.add(supplementParameter14);
				}
				resourceTypeOperationDetail10.setSupplementParameters13(supplementParameters13);

				apiInfos9.add(resourceTypeOperationDetail10);
			}
			operationUpdate.setApiInfos9(apiInfos9);
			resourceTypeAttributeMappings.setOperationUpdate(operationUpdate);

			OperationDelete operationDelete = new OperationDelete();
			operationDelete.setAttributeMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.AttributeMappings"));

			List<ResourceTypeOperationDetail18> apiInfos17 = new ArrayList<ResourceTypeOperationDetail18>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos.Length"); j++) {
				ResourceTypeOperationDetail18 resourceTypeOperationDetail18 = new ResourceTypeOperationDetail18();
				resourceTypeOperationDetail18.setGatewaySource(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].GatewaySource"));
				resourceTypeOperationDetail18.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].GatewayProduct"));
				resourceTypeOperationDetail18.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].GatewayVersion"));
				resourceTypeOperationDetail18.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].ApiName"));

				Paging19 paging19 = new Paging19();
				paging19.setType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].Paging.Type"));

				NextTokenConfig23 nextTokenConfig23 = new NextTokenConfig23();
				nextTokenConfig23.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].Paging.NextTokenConfig.RequestParameterMappings"));
				nextTokenConfig23.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].Paging.NextTokenConfig.ResponseParameterMappings"));
				paging19.setNextTokenConfig23(nextTokenConfig23);

				PageNumberConfig24 pageNumberConfig24 = new PageNumberConfig24();
				pageNumberConfig24.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].Paging.PageNumberConfig.RequestParameterMappings"));
				pageNumberConfig24.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].Paging.PageNumberConfig.ResponseParameterMappings"));
				paging19.setPageNumberConfig24(pageNumberConfig24);
				resourceTypeOperationDetail18.setPaging19(paging19);

				RequiredAttributeMappings20 requiredAttributeMappings20 = new RequiredAttributeMappings20();
				requiredAttributeMappings20.setIdMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].RequiredAttributeMappings.IdMappings"));
				resourceTypeOperationDetail18.setRequiredAttributeMappings20(requiredAttributeMappings20);

				List<SupplementParameter22> supplementParameters21 = new ArrayList<SupplementParameter22>();
				for (int k = 0; k < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters.Length"); k++) {
					SupplementParameter22 supplementParameter22 = new SupplementParameter22();
					supplementParameter22.setMappingType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters["+ k +"].MappingType"));
					supplementParameter22.setPosition(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters["+ k +"].Position"));
					supplementParameter22.setIn(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters["+ k +"].In"));
					supplementParameter22.setPath(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters["+ k +"].Path"));
					supplementParameter22.setValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationDelete.ApiInfos["+ j +"].SupplementParameters["+ k +"].Value"));

					supplementParameters21.add(supplementParameter22);
				}
				resourceTypeOperationDetail18.setSupplementParameters21(supplementParameters21);

				apiInfos17.add(resourceTypeOperationDetail18);
			}
			operationDelete.setApiInfos17(apiInfos17);
			resourceTypeAttributeMappings.setOperationDelete(operationDelete);

			OperationList operationList = new OperationList();
			operationList.setAttributeMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.AttributeMappings"));

			List<ResourceTypeOperationDetail26> apiInfos25 = new ArrayList<ResourceTypeOperationDetail26>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos.Length"); j++) {
				ResourceTypeOperationDetail26 resourceTypeOperationDetail26 = new ResourceTypeOperationDetail26();
				resourceTypeOperationDetail26.setGatewaySource(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].GatewaySource"));
				resourceTypeOperationDetail26.setGatewayProduct(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].GatewayProduct"));
				resourceTypeOperationDetail26.setGatewayVersion(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].GatewayVersion"));
				resourceTypeOperationDetail26.setApiName(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].ApiName"));

				Paging27 paging27 = new Paging27();
				paging27.setType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].Paging.Type"));

				NextTokenConfig31 nextTokenConfig31 = new NextTokenConfig31();
				nextTokenConfig31.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].Paging.NextTokenConfig.RequestParameterMappings"));
				nextTokenConfig31.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].Paging.NextTokenConfig.ResponseParameterMappings"));
				paging27.setNextTokenConfig31(nextTokenConfig31);

				PageNumberConfig32 pageNumberConfig32 = new PageNumberConfig32();
				pageNumberConfig32.setRequestParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].Paging.PageNumberConfig.RequestParameterMappings"));
				pageNumberConfig32.setResponseParameterMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].Paging.PageNumberConfig.ResponseParameterMappings"));
				paging27.setPageNumberConfig32(pageNumberConfig32);
				resourceTypeOperationDetail26.setPaging27(paging27);

				RequiredAttributeMappings28 requiredAttributeMappings28 = new RequiredAttributeMappings28();
				requiredAttributeMappings28.setIdMappings(_ctx.mapValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].RequiredAttributeMappings.IdMappings"));
				resourceTypeOperationDetail26.setRequiredAttributeMappings28(requiredAttributeMappings28);

				List<SupplementParameter30> supplementParameters29 = new ArrayList<SupplementParameter30>();
				for (int k = 0; k < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters.Length"); k++) {
					SupplementParameter30 supplementParameter30 = new SupplementParameter30();
					supplementParameter30.setMappingType(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters["+ k +"].MappingType"));
					supplementParameter30.setPosition(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters["+ k +"].Position"));
					supplementParameter30.setIn(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters["+ k +"].In"));
					supplementParameter30.setPath(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters["+ k +"].Path"));
					supplementParameter30.setValue(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].ResourceTypeAttributeMappings.OperationList.ApiInfos["+ j +"].SupplementParameters["+ k +"].Value"));

					supplementParameters29.add(supplementParameter30);
				}
				resourceTypeOperationDetail26.setSupplementParameters29(supplementParameters29);

				apiInfos25.add(resourceTypeOperationDetail26);
			}
			operationList.setApiInfos25(apiInfos25);
			resourceTypeAttributeMappings.setOperationList(operationList);
			resourceType.setResourceTypeAttributeMappings(resourceTypeAttributeMappings);

			CommonAttributeMark commonAttributeMark = new CommonAttributeMark();
			commonAttributeMark.setBillingMethod(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].CommonAttributeMark.BillingMethod"));

			List<String> uids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].CommonAttributeMark.Uids.Length"); j++) {
				uids.add(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].CommonAttributeMark.Uids["+ j +"]"));
			}
			commonAttributeMark.setUids(uids);
			resourceType.setCommonAttributeMark(commonAttributeMark);

			List<State> states = new ArrayList<State>();
			for (int j = 0; j < _ctx.lengthValue("HiFucker4Response.ResourceTypes["+ i +"].States.Length"); j++) {
				State state = new State();
				state.setStateCode(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].States["+ j +"].StateCode"));
				state.setDescription(_ctx.stringValue("HiFucker4Response.ResourceTypes["+ i +"].States["+ j +"].Description"));

				states.add(state);
			}
			resourceType.setStates(states);

			resourceTypes.add(resourceType);
		}
		hiFucker4Response.setResourceTypes(resourceTypes);
	 
	 	return hiFucker4Response;
	}
}