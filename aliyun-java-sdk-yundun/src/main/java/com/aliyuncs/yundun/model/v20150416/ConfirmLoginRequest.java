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

package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ConfirmLoginRequest extends RpcAcsRequest<ConfirmLoginResponse> {
	
	public ConfirmLoginRequest() {
		super("Yundun", "2015-04-16", "ConfirmLogin", "yundun");
	}

	private String instanceId;

	private String sourceIp;

	private String time;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time);
		}
	}

	@Override
	public Class<ConfirmLoginResponse> getResponseClass() {
		return ConfirmLoginResponse.class;
	}

}
