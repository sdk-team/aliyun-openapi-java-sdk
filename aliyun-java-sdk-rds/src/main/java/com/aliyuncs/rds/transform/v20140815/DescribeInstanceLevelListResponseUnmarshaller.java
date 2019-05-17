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

import com.aliyuncs.rds.model.v20140815.DescribeInstanceLevelListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceLevelListResponseUnmarshaller {

	public static DescribeInstanceLevelListResponse unmarshall(DescribeInstanceLevelListResponse describeInstanceLevelListResponse, UnmarshallerContext context) {
		
		describeInstanceLevelListResponse.setData(context.stringValue("DescribeInstanceLevelListResponse.Data"));
		describeInstanceLevelListResponse.setClassCodeList(context.stringValue("DescribeInstanceLevelListResponse.ClassCodeList"));
		describeInstanceLevelListResponse.setCategory(context.stringValue("DescribeInstanceLevelListResponse.Category"));
		describeInstanceLevelListResponse.setClassCode(context.stringValue("DescribeInstanceLevelListResponse.ClassCode"));
		describeInstanceLevelListResponse.setEngine(context.stringValue("DescribeInstanceLevelListResponse.Engine"));
		describeInstanceLevelListResponse.setEngineVersion(context.stringValue("DescribeInstanceLevelListResponse.EngineVersion"));
		describeInstanceLevelListResponse.setHostType(context.stringValue("DescribeInstanceLevelListResponse.HostType"));
		describeInstanceLevelListResponse.setResultCode(context.stringValue("DescribeInstanceLevelListResponse.ResultCode"));
		describeInstanceLevelListResponse.setSuccess(context.stringValue("DescribeInstanceLevelListResponse.Success"));
	 
	 	return describeInstanceLevelListResponse;
	}
}