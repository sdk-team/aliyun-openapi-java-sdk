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
import com.aliyuncs.acs.transform.v20150101.GetSecretKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecretKeyResponse extends AcsResponse {

	private List<SecretKey> secretKeys;

	public List<SecretKey> getSecretKeys() {
		return this.secretKeys;
	}

	public void setSecretKeys(List<SecretKey> secretKeys) {
		this.secretKeys = secretKeys;
	}

	public static class SecretKey {

		private String product;

		private String keyName;

		private String secretKey;

		private String description;

		public String getBizProduct() {
			return this.product;
		}

		public void setBizProduct(String product) {
			this.product = product;
		}

		/**
		 * @deprecated use getBizProduct instead of this.
		 */
		@Deprecated
		public String getProduct() {
			return this.product;
		}

		/**
		 * @deprecated use setBizProduct instead of this.
		 */
		@Deprecated
		public void setProduct(String product) {
			this.product = product;
		}

		public String getKeyName() {
			return this.keyName;
		}

		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

		public String getSecretKey() {
			return this.secretKey;
		}

		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public GetSecretKeyResponse getInstance(UnmarshallerContext context) {
		return	GetSecretKeyResponseUnmarshaller.unmarshall(this, context);
	}
}
