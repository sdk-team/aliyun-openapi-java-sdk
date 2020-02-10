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

package com.aliyuncs.ft.model.v20190827;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RetryTestDailyDemoRequest extends RoaAcsRequest<RetryTestDailyDemoResponse> {
	   

	private String number;
	public RetryTestDailyDemoRequest() {
		super("Ft", "2019-08-27", "RetryTestDailyDemo");
		setUriPattern("null");
		setMethod(MethodType.POST);
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putBodyParameter("Number", number);
		}
	}

	@Override
	public Class<RetryTestDailyDemoResponse> getResponseClass() {
		return RetryTestDailyDemoResponse.class;
	}

}
