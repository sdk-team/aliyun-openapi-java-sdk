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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateConfigLogSubscriptionsRequest extends RpcAcsRequest<CreateConfigLogSubscriptionsResponse> {
	
	public CreateConfigLogSubscriptionsRequest() {
		super("Ecs", "2016-03-14", "CreateConfigLogSubscriptions", "ecs");
	}

	private Long resourceOwnerId;

	private List<Subscription> subscriptions;

	private String resourceOwnerAccount;

	private String ownerAccount;

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

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;	
		if (subscriptions != null) {
			for (int depth1 = 0; depth1 < subscriptions.size(); depth1++) {
				putQueryParameter("Subscription." + (depth1 + 1) + ".Name" , subscriptions.get(depth1).getName());
				putQueryParameter("Subscription." + (depth1 + 1) + ".ResourceType" , subscriptions.get(depth1).getResourceType());
				putQueryParameter("Subscription." + (depth1 + 1) + ".MnsQueueArn" , subscriptions.get(depth1).getMnsQueueArn());
			}
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

	public static class Subscription {

		private String name;

		private String resourceType;

		private String mnsQueueArn;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getMnsQueueArn() {
			return this.mnsQueueArn;
		}

		public void setMnsQueueArn(String mnsQueueArn) {
			this.mnsQueueArn = mnsQueueArn;
		}
	}

	@Override
	public Class<CreateConfigLogSubscriptionsResponse> getResponseClass() {
		return CreateConfigLogSubscriptionsResponse.class;
	}

}
