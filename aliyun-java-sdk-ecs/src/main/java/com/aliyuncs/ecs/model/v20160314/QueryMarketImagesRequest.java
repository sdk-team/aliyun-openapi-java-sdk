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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMarketImagesRequest extends RpcAcsRequest<QueryMarketImagesResponse> {
	   

	private Long resourceOwnerId;

	private String marketImageCategory;

	private Boolean supportIoOptimized;

	private Boolean extra;

	private Integer pageSize;

	private String instanceType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer pageNo;
	public QueryMarketImagesRequest() {
		super("Ecs", "2016-03-14", "QueryMarketImages", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getMarketImageCategory() {
		return this.marketImageCategory;
	}

	public void setMarketImageCategory(String marketImageCategory) {
		this.marketImageCategory = marketImageCategory;
		if(marketImageCategory != null){
			putQueryParameter("MarketImageCategory", marketImageCategory);
		}
	}

	public Boolean getSupportIoOptimized() {
		return this.supportIoOptimized;
	}

	public void setSupportIoOptimized(Boolean supportIoOptimized) {
		this.supportIoOptimized = supportIoOptimized;
		if(supportIoOptimized != null){
			putQueryParameter("SupportIoOptimized", supportIoOptimized.toString());
		}
	}

	public Boolean getExtra() {
		return this.extra;
	}

	public void setExtra(Boolean extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	@Override
	public Class<QueryMarketImagesResponse> getResponseClass() {
		return QueryMarketImagesResponse.class;
	}

}
