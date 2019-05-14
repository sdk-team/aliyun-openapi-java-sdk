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
import com.aliyuncs.acs.transform.v20150101.GetFlowSpecialAPIResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowSpecialAPIResponse extends AcsResponse {

	private String product;

	private String name;

	private List<Api> apis;

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
	}

	/**
	 * @deprecated use getBizProduct instead of this.
	 */
	@Deprecated
	public String getProduct() {
		return this.product;
	}

	/**
	 * @deprecated use setBizProduct instead of this.
	 */
	@Deprecated
	public void setProduct(String product) {
		this.product = product;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Api> getApis() {
		return this.apis;
	}

	public void setApis(List<Api> apis) {
		this.apis = apis;
	}

	public static class Api {

		private String name;

		private String product;

		private String version;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBizProduct() {
			return this.product;
		}

		public void setBizProduct(String product) {
			this.product = product;
		}

		/**
		 * @deprecated use getBizProduct instead of this.
		 */
		@Deprecated
		public String getProduct() {
			return this.product;
		}

		/**
		 * @deprecated use setBizProduct instead of this.
		 */
		@Deprecated
		public void setProduct(String product) {
			this.product = product;
		}

		public String getBizVersion() {
			return this.version;
		}

		public void setBizVersion(String version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public String getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public GetFlowSpecialAPIResponse getInstance(UnmarshallerContext context) {
		return	GetFlowSpecialAPIResponseUnmarshaller.unmarshall(this, context);
	}
}
