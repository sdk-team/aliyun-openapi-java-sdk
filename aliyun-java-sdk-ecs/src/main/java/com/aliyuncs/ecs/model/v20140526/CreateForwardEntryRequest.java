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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateForwardEntryRequest extends RpcAcsRequest<CreateForwardEntryResponse> {
	   

	private Long resourceOwnerId;

	private String forwardTableId;

	private String internalIp;

	private String externalIp;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private Long ownerId;

	private String internalPort;

	private String externalPort;
	public CreateForwardEntryRequest() {
		super("Ecs", "2014-05-26", "CreateForwardEntry", "ecs");
		setMethod(MethodType.POST);
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

	public String getForwardTableId() {
		return this.forwardTableId;
	}

	public void setForwardTableId(String forwardTableId) {
		this.forwardTableId = forwardTableId;
		if(forwardTableId != null){
			putQueryParameter("ForwardTableId", forwardTableId);
		}
	}

	public String getInternalIp() {
		return this.internalIp;
	}

	public void setInternalIp(String internalIp) {
		this.internalIp = internalIp;
		if(internalIp != null){
			putQueryParameter("InternalIp", internalIp);
		}
	}

	public String getExternalIp() {
		return this.externalIp;
	}

	public void setExternalIp(String externalIp) {
		this.externalIp = externalIp;
		if(externalIp != null){
			putQueryParameter("ExternalIp", externalIp);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getInternalPort() {
		return this.internalPort;
	}

	public void setInternalPort(String internalPort) {
		this.internalPort = internalPort;
		if(internalPort != null){
			putQueryParameter("InternalPort", internalPort);
		}
	}

	public String getExternalPort() {
		return this.externalPort;
	}

	public void setExternalPort(String externalPort) {
		this.externalPort = externalPort;
		if(externalPort != null){
			putQueryParameter("ExternalPort", externalPort);
		}
	}

	@Override
	public Class<CreateForwardEntryResponse> getResponseClass() {
		return CreateForwardEntryResponse.class;
	}

}
