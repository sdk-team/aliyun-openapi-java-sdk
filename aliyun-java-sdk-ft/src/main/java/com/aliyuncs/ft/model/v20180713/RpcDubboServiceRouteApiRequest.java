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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RpcDubboServiceRouteApiRequest extends RpcAcsRequest<RpcDubboServiceRouteApiResponse> {
	   

	private String requiredValue;

	private String code;

	private Integer intValue;

	private Boolean proxy_original_security_transport;

	private String resultSwitchValue;

	private String proxy_original_source_ip;

	private String jsonObject;

	private Long sleep;

	private String switchValue;

	private String jsonObjectList;

	private String defaultValue;

	private Integer numberRange;

	private String message;

	private String checkNumberValue;

	private String httpStatusCode;

	private String stringValue;

	private Integer enumValue;

	private String success;

	private String otherParam;
	public RpcDubboServiceRouteApiRequest() {
		super("Ft", "2018-07-13", "RpcDubboServiceRouteApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRequiredValue() {
		return this.requiredValue;
	}

	public void setRequiredValue(String requiredValue) {
		this.requiredValue = requiredValue;
		if(requiredValue != null){
			putQueryParameter("RequiredValue", requiredValue);
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public Integer getIntValue() {
		return this.intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
		if(intValue != null){
			putQueryParameter("IntValue", intValue.toString());
		}
	}

	public Boolean getProxy_original_security_transport() {
		return this.proxy_original_security_transport;
	}

	public void setProxy_original_security_transport(Boolean proxy_original_security_transport) {
		this.proxy_original_security_transport = proxy_original_security_transport;
		if(proxy_original_security_transport != null){
			putQueryParameter("proxy_original_security_transport", proxy_original_security_transport.toString());
		}
	}

	public String getResultSwitchValue() {
		return this.resultSwitchValue;
	}

	public void setResultSwitchValue(String resultSwitchValue) {
		this.resultSwitchValue = resultSwitchValue;
		if(resultSwitchValue != null){
			putQueryParameter("ResultSwitchValue", resultSwitchValue);
		}
	}

	public String getProxy_original_source_ip() {
		return this.proxy_original_source_ip;
	}

	public void setProxy_original_source_ip(String proxy_original_source_ip) {
		this.proxy_original_source_ip = proxy_original_source_ip;
		if(proxy_original_source_ip != null){
			putQueryParameter("proxy_original_source_ip", proxy_original_source_ip);
		}
	}

	public String getJsonObject() {
		return this.jsonObject;
	}

	public void setJsonObject(String jsonObject) {
		this.jsonObject = jsonObject;
		if(jsonObject != null){
			putQueryParameter("JsonObject", jsonObject);
		}
	}

	public Long getSleep() {
		return this.sleep;
	}

	public void setSleep(Long sleep) {
		this.sleep = sleep;
		if(sleep != null){
			putQueryParameter("Sleep", sleep.toString());
		}
	}

	public String getSwitchValue() {
		return this.switchValue;
	}

	public void setSwitchValue(String switchValue) {
		this.switchValue = switchValue;
		if(switchValue != null){
			putQueryParameter("SwitchValue", switchValue);
		}
	}

	public String getJsonObjectList() {
		return this.jsonObjectList;
	}

	public void setJsonObjectList(String jsonObjectList) {
		this.jsonObjectList = jsonObjectList;
		if(jsonObjectList != null){
			putQueryParameter("JsonObjectList", jsonObjectList);
		}
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		if(defaultValue != null){
			putQueryParameter("DefaultValue", defaultValue);
		}
	}

	public Integer getNumberRange() {
		return this.numberRange;
	}

	public void setNumberRange(Integer numberRange) {
		this.numberRange = numberRange;
		if(numberRange != null){
			putQueryParameter("NumberRange", numberRange.toString());
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getCheckNumberValue() {
		return this.checkNumberValue;
	}

	public void setCheckNumberValue(String checkNumberValue) {
		this.checkNumberValue = checkNumberValue;
		if(checkNumberValue != null){
			putQueryParameter("CheckNumberValue", checkNumberValue);
		}
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
		if(httpStatusCode != null){
			putQueryParameter("HttpStatusCode", httpStatusCode);
		}
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
		if(stringValue != null){
			putQueryParameter("StringValue", stringValue);
		}
	}

	public Integer getEnumValue() {
		return this.enumValue;
	}

	public void setEnumValue(Integer enumValue) {
		this.enumValue = enumValue;
		if(enumValue != null){
			putQueryParameter("EnumValue", enumValue.toString());
		}
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success);
		}
	}

	public String getOtherParam() {
		return this.otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
		if(otherParam != null){
			putQueryParameter("OtherParam", otherParam);
		}
	}

	@Override
	public Class<RpcDubboServiceRouteApiResponse> getResponseClass() {
		return RpcDubboServiceRouteApiResponse.class;
	}

}
