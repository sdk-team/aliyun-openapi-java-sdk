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

/**
 * @author auto create
 * @version 
 */
public class CreateProductForTmallGenieRequest extends RpcAcsRequest<CreateProductForTmallGenieResponse> {
	
	public CreateProductForTmallGenieRequest() {
		super("Iot", "2019-07-30", "CreateProductForTmallGenie", "Iot");
	}

	private String productModel;

	private Integer dataFormat;

	private Integer nodeType;

	private String iotInstanceId;

	private Integer netType;

	private String taoBaoId;

	private String productName;

	private String description;

	private String productBrand;

	private Long categoryId;

	public String getProductModel() {
		return this.productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
		if(productModel != null){
			putBodyParameter("ProductModel", productModel);
		}
	}

	public Integer getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(Integer dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putBodyParameter("DataFormat", dataFormat.toString());
		}
	}

	public Integer getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putBodyParameter("NodeType", nodeType.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getNetType() {
		return this.netType;
	}

	public void setNetType(Integer netType) {
		this.netType = netType;
		if(netType != null){
			putBodyParameter("NetType", netType.toString());
		}
	}

	public String getTaoBaoId() {
		return this.taoBaoId;
	}

	public void setTaoBaoId(String taoBaoId) {
		this.taoBaoId = taoBaoId;
		if(taoBaoId != null){
			putBodyParameter("TaoBaoId", taoBaoId);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putBodyParameter("ProductName", productName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getProductBrand() {
		return this.productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
		if(productBrand != null){
			putBodyParameter("ProductBrand", productBrand);
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId.toString());
		}
	}

	@Override
	public Class<CreateProductForTmallGenieResponse> getResponseClass() {
		return CreateProductForTmallGenieResponse.class;
	}

}
