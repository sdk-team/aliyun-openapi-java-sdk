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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExportDeviceForTmallGenieRequest extends RpcAcsRequest<ExportDeviceForTmallGenieResponse> {
	   

	private List<String> deviceNamess;

	private String productKey;

	private String apiProduct;

	private String apiRevision;
	public ExportDeviceForTmallGenieRequest() {
		super("Iot", "2019-07-30", "ExportDeviceForTmallGenie");
		setMethod(MethodType.POST);
	}

	public List<String> getDeviceNamess() {
		return this.deviceNamess;
	}

	public void setDeviceNamess(List<String> deviceNamess) {
		this.deviceNamess = deviceNamess;	
		if (deviceNamess != null) {
			for (int i = 0; i < deviceNamess.size(); i++) {
				putQueryParameter("DeviceNames." + (i + 1) , deviceNamess.get(i));
			}
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
	public Class<ExportDeviceForTmallGenieResponse> getResponseClass() {
		return ExportDeviceForTmallGenieResponse.class;
	}

}
