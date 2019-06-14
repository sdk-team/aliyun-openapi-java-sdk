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

import com.aliyuncs.slb.model.v20140515.CreateMasterSlaveVServerGroupResponse;
import com.aliyuncs.slb.model.v20140515.CreateMasterSlaveVServerGroupResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMasterSlaveVServerGroupResponseUnmarshaller {

	public static CreateMasterSlaveVServerGroupResponse unmarshall(CreateMasterSlaveVServerGroupResponse createMasterSlaveVServerGroupResponse, UnmarshallerContext context) {
		
		createMasterSlaveVServerGroupResponse.setRequestId(context.stringValue("CreateMasterSlaveVServerGroupResponse.RequestId"));
		createMasterSlaveVServerGroupResponse.setMasterSlaveVServerGroupId(context.stringValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveVServerGroupId"));

		List<BackendServer> masterSlaveBackendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].ServerId"));
			backendServer.setPort(context.integerValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].Port"));
			backendServer.setWeight(context.integerValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].Weight"));
			backendServer.setBackup(context.booleanValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].Backup"));
			backendServer.setType(context.stringValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].Type"));
			backendServer.setServerIp(context.stringValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(context.stringValue("CreateMasterSlaveVServerGroupResponse.MasterSlaveBackendServers["+ i +"].VpcId"));

			masterSlaveBackendServers.add(backendServer);
		}
		createMasterSlaveVServerGroupResponse.setMasterSlaveBackendServers(masterSlaveBackendServers);
	 
	 	return createMasterSlaveVServerGroupResponse;
	}
}