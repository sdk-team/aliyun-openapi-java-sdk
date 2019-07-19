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
import java.util.Map;
import com.google.gson.Gson;

/**
 * @author auto create
 * @version 
 */
public class UpdateProductServiceIdentifierForTmallGenieRequest extends RpcAcsRequest<UpdateProductServiceIdentifierForTmallGenieResponse> {
	
	public UpdateProductServiceIdentifierForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateProductServiceIdentifierForTmallGenie", "Iot");
	}

	private String identifier;

	private List<InputParams> inputParamss;

	private String iotInstanceId;

	private String description;

	private String serviceName;

	private String productKey;

	private String callType;

	private List<OutputParams> outputParamss;

	private Map<Object,Object> extendConfig;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public List<InputParams> getInputParamss() {
		return this.inputParamss;
	}

	public void setInputParamss(List<InputParams> inputParamss) {
		this.inputParamss = inputParamss;	
		if (inputParamss != null) {
			for (int depth1 = 0; depth1 < inputParamss.size(); depth1++) {
				putQueryParameter("InputParams." + (depth1 + 1) + ".Identifier" , inputParamss.get(depth1).getIdentifier());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataSpecs" , inputParamss.get(depth1).getDataSpecs());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataType" , inputParamss.get(depth1).getDataType());
				putQueryParameter("InputParams." + (depth1 + 1) + ".Name" , inputParamss.get(depth1).getName());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataSpecsList" , inputParamss.get(depth1).getDataSpecsList());
				putQueryParameter("InputParams." + (depth1 + 1) + ".ParaOrder" , inputParamss.get(depth1).getParaOrder());
				putQueryParameter("InputParams." + (depth1 + 1) + ".Direction" , inputParamss.get(depth1).getDirection());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putBodyParameter("ServiceName", serviceName);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putBodyParameter("CallType", callType);
		}
	}

	public List<OutputParams> getOutputParamss() {
		return this.outputParamss;
	}

	public void setOutputParamss(List<OutputParams> outputParamss) {
		this.outputParamss = outputParamss;	
		if (outputParamss != null) {
			for (int depth1 = 0; depth1 < outputParamss.size(); depth1++) {
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Identifier" , outputParamss.get(depth1).getIdentifier());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataSpecs" , outputParamss.get(depth1).getDataSpecs());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataType" , outputParamss.get(depth1).getDataType());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Name" , outputParamss.get(depth1).getName());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataSpecsList" , outputParamss.get(depth1).getDataSpecsList());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".ParaOrder" , outputParamss.get(depth1).getParaOrder());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Direction" , outputParamss.get(depth1).getDirection());
			}
		}	
	}

	public Map<Object,Object> getExtendConfig() {
		return this.extendConfig;
	}

	public void setExtendConfig(Map<Object,Object> extendConfig) {
		this.extendConfig = extendConfig;
		if(extendConfig != null){
			putBodyParameter("ExtendConfig", new Gson().toJson(extendConfig));
		}
	}

	public static class InputParams {

		private String identifier;

		private String dataSpecs;

		private String dataType;

		private String name;

		private String dataSpecsList;

		private Integer paraOrder;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDataSpecs() {
			return this.dataSpecs;
		}

		public void setDataSpecs(String dataSpecs) {
			this.dataSpecs = dataSpecs;
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

		public String getDataSpecsList() {
			return this.dataSpecsList;
		}

		public void setDataSpecsList(String dataSpecsList) {
			this.dataSpecsList = dataSpecsList;
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
	}

	public static class OutputParams {

		private String identifier;

		private String dataSpecs;

		private String dataType;

		private String name;

		private String dataSpecsList;

		private Integer paraOrder;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDataSpecs() {
			return this.dataSpecs;
		}

		public void setDataSpecs(String dataSpecs) {
			this.dataSpecs = dataSpecs;
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

		public String getDataSpecsList() {
			return this.dataSpecsList;
		}

		public void setDataSpecsList(String dataSpecsList) {
			this.dataSpecsList = dataSpecsList;
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
	}

	@Override
	public Class<UpdateProductServiceIdentifierForTmallGenieResponse> getResponseClass() {
		return UpdateProductServiceIdentifierForTmallGenieResponse.class;
	}

}
