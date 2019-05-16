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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeKMSKeyAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKMSKeyAttributeResponse extends AcsResponse {

	private String requestId;

	private String kMSKeyId;

	private String status;

	private Boolean ecsTagged;

	private String creator;

	private String alias;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKMSKeyId() {
		return this.kMSKeyId;
	}

	public void setKMSKeyId(String kMSKeyId) {
		this.kMSKeyId = kMSKeyId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getEcsTagged() {
		return this.ecsTagged;
	}

	public void setEcsTagged(Boolean ecsTagged) {
		this.ecsTagged = ecsTagged;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public DescribeKMSKeyAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeKMSKeyAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
