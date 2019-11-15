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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InnerInstanceQueryByParamRequest extends RpcAcsRequest<InnerInstanceQueryByParamResponse> {
	   

	private Integer startOfInternetTx;

	private Long resourceOwnerId;

	private String izNo;

	private String internetIp;

	private String channel;

	private String networkType;

	private Boolean notSyncHouyi;

	private String operator;

	private String hostname;

	private String zoneNo;

	private Integer cores;

	private String vSwitchInstanceId;

	private String proxyId;

	private String order;

	private Integer agentId;

	private String imageType;

	private Integer endOfInternetTx;

	private Long ownerId;

	private String instanceIds;

	private Integer pageNo;

	private Long izId;

	private String status;

	private String intranetIp;

	private Boolean orderType;

	private Long imageId;

	private String vpcInstanceId;

	private Integer mem;

	private String bizStatus;

	private Integer pageSize;

	private Long aliUid;

	private String systemDeviceCategory;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String token;

	private String regionNo;

	private String appKey;

	private String bid;
	public InnerInstanceQueryByParamRequest() {
		super("Ecs", "2016-03-14", "InnerInstanceQueryByParam", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getStartOfInternetTx() {
		return this.startOfInternetTx;
	}

	public void setStartOfInternetTx(Integer startOfInternetTx) {
		this.startOfInternetTx = startOfInternetTx;
		if(startOfInternetTx != null){
			putQueryParameter("startOfInternetTx", startOfInternetTx.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("izNo", izNo);
		}
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
		if(internetIp != null){
			putQueryParameter("internetIp", internetIp);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("networkType", networkType);
		}
	}

	public Boolean getNotSyncHouyi() {
		return this.notSyncHouyi;
	}

	public void setNotSyncHouyi(Boolean notSyncHouyi) {
		this.notSyncHouyi = notSyncHouyi;
		if(notSyncHouyi != null){
			putQueryParameter("notSyncHouyi", notSyncHouyi.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("hostname", hostname);
		}
	}

	public String getZoneNo() {
		return this.zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		if(zoneNo != null){
			putQueryParameter("zoneNo", zoneNo);
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("cores", cores.toString());
		}
	}

	public String getVSwitchInstanceId() {
		return this.vSwitchInstanceId;
	}

	public void setVSwitchInstanceId(String vSwitchInstanceId) {
		this.vSwitchInstanceId = vSwitchInstanceId;
		if(vSwitchInstanceId != null){
			putQueryParameter("vSwitchInstanceId", vSwitchInstanceId);
		}
	}

	public String getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("proxyId", proxyId);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("order", order);
		}
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("agentId", agentId.toString());
		}
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("imageType", imageType);
		}
	}

	public Integer getEndOfInternetTx() {
		return this.endOfInternetTx;
	}

	public void setEndOfInternetTx(Integer endOfInternetTx) {
		this.endOfInternetTx = endOfInternetTx;
		if(endOfInternetTx != null){
			putQueryParameter("endOfInternetTx", endOfInternetTx.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("instanceIds", instanceIds);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("pageNo", pageNo.toString());
		}
	}

	public Long getIzId() {
		return this.izId;
	}

	public void setIzId(Long izId) {
		this.izId = izId;
		if(izId != null){
			putQueryParameter("izId", izId.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
		if(intranetIp != null){
			putQueryParameter("intranetIp", intranetIp);
		}
	}

	public Boolean getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Boolean orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("orderType", orderType.toString());
		}
	}

	public Long getImageId() {
		return this.imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("imageId", imageId.toString());
		}
	}

	public String getVpcInstanceId() {
		return this.vpcInstanceId;
	}

	public void setVpcInstanceId(String vpcInstanceId) {
		this.vpcInstanceId = vpcInstanceId;
		if(vpcInstanceId != null){
			putQueryParameter("vpcInstanceId", vpcInstanceId);
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("mem", mem.toString());
		}
	}

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
		if(bizStatus != null){
			putQueryParameter("bizStatus", bizStatus);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("aliUid", aliUid.toString());
		}
	}

	public String getSystemDeviceCategory() {
		return this.systemDeviceCategory;
	}

	public void setSystemDeviceCategory(String systemDeviceCategory) {
		this.systemDeviceCategory = systemDeviceCategory;
		if(systemDeviceCategory != null){
			putQueryParameter("systemDeviceCategory", systemDeviceCategory);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("regionNo", regionNo);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("appKey", appKey);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("bid", bid);
		}
	}

	@Override
	public Class<InnerInstanceQueryByParamResponse> getResponseClass() {
		return InnerInstanceQueryByParamResponse.class;
	}

}
