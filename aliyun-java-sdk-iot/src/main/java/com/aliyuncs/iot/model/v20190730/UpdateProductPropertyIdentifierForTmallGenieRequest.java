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
public class UpdateProductPropertyIdentifierForTmallGenieRequest extends RpcAcsRequest<UpdateProductPropertyIdentifierForTmallGenieResponse> {
	
	public UpdateProductPropertyIdentifierForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateProductPropertyIdentifierForTmallGenie", "iot");
	}

	private String identifier;

	private String dataSpecs;

	private String rwType;

	private String dataType;

	private String iotInstanceId;

	private String name;

	private String description;

	private String productKey;

	private String dataSpecsList;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getDataSpecs() {
		return this.dataSpecs;
	}

	public void setDataSpecs(String dataSpecs) {
		this.dataSpecs = dataSpecs;
		if(dataSpecs != null){
			putBodyParameter("DataSpecs", dataSpecs);
		}
	}

	public String getRwType() {
		return this.rwType;
	}

	public void setRwType(String rwType) {
		this.rwType = rwType;
		if(rwType != null){
			putBodyParameter("RwType", rwType);
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putBodyParameter("DataType", dataType);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getDataSpecsList() {
		return this.dataSpecsList;
	}

	public void setDataSpecsList(String dataSpecsList) {
		this.dataSpecsList = dataSpecsList;
		if(dataSpecsList != null){
			putBodyParameter("DataSpecsList", dataSpecsList);
		}
	}

	@Override
	public Class<UpdateProductPropertyIdentifierForTmallGenieResponse> getResponseClass() {
		return UpdateProductPropertyIdentifierForTmallGenieResponse.class;
	}

}
