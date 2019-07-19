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
public class GenerateEnrolleeSignForTmallGenieRequest extends RpcAcsRequest<GenerateEnrolleeSignForTmallGenieResponse> {
	
	public GenerateEnrolleeSignForTmallGenieRequest() {
		super("Iot", "2019-07-30", "GenerateEnrolleeSignForTmallGenie", "Iot");
	}

	private String iotId;

	private String signMethod;

	private String timeWindow;

	private String userType;

	private String deviceName;

	private String productKey;

	private String params;

	private String userId;

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getSignMethod() {
		return this.signMethod;
	}

	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
		if(signMethod != null){
			putQueryParameter("SignMethod", signMethod);
		}
	}

	public String getTimeWindow() {
		return this.timeWindow;
	}

	public void setTimeWindow(String timeWindow) {
		this.timeWindow = timeWindow;
		if(timeWindow != null){
			putQueryParameter("TimeWindow", timeWindow);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
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

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<GenerateEnrolleeSignForTmallGenieResponse> getResponseClass() {
		return GenerateEnrolleeSignForTmallGenieResponse.class;
	}

}
