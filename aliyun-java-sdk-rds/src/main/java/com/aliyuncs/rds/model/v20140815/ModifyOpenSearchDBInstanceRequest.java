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
public class ModifyOpenSearchDBInstanceRequest extends RpcAcsRequest<ModifyOpenSearchDBInstanceResponse> {
	
	public ModifyOpenSearchDBInstanceRequest() {
		super("Rds", "2014-08-15", "ModifyOpenSearchDBInstance", "rds");
	}

	private Long resourceOwnerId;

	private String lcuQuota;

	private String searchType;

	private String dBInstanceId;

	private String storageQuota;

	private String resourceOwnerAccount;

	private String specQuota;

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

	public String getLcuQuota() {
		return this.lcuQuota;
	}

	public void setLcuQuota(String lcuQuota) {
		this.lcuQuota = lcuQuota;
		if(lcuQuota != null){
			putQueryParameter("LcuQuota", lcuQuota);
		}
	}

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("SearchType", searchType);
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

	public String getStorageQuota() {
		return this.storageQuota;
	}

	public void setStorageQuota(String storageQuota) {
		this.storageQuota = storageQuota;
		if(storageQuota != null){
			putQueryParameter("StorageQuota", storageQuota);
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

	public String getSpecQuota() {
		return this.specQuota;
	}

	public void setSpecQuota(String specQuota) {
		this.specQuota = specQuota;
		if(specQuota != null){
			putQueryParameter("SpecQuota", specQuota);
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
	public Class<ModifyOpenSearchDBInstanceResponse> getResponseClass() {
		return ModifyOpenSearchDBInstanceResponse.class;
	}

}
