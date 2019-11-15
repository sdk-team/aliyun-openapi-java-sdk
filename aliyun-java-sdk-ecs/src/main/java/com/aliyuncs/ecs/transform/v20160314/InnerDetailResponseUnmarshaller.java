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

import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Group;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Group.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Img;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Img.OsTypeModel;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Img.OsTypeModel.Kind;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Img.QuoteType;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.Img.Tag2;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.PublicIp;
import com.aliyuncs.ecs.model.v20160314.InnerDetailResponse.InstanceModel.StatusNote;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDetailResponseUnmarshaller {

	public static InnerDetailResponse unmarshall(InnerDetailResponse innerDetailResponse, UnmarshallerContext _ctx) {
		
		innerDetailResponse.setRequestId(_ctx.stringValue("InnerDetailResponse.RequestId"));

		InstanceModel instanceModel = new InstanceModel();
		instanceModel.setSystemDeviceCategory(_ctx.stringValue("InnerDetailResponse.InstanceModel.SystemDeviceCategory"));
		instanceModel.setVncHost(_ctx.stringValue("InnerDetailResponse.InstanceModel.VncHost"));
		instanceModel.setIntensiveNet(_ctx.integerValue("InnerDetailResponse.InstanceModel.IntensiveNet"));
		instanceModel.setSafetyQuota(_ctx.stringValue("InnerDetailResponse.InstanceModel.SafetyQuota"));
		instanceModel.setVncPort(_ctx.integerValue("InnerDetailResponse.InstanceModel.VncPort"));
		instanceModel.setZoneNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.ZoneNo"));
		instanceModel.setInstanceName(_ctx.stringValue("InnerDetailResponse.InstanceModel.InstanceName"));
		instanceModel.setRegionNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.RegionNo"));
		instanceModel.setHostname(_ctx.stringValue("InnerDetailResponse.InstanceModel.Hostname"));
		instanceModel.setNetworkValidation(_ctx.booleanValue("InnerDetailResponse.InstanceModel.NetworkValidation"));
		instanceModel.setInternetTx(_ctx.integerValue("InnerDetailResponse.InstanceModel.InternetTx"));
		instanceModel.setInternetRx(_ctx.integerValue("InnerDetailResponse.InstanceModel.InternetRx"));
		instanceModel.setPlatform(_ctx.stringValue("InnerDetailResponse.InstanceModel.Platform"));
		instanceModel.setVlanNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.VlanNo"));
		instanceModel.setStatus(_ctx.stringValue("InnerDetailResponse.InstanceModel.Status"));
		instanceModel.setCreationTime(_ctx.stringValue("InnerDetailResponse.InstanceModel.CreationTime"));
		instanceModel.setMem(_ctx.integerValue("InnerDetailResponse.InstanceModel.Mem"));
		instanceModel.setIntensiveIo(_ctx.integerValue("InnerDetailResponse.InstanceModel.IntensiveIo"));
		instanceModel.setNcId(_ctx.stringValue("InnerDetailResponse.InstanceModel.NcId"));
		instanceModel.setBps(_ctx.integerValue("InnerDetailResponse.InstanceModel.Bps"));
		instanceModel.setVncPassword(_ctx.stringValue("InnerDetailResponse.InstanceModel.VncPassword"));
		instanceModel.setEcsName(_ctx.stringValue("InnerDetailResponse.InstanceModel.EcsName"));
		instanceModel.setInnerIp(_ctx.stringValue("InnerDetailResponse.InstanceModel.InnerIp"));
		instanceModel.setRealZoneNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.RealZoneNo"));
		instanceModel.setSerialNumber(_ctx.stringValue("InnerDetailResponse.InstanceModel.SerialNumber"));
		instanceModel.setIzNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.IzNo"));
		instanceModel.setCores(_ctx.integerValue("InnerDetailResponse.InstanceModel.Cores"));
		instanceModel.setIntranetTx(_ctx.integerValue("InnerDetailResponse.InstanceModel.IntranetTx"));
		instanceModel.setIntensiveCpu(_ctx.integerValue("InnerDetailResponse.InstanceModel.IntensiveCpu"));
		instanceModel.setImageProductCode(_ctx.stringValue("InnerDetailResponse.InstanceModel.ImageProductCode"));
		instanceModel.setIntranetRx(_ctx.integerValue("InnerDetailResponse.InstanceModel.IntranetRx"));
		instanceModel.setSecurityControl(_ctx.stringValue("InnerDetailResponse.InstanceModel.SecurityControl"));
		instanceModel.setRackId(_ctx.stringValue("InnerDetailResponse.InstanceModel.RackId"));
		instanceModel.setDisk(_ctx.integerValue("InnerDetailResponse.InstanceModel.Disk"));

		PublicIp publicIp = new PublicIp();
		publicIp.setBindIp(_ctx.stringValue("InnerDetailResponse.InstanceModel.PublicIp.BindIp"));
		publicIp.setAssignNatIp(_ctx.stringValue("InnerDetailResponse.InstanceModel.PublicIp.AssignNatIp"));
		publicIp.setAssignIp(_ctx.stringValue("InnerDetailResponse.InstanceModel.PublicIp.AssignIp"));
		instanceModel.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Name"));
		img.setImageId(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.ImageId"));
		img.setSrcImageId(_ctx.longValue("InnerDetailResponse.InstanceModel.Img.SrcImageId"));
		img.setGmtCreated(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.GmtCreated"));
		img.setId(_ctx.longValue("InnerDetailResponse.InstanceModel.Img.Id"));
		img.setBid(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Bid"));
		img.setVisibility(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Visibility"));
		img.setRemark(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Remark"));
		img.setSupportIoOptimizedInstance(_ctx.booleanValue("InnerDetailResponse.InstanceModel.Img.SupportIoOptimizedInstance"));
		img.setImportOSSObject(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.ImportOSSObject"));
		img.setGmtModified(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.GmtModified"));
		img.setProgress(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Progress"));
		img.setVersion(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Version"));
		img.setImageProductCode(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.ImageProductCode"));
		img.setAliUid(_ctx.longValue("InnerDetailResponse.InstanceModel.Img.AliUid"));
		img.setGmtRelease(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.GmtRelease"));
		img.setImageCategory(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.ImageCategory"));
		img.setDisplayName(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.DisplayName"));
		img.setOwner(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Owner"));
		img.setStatus(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Status"));
		img.setImportOSSBucket(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.ImportOSSBucket"));
		img.setFormat(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Format"));
		img.setRegionNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.RegionNo"));
		img.setImageSize(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.ImageSize"));
		img.setSnapshotNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.SnapshotNo"));

		OsTypeModel osTypeModel = new OsTypeModel();
		osTypeModel.setPlatform(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.Platform"));
		osTypeModel.setId(_ctx.longValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.Id"));
		osTypeModel.setOsBit(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.OsBit"));
		osTypeModel.setMinCpu(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.MinCpu"));
		osTypeModel.setMinMemory(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.MinMemory"));
		osTypeModel.setMaxCpu(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.MaxCpu"));
		osTypeModel.setMaxMemory(_ctx.integerValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.MaxMemory"));
		osTypeModel.setOsName(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.OsName"));
		osTypeModel.setOsMemo(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.OsMemo"));
		osTypeModel.setType(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.Type"));

		Kind kind = new Kind();
		kind.setKind(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.OsTypeModel.Kind.Kind"));
		osTypeModel.setKind(kind);
		img.setOsTypeModel(osTypeModel);

		QuoteType quoteType = new QuoteType();
		quoteType.setQuoteType(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.QuoteType.QuoteType"));
		img.setQuoteType(quoteType);

		List<Tag2> tags1 = new ArrayList<Tag2>();
		for (int i = 0; i < _ctx.lengthValue("InnerDetailResponse.InstanceModel.Img.Tags.Length"); i++) {
			Tag2 tag2 = new Tag2();
			tag2.setKey(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Tags["+ i +"].Key"));
			tag2.setValue(_ctx.stringValue("InnerDetailResponse.InstanceModel.Img.Tags["+ i +"].Value"));

			tags1.add(tag2);
		}
		img.setTags1(tags1);
		instanceModel.setImg(img);

		StatusNote statusNote = new StatusNote();
		statusNote.setNoteCode(_ctx.stringValue("InnerDetailResponse.InstanceModel.StatusNote.NoteCode"));
		statusNote.setNoteInfo(_ctx.stringValue("InnerDetailResponse.InstanceModel.StatusNote.NoteInfo"));
		instanceModel.setStatusNote(statusNote);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("InnerDetailResponse.InstanceModel.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupNo(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].GroupNo"));
			group.setGroupName(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].GroupName"));
			group.setGroupDesc(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].GroupDesc"));
			group.setEcsCount(_ctx.integerValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].EcsCount"));
			group.setVpcInstanceId(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].VpcInstanceId"));
			group.setGmtCreated(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].GmtCreated"));
			group.setGmtModified(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].GmtModified"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("InnerDetailResponse.InstanceModel.Groups["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			group.setTags(tags);

			groups.add(group);
		}
		instanceModel.setGroups(groups);
		innerDetailResponse.setInstanceModel(instanceModel);
	 
	 	return innerDetailResponse;
	}
}