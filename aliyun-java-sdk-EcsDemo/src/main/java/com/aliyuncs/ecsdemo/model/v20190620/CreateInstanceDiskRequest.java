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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceDiskRequest extends RpcAcsRequest<CreateInstanceDiskResponse> {
	   

	private String authKey;

	private String extraParams;

	private String serverClientIp;

	private String tagKeySet;

	private String changeStatusList;

	private String type;

	private Integer pageNum;

	private Boolean orderByModifiedTime;

	private Boolean prefixSearch;

	private String requestId;

	private String uniqueKeyDTO;

	private String clientIp;

	private String identityDTO;

	private Integer pageSize;

	private String idList;

	private Long id;

	private Long projectId;
	public CreateInstanceDiskRequest() {
		super("EcsDemo", "2019-06-20", "CreateInstanceDisk");
		setMethod(MethodType.PUT);
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getServerClientIp() {
		return this.serverClientIp;
	}

	public void setServerClientIp(String serverClientIp) {
		this.serverClientIp = serverClientIp;
		if(serverClientIp != null){
			putQueryParameter("ServerClientIp", serverClientIp);
		}
	}

	public String getTagKeySet() {
		return this.tagKeySet;
	}

	public void setTagKeySet(String tagKeySet) {
		this.tagKeySet = tagKeySet;
		if(tagKeySet != null){
			putBodyParameter("TagKeySet", tagKeySet);
		}
	}

	public String getChangeStatusList() {
		return this.changeStatusList;
	}

	public void setChangeStatusList(String changeStatusList) {
		this.changeStatusList = changeStatusList;
		if(changeStatusList != null){
			putBodyParameter("ChangeStatusList", changeStatusList);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Boolean getOrderByModifiedTime() {
		return this.orderByModifiedTime;
	}

	public void setOrderByModifiedTime(Boolean orderByModifiedTime) {
		this.orderByModifiedTime = orderByModifiedTime;
		if(orderByModifiedTime != null){
			putQueryParameter("OrderByModifiedTime", orderByModifiedTime.toString());
		}
	}

	public Boolean getPrefixSearch() {
		return this.prefixSearch;
	}

	public void setPrefixSearch(Boolean prefixSearch) {
		this.prefixSearch = prefixSearch;
		if(prefixSearch != null){
			putQueryParameter("PrefixSearch", prefixSearch.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getUniqueKeyDTO() {
		return this.uniqueKeyDTO;
	}

	public void setUniqueKeyDTO(String uniqueKeyDTO) {
		this.uniqueKeyDTO = uniqueKeyDTO;
		if(uniqueKeyDTO != null){
			putBodyParameter("UniqueKeyDTO", uniqueKeyDTO);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public String getIdentityDTO() {
		return this.identityDTO;
	}

	public void setIdentityDTO(String identityDTO) {
		this.identityDTO = identityDTO;
		if(identityDTO != null){
			putBodyParameter("IdentityDTO", identityDTO);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getIdList() {
		return this.idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
		if(idList != null){
			putBodyParameter("IdList", idList);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<CreateInstanceDiskResponse> getResponseClass() {
		return CreateInstanceDiskResponse.class;
	}

}
