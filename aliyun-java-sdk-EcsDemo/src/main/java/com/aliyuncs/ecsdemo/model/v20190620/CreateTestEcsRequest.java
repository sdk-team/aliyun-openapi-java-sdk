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
public class CreateTestEcsRequest extends RpcAcsRequest<CreateTestEcsResponse> {
	   

	private String dailyTime;

	private String namespaceName;

	private String authKey;

	private String extraParams;

	private String changeFreeStatus;

	private String serverClientIp;

	private String onlineTime;

	private String closeTime;

	private String gmtModified;

	private String relationPeople;

	private Long namespaceId;

	private String clientIp;

	private Long id;

	private String projectStatusStr;

	private String createPeopleName;

	private String marketStr;

	private String createPeopleBucId;

	private String projectName;

	private String planEndTime;

	private String createPeopleId;

	private String projectDesc;

	private String changeFreeOrderId;

	private String gmtCreate;

	private Integer market;

	private String requestId;

	private String preTime;

	private String identityDTO;

	private String planStartTime;

	private Long projectStatus;

	private String properties;
	public CreateTestEcsRequest() {
		super("EcsDemo", "2019-06-20", "CreateTestEcs");
		setMethod(MethodType.POST);
	}

	public String getDailyTime() {
		return this.dailyTime;
	}

	public void setDailyTime(String dailyTime) {
		this.dailyTime = dailyTime;
		if(dailyTime != null){
			putQueryParameter("DailyTime", dailyTime);
		}
	}

	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
		if(namespaceName != null){
			putQueryParameter("NamespaceName", namespaceName);
		}
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

	public String getChangeFreeStatus() {
		return this.changeFreeStatus;
	}

	public void setChangeFreeStatus(String changeFreeStatus) {
		this.changeFreeStatus = changeFreeStatus;
		if(changeFreeStatus != null){
			putQueryParameter("ChangeFreeStatus", changeFreeStatus);
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

	public String getOnlineTime() {
		return this.onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
		if(onlineTime != null){
			putQueryParameter("OnlineTime", onlineTime);
		}
	}

	public String getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
		if(closeTime != null){
			putQueryParameter("CloseTime", closeTime);
		}
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putQueryParameter("GmtModified", gmtModified);
		}
	}

	public String getRelationPeople() {
		return this.relationPeople;
	}

	public void setRelationPeople(String relationPeople) {
		this.relationPeople = relationPeople;
		if(relationPeople != null){
			putQueryParameter("RelationPeople", relationPeople);
		}
	}

	public Long getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(Long namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId.toString());
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getProjectStatusStr() {
		return this.projectStatusStr;
	}

	public void setProjectStatusStr(String projectStatusStr) {
		this.projectStatusStr = projectStatusStr;
		if(projectStatusStr != null){
			putQueryParameter("ProjectStatusStr", projectStatusStr);
		}
	}

	public String getCreatePeopleName() {
		return this.createPeopleName;
	}

	public void setCreatePeopleName(String createPeopleName) {
		this.createPeopleName = createPeopleName;
		if(createPeopleName != null){
			putQueryParameter("CreatePeopleName", createPeopleName);
		}
	}

	public String getMarketStr() {
		return this.marketStr;
	}

	public void setMarketStr(String marketStr) {
		this.marketStr = marketStr;
		if(marketStr != null){
			putQueryParameter("MarketStr", marketStr);
		}
	}

	public String getCreatePeopleBucId() {
		return this.createPeopleBucId;
	}

	public void setCreatePeopleBucId(String createPeopleBucId) {
		this.createPeopleBucId = createPeopleBucId;
		if(createPeopleBucId != null){
			putQueryParameter("CreatePeopleBucId", createPeopleBucId);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getPlanEndTime() {
		return this.planEndTime;
	}

	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
		if(planEndTime != null){
			putQueryParameter("PlanEndTime", planEndTime);
		}
	}

	public String getCreatePeopleId() {
		return this.createPeopleId;
	}

	public void setCreatePeopleId(String createPeopleId) {
		this.createPeopleId = createPeopleId;
		if(createPeopleId != null){
			putQueryParameter("CreatePeopleId", createPeopleId);
		}
	}

	public String getProjectDesc() {
		return this.projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
		if(projectDesc != null){
			putQueryParameter("ProjectDesc", projectDesc);
		}
	}

	public String getChangeFreeOrderId() {
		return this.changeFreeOrderId;
	}

	public void setChangeFreeOrderId(String changeFreeOrderId) {
		this.changeFreeOrderId = changeFreeOrderId;
		if(changeFreeOrderId != null){
			putQueryParameter("ChangeFreeOrderId", changeFreeOrderId);
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putQueryParameter("GmtCreate", gmtCreate);
		}
	}

	public Integer getMarket() {
		return this.market;
	}

	public void setMarket(Integer market) {
		this.market = market;
		if(market != null){
			putQueryParameter("Market", market.toString());
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

	public String getPreTime() {
		return this.preTime;
	}

	public void setPreTime(String preTime) {
		this.preTime = preTime;
		if(preTime != null){
			putQueryParameter("PreTime", preTime);
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

	public String getPlanStartTime() {
		return this.planStartTime;
	}

	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
		if(planStartTime != null){
			putQueryParameter("PlanStartTime", planStartTime);
		}
	}

	public Long getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(Long projectStatus) {
		this.projectStatus = projectStatus;
		if(projectStatus != null){
			putQueryParameter("ProjectStatus", projectStatus.toString());
		}
	}

	public String getProperties() {
		return this.properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
		if(properties != null){
			putQueryParameter("Properties", properties);
		}
	}

	@Override
	public Class<CreateTestEcsResponse> getResponseClass() {
		return CreateTestEcsResponse.class;
	}

}
