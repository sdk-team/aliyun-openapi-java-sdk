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
public class DataCleanSyncProductRequest extends RpcAcsRequest<DataCleanSyncProductResponse> {
	
	public DataCleanSyncProductRequest() {
		super("Iot", "2019-07-30", "DataCleanSyncProduct", "Iot");
	}

	private String productModel;

	private String image;

	private Integer dataFormat;

	private Integer deviceCount;

	private String taobaoId;

	private String actionStr;

	private String productKey;

	private String resourceGroupId;

	private String iotInstanceId;

	private Integer netType;

	private String name;

	private Long categoryId;

	public String getProductModel() {
		return this.productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
		if(productModel != null){
			putQueryParameter("ProductModel", productModel);
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
		}
	}

	public Integer getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(Integer dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putQueryParameter("DataFormat", dataFormat.toString());
		}
	}

	public Integer getDeviceCount() {
		return this.deviceCount;
	}

	public void setDeviceCount(Integer deviceCount) {
		this.deviceCount = deviceCount;
		if(deviceCount != null){
			putQueryParameter("DeviceCount", deviceCount.toString());
		}
	}

	public String getTaobaoId() {
		return this.taobaoId;
	}

	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
		if(taobaoId != null){
			putQueryParameter("TaobaoId", taobaoId);
		}
	}

	public String getActionStr() {
		return this.actionStr;
	}

	public void setActionStr(String actionStr) {
		this.actionStr = actionStr;
		if(actionStr != null){
			putQueryParameter("ActionStr", actionStr);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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
			putQueryParameter("NetType", netType.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	@Override
	public Class<DataCleanSyncProductResponse> getResponseClass() {
		return DataCleanSyncProductResponse.class;
	}

}
