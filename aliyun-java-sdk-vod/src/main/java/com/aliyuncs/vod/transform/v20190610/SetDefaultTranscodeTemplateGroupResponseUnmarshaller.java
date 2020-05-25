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

package com.aliyuncs.vod.transform.v20190610;

import com.aliyuncs.vod.model.v20190610.SetDefaultTranscodeTemplateGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDefaultTranscodeTemplateGroupResponseUnmarshaller {

	public static SetDefaultTranscodeTemplateGroupResponse unmarshall(SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroupResponse, UnmarshallerContext _ctx) {
		
		setDefaultTranscodeTemplateGroupResponse.setRequestId(_ctx.stringValue("SetDefaultTranscodeTemplateGroupResponse.RequestId"));
	 
	 	return setDefaultTranscodeTemplateGroupResponse;
	}
}