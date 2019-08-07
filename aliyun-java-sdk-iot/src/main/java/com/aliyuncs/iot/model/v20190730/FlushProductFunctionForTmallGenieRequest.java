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

/**
 * @author auto create
 * @version 
 */
public class FlushProductFunctionForTmallGenieRequest extends RpcAcsRequest<FlushProductFunctionForTmallGenieResponse> {
	
	public FlushProductFunctionForTmallGenieRequest() {
		super("Iot", "2019-07-30", "FlushProductFunctionForTmallGenie", "Iot");
	}

	private List<String> fields;

	private String iotInstanceId;

	private String productKey;

	public List<String> getFields() {
		return this.fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;	
		if (fields != null) {
			for (int i = 0; i < fields.size(); i++) {
				putQueryParameter("Field." + (i + 1) , fields.get(i));
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
	public Class<FlushProductFunctionForTmallGenieResponse> getResponseClass() {
		return FlushProductFunctionForTmallGenieResponse.class;
	}

}