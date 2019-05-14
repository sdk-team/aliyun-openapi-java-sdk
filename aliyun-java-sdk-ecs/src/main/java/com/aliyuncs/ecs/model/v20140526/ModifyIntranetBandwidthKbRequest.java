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
public class ModifyIntranetBandwidthKbRequest extends RpcAcsRequest<ModifyIntranetBandwidthKbResponse> {
	
	public ModifyIntranetBandwidthKbRequest() {
		super("Ecs", "2014-05-26", "ModifyIntranetBandwidthKb", "ecs");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer intranetMaxBandwidthOut;

	private String instanceId;

	private Integer intranetMaxBandwidthIn;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public Integer getIntranetMaxBandwidthOut() {
		return this.intranetMaxBandwidthOut;
	}

	public void setIntranetMaxBandwidthOut(Integer intranetMaxBandwidthOut) {
		this.intranetMaxBandwidthOut = intranetMaxBandwidthOut;
		if(intranetMaxBandwidthOut != null){
			putQueryParameter("IntranetMaxBandwidthOut", intranetMaxBandwidthOut.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getIntranetMaxBandwidthIn() {
		return this.intranetMaxBandwidthIn;
	}

	public void setIntranetMaxBandwidthIn(Integer intranetMaxBandwidthIn) {
		this.intranetMaxBandwidthIn = intranetMaxBandwidthIn;
		if(intranetMaxBandwidthIn != null){
			putQueryParameter("IntranetMaxBandwidthIn", intranetMaxBandwidthIn.toString());
		}
	}

	@Override
	public Class<ModifyIntranetBandwidthKbResponse> getResponseClass() {
		return ModifyIntranetBandwidthKbResponse.class;
	}

}
