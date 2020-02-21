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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ImportDeviceForTmallGenieRequest extends RpcAcsRequest<ImportDeviceForTmallGenieResponse> {
	   

	private String deviceDefinition;

	private String apiProduct;

	private String apiRevision;
	public ImportDeviceForTmallGenieRequest() {
		super("Iot", "2019-07-30", "ImportDeviceForTmallGenie");
		setMethod(MethodType.POST);
	}

	public String getDeviceDefinition() {
		return this.deviceDefinition;
	}

	public void setDeviceDefinition(String deviceDefinition) {
		this.deviceDefinition = deviceDefinition;
		if(deviceDefinition != null){
			putBodyParameter("DeviceDefinition", deviceDefinition);
		}
	}

	public String getApiProduct() {
		return this.apiProduct;
	}

	public void setApiProduct(String apiProduct) {
		this.apiProduct = apiProduct;
		if(apiProduct != null){
			putBodyParameter("ApiProduct", apiProduct);
		}
	}

	public String getApiRevision() {
		return this.apiRevision;
	}

	public void setApiRevision(String apiRevision) {
		this.apiRevision = apiRevision;
		if(apiRevision != null){
			putBodyParameter("ApiRevision", apiRevision);
		}
	}

	@Override
	public Class<ImportDeviceForTmallGenieResponse> getResponseClass() {
		return ImportDeviceForTmallGenieResponse.class;
	}

}
