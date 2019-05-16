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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.RunInstances_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunInstances_GatedLaunchResponseUnmarshaller {

	public static RunInstances_GatedLaunchResponse unmarshall(RunInstances_GatedLaunchResponse runInstances_GatedLaunchResponse, UnmarshallerContext context) {
		
		runInstances_GatedLaunchResponse.setRequestId(context.stringValue("RunInstances_GatedLaunchResponse.RequestId"));
		runInstances_GatedLaunchResponse.setTaskId(context.stringValue("RunInstances_GatedLaunchResponse.TaskId"));

		List<String> instanceIdSets = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("RunInstances_GatedLaunchResponse.InstanceIdSets.Length"); i++) {
			instanceIdSets.add(context.stringValue("RunInstances_GatedLaunchResponse.InstanceIdSets["+ i +"]"));
		}
		runInstances_GatedLaunchResponse.setInstanceIdSets(instanceIdSets);
	 
	 	return runInstances_GatedLaunchResponse;
	}
}