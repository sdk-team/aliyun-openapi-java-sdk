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
public class CreateTestDeviceForTmallGenieRequest extends RpcAcsRequest<CreateTestDeviceForTmallGenieResponse> {
	   

	private String iotInstanceId;

	private Integer quota;

	private String thingType;

	private String productKey;

	private String apiProduct;

	private String apiRevision;
	public CreateTestDeviceForTmallGenieRequest() {
		super("Iot", "2019-07-30", "CreateTestDeviceForTmallGenie");
		setMethod(MethodType.POST);
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

	public Integer getQuota() {
		return this.quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
		if(quota != null){
			putQueryParameter("Quota", quota.toString());
		}
	}

	public String getThingType() {
		return this.thingType;
	}

	public void setThingType(String thingType) {
		this.thingType = thingType;
		if(thingType != null){
			putQueryParameter("ThingType", thingType);
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
	public Class<CreateTestDeviceForTmallGenieResponse> getResponseClass() {
		return CreateTestDeviceForTmallGenieResponse.class;
	}

}
