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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceRequest extends RpcAcsRequest<GetInstanceResponse> {
	   

	private String authKey;

	private String extraParams;

	private String jsonResult;

	private String serverClientIp;

	private String method;

	private String pomXml;

	private String version;

	private String jarName;

	private Boolean exportOutput;

	private String genType;

	private String requestId;

	private String service;

	private String clientIp;

	private String identityDTO;

	private Boolean exportInput;

	private List<String> stringss;
	public GetInstanceRequest() {
		super("EcsDemo", "2019-06-20", "GetInstance");
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

	public String getJsonResult() {
		return this.jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
		if(jsonResult != null){
			putQueryParameter("JsonResult", jsonResult);
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

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putQueryParameter("Method", method);
		}
	}

	public String getPomXml() {
		return this.pomXml;
	}

	public void setPomXml(String pomXml) {
		this.pomXml = pomXml;
		if(pomXml != null){
			putQueryParameter("PomXml", pomXml);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getJarName() {
		return this.jarName;
	}

	public void setJarName(String jarName) {
		this.jarName = jarName;
		if(jarName != null){
			putQueryParameter("JarName", jarName);
		}
	}

	public Boolean getExportOutput() {
		return this.exportOutput;
	}

	public void setExportOutput(Boolean exportOutput) {
		this.exportOutput = exportOutput;
		if(exportOutput != null){
			putQueryParameter("ExportOutput", exportOutput.toString());
		}
	}

	public String getGenType() {
		return this.genType;
	}

	public void setGenType(String genType) {
		this.genType = genType;
		if(genType != null){
			putQueryParameter("GenType", genType);
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

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putQueryParameter("Service", service);
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

	public Boolean getExportInput() {
		return this.exportInput;
	}

	public void setExportInput(Boolean exportInput) {
		this.exportInput = exportInput;
		if(exportInput != null){
			putQueryParameter("ExportInput", exportInput.toString());
		}
	}

	public List<String> getStringss() {
		return this.stringss;
	}

	public void setStringss(List<String> stringss) {
		this.stringss = stringss;	
		if (stringss != null) {
			for (int i = 0; i < stringss.size(); i++) {
				putBodyParameter("Strings." + (i + 1) , stringss.get(i));
			}
		}	
	}

	@Override
	public Class<GetInstanceResponse> getResponseClass() {
		return GetInstanceResponse.class;
	}

}
