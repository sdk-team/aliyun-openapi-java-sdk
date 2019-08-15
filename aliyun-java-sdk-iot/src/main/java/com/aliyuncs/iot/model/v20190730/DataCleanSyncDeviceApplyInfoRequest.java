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
public class DataCleanSyncDeviceApplyInfoRequest extends RpcAcsRequest<DataCleanSyncDeviceApplyInfoResponse> {
	
	public DataCleanSyncDeviceApplyInfoRequest() {
		super("Iot", "2019-07-30", "DataCleanSyncDeviceApplyInfo", "iot");
	}

	private String applyId;

	private List<Devices> devicess;

	private String iotInstanceId;

	public String getApplyId() {
		return this.applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
		if(applyId != null){
			putQueryParameter("ApplyId", applyId);
		}
	}

	public List<Devices> getDevicess() {
		return this.devicess;
	}

	public void setDevicess(List<Devices> devicess) {
		this.devicess = devicess;	
		if (devicess != null) {
			for (int depth1 = 0; depth1 < devicess.size(); depth1++) {
				putQueryParameter("Devices." + (depth1 + 1) + ".DeviceName" , devicess.get(depth1).getDeviceName());
				putQueryParameter("Devices." + (depth1 + 1) + ".ProductKey" , devicess.get(depth1).getProductKey());
			}
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

	public static class Devices {

		private String deviceName;

		private String productKey;

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}
	}

	@Override
	public Class<DataCleanSyncDeviceApplyInfoResponse> getResponseClass() {
		return DataCleanSyncDeviceApplyInfoResponse.class;
	}

}
