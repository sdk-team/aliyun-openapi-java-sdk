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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyAutoSnapshotPolicyExRequest extends RpcAcsRequest<ModifyAutoSnapshotPolicyExResponse> {
	
	public ModifyAutoSnapshotPolicyExRequest() {
		super("Ecs", "2014-05-26", "ModifyAutoSnapshotPolicyEx", "ecs");
	}

	private Long resourceOwnerId;

	private String autoSnapshotPolicyId;

	private String timePoints;

	private String repeatWeekdays;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String autoSnapshotPolicyName;

	private Integer retentionDays;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAutoSnapshotPolicyId() {
		return this.autoSnapshotPolicyId;
	}

	public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
		this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		if(autoSnapshotPolicyId != null){
			putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
		}
	}

	public String getTimePoints() {
		return this.timePoints;
	}

	public void setTimePoints(String timePoints) {
		this.timePoints = timePoints;
		if(timePoints != null){
			putQueryParameter("timePoints", timePoints);
		}
	}

	public String getRepeatWeekdays() {
		return this.repeatWeekdays;
	}

	public void setRepeatWeekdays(String repeatWeekdays) {
		this.repeatWeekdays = repeatWeekdays;
		if(repeatWeekdays != null){
			putQueryParameter("repeatWeekdays", repeatWeekdays);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAutoSnapshotPolicyName() {
		return this.autoSnapshotPolicyName;
	}

	public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
		this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		if(autoSnapshotPolicyName != null){
			putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
		}
	}

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if(retentionDays != null){
			putQueryParameter("retentionDays", retentionDays.toString());
		}
	}

	@Override
	public Class<ModifyAutoSnapshotPolicyExResponse> getResponseClass() {
		return ModifyAutoSnapshotPolicyExResponse.class;
	}

}
