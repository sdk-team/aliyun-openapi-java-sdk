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
import com.google.gson.Gson;

/**
 * @author auto create
 * @version 
 */
public class AddProductIdentifierForTmallGenieRequest extends RpcAcsRequest<AddProductIdentifierForTmallGenieResponse> {
	
	public AddProductIdentifierForTmallGenieRequest() {
		super("Iot", "2019-07-30", "AddProductIdentifierForTmallGenie", "iot");
	}

	private List<Object> identifier;

	private String iotInstanceId;

	private String productKey;

	public List<Object> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<Object> identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", new Gson().toJson(identifier));
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<AddProductIdentifierForTmallGenieResponse> getResponseClass() {
		return AddProductIdentifierForTmallGenieResponse.class;
	}

}
