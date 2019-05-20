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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InvokeCommandRequest extends RpcAcsRequest<InvokeCommandResponse> {
	
	public InvokeCommandRequest() {
		super("Ecs", "2014-05-26", "InvokeCommand", "ecs");
	}

	private Long resourceOwnerId;

	private String commandId;

	private String frequency;

	private Boolean timed;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> instanceIds;

	private String parameters;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
		}
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency);
		}
	}

	public Boolean getTimed() {
		return this.timed;
	}

	public void setTimed(Boolean timed) {
		this.timed = timed;
		if(timed != null){
			putQueryParameter("Timed", timed.toString());
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<InvokeCommandResponse> getResponseClass() {
		return InvokeCommandResponse.class;
	}

}
