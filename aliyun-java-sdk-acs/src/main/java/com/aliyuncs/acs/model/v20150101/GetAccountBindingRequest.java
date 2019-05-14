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
public class GetAccountBindingRequest extends RoaAcsRequest<GetAccountBindingResponse> {
	
	public GetAccountBindingRequest() {
		super("Acs", "2015-01-01", "GetAccountBinding");
		setUriPattern("/AccountBinding/[Product]");
		setMethod(MethodType.GET);
	}

	private String product;

	private Long aliyunUid;

	private String bucEmpId;

	private String accept;

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
		if(product != null){
			putPathParameter("Product", product);
		}
	}

	/**
	 * @deprecated use getBizProduct instead of this.
	 */
	@Deprecated
	public String getProduct() {
		return this.product;
	}

	/**
	 * @deprecated use setBizProduct instead of this.
	 */
	@Deprecated
	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putPathParameter("Product", product);
		}
	}

	public Long getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(Long aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("AliyunUid", aliyunUid.toString());
		}
	}

	public String getBucEmpId() {
		return this.bucEmpId;
	}

	public void setBucEmpId(String bucEmpId) {
		this.bucEmpId = bucEmpId;
		if(bucEmpId != null){
			putQueryParameter("BucEmpId", bucEmpId);
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
	public Class<GetAccountBindingResponse> getResponseClass() {
		return GetAccountBindingResponse.class;
	}

}
