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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsdemo.transform.v20190620.JxyTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JxyTestResponse extends AcsResponse {

	private String requestId;

	private Long aa;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAa() {
		return this.aa;
	}

	public void setAa(Long aa) {
		this.aa = aa;
	}

	@Override
	public JxyTestResponse getInstance(UnmarshallerContext context) {
		return	JxyTestResponseUnmarshaller.unmarshall(this, context);
	}
}
