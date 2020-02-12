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
public class HttpMockRequest extends RpcAcsRequest<HttpMockResponse> {
	   

	private String request;

	private String rT;

	private String responseSize;

	private String response;
	public HttpMockRequest() {
		super("EcsDemo", "2019-06-20", "HttpMock");
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

	public String getRT() {
		return this.rT;
	}

	public void setRT(String rT) {
		this.rT = rT;
		if(rT != null){
			putBodyParameter("RT", rT);
		}
	}

	public String getResponseSize() {
		return this.responseSize;
	}

	public void setResponseSize(String responseSize) {
		this.responseSize = responseSize;
		if(responseSize != null){
			putBodyParameter("ResponseSize", responseSize);
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

	@Override
	public Class<HttpMockResponse> getResponseClass() {
		return HttpMockResponse.class;
	}

}
