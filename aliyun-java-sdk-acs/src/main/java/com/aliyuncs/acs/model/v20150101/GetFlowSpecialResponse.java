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
import com.aliyuncs.acs.transform.v20150101.GetFlowSpecialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowSpecialResponse extends AcsResponse {

	private String product;

	private String name;

	private String description;

	private List<Special> specials;

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Special> getSpecials() {
		return this.specials;
	}

	public void setSpecials(List<Special> specials) {
		this.specials = specials;
	}

	public static class Special {

		private String threshold;

		private Boolean whitelist;

		private List<Section> sections;

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public Boolean getWhitelist() {
			return this.whitelist;
		}

		public void setWhitelist(Boolean whitelist) {
			this.whitelist = whitelist;
		}

		public List<Section> getSections() {
			return this.sections;
		}

		public void setSections(List<Section> sections) {
			this.sections = sections;
		}

		public static class Section {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetFlowSpecialResponse getInstance(UnmarshallerContext context) {
		return	GetFlowSpecialResponseUnmarshaller.unmarshall(this, context);
	}
}
