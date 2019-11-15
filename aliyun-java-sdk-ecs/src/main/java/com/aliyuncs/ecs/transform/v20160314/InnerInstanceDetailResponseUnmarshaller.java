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

import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Group;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Group.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Img;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Img.OsTypeModel;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Img.OsTypeModel.Kind;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Img.QuoteType;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.Img.Tag2;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.PublicIp;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.Data.StatusNote;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceDetailResponseUnmarshaller {

	public static InnerInstanceDetailResponse unmarshall(InnerInstanceDetailResponse innerInstanceDetailResponse, UnmarshallerContext _ctx) {
		
		innerInstanceDetailResponse.setRequestId(_ctx.stringValue("InnerInstanceDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceDetailResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceDetailResponse.errorCode.isSuccess"));
		innerInstanceDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setSystemDeviceCategory(_ctx.stringValue("InnerInstanceDetailResponse.data.systemDeviceCategory"));
		data.setVncHost(_ctx.stringValue("InnerInstanceDetailResponse.data.vncHost"));
		data.setIntensiveNet(_ctx.integerValue("InnerInstanceDetailResponse.data.intensiveNet"));
		data.setSafetyQuota(_ctx.stringValue("InnerInstanceDetailResponse.data.safetyQuota"));
		data.setVncPort(_ctx.integerValue("InnerInstanceDetailResponse.data.vncPort"));
		data.setZoneNo(_ctx.stringValue("InnerInstanceDetailResponse.data.zoneNo"));
		data.setInstanceName(_ctx.stringValue("InnerInstanceDetailResponse.data.instanceName"));
		data.setRegionNo(_ctx.stringValue("InnerInstanceDetailResponse.data.regionNo"));
		data.setHostname(_ctx.stringValue("InnerInstanceDetailResponse.data.hostname"));
		data.setNetworkValidation(_ctx.booleanValue("InnerInstanceDetailResponse.data.networkValidation"));
		data.setInternetTx(_ctx.integerValue("InnerInstanceDetailResponse.data.internetTx"));
		data.setInternetRx(_ctx.integerValue("InnerInstanceDetailResponse.data.internetRx"));
		data.setPlatform(_ctx.stringValue("InnerInstanceDetailResponse.data.platform"));
		data.setVlanNo(_ctx.stringValue("InnerInstanceDetailResponse.data.vlanNo"));
		data.setStatus(_ctx.stringValue("InnerInstanceDetailResponse.data.status"));
		data.setCreationTime(_ctx.stringValue("InnerInstanceDetailResponse.data.creationTime"));
		data.setMem(_ctx.integerValue("InnerInstanceDetailResponse.data.mem"));
		data.setIntensiveIo(_ctx.integerValue("InnerInstanceDetailResponse.data.intensiveIo"));
		data.setNcId(_ctx.stringValue("InnerInstanceDetailResponse.data.ncId"));
		data.setBps(_ctx.integerValue("InnerInstanceDetailResponse.data.bps"));
		data.setVncPassword(_ctx.stringValue("InnerInstanceDetailResponse.data.vncPassword"));
		data.setEcsName(_ctx.stringValue("InnerInstanceDetailResponse.data.ecsName"));
		data.setInnerIp(_ctx.stringValue("InnerInstanceDetailResponse.data.innerIp"));
		data.setRealZoneNo(_ctx.stringValue("InnerInstanceDetailResponse.data.realZoneNo"));
		data.setSerialNumber(_ctx.stringValue("InnerInstanceDetailResponse.data.serialNumber"));
		data.setIzNo(_ctx.stringValue("InnerInstanceDetailResponse.data.izNo"));
		data.setCores(_ctx.integerValue("InnerInstanceDetailResponse.data.cores"));
		data.setIntranetTx(_ctx.integerValue("InnerInstanceDetailResponse.data.intranetTx"));
		data.setIntensiveCpu(_ctx.integerValue("InnerInstanceDetailResponse.data.intensiveCpu"));
		data.setImageProductCode(_ctx.stringValue("InnerInstanceDetailResponse.data.imageProductCode"));
		data.setIntranetRx(_ctx.integerValue("InnerInstanceDetailResponse.data.intranetRx"));
		data.setSecurityControl(_ctx.stringValue("InnerInstanceDetailResponse.data.securityControl"));
		data.setRackId(_ctx.stringValue("InnerInstanceDetailResponse.data.rackId"));
		data.setDisk(_ctx.integerValue("InnerInstanceDetailResponse.data.disk"));

		PublicIp publicIp = new PublicIp();
		publicIp.setBindIp(_ctx.stringValue("InnerInstanceDetailResponse.data.publicIp.bindIp"));
		publicIp.setAssignNatIp(_ctx.stringValue("InnerInstanceDetailResponse.data.publicIp.assignNatIp"));
		publicIp.setAssignIp(_ctx.stringValue("InnerInstanceDetailResponse.data.publicIp.assignIp"));
		data.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(_ctx.stringValue("InnerInstanceDetailResponse.data.img.name"));
		img.setImageId(_ctx.stringValue("InnerInstanceDetailResponse.data.img.imageId"));
		img.setSrcImageId(_ctx.longValue("InnerInstanceDetailResponse.data.img.srcImageId"));
		img.setGmtCreated(_ctx.stringValue("InnerInstanceDetailResponse.data.img.gmtCreated"));
		img.setId(_ctx.longValue("InnerInstanceDetailResponse.data.img.id"));
		img.setBid(_ctx.stringValue("InnerInstanceDetailResponse.data.img.bid"));
		img.setVisibility(_ctx.stringValue("InnerInstanceDetailResponse.data.img.visibility"));
		img.setRemark(_ctx.stringValue("InnerInstanceDetailResponse.data.img.remark"));
		img.setSupportIoOptimizedInstance(_ctx.booleanValue("InnerInstanceDetailResponse.data.img.supportIoOptimizedInstance"));
		img.setImportOSSObject(_ctx.stringValue("InnerInstanceDetailResponse.data.img.importOSSObject"));
		img.setGmtModified(_ctx.stringValue("InnerInstanceDetailResponse.data.img.gmtModified"));
		img.setProgress(_ctx.stringValue("InnerInstanceDetailResponse.data.img.progress"));
		img.setVersion(_ctx.stringValue("InnerInstanceDetailResponse.data.img.version"));
		img.setImageProductCode(_ctx.stringValue("InnerInstanceDetailResponse.data.img.imageProductCode"));
		img.setAliUid(_ctx.longValue("InnerInstanceDetailResponse.data.img.aliUid"));
		img.setGmtRelease(_ctx.stringValue("InnerInstanceDetailResponse.data.img.gmtRelease"));
		img.setImageCategory(_ctx.stringValue("InnerInstanceDetailResponse.data.img.imageCategory"));
		img.setDisplayName(_ctx.stringValue("InnerInstanceDetailResponse.data.img.displayName"));
		img.setOwner(_ctx.stringValue("InnerInstanceDetailResponse.data.img.owner"));
		img.setStatus(_ctx.stringValue("InnerInstanceDetailResponse.data.img.status"));
		img.setImportOSSBucket(_ctx.stringValue("InnerInstanceDetailResponse.data.img.importOSSBucket"));
		img.setFormat(_ctx.stringValue("InnerInstanceDetailResponse.data.img.format"));
		img.setRegionNo(_ctx.stringValue("InnerInstanceDetailResponse.data.img.regionNo"));
		img.setImageSize(_ctx.integerValue("InnerInstanceDetailResponse.data.img.imageSize"));
		img.setSnapshotNo(_ctx.stringValue("InnerInstanceDetailResponse.data.img.snapshotNo"));

		OsTypeModel osTypeModel = new OsTypeModel();
		osTypeModel.setPlatform(_ctx.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.platform"));
		osTypeModel.setId(_ctx.longValue("InnerInstanceDetailResponse.data.img.osTypeModel.id"));
		osTypeModel.setOsBit(_ctx.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.osBit"));
		osTypeModel.setMinCpu(_ctx.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.minCpu"));
		osTypeModel.setMinMemory(_ctx.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.minMemory"));
		osTypeModel.setMaxCpu(_ctx.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.maxCpu"));
		osTypeModel.setMaxMemory(_ctx.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.maxMemory"));
		osTypeModel.setOsName(_ctx.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.osName"));
		osTypeModel.setOsMemo(_ctx.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.osMemo"));
		osTypeModel.setType(_ctx.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.type"));

		Kind kind = new Kind();
		kind.setKind(_ctx.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.kind.kind"));
		osTypeModel.setKind(kind);
		img.setOsTypeModel(osTypeModel);

		QuoteType quoteType = new QuoteType();
		quoteType.setQuoteType(_ctx.stringValue("InnerInstanceDetailResponse.data.img.quoteType.quoteType"));
		img.setQuoteType(quoteType);

		List<Tag2> tags1 = new ArrayList<Tag2>();
		for (int i = 0; i < _ctx.lengthValue("InnerInstanceDetailResponse.data.img.tags.Length"); i++) {
			Tag2 tag2 = new Tag2();
			tag2.setKey(_ctx.stringValue("InnerInstanceDetailResponse.data.img.tags["+ i +"].key"));
			tag2.setValue(_ctx.stringValue("InnerInstanceDetailResponse.data.img.tags["+ i +"].value"));

			tags1.add(tag2);
		}
		img.setTags1(tags1);
		data.setImg(img);

		StatusNote statusNote = new StatusNote();
		statusNote.setNoteCode(_ctx.stringValue("InnerInstanceDetailResponse.data.statusNote.noteCode"));
		statusNote.setNoteInfo(_ctx.stringValue("InnerInstanceDetailResponse.data.statusNote.noteInfo"));
		data.setStatusNote(statusNote);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("InnerInstanceDetailResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setGroupNo(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupNo"));
			group.setGroupName(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupName"));
			group.setGroupDesc(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupDesc"));
			group.setEcsCount(_ctx.integerValue("InnerInstanceDetailResponse.data.groups["+ i +"].ecsCount"));
			group.setVpcInstanceId(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].vpcInstanceId"));
			group.setGmtCreated(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].gmtCreated"));
			group.setGmtModified(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].gmtModified"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags["+ j +"].key"));
				tag.setValue(_ctx.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			group.setTags(tags);

			groups.add(group);
		}
		data.setGroups(groups);
		innerInstanceDetailResponse.setData(data);
	 
	 	return innerInstanceDetailResponse;
	}
}