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
import com.aliyuncs.ecsdemo.transform.v20190620.CreateMountInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMountInstancesResponse extends AcsResponse {

	private String requestId;

	private String kiss;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKiss() {
		return this.kiss;
	}

	public void setKiss(String kiss) {
		this.kiss = kiss;
	}

	@Override
	public CreateMountInstancesResponse getInstance(UnmarshallerContext context) {
		return	CreateMountInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
