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

package com.aliyuncs.iot.transform.v20190730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20190730.ListTestDeviceForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListTestDeviceForTmallGenieResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTestDeviceForTmallGenieResponseUnmarshaller {

	public static ListTestDeviceForTmallGenieResponse unmarshall(ListTestDeviceForTmallGenieResponse listTestDeviceForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		listTestDeviceForTmallGenieResponse.setRequestId(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.RequestId"));
		listTestDeviceForTmallGenieResponse.setSuccess(_ctx.booleanValue("ListTestDeviceForTmallGenieResponse.Success"));
		listTestDeviceForTmallGenieResponse.setCode(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.Code"));
		listTestDeviceForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.ErrorMessage"));
		listTestDeviceForTmallGenieResponse.setPageNo(_ctx.integerValue("ListTestDeviceForTmallGenieResponse.PageNo"));
		listTestDeviceForTmallGenieResponse.setTotal(_ctx.integerValue("ListTestDeviceForTmallGenieResponse.Total"));
		listTestDeviceForTmallGenieResponse.setPageSize(_ctx.integerValue("ListTestDeviceForTmallGenieResponse.PageSize"));

		List<DeviceInfo> data = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListTestDeviceForTmallGenieResponse.Data.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setIotId(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].IotId"));
			deviceInfo.setProductKey(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].ProductKey"));
			deviceInfo.setDeviceName(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].DeviceName"));
			deviceInfo.setDeviceSecret(_ctx.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].DeviceSecret"));

			data.add(deviceInfo);
		}
		listTestDeviceForTmallGenieResponse.setData(data);
	 
	 	return listTestDeviceForTmallGenieResponse;
	}
}