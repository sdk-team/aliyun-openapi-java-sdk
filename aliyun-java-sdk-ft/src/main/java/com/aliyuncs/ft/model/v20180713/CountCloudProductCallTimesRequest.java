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
public class CountCloudProductCallTimesRequest extends RpcAcsRequest<CountCloudProductCallTimesResponse> {
	   

	private Long bucUid;

	private String bucName;

	private String bucEmpId;

	private String cloudProductsJsonString;

	private Boolean clearCloudCache;

	private Boolean clearProductCache;
	public CountCloudProductCallTimesRequest() {
		super("Ft", "2018-07-13", "CountCloudProductCallTimes");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCloudProductsJsonString() {
		return this.cloudProductsJsonString;
	}

	public void setCloudProductsJsonString(String cloudProductsJsonString) {
		this.cloudProductsJsonString = cloudProductsJsonString;
		if(cloudProductsJsonString != null){
			putBodyParameter("CloudProductsJsonString", cloudProductsJsonString);
		}
	}

	public Boolean getClearCloudCache() {
		return this.clearCloudCache;
	}

	public void setClearCloudCache(Boolean clearCloudCache) {
		this.clearCloudCache = clearCloudCache;
		if(clearCloudCache != null){
			putBodyParameter("ClearCloudCache", clearCloudCache.toString());
		}
	}

	public Boolean getClearProductCache() {
		return this.clearProductCache;
	}

	public void setClearProductCache(Boolean clearProductCache) {
		this.clearProductCache = clearProductCache;
		if(clearProductCache != null){
			putBodyParameter("ClearProductCache", clearProductCache.toString());
		}
	}

	@Override
	public Class<CountCloudProductCallTimesResponse> getResponseClass() {
		return CountCloudProductCallTimesResponse.class;
	}

}
