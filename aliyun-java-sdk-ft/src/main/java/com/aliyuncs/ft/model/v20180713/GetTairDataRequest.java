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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetTairDataRequest extends RpcAcsRequest<GetTairDataResponse> {
	   

	private List<String> keyss;

	private String cacheName;
	public GetTairDataRequest() {
		super("Ft", "2018-07-13", "GetTairData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getKeyss() {
		return this.keyss;
	}

	public void setKeyss(List<String> keyss) {
		this.keyss = keyss;	
		if (keyss != null) {
			for (int i = 0; i < keyss.size(); i++) {
				putQueryParameter("Keys." + (i + 1) , keyss.get(i));
			}
		}	
	}

	public String getCacheName() {
		return this.cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
		if(cacheName != null){
			putQueryParameter("CacheName", cacheName);
		}
	}

	@Override
	public Class<GetTairDataResponse> getResponseClass() {
		return GetTairDataResponse.class;
	}

}
