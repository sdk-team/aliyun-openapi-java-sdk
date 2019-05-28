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
public class SetDdosQpsRequest extends RpcAcsRequest<SetDdosQpsResponse> {
	
	public SetDdosQpsRequest() {
		super("Yundun", "2015-04-16", "SetDdosQps", "yundun");
	}

	private String instanceId;

	private Integer level;

	private String instanceType;

	private Integer qpsPosition;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Integer getQpsPosition() {
		return this.qpsPosition;
	}

	public void setQpsPosition(Integer qpsPosition) {
		this.qpsPosition = qpsPosition;
		if(qpsPosition != null){
			putQueryParameter("QpsPosition", qpsPosition.toString());
		}
	}

	@Override
	public Class<SetDdosQpsResponse> getResponseClass() {
		return SetDdosQpsResponse.class;
	}

}
