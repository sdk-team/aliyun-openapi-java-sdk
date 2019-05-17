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

package com.aliyuncs.aas.model.v20150701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.ListAccessKeysForAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccessKeysForAccountResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private List<AccessKey> accessKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
	}

	public List<AccessKey> getAccessKeys() {
		return this.accessKeys;
	}

	public void setAccessKeys(List<AccessKey> accessKeys) {
		this.accessKeys = accessKeys;
	}

	public static class AccessKey {

		private String createTime;

		private String accessKeyId;

		private String accessKeySecret;

		private String accessKeyStatus;

		private String accessKeyType;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getAccessKeyStatus() {
			return this.accessKeyStatus;
		}

		public void setAccessKeyStatus(String accessKeyStatus) {
			this.accessKeyStatus = accessKeyStatus;
		}

		public String getAccessKeyType() {
			return this.accessKeyType;
		}

		public void setAccessKeyType(String accessKeyType) {
			this.accessKeyType = accessKeyType;
		}
	}

	@Override
	public ListAccessKeysForAccountResponse getInstance(UnmarshallerContext context) {
		return	ListAccessKeysForAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
