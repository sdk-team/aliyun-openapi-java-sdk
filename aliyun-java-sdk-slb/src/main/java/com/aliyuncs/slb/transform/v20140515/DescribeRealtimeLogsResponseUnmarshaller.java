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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeRealtimeLogsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeRealtimeLogsResponse.LBRealtimeLogsType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRealtimeLogsResponseUnmarshaller {

	public static DescribeRealtimeLogsResponse unmarshall(DescribeRealtimeLogsResponse describeRealtimeLogsResponse, UnmarshallerContext context) {
		
		describeRealtimeLogsResponse.setRequestId(context.stringValue("DescribeRealtimeLogsResponse.RequestId"));
		describeRealtimeLogsResponse.setPageNumber(context.integerValue("DescribeRealtimeLogsResponse.PageNumber"));
		describeRealtimeLogsResponse.setPageSize(context.integerValue("DescribeRealtimeLogsResponse.PageSize"));
		describeRealtimeLogsResponse.setTotalCount(context.integerValue("DescribeRealtimeLogsResponse.TotalCount"));

		List<LBRealtimeLogsType> lBRealTimeLogsSet = new ArrayList<LBRealtimeLogsType>();
		for (int i = 0; i < context.lengthValue("DescribeRealtimeLogsResponse.LBRealTimeLogsSet.Length"); i++) {
			LBRealtimeLogsType lBRealtimeLogsType = new LBRealtimeLogsType();
			lBRealtimeLogsType.setLogDetail(context.stringValue("DescribeRealtimeLogsResponse.LBRealTimeLogsSet["+ i +"].LogDetail"));

			lBRealTimeLogsSet.add(lBRealtimeLogsType);
		}
		describeRealtimeLogsResponse.setLBRealTimeLogsSet(lBRealTimeLogsSet);
	 
	 	return describeRealtimeLogsResponse;
	}
}