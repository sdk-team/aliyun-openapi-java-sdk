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
public class BulkQueryProductInfoForTmallGenieRequest extends RpcAcsRequest<BulkQueryProductInfoForTmallGenieResponse> {
	
	public BulkQueryProductInfoForTmallGenieRequest() {
		super("Iot", "2019-07-30", "BulkQueryProductInfoForTmallGenie", "iot");
	}

	private List<Object> productKeys;

	private String iotInstanceId;

	public List<Object> getProductKeys() {
		return this.productKeys;
	}

	public void setProductKeys(List<Object> productKeys) {
		this.productKeys = productKeys;
		if(productKeys != null){
			putBodyParameter("ProductKeys", new Gson().toJson(productKeys));
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
	public Class<BulkQueryProductInfoForTmallGenieResponse> getResponseClass() {
		return BulkQueryProductInfoForTmallGenieResponse.class;
	}

}
