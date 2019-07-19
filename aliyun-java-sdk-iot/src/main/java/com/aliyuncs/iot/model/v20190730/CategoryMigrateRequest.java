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

package com.aliyuncs.iot.model.v20190730;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CategoryMigrateRequest extends RpcAcsRequest<CategoryMigrateResponse> {
	
	public CategoryMigrateRequest() {
		super("Iot", "2019-07-30", "CategoryMigrate", "Iot");
	}

	private String iotInstanceId;

	private String imageUrl;

	private String namespace;

	private String categoryKey;

	private String categoryName;

	private List<Tag> tags;

	private String bizTenantId;

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getCategoryKey() {
		return this.categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
		if(categoryKey != null){
			putQueryParameter("CategoryKey", categoryKey);
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putQueryParameter("CategoryName", categoryName);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".TagName" , tags.get(depth1).getTagName());
				putQueryParameter("Tag." + (depth1 + 1) + ".TagValue" , tags.get(depth1).getTagValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Namespace" , tags.get(depth1).getNamespace());
				putQueryParameter("Tag." + (depth1 + 1) + ".TagKey" , tags.get(depth1).getTagKey());
			}
		}	
	}

	public String getBizTenantId() {
		return this.bizTenantId;
	}

	public void setBizTenantId(String bizTenantId) {
		this.bizTenantId = bizTenantId;
		if(bizTenantId != null){
			putQueryParameter("BizTenantId", bizTenantId);
		}
	}

	public static class Tag {

		private String tagName;

		private String tagValue;

		private String namespace;

		private String tagKey;

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public Class<CategoryMigrateResponse> getResponseClass() {
		return CategoryMigrateResponse.class;
	}

}
