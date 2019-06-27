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
public class ListTestDeviceForTmallGenieRequest extends RpcAcsRequest<ListTestDeviceForTmallGenieResponse> {
	
	public ListTestDeviceForTmallGenieRequest() {
		super("Iot", "2019-07-30", "ListTestDeviceForTmallGenie", "iot");
	}

	private Long pageNo;

	private String iotInstanceId;

	private Long pageSize;

	private String thingType;

	private String productKey;

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getThingType() {
		return this.thingType;
	}

	public void setThingType(String thingType) {
		this.thingType = thingType;
		if(thingType != null){
			putQueryParameter("ThingType", thingType);
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

	@Override
	public Class<ListTestDeviceForTmallGenieResponse> getResponseClass() {
		return ListTestDeviceForTmallGenieResponse.class;
	}

}
