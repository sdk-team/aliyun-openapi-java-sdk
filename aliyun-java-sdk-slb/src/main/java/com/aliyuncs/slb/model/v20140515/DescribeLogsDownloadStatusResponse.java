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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLogsDownloadStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogsDownloadStatusResponse extends AcsResponse {

	private String requestId;

	private String logsDownloadStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogsDownloadStatus() {
		return this.logsDownloadStatus;
	}

	public void setLogsDownloadStatus(String logsDownloadStatus) {
		this.logsDownloadStatus = logsDownloadStatus;
	}

	@Override
	public DescribeLogsDownloadStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogsDownloadStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
