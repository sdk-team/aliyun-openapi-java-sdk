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

import com.aliyuncs.ecs.model.v20160314.InnerImageQueryUserImagesResponse;
import com.aliyuncs.ecs.model.v20160314.InnerImageQueryUserImagesResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerImageQueryUserImagesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryUserImagesResponseUnmarshaller {

	public static InnerImageQueryUserImagesResponse unmarshall(InnerImageQueryUserImagesResponse innerImageQueryUserImagesResponse, UnmarshallerContext _ctx) {
		
		innerImageQueryUserImagesResponse.setRequestId(_ctx.stringValue("InnerImageQueryUserImagesResponse.RequestId"));
		innerImageQueryUserImagesResponse.setCount(_ctx.integerValue("InnerImageQueryUserImagesResponse.count"));
		innerImageQueryUserImagesResponse.setPageNo(_ctx.integerValue("InnerImageQueryUserImagesResponse.pageNo"));
		innerImageQueryUserImagesResponse.setPageSize(_ctx.integerValue("InnerImageQueryUserImagesResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerImageQueryUserImagesResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerImageQueryUserImagesResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerImageQueryUserImagesResponse.errorCode.isSuccess"));
		innerImageQueryUserImagesResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerImageQueryUserImagesResponse.data.Length"); i++) {
			Item item = new Item();
			item.setKind(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].kind"));
			item.setVersion(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].version"));
			item.setWindowsOS(_ctx.booleanValue("InnerImageQueryUserImagesResponse.data["+ i +"].windowsOS"));
			item.setAliUid(_ctx.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].aliUid"));
			item.setType(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].type"));
			item.setGmtRelease(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtRelease"));
			item.setMinMemory(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].minMemory"));
			item.setOsTypeId(_ctx.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].osTypeId"));
			item.setMaxCpu(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].maxCpu"));
			item.setMinCpu(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].minCpu"));
			item.setRemark(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].remark"));
			item.setGmtModified(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtModified"));
			item.setImageNo(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageNo"));
			item.setBid(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].bid"));
			item.setOsBit(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].osBit"));
			item.setGmtCreated(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtCreated"));
			item.setId(_ctx.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].id"));
			item.setOsMemo(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].osMemo"));
			item.setImageSize(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageSize"));
			item.setIsPublic(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].isPublic"));
			item.setRegionNo(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].regionNo"));
			item.setMaxMemory(_ctx.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].maxMemory"));
			item.setSnapshotNo(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].snapshotNo"));
			item.setStatus(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].status"));
			item.setImageName(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageName"));
			item.setPlatform(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].platform"));
			item.setOsName(_ctx.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].osName"));

			data.add(item);
		}
		innerImageQueryUserImagesResponse.setData(data);
	 
	 	return innerImageQueryUserImagesResponse;
	}
}