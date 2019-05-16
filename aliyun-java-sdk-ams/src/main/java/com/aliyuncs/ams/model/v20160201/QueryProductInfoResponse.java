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

package com.aliyuncs.ams.model.v20160201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ams.transform.v20160201.QueryProductInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private ProductInfo productInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public static class ProductInfo {

		private Long productId;

		private Long userId;

		private Long taobaoUserId;

		private String name;

		private String description;

		private Boolean visible;

		private Integer industryId;

		private Integer status;

		private String bizName;

		private String createTime;

		private String modifyTime;

		public Long getProductId() {
			return this.productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public Long getTaobaoUserId() {
			return this.taobaoUserId;
		}

		public void setTaobaoUserId(Long taobaoUserId) {
			this.taobaoUserId = taobaoUserId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getVisible() {
			return this.visible;
		}

		public void setVisible(Boolean visible) {
			this.visible = visible;
		}

		public Integer getIndustryId() {
			return this.industryId;
		}

		public void setIndustryId(Integer industryId) {
			this.industryId = industryId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getBizName() {
			return this.bizName;
		}

		public void setBizName(String bizName) {
			this.bizName = bizName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public QueryProductInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryProductInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
