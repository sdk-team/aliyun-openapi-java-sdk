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

package com.aliyuncs.acs.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.acs.transform.v20150101.GetApiBackupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApiBackupListResponse extends AcsResponse {

	private List<ApiBackup> apiBackups;

	public List<ApiBackup> getApiBackups() {
		return this.apiBackups;
	}

	public void setApiBackups(List<ApiBackup> apiBackups) {
		this.apiBackups = apiBackups;
	}

	public static class ApiBackup {

		private Long backupId;

		private String name;

		private String time;

		public Long getBackupId() {
			return this.backupId;
		}

		public void setBackupId(Long backupId) {
			this.backupId = backupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public GetApiBackupListResponse getInstance(UnmarshallerContext context) {
		return	GetApiBackupListResponseUnmarshaller.unmarshall(this, context);
	}
}
