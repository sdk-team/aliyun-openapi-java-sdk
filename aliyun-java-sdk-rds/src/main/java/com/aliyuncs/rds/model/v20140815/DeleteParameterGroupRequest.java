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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteParameterGroupRequest extends RpcAcsRequest<DeleteParameterGroupResponse> {
	
	public DeleteParameterGroupRequest() {
		super("Rds", "2014-08-15", "DeleteParameterGroup");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String parameterGroupId;

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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getParameterGroupId() {
		return this.parameterGroupId;
	}

	public void setParameterGroupId(String parameterGroupId) {
		this.parameterGroupId = parameterGroupId;
		if(parameterGroupId != null){
			putQueryParameter("ParameterGroupId", parameterGroupId);
		}
	}

	@Override
	public Class<DeleteParameterGroupResponse> getResponseClass() {
		return DeleteParameterGroupResponse.class;
	}

}