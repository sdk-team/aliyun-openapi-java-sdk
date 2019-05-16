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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteProductRequest extends RpcAcsRequest<DeleteProductResponse> {
	
	public DeleteProductRequest() {
		super("AMS", "2016-02-01", "DeleteProduct");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String bizToken;

	private String bizName;

	private Long productId;

	public String getBizToken() {
		return this.bizToken;
	}

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
		if(bizToken != null){
			putQueryParameter("BizToken", bizToken);
		}
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
		if(bizName != null){
			putQueryParameter("BizName", bizName);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
		}
	}

	@Override
	public Class<DeleteProductResponse> getResponseClass() {
		return DeleteProductResponse.class;
	}

}
