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
public class QueryProductProjectForTmallGenieRequest extends RpcAcsRequest<QueryProductProjectForTmallGenieResponse> {
	   

	private String taoBaoId;

	private String productKey;

	private String iotInstanceId;
	public QueryProductProjectForTmallGenieRequest() {
		super("Iot", "2019-07-30", "QueryProductProjectForTmallGenie");
		setMethod(MethodType.POST);
	}

	public String getTaoBaoId() {
		return this.taoBaoId;
	}

	public void setTaoBaoId(String taoBaoId) {
		this.taoBaoId = taoBaoId;
		if(taoBaoId != null){
			putQueryParameter("TaoBaoId", taoBaoId);
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
	public Class<QueryProductProjectForTmallGenieResponse> getResponseClass() {
		return QueryProductProjectForTmallGenieResponse.class;
	}

}
