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

import com.aliyuncs.ecs.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse;
import com.aliyuncs.ecs.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSnapshotQueryUserSnapshotsResponseUnmarshaller {

	public static InnerSnapshotQueryUserSnapshotsResponse unmarshall(InnerSnapshotQueryUserSnapshotsResponse innerSnapshotQueryUserSnapshotsResponse, UnmarshallerContext _ctx) {
		
		innerSnapshotQueryUserSnapshotsResponse.setRequestId(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.RequestId"));
		innerSnapshotQueryUserSnapshotsResponse.setCount(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.count"));
		innerSnapshotQueryUserSnapshotsResponse.setPageNo(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.pageNo"));
		innerSnapshotQueryUserSnapshotsResponse.setPageSize(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.isSuccess"));
		innerSnapshotQueryUserSnapshotsResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerSnapshotQueryUserSnapshotsResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSnapshotType(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotType"));
			item.setGmtModified(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].gmtModified"));
			item.setSnapshotId(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotId"));
			item.setAliUid(_ctx.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].aliUid"));
			item.setImgPc(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].imgPc"));
			item.setDiskType(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskType"));
			item.setSnapshotNickname(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotNickname"));
			item.setDeviceType(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].deviceType"));
			item.setSnapshotName(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotName"));
			item.setDescription(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].description"));
			item.setId(_ctx.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].id"));
			item.setEcsSnapshotStatus(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].ecsSnapshotStatus"));
			item.setGmtCreated(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].gmtCreated"));
			item.setBid(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].bid"));
			item.setEcsId(_ctx.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].ecsId"));
			item.setDiskId(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskId"));
			item.setSnapshotProcess(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotProcess"));
			item.setStatus(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].status"));
			item.setSnapshotSize(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotSize"));
			item.setSnapshotNo(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotNo"));
			item.setQuoteType(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].quoteType"));
			item.setImgId(_ctx.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].imgId"));
			item.setDeviceNo(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].deviceNo"));
			item.setDiskSize(_ctx.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskSize"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(_ctx.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerSnapshotQueryUserSnapshotsResponse.setData(data);
	 
	 	return innerSnapshotQueryUserSnapshotsResponse;
	}
}