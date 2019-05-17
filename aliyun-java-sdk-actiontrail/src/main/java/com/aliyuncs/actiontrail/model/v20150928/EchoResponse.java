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

package com.aliyuncs.actiontrail.model.v20150928;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20150928.EchoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EchoResponse extends AcsResponse {

	private String requestId;

	private String param;

	private String result;

	private String param1;

	private String result2;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getParam1() {
		return this.param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getResult2() {
		return this.result2;
	}

	public void setResult2(String result2) {
		this.result2 = result2;
	}

	@Override
	public EchoResponse getInstance(UnmarshallerContext context) {
		return	EchoResponseUnmarshaller.unmarshall(this, context);
	}
}
