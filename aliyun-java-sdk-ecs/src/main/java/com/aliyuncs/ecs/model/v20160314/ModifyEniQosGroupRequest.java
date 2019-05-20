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

/**
 * @author auto create
 * @version 
 */
public class ModifyEniQosGroupRequest extends RpcAcsRequest<ModifyEniQosGroupResponse> {
	
	public ModifyEniQosGroupRequest() {
		super("Ecs", "2016-03-14", "ModifyEniQosGroup", "ecs");
	}

	private Long resourceOwnerId;

	private Integer tx;

	private Integer rx;

	private Integer rxPps;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String qosGroupName;

	private Integer txPps;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getTx() {
		return this.tx;
	}

	public void setTx(Integer tx) {
		this.tx = tx;
		if(tx != null){
			putQueryParameter("Tx", tx.toString());
		}
	}

	public Integer getRx() {
		return this.rx;
	}

	public void setRx(Integer rx) {
		this.rx = rx;
		if(rx != null){
			putQueryParameter("Rx", rx.toString());
		}
	}

	public Integer getRxPps() {
		return this.rxPps;
	}

	public void setRxPps(Integer rxPps) {
		this.rxPps = rxPps;
		if(rxPps != null){
			putQueryParameter("RxPps", rxPps.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getQosGroupName() {
		return this.qosGroupName;
	}

	public void setQosGroupName(String qosGroupName) {
		this.qosGroupName = qosGroupName;
		if(qosGroupName != null){
			putQueryParameter("QosGroupName", qosGroupName);
		}
	}

	public Integer getTxPps() {
		return this.txPps;
	}

	public void setTxPps(Integer txPps) {
		this.txPps = txPps;
		if(txPps != null){
			putQueryParameter("TxPps", txPps.toString());
		}
	}

	@Override
	public Class<ModifyEniQosGroupResponse> getResponseClass() {
		return ModifyEniQosGroupResponse.class;
	}

}
