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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class JxyTestRequest extends RpcAcsRequest<JxyTestResponse> {
	   

	private Float aa;
	public JxyTestRequest() {
		super("EcsDemo", "2019-06-20", "JxyTest");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Float getAa() {
		return this.aa;
	}

	public void setAa(Float aa) {
		this.aa = aa;
		if(aa != null){
			putQueryParameter("Aa", aa.toString());
		}
	}

	@Override
	public Class<JxyTestResponse> getResponseClass() {
		return JxyTestResponse.class;
	}

}
