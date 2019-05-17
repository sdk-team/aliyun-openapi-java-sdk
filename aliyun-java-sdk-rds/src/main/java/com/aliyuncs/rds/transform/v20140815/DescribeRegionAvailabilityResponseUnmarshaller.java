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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRegionAvailabilityResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionAvailabilityResponse.RegionAvzDetailModel;
import com.aliyuncs.rds.model.v20140815.DescribeRegionAvailabilityResponse.RegionAvzDetailModel.RegionAvzAllDbDetailModel;
import com.aliyuncs.rds.model.v20140815.DescribeRegionAvailabilityResponse.RegionAvzDetailModel.RegionAvzAllDbDetailModel.RegionAvailabilityModel;
import com.aliyuncs.rds.model.v20140815.DescribeRegionAvailabilityResponse.RegionAvzDetailModel.RegionAvzAllDbDetailModel.RegionAvailabilityModel.RegionAvzDbTypeModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionAvailabilityResponseUnmarshaller {

	public static DescribeRegionAvailabilityResponse unmarshall(DescribeRegionAvailabilityResponse describeRegionAvailabilityResponse, UnmarshallerContext context) {
		
		describeRegionAvailabilityResponse.setRequestId(context.stringValue("DescribeRegionAvailabilityResponse.RequestId"));

		List<RegionAvzDetailModel> items = new ArrayList<RegionAvzDetailModel>();
		for (int i = 0; i < context.lengthValue("DescribeRegionAvailabilityResponse.Items.Length"); i++) {
			RegionAvzDetailModel regionAvzDetailModel = new RegionAvzDetailModel();
			regionAvzDetailModel.setRegion(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].Region"));
			regionAvzDetailModel.setRegionName(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionName"));
			regionAvzDetailModel.setAvailabilityArea(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].AvailabilityArea"));
			regionAvzDetailModel.setAvailabilityAreaName(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].AvailabilityAreaName"));
			regionAvzDetailModel.setMutiAvz(context.booleanValue("DescribeRegionAvailabilityResponse.Items["+ i +"].MutiAvz"));
			regionAvzDetailModel.setVpcEnable(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].VpcEnable"));

			List<RegionAvzAllDbDetailModel> regionAvzAllDbDetailModels = new ArrayList<RegionAvzAllDbDetailModel>();
			for (int j = 0; j < context.lengthValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels.Length"); j++) {
				RegionAvzAllDbDetailModel regionAvzAllDbDetailModel = new RegionAvzAllDbDetailModel();
				regionAvzAllDbDetailModel.setDBType(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].DBType"));

				RegionAvailabilityModel regionAvailabilityModel = new RegionAvailabilityModel();
				regionAvailabilityModel.setRegion(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.Region"));
				regionAvailabilityModel.setHostType(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.HostType"));
				regionAvailabilityModel.setDBInstanceConnType(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.DBInstanceConnType"));
				regionAvailabilityModel.setStorage(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.Storage"));

				List<RegionAvzDbTypeModel> regionAvzDbTypeModels = new ArrayList<RegionAvzDbTypeModel>();
				for (int k = 0; k < context.lengthValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.RegionAvzDbTypeModels.Length"); k++) {
					RegionAvzDbTypeModel regionAvzDbTypeModel = new RegionAvzDbTypeModel();
					regionAvzDbTypeModel.setEngine(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.RegionAvzDbTypeModels["+ k +"].Engine"));
					regionAvzDbTypeModel.setEngineVersion(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.RegionAvzDbTypeModels["+ k +"].EngineVersion"));
					regionAvzDbTypeModel.setDBInstanceAvailable(context.integerValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.RegionAvzDbTypeModels["+ k +"].DBInstanceAvailable"));
					regionAvzDbTypeModel.setDBInstanceClass(context.stringValue("DescribeRegionAvailabilityResponse.Items["+ i +"].RegionAvzAllDbDetailModels["+ j +"].RegionAvailabilityModel.RegionAvzDbTypeModels["+ k +"].DBInstanceClass"));

					regionAvzDbTypeModels.add(regionAvzDbTypeModel);
				}
				regionAvailabilityModel.setRegionAvzDbTypeModels(regionAvzDbTypeModels);
				regionAvzAllDbDetailModel.setRegionAvailabilityModel(regionAvailabilityModel);

				regionAvzAllDbDetailModels.add(regionAvzAllDbDetailModel);
			}
			regionAvzDetailModel.setRegionAvzAllDbDetailModels(regionAvzAllDbDetailModels);

			items.add(regionAvzDetailModel);
		}
		describeRegionAvailabilityResponse.setItems(items);
	 
	 	return describeRegionAvailabilityResponse;
	}
}