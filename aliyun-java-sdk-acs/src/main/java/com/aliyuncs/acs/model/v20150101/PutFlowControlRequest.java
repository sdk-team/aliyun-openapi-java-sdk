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
public class PutFlowControlRequest extends RoaAcsRequest<PutFlowControlResponse> {
	   

	private String bodyContent;

	private String apiName;

	private String productName;

	private String versionName;

	private String accept;
	public PutFlowControlRequest() {
		super("Acs", "2015-01-01", "PutFlowControl");
		setUriPattern("/FlowControl/[ProductName]/[VersionName]/[ApiName]");
		setMethod(MethodType.PUT);
	}

	public String getBodyContent() {
		return this.bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
		if(bodyContent != null){
			putBodyParameter("BodyContent", bodyContent);
		}
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putPathParameter("ApiName", apiName);
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

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putPathParameter("VersionName", versionName);
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
	public Class<PutFlowControlResponse> getResponseClass() {
		return PutFlowControlResponse.class;
	}

}
