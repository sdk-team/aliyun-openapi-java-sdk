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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20190730.BulkQueryProductInfoForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BulkQueryProductInfoForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private List<ProductInfo> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ProductInfo> getList() {
		return this.list;
	}

	public void setList(List<ProductInfo> list) {
		this.list = list;
	}

	public static class ProductInfo {

		private String gmtCreate;

		private Integer dataFormat;

		private String description;

		private Integer deviceCount;

		private Integer netType;

		private Integer nodeType;

		private String productKey;

		private String productName;

		private String productModel;

		private String productSecret;

		private String productStatus;

		private Long scriptId;

		private String scriptDraftCode;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getDataFormat() {
			return this.dataFormat;
		}

		public void setDataFormat(Integer dataFormat) {
			this.dataFormat = dataFormat;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getDeviceCount() {
			return this.deviceCount;
		}

		public void setDeviceCount(Integer deviceCount) {
			this.deviceCount = deviceCount;
		}

		public Integer getNetType() {
			return this.netType;
		}

		public void setNetType(Integer netType) {
			this.netType = netType;
		}

		public Integer getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(Integer nodeType) {
			this.nodeType = nodeType;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductModel() {
			return this.productModel;
		}

		public void setProductModel(String productModel) {
			this.productModel = productModel;
		}

		public String getProductSecret() {
			return this.productSecret;
		}

		public void setProductSecret(String productSecret) {
			this.productSecret = productSecret;
		}

		public String getProductStatus() {
			return this.productStatus;
		}

		public void setProductStatus(String productStatus) {
			this.productStatus = productStatus;
		}

		public Long getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(Long scriptId) {
			this.scriptId = scriptId;
		}

		public String getScriptDraftCode() {
			return this.scriptDraftCode;
		}

		public void setScriptDraftCode(String scriptDraftCode) {
			this.scriptDraftCode = scriptDraftCode;
		}
	}

	@Override
	public BulkQueryProductInfoForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	BulkQueryProductInfoForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}
