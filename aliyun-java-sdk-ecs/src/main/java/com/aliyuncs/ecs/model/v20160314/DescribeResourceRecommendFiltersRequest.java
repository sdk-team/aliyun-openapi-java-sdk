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
public class DescribeResourceRecommendFiltersRequest extends RpcAcsRequest<DescribeResourceRecommendFiltersResponse> {
	
	public DescribeResourceRecommendFiltersRequest() {
		super("Ecs", "2016-03-14", "DescribeResourceRecommendFilters");
	}

	private Long resourceOwnerId;

	private String attributeValue;

	private String global;

	private String attributeName;

	private List<TemplateTag> templateTags;

	private String product;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String resourceType;

	private String regionNo;

	private Integer maxItems;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
		if(attributeValue != null){
			putQueryParameter("AttributeValue", attributeValue);
		}
	}

	public String getGlobal() {
		return this.global;
	}

	public void setGlobal(String global) {
		this.global = global;
		if(global != null){
			putQueryParameter("Global", global);
		}
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
		if(attributeName != null){
			putQueryParameter("AttributeName", attributeName);
		}
	}

	public List<TemplateTag> getTemplateTags() {
		return this.templateTags;
	}

	public void setTemplateTags(List<TemplateTag> templateTags) {
		this.templateTags = templateTags;	
		if (templateTags != null) {
			for (int depth1 = 0; depth1 < templateTags.size(); depth1++) {
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Key" , templateTags.get(depth1).getKey());
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Value" , templateTags.get(depth1).getValue());
			}
		}	
	}

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	/**
	 * @deprecated use getBizProduct instead of this.
	 */
	@Deprecated
	public String getProduct() {
		return this.product;
	}

	/**
	 * @deprecated use setBizProduct instead of this.
	 */
	@Deprecated
	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Integer getMaxItems() {
		return this.maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
		if(maxItems != null){
			putQueryParameter("MaxItems", maxItems.toString());
		}
	}

	public static class TemplateTag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<DescribeResourceRecommendFiltersResponse> getResponseClass() {
		return DescribeResourceRecommendFiltersResponse.class;
	}

}
