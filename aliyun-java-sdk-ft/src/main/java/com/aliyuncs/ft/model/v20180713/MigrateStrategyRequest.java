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
public class MigrateStrategyRequest extends RpcAcsRequest<MigrateStrategyResponse> {
	   

	private String apiName;

	private String productName;

	private Long bucUid;

	private Long step;

	private String bucName;

	private String env;

	private String bucEmpId;

	private String versionName;
	public MigrateStrategyRequest() {
		super("Ft", "2018-07-13", "MigrateStrategy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
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

	public Long getStep() {
		return this.step;
	}

	public void setStep(Long step) {
		this.step = step;
		if(step != null){
			putQueryParameter("Step", step.toString());
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

	public String getBucEmpId() {
		return this.bucEmpId;
	}

	public void setBucEmpId(String bucEmpId) {
		this.bucEmpId = bucEmpId;
		if(bucEmpId != null){
			putQueryParameter("BucEmpId", bucEmpId);
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

	@Override
	public Class<MigrateStrategyResponse> getResponseClass() {
		return MigrateStrategyResponse.class;
	}

}
