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
public class ApplyAutoSnapshotPolicy_GatedLaunchRequest extends RpcAcsRequest<ApplyAutoSnapshotPolicy_GatedLaunchResponse> {
	
	public ApplyAutoSnapshotPolicy_GatedLaunchRequest() {
		super("Ecs", "2014-05-26", "ApplyAutoSnapshotPolicy_GatedLaunch", "ecs");
	}

	private Long resourceOwnerId;

	private String autoSnapshotPolicyId;

	private String diskIds;

	private String resourceOwnerAccount;

	private Long ownerId;

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

	public String getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(String diskIds) {
		this.diskIds = diskIds;
		if(diskIds != null){
			putQueryParameter("diskIds", diskIds);
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

	@Override
	public Class<ApplyAutoSnapshotPolicy_GatedLaunchResponse> getResponseClass() {
		return ApplyAutoSnapshotPolicy_GatedLaunchResponse.class;
	}

}
