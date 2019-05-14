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

package com.aliyuncs.acs.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.acs.transform.v20150101.GetProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProductResponse extends AcsResponse {

	private String name;

	private String domain;

	private String type;

	private List<Version> versions;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Version> getVersions() {
		return this.versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public static class Version {

		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public GetProductResponse getInstance(UnmarshallerContext context) {
		return	GetProductResponseUnmarshaller.unmarshall(this, context);
	}
}
