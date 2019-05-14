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

import com.aliyuncs.ecs.model.v20140526.CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponseUnmarshaller {

	public static CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse unmarshall(CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse checkDiskEnableAutoSnapshotValidation_GatedLaunchResponse, UnmarshallerContext context) {
		
		checkDiskEnableAutoSnapshotValidation_GatedLaunchResponse.setRequestId(context.stringValue("CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse.RequestId"));
		checkDiskEnableAutoSnapshotValidation_GatedLaunchResponse.setIsPermitted(context.stringValue("CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse.IsPermitted"));
		checkDiskEnableAutoSnapshotValidation_GatedLaunchResponse.setAutoSnapshotOccupation(context.integerValue("CheckDiskEnableAutoSnapshotValidation_GatedLaunchResponse.AutoSnapshotOccupation"));
	 
	 	return checkDiskEnableAutoSnapshotValidation_GatedLaunchResponse;
	}
}