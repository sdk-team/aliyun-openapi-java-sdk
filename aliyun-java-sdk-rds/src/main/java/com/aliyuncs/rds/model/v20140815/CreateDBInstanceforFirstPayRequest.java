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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceforFirstPayRequest extends RpcAcsRequest<CreateDBInstanceforFirstPayResponse> {
	
	public CreateDBInstanceforFirstPayRequest() {
		super("Rds", "2014-08-15", "CreateDBInstanceforFirstPay", "rds");
	}

	private Integer dBInstanceStorage;

	private String clientToken;

	private String engineVersion;

	private Long uid;

	private String bidLoginEmail;

	private String engine;

	private String uidLoginEmail;

	private String dBInstanceNetType;

	private String ownerAccount;

	private String dBInstanceRemarks;

	private String dBInstanceClass;

	private String bid;

	private String characterSetName;

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		if(dBInstanceStorage != null){
			putQueryParameter("DBInstanceStorage", dBInstanceStorage.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("uid", uid.toString());
		}
	}

	public String getBidLoginEmail() {
		return this.bidLoginEmail;
	}

	public void setBidLoginEmail(String bidLoginEmail) {
		this.bidLoginEmail = bidLoginEmail;
		if(bidLoginEmail != null){
			putQueryParameter("bidLoginEmail", bidLoginEmail);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getUidLoginEmail() {
		return this.uidLoginEmail;
	}

	public void setUidLoginEmail(String uidLoginEmail) {
		this.uidLoginEmail = uidLoginEmail;
		if(uidLoginEmail != null){
			putQueryParameter("uidLoginEmail", uidLoginEmail);
		}
	}

	public String getDBInstanceNetType() {
		return this.dBInstanceNetType;
	}

	public void setDBInstanceNetType(String dBInstanceNetType) {
		this.dBInstanceNetType = dBInstanceNetType;
		if(dBInstanceNetType != null){
			putQueryParameter("DBInstanceNetType", dBInstanceNetType);
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

	public String getDBInstanceRemarks() {
		return this.dBInstanceRemarks;
	}

	public void setDBInstanceRemarks(String dBInstanceRemarks) {
		this.dBInstanceRemarks = dBInstanceRemarks;
		if(dBInstanceRemarks != null){
			putQueryParameter("DBInstanceRemarks", dBInstanceRemarks);
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
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

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
		if(characterSetName != null){
			putQueryParameter("CharacterSetName", characterSetName);
		}
	}

	@Override
	public Class<CreateDBInstanceforFirstPayResponse> getResponseClass() {
		return CreateDBInstanceforFirstPayResponse.class;
	}

}
