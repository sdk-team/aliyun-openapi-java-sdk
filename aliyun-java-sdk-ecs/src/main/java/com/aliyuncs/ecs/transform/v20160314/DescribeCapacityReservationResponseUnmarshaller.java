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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeCapacityReservationResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeCapacityReservationResponse.CapacityReservation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityReservationResponseUnmarshaller {

	public static DescribeCapacityReservationResponse unmarshall(DescribeCapacityReservationResponse describeCapacityReservationResponse, UnmarshallerContext _ctx) {
		
		describeCapacityReservationResponse.setRequestId(_ctx.stringValue("DescribeCapacityReservationResponse.RequestId"));
		describeCapacityReservationResponse.setTotalCount(_ctx.integerValue("DescribeCapacityReservationResponse.TotalCount"));
		describeCapacityReservationResponse.setPageNumber(_ctx.integerValue("DescribeCapacityReservationResponse.PageNumber"));
		describeCapacityReservationResponse.setPageSize(_ctx.integerValue("DescribeCapacityReservationResponse.PageSize"));

		List<CapacityReservation> capacityReservations = new ArrayList<CapacityReservation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCapacityReservationResponse.CapacityReservations.Length"); i++) {
			CapacityReservation capacityReservation = new CapacityReservation();
			capacityReservation.setCapacityReservationId(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].CapacityReservationId"));
			capacityReservation.setRegionId(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].RegionId"));
			capacityReservation.setZoneId(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].ZoneId"));
			capacityReservation.setCapacityReservationName(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].CapacityReservationName"));
			capacityReservation.setStatus(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].Status"));
			capacityReservation.setDescription(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].Description"));
			capacityReservation.setInstancePlatform(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].InstancePlatform"));
			capacityReservation.setTotalInstanceCount(_ctx.integerValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].TotalInstanceCount"));
			capacityReservation.setAvailableInstanceCount(_ctx.integerValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].AvailableInstanceCount"));
			capacityReservation.setNetworkType(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].NetworkType"));
			capacityReservation.setEndDateType(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].EndDateType"));
			capacityReservation.setInstanceMatchCriteria(_ctx.stringValue("DescribeCapacityReservationResponse.CapacityReservations["+ i +"].InstanceMatchCriteria"));

			capacityReservations.add(capacityReservation);
		}
		describeCapacityReservationResponse.setCapacityReservations(capacityReservations);
	 
	 	return describeCapacityReservationResponse;
	}
}