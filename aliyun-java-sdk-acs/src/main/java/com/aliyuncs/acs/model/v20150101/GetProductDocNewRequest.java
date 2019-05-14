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

package com.aliyuncs.acs.model.v20150101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProductDocNewRequest extends RoaAcsRequest<GetProductDocNewResponse> {
	
	public GetProductDocNewRequest() {
		super("Acs", "2015-01-01", "GetProductDocNew", "1.0.3");
		setUriPattern("/ProductDocNew/[ProductName]/[Language]/[IsDraft]");
		setMethod(MethodType.GET);
	}

	private Boolean isDraft;

	private String productName;

	private String language;

	private String accept;

	public Boolean getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		if(isDraft != null){
			putPathParameter("IsDraft", isDraft.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putPathParameter("ProductName", productName);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putPathParameter("Language", language);
		}
	}

	public String getAccept() {
		return this.accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
		if(accept != null){
			putHeaderParameter("Accept", accept);
		}
	}

	@Override
	public Class<GetProductDocNewResponse> getResponseClass() {
		return GetProductDocNewResponse.class;
	}

}
