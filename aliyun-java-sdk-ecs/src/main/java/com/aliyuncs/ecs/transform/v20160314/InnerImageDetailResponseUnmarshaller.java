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

import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.Data.OsTypeModel;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.Data.OsTypeModel.Kind;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.Data.QuoteType;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.Data.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerImageDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageDetailResponseUnmarshaller {

	public static InnerImageDetailResponse unmarshall(InnerImageDetailResponse innerImageDetailResponse, UnmarshallerContext _ctx) {
		
		innerImageDetailResponse.setRequestId(_ctx.stringValue("InnerImageDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerImageDetailResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerImageDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerImageDetailResponse.errorCode.isSuccess"));
		innerImageDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setName(_ctx.stringValue("InnerImageDetailResponse.data.name"));
		data.setSrcImageId(_ctx.longValue("InnerImageDetailResponse.data.srcImageId"));
		data.setImageId(_ctx.stringValue("InnerImageDetailResponse.data.imageId"));
		data.setGmtCreated(_ctx.stringValue("InnerImageDetailResponse.data.gmtCreated"));
		data.setId(_ctx.longValue("InnerImageDetailResponse.data.id"));
		data.setBid(_ctx.stringValue("InnerImageDetailResponse.data.bid"));
		data.setSupportIoOptimizedInstance(_ctx.booleanValue("InnerImageDetailResponse.data.supportIoOptimizedInstance"));
		data.setRemark(_ctx.stringValue("InnerImageDetailResponse.data.remark"));
		data.setVisibility(_ctx.stringValue("InnerImageDetailResponse.data.visibility"));
		data.setImportOSSObject(_ctx.stringValue("InnerImageDetailResponse.data.importOSSObject"));
		data.setGmtModified(_ctx.stringValue("InnerImageDetailResponse.data.gmtModified"));
		data.setProgress(_ctx.stringValue("InnerImageDetailResponse.data.progress"));
		data.setVersion(_ctx.stringValue("InnerImageDetailResponse.data.version"));
		data.setImageProductCode(_ctx.stringValue("InnerImageDetailResponse.data.imageProductCode"));
		data.setAliUid(_ctx.longValue("InnerImageDetailResponse.data.aliUid"));
		data.setGmtRelease(_ctx.stringValue("InnerImageDetailResponse.data.gmtRelease"));
		data.setImageCategory(_ctx.stringValue("InnerImageDetailResponse.data.imageCategory"));
		data.setDisplayName(_ctx.stringValue("InnerImageDetailResponse.data.displayName"));
		data.setOwner(_ctx.stringValue("InnerImageDetailResponse.data.owner"));
		data.setStatus(_ctx.stringValue("InnerImageDetailResponse.data.status"));
		data.setImportOSSBucket(_ctx.stringValue("InnerImageDetailResponse.data.importOSSBucket"));
		data.setRegionNo(_ctx.stringValue("InnerImageDetailResponse.data.regionNo"));
		data.setFormat(_ctx.stringValue("InnerImageDetailResponse.data.format"));
		data.setImageSize(_ctx.integerValue("InnerImageDetailResponse.data.imageSize"));
		data.setSnapshotNo(_ctx.stringValue("InnerImageDetailResponse.data.snapshotNo"));

		OsTypeModel osTypeModel = new OsTypeModel();
		osTypeModel.setPlatform(_ctx.stringValue("InnerImageDetailResponse.data.osTypeModel.platform"));
		osTypeModel.setId(_ctx.longValue("InnerImageDetailResponse.data.osTypeModel.id"));
		osTypeModel.setOsBit(_ctx.integerValue("InnerImageDetailResponse.data.osTypeModel.osBit"));
		osTypeModel.setMinCpu(_ctx.integerValue("InnerImageDetailResponse.data.osTypeModel.minCpu"));
		osTypeModel.setMinMemory(_ctx.integerValue("InnerImageDetailResponse.data.osTypeModel.minMemory"));
		osTypeModel.setMaxCpu(_ctx.integerValue("InnerImageDetailResponse.data.osTypeModel.maxCpu"));
		osTypeModel.setMaxMemory(_ctx.integerValue("InnerImageDetailResponse.data.osTypeModel.maxMemory"));
		osTypeModel.setOsName(_ctx.stringValue("InnerImageDetailResponse.data.osTypeModel.osName"));
		osTypeModel.setOsMemo(_ctx.stringValue("InnerImageDetailResponse.data.osTypeModel.osMemo"));
		osTypeModel.setType(_ctx.stringValue("InnerImageDetailResponse.data.osTypeModel.type"));

		Kind kind = new Kind();
		kind.setKind(_ctx.stringValue("InnerImageDetailResponse.data.osTypeModel.kind.kind"));
		osTypeModel.setKind(kind);
		data.setOsTypeModel(osTypeModel);

		QuoteType quoteType = new QuoteType();
		quoteType.setQuoteType(_ctx.stringValue("InnerImageDetailResponse.data.quoteType.quoteType"));
		data.setQuoteType(quoteType);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("InnerImageDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("InnerImageDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(_ctx.stringValue("InnerImageDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);
		innerImageDetailResponse.setData(data);
	 
	 	return innerImageDetailResponse;
	}
}