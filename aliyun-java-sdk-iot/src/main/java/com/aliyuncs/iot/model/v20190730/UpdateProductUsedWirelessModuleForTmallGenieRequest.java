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

/**
 * @author auto create
 * @version 
 */
public class UpdateProductUsedWirelessModuleForTmallGenieRequest extends RpcAcsRequest<UpdateProductUsedWirelessModuleForTmallGenieResponse> {
	
	public UpdateProductUsedWirelessModuleForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateProductUsedWirelessModuleForTmallGenie", "Iot");
	}

	private Boolean isStandardNetwork;

	private String connectMode;

	private Boolean isCertificationModule;

	private String modelType;

	private String iotInstanceId;

	private String moduleFunction;

	private String model;

	private String productKey;

	private String brand;

	public Boolean getIsStandardNetwork() {
		return this.isStandardNetwork;
	}

	public void setIsStandardNetwork(Boolean isStandardNetwork) {
		this.isStandardNetwork = isStandardNetwork;
		if(isStandardNetwork != null){
			putBodyParameter("IsStandardNetwork", isStandardNetwork.toString());
		}
	}

	public String getConnectMode() {
		return this.connectMode;
	}

	public void setConnectMode(String connectMode) {
		this.connectMode = connectMode;
		if(connectMode != null){
			putBodyParameter("ConnectMode", connectMode);
		}
	}

	public Boolean getIsCertificationModule() {
		return this.isCertificationModule;
	}

	public void setIsCertificationModule(Boolean isCertificationModule) {
		this.isCertificationModule = isCertificationModule;
		if(isCertificationModule != null){
			putBodyParameter("IsCertificationModule", isCertificationModule.toString());
		}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putBodyParameter("ModelType", modelType);
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

	public String getModuleFunction() {
		return this.moduleFunction;
	}

	public void setModuleFunction(String moduleFunction) {
		this.moduleFunction = moduleFunction;
		if(moduleFunction != null){
			putBodyParameter("ModuleFunction", moduleFunction);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		if(brand != null){
			putBodyParameter("Brand", brand);
		}
	}

	@Override
	public Class<UpdateProductUsedWirelessModuleForTmallGenieResponse> getResponseClass() {
		return UpdateProductUsedWirelessModuleForTmallGenieResponse.class;
	}

}
