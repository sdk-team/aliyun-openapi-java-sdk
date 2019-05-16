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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeConfigLogHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigLogHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ConfigurationItem> configurationItemSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ConfigurationItem> getConfigurationItemSet() {
		return this.configurationItemSet;
	}

	public void setConfigurationItemSet(List<ConfigurationItem> configurationItemSet) {
		this.configurationItemSet = configurationItemSet;
	}

	public static class ConfigurationItem {

		private String configurationItemVersion;

		private String configurationCaptureTime;

		private String resourceId;

		private String resourceType;

		private Long aliUid;

		private String arn;

		private String resourceCreationTime;

		private String regionId;

		private String zoneId;

		private String configuration;

		public String getConfigurationItemVersion() {
			return this.configurationItemVersion;
		}

		public void setConfigurationItemVersion(String configurationItemVersion) {
			this.configurationItemVersion = configurationItemVersion;
		}

		public String getConfigurationCaptureTime() {
			return this.configurationCaptureTime;
		}

		public void setConfigurationCaptureTime(String configurationCaptureTime) {
			this.configurationCaptureTime = configurationCaptureTime;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getResourceCreationTime() {
			return this.resourceCreationTime;
		}

		public void setResourceCreationTime(String resourceCreationTime) {
			this.resourceCreationTime = resourceCreationTime;
		}

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

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}
	}

	@Override
	public DescribeConfigLogHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigLogHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
