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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeviceWhiteListMaintainRequest extends RpcAcsRequest<DeviceWhiteListMaintainResponse> {
	
	public DeviceWhiteListMaintainRequest() {
		super("Iot", "2019-07-30", "DeviceWhiteListMaintain");
		setMethod(MethodType.POST);
	}

	private String actionType;

	private String manufacture;

	private String iotInstanceId;

	private List<Device> devices;

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
		}
	}

	public String getManufacture() {
		return this.manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
		if(manufacture != null){
			putQueryParameter("Manufacture", manufacture);
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

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;	
		if (devices != null) {
			for (int depth1 = 0; depth1 < devices.size(); depth1++) {
				putBodyParameter("Device." + (depth1 + 1) + ".Secret" , devices.get(depth1).getSecret());
				putBodyParameter("Device." + (depth1 + 1) + ".Mac" , devices.get(depth1).getMac());
			}
		}	
	}

	public static class Device {

		private String secret;

		private String mac;

		public String getSecret() {
			return this.secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}
	}

	@Override
	public Class<DeviceWhiteListMaintainResponse> getResponseClass() {
		return DeviceWhiteListMaintainResponse.class;
	}

}
