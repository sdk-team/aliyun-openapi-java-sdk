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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateFCTriggerRequest extends RpcAcsRequest<CreateFCTriggerResponse> {
	
	public CreateFCTriggerRequest() {
		super("Rds", "2014-08-15", "CreateFCTrigger");
	}

	private Long resourceOwnerId;

	private String triggerId;

	private List<String> subscriptionObjectss;

	private String securityToken;

	private String eventFormat;

	private Integer retry;

	private String triggerArn;

	private String resourceOwnerAccount;

	private String sourceArn;

	private String ownerAccount;

	private Long ownerId;

	private Integer concurrency;

	private String instanceId;

	private String invocationRoleArn;

	private String region;

	private String functionArn;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTriggerId() {
		return this.triggerId;
	}

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
		if(triggerId != null){
			putQueryParameter("TriggerId", triggerId);
		}
	}

	public List<String> getSubscriptionObjectss() {
		return this.subscriptionObjectss;
	}

	public void setSubscriptionObjectss(List<String> subscriptionObjectss) {
		this.subscriptionObjectss = subscriptionObjectss;	
		if (subscriptionObjectss != null) {
			for (int i = 0; i < subscriptionObjectss.size(); i++) {
				putQueryParameter("SubscriptionObjects." + (i + 1) , subscriptionObjectss.get(i));
			}
		}	
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEventFormat() {
		return this.eventFormat;
	}

	public void setEventFormat(String eventFormat) {
		this.eventFormat = eventFormat;
		if(eventFormat != null){
			putQueryParameter("EventFormat", eventFormat);
		}
	}

	public Integer getRetry() {
		return this.retry;
	}

	public void setRetry(Integer retry) {
		this.retry = retry;
		if(retry != null){
			putQueryParameter("Retry", retry.toString());
		}
	}

	public String getTriggerArn() {
		return this.triggerArn;
	}

	public void setTriggerArn(String triggerArn) {
		this.triggerArn = triggerArn;
		if(triggerArn != null){
			putQueryParameter("TriggerArn", triggerArn);
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

	public String getSourceArn() {
		return this.sourceArn;
	}

	public void setSourceArn(String sourceArn) {
		this.sourceArn = sourceArn;
		if(sourceArn != null){
			putQueryParameter("SourceArn", sourceArn);
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

	public Integer getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(Integer concurrency) {
		this.concurrency = concurrency;
		if(concurrency != null){
			putQueryParameter("Concurrency", concurrency.toString());
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

	public String getInvocationRoleArn() {
		return this.invocationRoleArn;
	}

	public void setInvocationRoleArn(String invocationRoleArn) {
		this.invocationRoleArn = invocationRoleArn;
		if(invocationRoleArn != null){
			putQueryParameter("InvocationRoleArn", invocationRoleArn);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getFunctionArn() {
		return this.functionArn;
	}

	public void setFunctionArn(String functionArn) {
		this.functionArn = functionArn;
		if(functionArn != null){
			putQueryParameter("FunctionArn", functionArn);
		}
	}

	@Override
	public Class<CreateFCTriggerResponse> getResponseClass() {
		return CreateFCTriggerResponse.class;
	}

}
