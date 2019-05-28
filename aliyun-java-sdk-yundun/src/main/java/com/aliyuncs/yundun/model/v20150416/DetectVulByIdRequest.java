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
public class DetectVulByIdRequest extends RpcAcsRequest<DetectVulByIdResponse> {
	
	public DetectVulByIdRequest() {
		super("Yundun", "2015-04-16", "DetectVulById", "yundun");
	}

	private String instanceId;

	private Integer vulId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getVulId() {
		return this.vulId;
	}

	public void setVulId(Integer vulId) {
		this.vulId = vulId;
		if(vulId != null){
			putQueryParameter("VulId", vulId.toString());
		}
	}

	@Override
	public Class<DetectVulByIdResponse> getResponseClass() {
		return DetectVulByIdResponse.class;
	}

}
