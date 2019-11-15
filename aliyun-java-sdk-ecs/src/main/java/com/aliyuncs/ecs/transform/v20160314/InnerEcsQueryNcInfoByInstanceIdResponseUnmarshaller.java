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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryNcInfoByInstanceIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryNcInfoByInstanceIdResponseUnmarshaller {

	public static InnerEcsQueryNcInfoByInstanceIdResponse unmarshall(InnerEcsQueryNcInfoByInstanceIdResponse innerEcsQueryNcInfoByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryNcInfoByInstanceIdResponse.setRequestId(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryNcInfoByInstanceIdResponse.errorCode.isSuccess"));
		innerEcsQueryNcInfoByInstanceIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setNcId(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.ncId"));
		data.setNcIp(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.ncIp"));
		data.setRackId(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.rackId"));
		data.setZoneNo(_ctx.stringValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.zoneNo"));
		data.setAvaliableDisk(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableDisk"));
		data.setTotalDisk(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalDisk"));
		data.setAvaliableCpu(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableCpu"));
		data.setTotalCpu(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalCpu"));
		data.setAvaliableMem(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.avaliableMem"));
		data.setTotalMem(_ctx.integerValue("InnerEcsQueryNcInfoByInstanceIdResponse.data.totalMem"));
		innerEcsQueryNcInfoByInstanceIdResponse.setData(data);
	 
	 	return innerEcsQueryNcInfoByInstanceIdResponse;
	}
}