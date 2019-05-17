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

package com.aliyuncs.rds.transform.v20130528;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20130528.QueryShareDBInstancesServiceResponse;
import com.aliyuncs.rds.model.v20130528.QueryShareDBInstancesServiceResponse.ShareDBInstanceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryShareDBInstancesServiceResponseUnmarshaller {

	public static QueryShareDBInstancesServiceResponse unmarshall(QueryShareDBInstancesServiceResponse queryShareDBInstancesServiceResponse, UnmarshallerContext context) {
		
		queryShareDBInstancesServiceResponse.setRequestId(context.stringValue("QueryShareDBInstancesServiceResponse.RequestId"));
		queryShareDBInstancesServiceResponse.setCode(context.stringValue("QueryShareDBInstancesServiceResponse.Code"));
		queryShareDBInstancesServiceResponse.setMessage(context.stringValue("QueryShareDBInstancesServiceResponse.Message"));
		queryShareDBInstancesServiceResponse.setSuccess(context.booleanValue("QueryShareDBInstancesServiceResponse.Success"));

		List<ShareDBInstanceModel> shareDBInstances = new ArrayList<ShareDBInstanceModel>();
		for (int i = 0; i < context.lengthValue("QueryShareDBInstancesServiceResponse.ShareDBInstances.Length"); i++) {
			ShareDBInstanceModel shareDBInstanceModel = new ShareDBInstanceModel();
			shareDBInstanceModel.setDbInstanceId(context.integerValue("QueryShareDBInstancesServiceResponse.ShareDBInstances["+ i +"].dbInstanceId"));
			shareDBInstanceModel.setDbInstanceName(context.stringValue("QueryShareDBInstancesServiceResponse.ShareDBInstances["+ i +"].dbInstanceName"));
			shareDBInstanceModel.setClusterName(context.stringValue("QueryShareDBInstancesServiceResponse.ShareDBInstances["+ i +"].clusterName"));
			shareDBInstanceModel.setShareMaxQty(context.stringValue("QueryShareDBInstancesServiceResponse.ShareDBInstances["+ i +"].shareMaxQty"));
			shareDBInstanceModel.setShareUsedQty(context.stringValue("QueryShareDBInstancesServiceResponse.ShareDBInstances["+ i +"].shareUsedQty"));

			shareDBInstances.add(shareDBInstanceModel);
		}
		queryShareDBInstancesServiceResponse.setShareDBInstances(shareDBInstances);
	 
	 	return queryShareDBInstancesServiceResponse;
	}
}