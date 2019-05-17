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
import com.aliyuncs.rds.transform.v20130528.QueryShareDBInstancesServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryShareDBInstancesServiceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<ShareDBInstanceModel> shareDBInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ShareDBInstanceModel> getShareDBInstances() {
		return this.shareDBInstances;
	}

	public void setShareDBInstances(List<ShareDBInstanceModel> shareDBInstances) {
		this.shareDBInstances = shareDBInstances;
	}

	public static class ShareDBInstanceModel {

		private Integer dbInstanceId;

		private String dbInstanceName;

		private String clusterName;

		private String shareMaxQty;

		private String shareUsedQty;

		public Integer getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(Integer dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getShareMaxQty() {
			return this.shareMaxQty;
		}

		public void setShareMaxQty(String shareMaxQty) {
			this.shareMaxQty = shareMaxQty;
		}

		public String getShareUsedQty() {
			return this.shareUsedQty;
		}

		public void setShareUsedQty(String shareUsedQty) {
			this.shareUsedQty = shareUsedQty;
		}
	}

	@Override
	public QueryShareDBInstancesServiceResponse getInstance(UnmarshallerContext context) {
		return	QueryShareDBInstancesServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
