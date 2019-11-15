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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.InnerQueryNcInfoByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryNcInfoByInstanceIdResponse extends AcsResponse {

	private String requestId;

	private EcsNcInfo ecsNcInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EcsNcInfo getEcsNcInfo() {
		return this.ecsNcInfo;
	}

	public void setEcsNcInfo(EcsNcInfo ecsNcInfo) {
		this.ecsNcInfo = ecsNcInfo;
	}

	public static class EcsNcInfo {

		private String ncIp;

		private Integer avaliableDisk;

		private Integer totalCpu;

		private Integer avaliableMem;

		private Integer avaliableCpu;

		private Integer totalDisk;

		private String zoneNo;

		private Integer totalMem;

		private String rackId;

		private String ncId;

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public Integer getAvaliableDisk() {
			return this.avaliableDisk;
		}

		public void setAvaliableDisk(Integer avaliableDisk) {
			this.avaliableDisk = avaliableDisk;
		}

		public Integer getTotalCpu() {
			return this.totalCpu;
		}

		public void setTotalCpu(Integer totalCpu) {
			this.totalCpu = totalCpu;
		}

		public Integer getAvaliableMem() {
			return this.avaliableMem;
		}

		public void setAvaliableMem(Integer avaliableMem) {
			this.avaliableMem = avaliableMem;
		}

		public Integer getAvaliableCpu() {
			return this.avaliableCpu;
		}

		public void setAvaliableCpu(Integer avaliableCpu) {
			this.avaliableCpu = avaliableCpu;
		}

		public Integer getTotalDisk() {
			return this.totalDisk;
		}

		public void setTotalDisk(Integer totalDisk) {
			this.totalDisk = totalDisk;
		}

		public String getZoneNo() {
			return this.zoneNo;
		}

		public void setZoneNo(String zoneNo) {
			this.zoneNo = zoneNo;
		}

		public Integer getTotalMem() {
			return this.totalMem;
		}

		public void setTotalMem(Integer totalMem) {
			this.totalMem = totalMem;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}
	}

	@Override
	public InnerQueryNcInfoByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryNcInfoByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}
}
