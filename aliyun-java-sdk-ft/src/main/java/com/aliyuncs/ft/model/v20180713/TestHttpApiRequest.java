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

/**
 * @author auto create
 * @version 
 */
public class TestHttpApiRequest extends RpcAcsRequest<TestHttpApiResponse> {
	   

	private String ispSignatureSecretKey;

	private String stringValue;

	private String otherParam;

	private Boolean booleanParam;

	private String defaultValue;

	private String ispSignature;
	public TestHttpApiRequest() {
		super("Ft", "2018-07-13", "TestHttpApi");
		setMethod(MethodType.POST);
	}

	public String getIspSignatureSecretKey() {
		return this.ispSignatureSecretKey;
	}

	public void setIspSignatureSecretKey(String ispSignatureSecretKey) {
		this.ispSignatureSecretKey = ispSignatureSecretKey;
		if(ispSignatureSecretKey != null){
			putQueryParameter("IspSignatureSecretKey", ispSignatureSecretKey);
		}
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
		if(stringValue != null){
			putBodyParameter("StringValue", stringValue);
		}
	}

	public String getOtherParam() {
		return this.otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
		if(otherParam != null){
			putBodyParameter("OtherParam", otherParam);
		}
	}

	public Boolean getBooleanParam() {
		return this.booleanParam;
	}

	public void setBooleanParam(Boolean booleanParam) {
		this.booleanParam = booleanParam;
		if(booleanParam != null){
			putQueryParameter("BooleanParam", booleanParam.toString());
		}
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		if(defaultValue != null){
			putBodyParameter("DefaultValue", defaultValue);
		}
	}

	public String getIspSignature() {
		return this.ispSignature;
	}

	public void setIspSignature(String ispSignature) {
		this.ispSignature = ispSignature;
		if(ispSignature != null){
			putQueryParameter("IspSignature", ispSignature);
		}
	}

	@Override
	public Class<TestHttpApiResponse> getResponseClass() {
		return TestHttpApiResponse.class;
	}

}
