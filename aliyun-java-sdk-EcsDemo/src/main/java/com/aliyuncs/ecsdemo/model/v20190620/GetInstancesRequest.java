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
public class GetInstancesRequest extends RpcAcsRequest<GetInstancesResponse> {
	   

	private String authKey;

	private String extraParams;

	private String descriptionEn;

	private String plural;

	private String descriptionCn;

	private String serverClientIp;

	private String namespaceCode;

	private String gmtCreate;

	private String gmtModified;

	private String type;

	private String resourceType;

	private String applicableScene;

	private String tags;

	private String pluralVocabulary;

	private String vocabulary;

	private String vocabularyCn;

	private String requestId;

	private String applicableScope;

	private String uniqueKeyDTO;

	private String clientIp;

	private String identityDTO;

	private String disabled;

	private Long id;

	private String status;
	public GetInstancesRequest() {
		super("EcsDemo", "2019-06-20", "GetInstances");
		setMethod(MethodType.POST);
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

	public String getDescriptionEn() {
		return this.descriptionEn;
	}

	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
		if(descriptionEn != null){
			putQueryParameter("DescriptionEn", descriptionEn);
		}
	}

	public String getPlural() {
		return this.plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
		if(plural != null){
			putQueryParameter("Plural", plural);
		}
	}

	public String getDescriptionCn() {
		return this.descriptionCn;
	}

	public void setDescriptionCn(String descriptionCn) {
		this.descriptionCn = descriptionCn;
		if(descriptionCn != null){
			putQueryParameter("DescriptionCn", descriptionCn);
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

	public String getNamespaceCode() {
		return this.namespaceCode;
	}

	public void setNamespaceCode(String namespaceCode) {
		this.namespaceCode = namespaceCode;
		if(namespaceCode != null){
			putQueryParameter("NamespaceCode", namespaceCode);
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

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putQueryParameter("GmtModified", gmtModified);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getApplicableScene() {
		return this.applicableScene;
	}

	public void setApplicableScene(String applicableScene) {
		this.applicableScene = applicableScene;
		if(applicableScene != null){
			putQueryParameter("ApplicableScene", applicableScene);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	public String getPluralVocabulary() {
		return this.pluralVocabulary;
	}

	public void setPluralVocabulary(String pluralVocabulary) {
		this.pluralVocabulary = pluralVocabulary;
		if(pluralVocabulary != null){
			putQueryParameter("PluralVocabulary", pluralVocabulary);
		}
	}

	public String getVocabulary() {
		return this.vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
		if(vocabulary != null){
			putQueryParameter("Vocabulary", vocabulary);
		}
	}

	public String getVocabularyCn() {
		return this.vocabularyCn;
	}

	public void setVocabularyCn(String vocabularyCn) {
		this.vocabularyCn = vocabularyCn;
		if(vocabularyCn != null){
			putQueryParameter("VocabularyCn", vocabularyCn);
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

	public String getApplicableScope() {
		return this.applicableScope;
	}

	public void setApplicableScope(String applicableScope) {
		this.applicableScope = applicableScope;
		if(applicableScope != null){
			putQueryParameter("ApplicableScope", applicableScope);
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

	public String getDisabled() {
		return this.disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
		if(disabled != null){
			putQueryParameter("Disabled", disabled);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<GetInstancesResponse> getResponseClass() {
		return GetInstancesResponse.class;
	}

}
