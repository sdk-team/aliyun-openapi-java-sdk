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

import com.aliyuncs.ecs.model.v20160314.DescribeDedicatedHostTypesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDedicatedHostTypesResponse.DedicatedHostType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostTypesResponseUnmarshaller {

	public static DescribeDedicatedHostTypesResponse unmarshall(DescribeDedicatedHostTypesResponse describeDedicatedHostTypesResponse, UnmarshallerContext context) {
		
		describeDedicatedHostTypesResponse.setRequestId(context.stringValue("DescribeDedicatedHostTypesResponse.RequestId"));

		List<DedicatedHostType> dedicatedHostTypes = new ArrayList<DedicatedHostType>();
		for (int i = 0; i < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes.Length"); i++) {
			DedicatedHostType dedicatedHostType = new DedicatedHostType();
			dedicatedHostType.setDedicatedHostType(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].DedicatedHostType"));
			dedicatedHostType.setGeneration(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].Generation"));
			dedicatedHostType.setTotalSockets(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalSockets"));
			dedicatedHostType.setTotalVcpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalVcpus"));
			dedicatedHostType.setTotalVgpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalVgpus"));
			dedicatedHostType.setTotalPhysicalCores(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalPhysicalCores"));
			dedicatedHostType.setPhysicalGpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].PhysicalGpus"));
			dedicatedHostType.setMemorySize(context.floatValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].MemorySize"));
			dedicatedHostType.setLocalStorageCapacity(context.longValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCapacity"));
			dedicatedHostType.setLocalStorageAmount(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageAmount"));
			dedicatedHostType.setLocalStorageCategory(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCategory"));
			dedicatedHostType.setGPUSpec(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].GPUSpec"));

			List<String> supportInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypeFamilies.Length"); j++) {
				supportInstanceTypeFamilies.add(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHostType.setSupportInstanceTypeFamilies(supportInstanceTypeFamilies);

			List<String> supportInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypesList.Length"); j++) {
				supportInstanceTypesList.add(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypesList["+ j +"]"));
			}
			dedicatedHostType.setSupportInstanceTypesList(supportInstanceTypesList);

			dedicatedHostTypes.add(dedicatedHostType);
		}
		describeDedicatedHostTypesResponse.setDedicatedHostTypes(dedicatedHostTypes);
	 
	 	return describeDedicatedHostTypesResponse;
	}
}