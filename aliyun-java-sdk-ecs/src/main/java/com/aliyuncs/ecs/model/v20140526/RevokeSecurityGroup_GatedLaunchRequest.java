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
public class RevokeSecurityGroup_GatedLaunchRequest extends RpcAcsRequest<RevokeSecurityGroup_GatedLaunchResponse> {
	
	public RevokeSecurityGroup_GatedLaunchRequest() {
		super("Ecs", "2014-05-26", "RevokeSecurityGroup_GatedLaunch");
	}

	private String nicType;

	private Long resourceOwnerId;

	private String securityGroupId;

	private Long sourceGroupOwnerId;

	private String sourceGroupOwnerAccount;

	private String policy;

	private String portRange;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String sourceCidrIp;

	private String ownerAccount;

	private Long ownerId;

	private String sourceGroupId;

	public String getNicType() {
		return this.nicType;
	}

	public void setNicType(String nicType) {
		this.nicType = nicType;
		if(nicType != null){
			putQueryParameter("NicType", nicType);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Long getSourceGroupOwnerId() {
		return this.sourceGroupOwnerId;
	}

	public void setSourceGroupOwnerId(Long sourceGroupOwnerId) {
		this.sourceGroupOwnerId = sourceGroupOwnerId;
		if(sourceGroupOwnerId != null){
			putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId.toString());
		}
	}

	public String getSourceGroupOwnerAccount() {
		return this.sourceGroupOwnerAccount;
	}

	public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
		this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		if(sourceGroupOwnerAccount != null){
			putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("PortRange", portRange);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		if(sourceCidrIp != null){
			putQueryParameter("SourceCidrIp", sourceCidrIp);
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

	public String getSourceGroupId() {
		return this.sourceGroupId;
	}

	public void setSourceGroupId(String sourceGroupId) {
		this.sourceGroupId = sourceGroupId;
		if(sourceGroupId != null){
			putQueryParameter("SourceGroupId", sourceGroupId);
		}
	}

	@Override
	public Class<RevokeSecurityGroup_GatedLaunchResponse> getResponseClass() {
		return RevokeSecurityGroup_GatedLaunchResponse.class;
	}

}
