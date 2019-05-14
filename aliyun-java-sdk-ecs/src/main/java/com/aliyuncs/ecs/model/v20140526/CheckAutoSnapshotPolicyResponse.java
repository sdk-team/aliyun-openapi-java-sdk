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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.CheckAutoSnapshotPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckAutoSnapshotPolicyResponse extends AcsResponse {

	private String requestId;

	private Integer autoSnapshotOccupation;

	private String isPermittedModify;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAutoSnapshotOccupation() {
		return this.autoSnapshotOccupation;
	}

	public void setAutoSnapshotOccupation(Integer autoSnapshotOccupation) {
		this.autoSnapshotOccupation = autoSnapshotOccupation;
	}

	public String getIsPermittedModify() {
		return this.isPermittedModify;
	}

	public void setIsPermittedModify(String isPermittedModify) {
		this.isPermittedModify = isPermittedModify;
	}

	@Override
	public CheckAutoSnapshotPolicyResponse getInstance(UnmarshallerContext context) {
		return	CheckAutoSnapshotPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
