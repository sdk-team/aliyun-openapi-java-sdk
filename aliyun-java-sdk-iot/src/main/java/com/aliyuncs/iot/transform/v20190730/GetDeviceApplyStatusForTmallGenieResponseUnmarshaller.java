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

import com.aliyuncs.iot.model.v20190730.GetDeviceApplyStatusForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.GetDeviceApplyStatusForTmallGenieResponse.ApplyStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceApplyStatusForTmallGenieResponseUnmarshaller {

	public static GetDeviceApplyStatusForTmallGenieResponse unmarshall(GetDeviceApplyStatusForTmallGenieResponse getDeviceApplyStatusForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		getDeviceApplyStatusForTmallGenieResponse.setRequestId(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.RequestId"));
		getDeviceApplyStatusForTmallGenieResponse.setSuccess(_ctx.booleanValue("GetDeviceApplyStatusForTmallGenieResponse.Success"));
		getDeviceApplyStatusForTmallGenieResponse.setCode(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.Code"));
		getDeviceApplyStatusForTmallGenieResponse.setErrorMessage(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.ErrorMessage"));

		List<ApplyStatus> data = new ArrayList<ApplyStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceApplyStatusForTmallGenieResponse.Data.Length"); i++) {
			ApplyStatus applyStatus = new ApplyStatus();
			applyStatus.setStatus(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.Data["+ i +"].Status"));
			applyStatus.setSuccessCount(_ctx.integerValue("GetDeviceApplyStatusForTmallGenieResponse.Data["+ i +"].SuccessCount"));
			applyStatus.setTotalCount(_ctx.integerValue("GetDeviceApplyStatusForTmallGenieResponse.Data["+ i +"].TotalCount"));
			applyStatus.setDownloadHref(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.Data["+ i +"].DownloadHref"));
			applyStatus.setApplyId(_ctx.stringValue("GetDeviceApplyStatusForTmallGenieResponse.Data["+ i +"].ApplyId"));

			data.add(applyStatus);
		}
		getDeviceApplyStatusForTmallGenieResponse.setData(data);
	 
	 	return getDeviceApplyStatusForTmallGenieResponse;
	}
}