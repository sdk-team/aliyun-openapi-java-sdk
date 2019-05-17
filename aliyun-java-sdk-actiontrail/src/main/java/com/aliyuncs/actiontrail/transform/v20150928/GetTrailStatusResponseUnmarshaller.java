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

package com.aliyuncs.actiontrail.transform.v20150928;

import com.aliyuncs.actiontrail.model.v20150928.GetTrailStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrailStatusResponseUnmarshaller {

	public static GetTrailStatusResponse unmarshall(GetTrailStatusResponse getTrailStatusResponse, UnmarshallerContext context) {
		
		getTrailStatusResponse.setIsLogging(context.booleanValue("GetTrailStatusResponse.IsLogging"));
		getTrailStatusResponse.setLatestDeliveryError(context.stringValue("GetTrailStatusResponse.LatestDeliveryError"));
		getTrailStatusResponse.setLatestDeliveryTime(context.stringValue("GetTrailStatusResponse.LatestDeliveryTime"));
		getTrailStatusResponse.setStartLoggingTime(context.stringValue("GetTrailStatusResponse.StartLoggingTime"));
		getTrailStatusResponse.setStopLoggingTime(context.stringValue("GetTrailStatusResponse.StopLoggingTime"));
		getTrailStatusResponse.setParam(context.stringValue("GetTrailStatusResponse.Param"));
		getTrailStatusResponse.setResult(context.stringValue("GetTrailStatusResponse.Result"));
	 
	 	return getTrailStatusResponse;
	}
}