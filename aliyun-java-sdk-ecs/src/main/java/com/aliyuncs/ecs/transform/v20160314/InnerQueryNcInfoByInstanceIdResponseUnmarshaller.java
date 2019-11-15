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

import com.aliyuncs.ecs.model.v20160314.InnerQueryNcInfoByInstanceIdResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryNcInfoByInstanceIdResponseUnmarshaller {

	public static InnerQueryNcInfoByInstanceIdResponse unmarshall(InnerQueryNcInfoByInstanceIdResponse innerQueryNcInfoByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		innerQueryNcInfoByInstanceIdResponse.setRequestId(_ctx.stringValue("InnerQueryNcInfoByInstanceIdResponse.RequestId"));

		EcsNcInfo ecsNcInfo = new EcsNcInfo();
		ecsNcInfo.setNcIp(_ctx.stringValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.NcIp"));
		ecsNcInfo.setAvaliableDisk(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.AvaliableDisk"));
		ecsNcInfo.setTotalCpu(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.TotalCpu"));
		ecsNcInfo.setAvaliableMem(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.AvaliableMem"));
		ecsNcInfo.setAvaliableCpu(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.AvaliableCpu"));
		ecsNcInfo.setTotalDisk(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.TotalDisk"));
		ecsNcInfo.setZoneNo(_ctx.stringValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.ZoneNo"));
		ecsNcInfo.setTotalMem(_ctx.integerValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.TotalMem"));
		ecsNcInfo.setRackId(_ctx.stringValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.RackId"));
		ecsNcInfo.setNcId(_ctx.stringValue("InnerQueryNcInfoByInstanceIdResponse.EcsNcInfo.NcId"));
		innerQueryNcInfoByInstanceIdResponse.setEcsNcInfo(ecsNcInfo);
	 
	 	return innerQueryNcInfoByInstanceIdResponse;
	}
}