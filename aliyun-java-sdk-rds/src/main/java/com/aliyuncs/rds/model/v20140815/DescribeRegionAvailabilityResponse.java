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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRegionAvailabilityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionAvailabilityResponse extends AcsResponse {

	private String requestId;

	private List<RegionAvzDetailModel> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegionAvzDetailModel> getItems() {
		return this.items;
	}

	public void setItems(List<RegionAvzDetailModel> items) {
		this.items = items;
	}

	public static class RegionAvzDetailModel {

		private String region;

		private String regionName;

		private String availabilityArea;

		private String availabilityAreaName;

		private Boolean mutiAvz;

		private String vpcEnable;

		private List<RegionAvzAllDbDetailModel> regionAvzAllDbDetailModels;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getAvailabilityArea() {
			return this.availabilityArea;
		}

		public void setAvailabilityArea(String availabilityArea) {
			this.availabilityArea = availabilityArea;
		}

		public String getAvailabilityAreaName() {
			return this.availabilityAreaName;
		}

		public void setAvailabilityAreaName(String availabilityAreaName) {
			this.availabilityAreaName = availabilityAreaName;
		}

		public Boolean getMutiAvz() {
			return this.mutiAvz;
		}

		public void setMutiAvz(Boolean mutiAvz) {
			this.mutiAvz = mutiAvz;
		}

		public String getVpcEnable() {
			return this.vpcEnable;
		}

		public void setVpcEnable(String vpcEnable) {
			this.vpcEnable = vpcEnable;
		}

		public List<RegionAvzAllDbDetailModel> getRegionAvzAllDbDetailModels() {
			return this.regionAvzAllDbDetailModels;
		}

		public void setRegionAvzAllDbDetailModels(List<RegionAvzAllDbDetailModel> regionAvzAllDbDetailModels) {
			this.regionAvzAllDbDetailModels = regionAvzAllDbDetailModels;
		}

		public static class RegionAvzAllDbDetailModel {

			private String dBType;

			private RegionAvailabilityModel regionAvailabilityModel;

			public String getDBType() {
				return this.dBType;
			}

			public void setDBType(String dBType) {
				this.dBType = dBType;
			}

			public RegionAvailabilityModel getRegionAvailabilityModel() {
				return this.regionAvailabilityModel;
			}

			public void setRegionAvailabilityModel(RegionAvailabilityModel regionAvailabilityModel) {
				this.regionAvailabilityModel = regionAvailabilityModel;
			}

			public static class RegionAvailabilityModel {

				private String region;

				private String hostType;

				private String dBInstanceConnType;

				private String storage;

				private List<RegionAvzDbTypeModel> regionAvzDbTypeModels;

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getHostType() {
					return this.hostType;
				}

				public void setHostType(String hostType) {
					this.hostType = hostType;
				}

				public String getDBInstanceConnType() {
					return this.dBInstanceConnType;
				}

				public void setDBInstanceConnType(String dBInstanceConnType) {
					this.dBInstanceConnType = dBInstanceConnType;
				}

				public String getStorage() {
					return this.storage;
				}

				public void setStorage(String storage) {
					this.storage = storage;
				}

				public List<RegionAvzDbTypeModel> getRegionAvzDbTypeModels() {
					return this.regionAvzDbTypeModels;
				}

				public void setRegionAvzDbTypeModels(List<RegionAvzDbTypeModel> regionAvzDbTypeModels) {
					this.regionAvzDbTypeModels = regionAvzDbTypeModels;
				}

				public static class RegionAvzDbTypeModel {

					private String engine;

					private String engineVersion;

					private Integer dBInstanceAvailable;

					private String dBInstanceClass;

					public String getEngine() {
						return this.engine;
					}

					public void setEngine(String engine) {
						this.engine = engine;
					}

					public String getEngineVersion() {
						return this.engineVersion;
					}

					public void setEngineVersion(String engineVersion) {
						this.engineVersion = engineVersion;
					}

					public Integer getDBInstanceAvailable() {
						return this.dBInstanceAvailable;
					}

					public void setDBInstanceAvailable(Integer dBInstanceAvailable) {
						this.dBInstanceAvailable = dBInstanceAvailable;
					}

					public String getDBInstanceClass() {
						return this.dBInstanceClass;
					}

					public void setDBInstanceClass(String dBInstanceClass) {
						this.dBInstanceClass = dBInstanceClass;
					}
				}
			}
		}
	}

	@Override
	public DescribeRegionAvailabilityResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionAvailabilityResponseUnmarshaller.unmarshall(this, context);
	}
}
