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
public class GetMigrateStrategyResultRequest extends RpcAcsRequest<GetMigrateStrategyResultResponse> {
	   

	private String parentName;

	private Integer currentPage;

	private String bucName;

	private String env;

	private String type;

	private String bucEmpId;

	private String strategyName;

	private String apiName;

	private String flowSpecial;

	private Integer pageSize;

	private String productName;

	private String bucUid;

	private String versionName;

	private String status;
	public GetMigrateStrategyResultRequest() {
		super("Ft", "2018-07-13", "GetMigrateStrategyResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
		if(parentName != null){
			putQueryParameter("parentName", parentName);
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

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("type", type);
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

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putBodyParameter("strategyName", strategyName);
		}
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putQueryParameter("ApiName", apiName);
		}
	}

	public String getFlowSpecial() {
		return this.flowSpecial;
	}

	public void setFlowSpecial(String flowSpecial) {
		this.flowSpecial = flowSpecial;
		if(flowSpecial != null){
			putQueryParameter("flowSpecial", flowSpecial);
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

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getBucUid() {
		return this.bucUid;
	}

	public void setBucUid(String bucUid) {
		this.bucUid = bucUid;
		if(bucUid != null){
			putQueryParameter("BucUid", bucUid);
		}
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putQueryParameter("VersionName", versionName);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	@Override
	public Class<GetMigrateStrategyResultResponse> getResponseClass() {
		return GetMigrateStrategyResultResponse.class;
	}

}
