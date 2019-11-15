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

import com.aliyuncs.ecs.model.v20160314.InnerCountEcsInRegionResponse;
import com.aliyuncs.ecs.model.v20160314.InnerCountEcsInRegionResponse.EcsInRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCountEcsInRegionResponseUnmarshaller {

	public static InnerCountEcsInRegionResponse unmarshall(InnerCountEcsInRegionResponse innerCountEcsInRegionResponse, UnmarshallerContext _ctx) {
		
		innerCountEcsInRegionResponse.setRequestId(_ctx.stringValue("InnerCountEcsInRegionResponse.RequestId"));
		innerCountEcsInRegionResponse.setPageNumber(_ctx.integerValue("InnerCountEcsInRegionResponse.PageNumber"));
		innerCountEcsInRegionResponse.setPageSize(_ctx.integerValue("InnerCountEcsInRegionResponse.PageSize"));

		List<EcsInRegion> ecsInRegions = new ArrayList<EcsInRegion>();
		for (int i = 0; i < _ctx.lengthValue("InnerCountEcsInRegionResponse.EcsInRegions.Length"); i++) {
			EcsInRegion ecsInRegion = new EcsInRegion();
			ecsInRegion.setEcsNum(_ctx.integerValue("InnerCountEcsInRegionResponse.EcsInRegions["+ i +"].EcsNum"));
			ecsInRegion.setAliUid(_ctx.longValue("InnerCountEcsInRegionResponse.EcsInRegions["+ i +"].AliUid"));
			ecsInRegion.setRegionNo(_ctx.stringValue("InnerCountEcsInRegionResponse.EcsInRegions["+ i +"].RegionNo"));

			ecsInRegions.add(ecsInRegion);
		}
		innerCountEcsInRegionResponse.setEcsInRegions(ecsInRegions);
	 
	 	return innerCountEcsInRegionResponse;
	}
}