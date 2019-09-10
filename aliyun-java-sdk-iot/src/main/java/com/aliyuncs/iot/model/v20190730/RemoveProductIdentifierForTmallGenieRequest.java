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
public class RemoveProductIdentifierForTmallGenieRequest extends RpcAcsRequest<RemoveProductIdentifierForTmallGenieResponse> {
	
	public RemoveProductIdentifierForTmallGenieRequest() {
		super("Iot", "2019-07-30", "RemoveProductIdentifierForTmallGenie");
		setMethod(MethodType.POST);
	}

	private List<String> identifiers;

	private String productKey;

	private String iotInstanceId;

	public List<String> getIdentifiers() {
		return this.identifiers;
	}

	public void setIdentifiers(List<String> identifiers) {
		this.identifiers = identifiers;	
		if (identifiers != null) {
			for (int i = 0; i < identifiers.size(); i++) {
				putQueryParameter("Identifier." + (i + 1) , identifiers.get(i));
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	@Override
	public Class<RemoveProductIdentifierForTmallGenieResponse> getResponseClass() {
		return RemoveProductIdentifierForTmallGenieResponse.class;
	}

}
