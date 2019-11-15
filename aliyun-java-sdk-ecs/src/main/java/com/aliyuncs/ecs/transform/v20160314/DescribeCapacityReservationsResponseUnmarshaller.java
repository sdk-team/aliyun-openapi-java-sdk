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

import com.aliyuncs.ecs.model.v20160314.DescribeCapacityReservationsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeCapacityReservationsResponse.CapacityReservation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityReservationsResponseUnmarshaller {

	public static DescribeCapacityReservationsResponse unmarshall(DescribeCapacityReservationsResponse describeCapacityReservationsResponse, UnmarshallerContext _ctx) {
		
		describeCapacityReservationsResponse.setRequestId(_ctx.stringValue("DescribeCapacityReservationsResponse.RequestId"));
		describeCapacityReservationsResponse.setTotalCount(_ctx.integerValue("DescribeCapacityReservationsResponse.TotalCount"));
		describeCapacityReservationsResponse.setPageNumber(_ctx.integerValue("DescribeCapacityReservationsResponse.PageNumber"));
		describeCapacityReservationsResponse.setPageSize(_ctx.integerValue("DescribeCapacityReservationsResponse.PageSize"));

		List<CapacityReservation> capacityReservations = new ArrayList<CapacityReservation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCapacityReservationsResponse.CapacityReservations.Length"); i++) {
			CapacityReservation capacityReservation = new CapacityReservation();
			capacityReservation.setCapacityReservationId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].CapacityReservationId"));
			capacityReservation.setRegionId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].RegionId"));
			capacityReservation.setZoneId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].ZoneId"));
			capacityReservation.setCapacityReservationName(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].CapacityReservationName"));
			capacityReservation.setStatus(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].Status"));
			capacityReservation.setDescription(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].Description"));
			capacityReservation.setInstancePlatform(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstancePlatform"));
			capacityReservation.setTotalInstanceCount(_ctx.integerValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].TotalInstanceCount"));
			capacityReservation.setAvailableInstanceCount(_ctx.integerValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].AvailableInstanceCount"));
			capacityReservation.setNetworkType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].NetworkType"));
			capacityReservation.setEndDateType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].EndDateType"));
			capacityReservation.setInstanceMatchCriteria(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstanceMatchCriteria"));
			capacityReservation.setInstanceType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstanceType"));
			capacityReservation.setTimeSlot(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].TimeSlot"));

			capacityReservations.add(capacityReservation);
		}
		describeCapacityReservationsResponse.setCapacityReservations(capacityReservations);
	 
	 	return describeCapacityReservationsResponse;
	}
}