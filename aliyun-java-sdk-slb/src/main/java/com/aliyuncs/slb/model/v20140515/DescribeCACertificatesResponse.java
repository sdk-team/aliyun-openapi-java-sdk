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
import com.aliyuncs.slb.transform.v20140515.DescribeCACertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCACertificatesResponse extends AcsResponse {

	private String requestId;

	private List<CACertificate> cACertificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CACertificate> getCACertificates() {
		return this.cACertificates;
	}

	public void setCACertificates(List<CACertificate> cACertificates) {
		this.cACertificates = cACertificates;
	}

	public static class CACertificate {

		private String regionId;

		private String cACertificateId;

		private String cACertificateName;

		private String fingerprint;

		private String expireTime;

		private Long expireTimeStamp;

		private String commonName;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCACertificateId() {
			return this.cACertificateId;
		}

		public void setCACertificateId(String cACertificateId) {
			this.cACertificateId = cACertificateId;
		}

		public String getCACertificateName() {
			return this.cACertificateName;
		}

		public void setCACertificateName(String cACertificateName) {
			this.cACertificateName = cACertificateName;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getExpireTimeStamp() {
			return this.expireTimeStamp;
		}

		public void setExpireTimeStamp(Long expireTimeStamp) {
			this.expireTimeStamp = expireTimeStamp;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}
	}

	@Override
	public DescribeCACertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCACertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}
