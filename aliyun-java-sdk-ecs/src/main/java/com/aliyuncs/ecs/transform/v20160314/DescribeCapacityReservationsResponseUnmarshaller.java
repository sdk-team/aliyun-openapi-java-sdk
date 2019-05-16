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

	public static DescribeCapacityReservationsResponse unmarshall(DescribeCapacityReservationsResponse describeCapacityReservationsResponse, UnmarshallerContext context) {
		
		describeCapacityReservationsResponse.setRequestId(context.stringValue("DescribeCapacityReservationsResponse.RequestId"));
		describeCapacityReservationsResponse.setTotalCount(context.integerValue("DescribeCapacityReservationsResponse.TotalCount"));
		describeCapacityReservationsResponse.setPageNumber(context.integerValue("DescribeCapacityReservationsResponse.PageNumber"));
		describeCapacityReservationsResponse.setPageSize(context.integerValue("DescribeCapacityReservationsResponse.PageSize"));

		List<CapacityReservation> capacityReservations = new ArrayList<CapacityReservation>();
		for (int i = 0; i < context.lengthValue("DescribeCapacityReservationsResponse.CapacityReservations.Length"); i++) {
			CapacityReservation capacityReservation = new CapacityReservation();
			capacityReservation.setCapacityReservationId(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].CapacityReservationId"));
			capacityReservation.setRegionId(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].RegionId"));
			capacityReservation.setZoneId(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].ZoneId"));
			capacityReservation.setCapacityReservationName(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].CapacityReservationName"));
			capacityReservation.setStatus(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].Status"));
			capacityReservation.setDescription(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].Description"));
			capacityReservation.setInstancePlatform(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstancePlatform"));
			capacityReservation.setTotalInstanceCount(context.integerValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].TotalInstanceCount"));
			capacityReservation.setAvailableInstanceCount(context.integerValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].AvailableInstanceCount"));
			capacityReservation.setNetworkType(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].NetworkType"));
			capacityReservation.setEndDateType(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].EndDateType"));
			capacityReservation.setInstanceMatchCriteria(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstanceMatchCriteria"));
			capacityReservation.setInstanceType(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].InstanceType"));
			capacityReservation.setTimeSlot(context.stringValue("DescribeCapacityReservationsResponse.CapacityReservations["+ i +"].TimeSlot"));

			capacityReservations.add(capacityReservation);
		}
		describeCapacityReservationsResponse.setCapacityReservations(capacityReservations);
	 
	 	return describeCapacityReservationsResponse;
	}
}