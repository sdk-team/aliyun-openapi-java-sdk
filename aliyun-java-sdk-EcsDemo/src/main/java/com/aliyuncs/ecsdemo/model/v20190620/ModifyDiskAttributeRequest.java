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

package com.aliyuncs.ecsdemo.model.v20190620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDiskAttributeRequest extends RpcAcsRequest<ModifyDiskAttributeResponse> {
	   

	private String diskName;

	private Boolean deleteAutoSnapshot;

	private String description;

	private String diskId;

	private Boolean deleteWithInstance;
	public ModifyDiskAttributeRequest() {
		super("EcsDemo", "2019-06-20", "ModifyDiskAttribute");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.PUT);
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putBodyParameter("DiskName", diskName);
		}
	}

	public Boolean getDeleteAutoSnapshot() {
		return this.deleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
		this.deleteAutoSnapshot = deleteAutoSnapshot;
		if(deleteAutoSnapshot != null){
			putBodyParameter("DeleteAutoSnapshot", deleteAutoSnapshot.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putBodyParameter("DiskId", diskId);
		}
	}

	public Boolean getDeleteWithInstance() {
		return this.deleteWithInstance;
	}

	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		this.deleteWithInstance = deleteWithInstance;
		if(deleteWithInstance != null){
			putBodyParameter("DeleteWithInstance", deleteWithInstance.toString());
		}
	}

	@Override
	public Class<ModifyDiskAttributeResponse> getResponseClass() {
		return ModifyDiskAttributeResponse.class;
	}

}
