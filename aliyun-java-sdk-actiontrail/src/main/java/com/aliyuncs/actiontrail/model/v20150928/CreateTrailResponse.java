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
import com.aliyuncs.actiontrail.transform.v20150928.CreateTrailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTrailResponse extends AcsResponse {

	private String name;

	private String ossBucketName;

	private String ossKeyPrefix;

	private String roleName;

	private String param;

	private String result;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
	}

	public String getOssKeyPrefix() {
		return this.ossKeyPrefix;
	}

	public void setOssKeyPrefix(String ossKeyPrefix) {
		this.ossKeyPrefix = ossKeyPrefix;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public CreateTrailResponse getInstance(UnmarshallerContext context) {
		return	CreateTrailResponseUnmarshaller.unmarshall(this, context);
	}
}
