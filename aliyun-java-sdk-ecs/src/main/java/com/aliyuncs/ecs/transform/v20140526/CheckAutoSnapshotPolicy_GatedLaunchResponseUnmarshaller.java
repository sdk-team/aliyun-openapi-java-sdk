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

import com.aliyuncs.ecs.model.v20140526.CheckAutoSnapshotPolicy_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAutoSnapshotPolicy_GatedLaunchResponseUnmarshaller {

	public static CheckAutoSnapshotPolicy_GatedLaunchResponse unmarshall(CheckAutoSnapshotPolicy_GatedLaunchResponse checkAutoSnapshotPolicy_GatedLaunchResponse, UnmarshallerContext context) {
		
		checkAutoSnapshotPolicy_GatedLaunchResponse.setRequestId(context.stringValue("CheckAutoSnapshotPolicy_GatedLaunchResponse.RequestId"));
		checkAutoSnapshotPolicy_GatedLaunchResponse.setAutoSnapshotOccupation(context.integerValue("CheckAutoSnapshotPolicy_GatedLaunchResponse.AutoSnapshotOccupation"));
		checkAutoSnapshotPolicy_GatedLaunchResponse.setIsPermittedModify(context.stringValue("CheckAutoSnapshotPolicy_GatedLaunchResponse.IsPermittedModify"));
	 
	 	return checkAutoSnapshotPolicy_GatedLaunchResponse;
	}
}