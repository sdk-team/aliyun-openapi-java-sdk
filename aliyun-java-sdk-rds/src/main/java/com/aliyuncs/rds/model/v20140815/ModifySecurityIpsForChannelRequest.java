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
public class ModifySecurityIpsForChannelRequest extends RpcAcsRequest<ModifySecurityIpsForChannelResponse> {
	
	public ModifySecurityIpsForChannelRequest() {
		super("Rds", "2014-08-15", "ModifySecurityIpsForChannel");
	}

	private String dBInstanceIPArrayName;

	private Long resourceOwnerId;

	private String clientToken;

	private String securityIps;

	private String securityGroupId;

	private String whitelistNetworkType;

	private String securityIPType;

	private String dBInstanceId;

	private String modifyMode;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String dBInstanceIPArrayAttribute;

	public String getDBInstanceIPArrayName() {
		return this.dBInstanceIPArrayName;
	}

	public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
		this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		if(dBInstanceIPArrayName != null){
			putQueryParameter("DBInstanceIPArrayName", dBInstanceIPArrayName);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
		if(securityIps != null){
			putQueryParameter("SecurityIps", securityIps);
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

	public String getWhitelistNetworkType() {
		return this.whitelistNetworkType;
	}

	public void setWhitelistNetworkType(String whitelistNetworkType) {
		this.whitelistNetworkType = whitelistNetworkType;
		if(whitelistNetworkType != null){
			putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
		}
	}

	public String getSecurityIPType() {
		return this.securityIPType;
	}

	public void setSecurityIPType(String securityIPType) {
		this.securityIPType = securityIPType;
		if(securityIPType != null){
			putQueryParameter("SecurityIPType", securityIPType);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
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

	public String getDBInstanceIPArrayAttribute() {
		return this.dBInstanceIPArrayAttribute;
	}

	public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
		this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		if(dBInstanceIPArrayAttribute != null){
			putQueryParameter("DBInstanceIPArrayAttribute", dBInstanceIPArrayAttribute);
		}
	}

	@Override
	public Class<ModifySecurityIpsForChannelResponse> getResponseClass() {
		return ModifySecurityIpsForChannelResponse.class;
	}

}