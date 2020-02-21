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
public class GetDeviceApplyStatusForTmallGenieRequest extends RpcAcsRequest<GetDeviceApplyStatusForTmallGenieResponse> {
	   

	private String productKey;

	private List<String> applyIds;

	private String apiProduct;

	private String apiRevision;

	private String fileFormat;
	public GetDeviceApplyStatusForTmallGenieRequest() {
		super("Iot", "2019-07-30", "GetDeviceApplyStatusForTmallGenie");
		setMethod(MethodType.POST);
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

	public List<String> getApplyIds() {
		return this.applyIds;
	}

	public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;	
		if (applyIds != null) {
			for (int i = 0; i < applyIds.size(); i++) {
				putQueryParameter("ApplyId." + (i + 1) , applyIds.get(i));
			}
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

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
		if(fileFormat != null){
			putQueryParameter("FileFormat", fileFormat);
		}
	}

	@Override
	public Class<GetDeviceApplyStatusForTmallGenieResponse> getResponseClass() {
		return GetDeviceApplyStatusForTmallGenieResponse.class;
	}

}
