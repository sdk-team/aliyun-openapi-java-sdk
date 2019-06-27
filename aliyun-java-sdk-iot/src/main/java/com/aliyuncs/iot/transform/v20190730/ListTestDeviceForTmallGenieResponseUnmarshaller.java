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

	public static ListTestDeviceForTmallGenieResponse unmarshall(ListTestDeviceForTmallGenieResponse listTestDeviceForTmallGenieResponse, UnmarshallerContext context) {
		
		listTestDeviceForTmallGenieResponse.setRequestId(context.stringValue("ListTestDeviceForTmallGenieResponse.RequestId"));
		listTestDeviceForTmallGenieResponse.setSuccess(context.booleanValue("ListTestDeviceForTmallGenieResponse.Success"));
		listTestDeviceForTmallGenieResponse.setCode(context.stringValue("ListTestDeviceForTmallGenieResponse.Code"));
		listTestDeviceForTmallGenieResponse.setErrorMessage(context.stringValue("ListTestDeviceForTmallGenieResponse.ErrorMessage"));
		listTestDeviceForTmallGenieResponse.setPageNo(context.integerValue("ListTestDeviceForTmallGenieResponse.PageNo"));
		listTestDeviceForTmallGenieResponse.setTotal(context.integerValue("ListTestDeviceForTmallGenieResponse.Total"));
		listTestDeviceForTmallGenieResponse.setPageSize(context.integerValue("ListTestDeviceForTmallGenieResponse.PageSize"));

		List<DeviceInfo> data = new ArrayList<DeviceInfo>();
		for (int i = 0; i < context.lengthValue("ListTestDeviceForTmallGenieResponse.Data.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setIotId(context.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].IotId"));
			deviceInfo.setProductKey(context.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].ProductKey"));
			deviceInfo.setDeviceName(context.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].DeviceName"));
			deviceInfo.setDeviceSecret(context.stringValue("ListTestDeviceForTmallGenieResponse.Data["+ i +"].DeviceSecret"));

			data.add(deviceInfo);
		}
		listTestDeviceForTmallGenieResponse.setData(data);
	 
	 	return listTestDeviceForTmallGenieResponse;
	}
}