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

package com.aliyuncs.rds.model.v20130528;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDatabaseRequest extends RpcAcsRequest<CreateDatabaseResponse> {
	
	public CreateDatabaseRequest() {
		super("Rds", "2013-05-28", "CreateDatabase");
	}

	private Long resourceOwnerId;

	private String accountPrivilege;

	private String accountName;

	private String dbInstanceId;

	private String dBDescription;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String dBName;

	private String characterSetName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAccountPrivilege() {
		return this.accountPrivilege;
	}

	public void setAccountPrivilege(String accountPrivilege) {
		this.accountPrivilege = accountPrivilege;
		if(accountPrivilege != null){
			putQueryParameter("AccountPrivilege", accountPrivilege);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getDBDescription() {
		return this.dBDescription;
	}

	public void setDBDescription(String dBDescription) {
		this.dBDescription = dBDescription;
		if(dBDescription != null){
			putQueryParameter("DBDescription", dBDescription);
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

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
		if(dBName != null){
			putQueryParameter("DBName", dBName);
		}
	}

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
		if(characterSetName != null){
			putQueryParameter("CharacterSetName", characterSetName);
		}
	}

	@Override
	public Class<CreateDatabaseResponse> getResponseClass() {
		return CreateDatabaseResponse.class;
	}

}
