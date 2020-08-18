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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainChangeRecordsRequest extends RpcAcsRequest<QueryDomainChangeRecordsResponse> {
	   

	private String product;

	private Integer pageSize;

	private Long bucUid;

	private Integer currentPage;

	private String bucName;

	private String bucEmpId;
	public QueryDomainChangeRecordsRequest() {
		super("Ft", "2018-07-13", "QueryDomainChangeRecords");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getBucUid() {
		return this.bucUid;
	}

	public void setBucUid(Long bucUid) {
		this.bucUid = bucUid;
		if(bucUid != null){
			putQueryParameter("BucUid", bucUid.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getBucName() {
		return this.bucName;
	}

	public void setBucName(String bucName) {
		this.bucName = bucName;
		if(bucName != null){
			putQueryParameter("BucName", bucName);
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

	@Override
	public Class<QueryDomainChangeRecordsResponse> getResponseClass() {
		return QueryDomainChangeRecordsResponse.class;
	}

}
