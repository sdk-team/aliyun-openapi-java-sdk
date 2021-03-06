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

package com.aliyuncs.vod.model.v20190610;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20190610.SubmitSnapshotJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitSnapshotJobResponse extends AcsResponse {

	private String requestId;

	private SnapshotJob snapshotJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SnapshotJob getSnapshotJob() {
		return this.snapshotJob;
	}

	public void setSnapshotJob(SnapshotJob snapshotJob) {
		this.snapshotJob = snapshotJob;
	}

	public static class SnapshotJob {

		private String jobId;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
	}

	@Override
	public SubmitSnapshotJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitSnapshotJobResponseUnmarshaller.unmarshall(this, context);
	}
}
