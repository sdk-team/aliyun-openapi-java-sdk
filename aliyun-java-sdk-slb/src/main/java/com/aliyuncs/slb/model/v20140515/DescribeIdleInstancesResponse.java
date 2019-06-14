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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeIdleInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIdleInstancesResponse extends AcsResponse {

	private String requestId;

	private List<IdleInstance> idleInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IdleInstance> getIdleInstances() {
		return this.idleInstances;
	}

	public void setIdleInstances(List<IdleInstance> idleInstances) {
		this.idleInstances = idleInstances;
	}

	public static class IdleInstance {

		private String instanceId;

		private String instanceName;

		private String ip;

		private String idleType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getIdleType() {
			return this.idleType;
		}

		public void setIdleType(String idleType) {
			this.idleType = idleType;
		}
	}

	@Override
	public DescribeIdleInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIdleInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
