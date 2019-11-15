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

import com.aliyuncs.ecs.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse;
import com.aliyuncs.ecs.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSnapshotDescribeMountedSnapshotsResponseUnmarshaller {

	public static InnerSnapshotDescribeMountedSnapshotsResponse unmarshall(InnerSnapshotDescribeMountedSnapshotsResponse innerSnapshotDescribeMountedSnapshotsResponse, UnmarshallerContext _ctx) {
		
		innerSnapshotDescribeMountedSnapshotsResponse.setRequestId(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.RequestId"));
		innerSnapshotDescribeMountedSnapshotsResponse.setCount(_ctx.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.count"));
		innerSnapshotDescribeMountedSnapshotsResponse.setPageNo(_ctx.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.pageNo"));
		innerSnapshotDescribeMountedSnapshotsResponse.setPageSize(_ctx.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.pageSize"));
		innerSnapshotDescribeMountedSnapshotsResponse.setTotalCount(_ctx.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.totalCount"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.isSuccess"));
		innerSnapshotDescribeMountedSnapshotsResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerSnapshotDescribeMountedSnapshotsResponse.data.Length"); i++) {
			Item item = new Item();
			item.setDevice(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].device"));
			item.setEcsOwnerAliUid(_ctx.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsOwnerAliUid"));
			item.setEcsInstanceId(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsInstanceId"));
			item.setSnapshotId(_ctx.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].snapshotId"));
			item.setEcsRegionNo(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsRegionNo"));
			item.setSnapshotOwnerAliUid(_ctx.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].snapshotOwnerAliUid"));
			item.setStatus(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].status"));
			item.setMountedTime(_ctx.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].mountedTime"));

			data.add(item);
		}
		innerSnapshotDescribeMountedSnapshotsResponse.setData(data);
	 
	 	return innerSnapshotDescribeMountedSnapshotsResponse;
	}
}