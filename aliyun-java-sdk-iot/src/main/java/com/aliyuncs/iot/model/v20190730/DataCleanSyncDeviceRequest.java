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
public class DataCleanSyncDeviceRequest extends RpcAcsRequest<DataCleanSyncDeviceResponse> {
	
	public DataCleanSyncDeviceRequest() {
		super("Iot", "2019-07-30", "DataCleanSyncDevice");
		setMethod(MethodType.POST);
	}

	private List<SyncDeviceInfos> syncDeviceInfoss;

	private String resourceGroupId;

	private String iotInstanceId;

	public List<SyncDeviceInfos> getSyncDeviceInfoss() {
		return this.syncDeviceInfoss;
	}

	public void setSyncDeviceInfoss(List<SyncDeviceInfos> syncDeviceInfoss) {
		this.syncDeviceInfoss = syncDeviceInfoss;	
		if (syncDeviceInfoss != null) {
			for (int depth1 = 0; depth1 < syncDeviceInfoss.size(); depth1++) {
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".ActiveTime" , syncDeviceInfoss.get(depth1).getActiveTime());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".FirmVersion" , syncDeviceInfoss.get(depth1).getFirmVersion());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".Name" , syncDeviceInfoss.get(depth1).getName());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".DeviceSecret" , syncDeviceInfoss.get(depth1).getDeviceSecret());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".ActionStr" , syncDeviceInfoss.get(depth1).getActionStr());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".ProductKey" , syncDeviceInfoss.get(depth1).getProductKey());
				putQueryParameter("SyncDeviceInfos." + (depth1 + 1) + ".DeviceType" , syncDeviceInfoss.get(depth1).getDeviceType());
			}
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

	public static class SyncDeviceInfos {

		private Long activeTime;

		private String firmVersion;

		private String name;

		private String deviceSecret;

		private String actionStr;

		private String productKey;

		private Integer deviceType;

		public Long getActiveTime() {
			return this.activeTime;
		}

		public void setActiveTime(Long activeTime) {
			this.activeTime = activeTime;
		}

		public String getFirmVersion() {
			return this.firmVersion;
		}

		public void setFirmVersion(String firmVersion) {
			this.firmVersion = firmVersion;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDeviceSecret() {
			return this.deviceSecret;
		}

		public void setDeviceSecret(String deviceSecret) {
			this.deviceSecret = deviceSecret;
		}

		public String getActionStr() {
			return this.actionStr;
		}

		public void setActionStr(String actionStr) {
			this.actionStr = actionStr;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public Integer getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(Integer deviceType) {
			this.deviceType = deviceType;
		}
	}

	@Override
	public Class<DataCleanSyncDeviceResponse> getResponseClass() {
		return DataCleanSyncDeviceResponse.class;
	}

}
