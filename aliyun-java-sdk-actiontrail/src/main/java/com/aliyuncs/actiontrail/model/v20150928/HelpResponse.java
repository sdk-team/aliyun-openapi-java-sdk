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
import com.aliyuncs.actiontrail.transform.v20150928.HelpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HelpResponse extends AcsResponse {

	private String action;

	private String param;

	private String result;

	public String getBizAction() {
		return this.action;
	}

	public void setBizAction(String action) {
		this.action = action;
	}

	/**
	 * @deprecated use getBizAction instead of this.
	 */
	@Deprecated
	public String getAction() {
		return this.action;
	}

	/**
	 * @deprecated use setBizAction instead of this.
	 */
	@Deprecated
	public void setAction(String action) {
		this.action = action;
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

	@Override
	public HelpResponse getInstance(UnmarshallerContext context) {
		return	HelpResponseUnmarshaller.unmarshall(this, context);
	}
}
