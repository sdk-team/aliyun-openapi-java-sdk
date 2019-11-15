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

import com.aliyuncs.ecs.model.v20160314.InnerDiskQueryByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerDiskQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerDiskQueryByParamResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerDiskQueryByParamResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDiskQueryByParamResponseUnmarshaller {

	public static InnerDiskQueryByParamResponse unmarshall(InnerDiskQueryByParamResponse innerDiskQueryByParamResponse, UnmarshallerContext _ctx) {
		
		innerDiskQueryByParamResponse.setRequestId(_ctx.stringValue("InnerDiskQueryByParamResponse.RequestId"));
		innerDiskQueryByParamResponse.setCount(_ctx.integerValue("InnerDiskQueryByParamResponse.count"));
		innerDiskQueryByParamResponse.setPageNo(_ctx.integerValue("InnerDiskQueryByParamResponse.pageNo"));
		innerDiskQueryByParamResponse.setPageSize(_ctx.integerValue("InnerDiskQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerDiskQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerDiskQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerDiskQueryByParamResponse.errorCode.isSuccess"));
		innerDiskQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerDiskQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSeq(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].seq"));
			item.setEnableAutoSnapshot(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].enableAutoSnapshot"));
			item.setActive(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].active"));
			item.setDiskSize(_ctx.integerValue("InnerDiskQueryByParamResponse.data["+ i +"].diskSize"));
			item.setDiskDesc(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskDesc"));
			item.setBusinessStatus(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setZoneNo(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].zoneNo"));
			item.setRegionNo(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].regionNo"));
			item.setDiskCategory(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskCategory"));
			item.setSnapshotNo(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].snapshotNo"));
			item.setHouyiDiskId(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].houyiDiskId"));
			item.setDiskName(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskName"));
			item.setProductCode(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].productCode"));
			item.setMountPoint(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].mountPoint"));
			item.setDeleteAutoSnapshot(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].deleteAutoSnapshot"));
			item.setImageNo(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].imageNo"));
			item.setId(_ctx.longValue("InnerDiskQueryByParamResponse.data["+ i +"].id"));
			item.setBootable(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].bootable"));
			item.setDeleteWithInstance(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].deleteWithInstance"));
			item.setDiskType(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskType"));
			item.setEcsInstanceId(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].ecsInstanceId"));
			item.setLastAttachTime(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].lastAttachTime"));
			item.setLastDetachTime(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].lastDetachTime"));
			item.setIzNo(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].izNo"));
			item.setPortable(_ctx.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].portable"));
			item.setIopsSize(_ctx.integerValue("InnerDiskQueryByParamResponse.data["+ i +"].iopsSize"));
			item.setAutoSnapshotPolicyId(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].autoSnapshotPolicyId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerDiskQueryByParamResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(_ctx.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerDiskQueryByParamResponse.setData(data);
	 
	 	return innerDiskQueryByParamResponse;
	}
}