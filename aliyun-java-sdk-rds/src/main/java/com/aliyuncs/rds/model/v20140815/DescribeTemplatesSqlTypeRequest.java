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
public class DescribeTemplatesSqlTypeRequest extends RpcAcsRequest<DescribeTemplatesSqlTypeResponse> {
	
	public DescribeTemplatesSqlTypeRequest() {
		super("Rds", "2014-08-15", "DescribeTemplatesSqlType", "rds");
	}

	private Long resourceOwnerId;

	private String minScanRows;

	private String startTime;

	private String sortKey;

	private String securityToken;

	private String pagingId;

	private String dBInstanceId;

	private String minConsume;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String endTime;

	private Long ownerId;

	private String maxConsume;

	private String sortMethod;

	private String maxScanRows;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getMinScanRows() {
		return this.minScanRows;
	}

	public void setMinScanRows(String minScanRows) {
		this.minScanRows = minScanRows;
		if(minScanRows != null){
			putQueryParameter("MinScanRows", minScanRows);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		if(sortKey != null){
			putQueryParameter("SortKey", sortKey);
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

	public String getPagingId() {
		return this.pagingId;
	}

	public void setPagingId(String pagingId) {
		this.pagingId = pagingId;
		if(pagingId != null){
			putQueryParameter("PagingId", pagingId);
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

	public String getMinConsume() {
		return this.minConsume;
	}

	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
		if(minConsume != null){
			putQueryParameter("MinConsume", minConsume);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getMaxConsume() {
		return this.maxConsume;
	}

	public void setMaxConsume(String maxConsume) {
		this.maxConsume = maxConsume;
		if(maxConsume != null){
			putQueryParameter("MaxConsume", maxConsume);
		}
	}

	public String getSortMethod() {
		return this.sortMethod;
	}

	public void setSortMethod(String sortMethod) {
		this.sortMethod = sortMethod;
		if(sortMethod != null){
			putQueryParameter("SortMethod", sortMethod);
		}
	}

	public String getMaxScanRows() {
		return this.maxScanRows;
	}

	public void setMaxScanRows(String maxScanRows) {
		this.maxScanRows = maxScanRows;
		if(maxScanRows != null){
			putQueryParameter("MaxScanRows", maxScanRows);
		}
	}

	@Override
	public Class<DescribeTemplatesSqlTypeResponse> getResponseClass() {
		return DescribeTemplatesSqlTypeResponse.class;
	}

}
