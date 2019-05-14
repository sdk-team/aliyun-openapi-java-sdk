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
import com.aliyuncs.acs.transform.v20150101.GetProductDocumentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProductDocumentResponse extends AcsResponse {

	private String product;

	private String title;

	private String language;

	private String site;

	private Boolean useRam;

	private Boolean ramDescription;

	private String description;

	private List<DomainDoc> domainDocList;

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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Boolean getUseRam() {
		return this.useRam;
	}

	public void setUseRam(Boolean useRam) {
		this.useRam = useRam;
	}

	public Boolean getRamDescription() {
		return this.ramDescription;
	}

	public void setRamDescription(Boolean ramDescription) {
		this.ramDescription = ramDescription;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<DomainDoc> getDomainDocList() {
		return this.domainDocList;
	}

	public void setDomainDocList(List<DomainDoc> domainDocList) {
		this.domainDocList = domainDocList;
	}

	public static class DomainDoc {

		private String domain;

		private String tagName;

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

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}
	}

	@Override
	public GetProductDocumentResponse getInstance(UnmarshallerContext context) {
		return	GetProductDocumentResponseUnmarshaller.unmarshall(this, context);
	}
}
