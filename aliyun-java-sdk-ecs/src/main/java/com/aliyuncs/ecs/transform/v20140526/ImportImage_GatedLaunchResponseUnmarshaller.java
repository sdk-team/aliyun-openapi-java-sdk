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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.ImportImage_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportImage_GatedLaunchResponseUnmarshaller {

	public static ImportImage_GatedLaunchResponse unmarshall(ImportImage_GatedLaunchResponse importImage_GatedLaunchResponse, UnmarshallerContext context) {
		
		importImage_GatedLaunchResponse.setRequestId(context.stringValue("ImportImage_GatedLaunchResponse.RequestId"));
		importImage_GatedLaunchResponse.setTaskId(context.stringValue("ImportImage_GatedLaunchResponse.TaskId"));
		importImage_GatedLaunchResponse.setRegionId(context.stringValue("ImportImage_GatedLaunchResponse.RegionId"));
		importImage_GatedLaunchResponse.setImageId(context.stringValue("ImportImage_GatedLaunchResponse.ImageId"));
	 
	 	return importImage_GatedLaunchResponse;
	}
}