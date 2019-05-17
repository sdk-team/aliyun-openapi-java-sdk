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

package com.aliyuncs.rds.model.v20130528;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20130528.DescribeSwitchDBInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSwitchDBInstanceListResponse extends AcsResponse {

	private String requestId;

	private List<SwitchDBInstance> switchDBInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SwitchDBInstance> getSwitchDBInstances() {
		return this.switchDBInstances;
	}

	public void setSwitchDBInstances(List<SwitchDBInstance> switchDBInstances) {
		this.switchDBInstances = switchDBInstances;
	}

	public static class SwitchDBInstance {

		private String dBInstanceId;

		private String guardDBInstanceId;

		private String switchStatus;

		private String forceSwitch;

		private String description;

		private String switchTime;

		private String switchSuccessTime;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
		}

		public String getSwitchStatus() {
			return this.switchStatus;
		}

		public void setSwitchStatus(String switchStatus) {
			this.switchStatus = switchStatus;
		}

		public String getForceSwitch() {
			return this.forceSwitch;
		}

		public void setForceSwitch(String forceSwitch) {
			this.forceSwitch = forceSwitch;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSwitchTime() {
			return this.switchTime;
		}

		public void setSwitchTime(String switchTime) {
			this.switchTime = switchTime;
		}

		public String getSwitchSuccessTime() {
			return this.switchSuccessTime;
		}

		public void setSwitchSuccessTime(String switchSuccessTime) {
			this.switchSuccessTime = switchSuccessTime;
		}
	}

	@Override
	public DescribeSwitchDBInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSwitchDBInstanceListResponseUnmarshaller.unmarshall(this, context);
	}
}
