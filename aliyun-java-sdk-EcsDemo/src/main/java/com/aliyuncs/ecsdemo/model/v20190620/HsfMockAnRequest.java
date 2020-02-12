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

package com.aliyuncs.ecsdemo.model.v20190620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HsfMockAnRequest extends RpcAcsRequest<HsfMockAnResponse> {
	   

	private String request;

	private String response;

	private Long rT;

	private Integer responseSize;
	public HsfMockAnRequest() {
		super("EcsDemo", "2019-06-20", "HsfMockAn");
		setMethod(MethodType.POST);
	}

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
		if(request != null){
			putBodyParameter("Request", request);
		}
	}

	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
		if(response != null){
			putBodyParameter("Response", response);
		}
	}

	public Long getRT() {
		return this.rT;
	}

	public void setRT(Long rT) {
		this.rT = rT;
		if(rT != null){
			putBodyParameter("RT", rT.toString());
		}
	}

	public Integer getResponseSize() {
		return this.responseSize;
	}

	public void setResponseSize(Integer responseSize) {
		this.responseSize = responseSize;
		if(responseSize != null){
			putBodyParameter("ResponseSize", responseSize.toString());
		}
	}

	@Override
	public Class<HsfMockAnResponse> getResponseClass() {
		return HsfMockAnResponse.class;
	}

}
