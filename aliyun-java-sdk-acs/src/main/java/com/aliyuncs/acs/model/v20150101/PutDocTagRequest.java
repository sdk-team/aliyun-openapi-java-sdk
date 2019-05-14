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

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutDocTagRequest extends RoaAcsRequest<PutDocTagResponse> {
	
	public PutDocTagRequest() {
		super("Acs", "2015-01-01", "PutDocTag");
		setUriPattern("/DocTag/[Product]/[TagId]/[Language]");
		setMethod(MethodType.PUT);
	}

	private Integer contentLength;

	private String product;

	private String bodyContent;

	private String tagId;

	private String contentMD5;

	private String contentType;

	private String language;

	private String accept;

	public Integer getContentLength() {
		return this.contentLength;
	}

	public void setContentLength(Integer contentLength) {
		this.contentLength = contentLength;
		if(contentLength != null){
			putHeaderParameter("Content-Length", contentLength.toString());
		}
	}

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
		if(product != null){
			putPathParameter("Product", product);
		}
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
		if(product != null){
			putPathParameter("Product", product);
		}
	}

	public String getBodyContent() {
		return this.bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
		if(bodyContent != null){
			putBodyParameter("BodyContent", bodyContent);
		}
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putPathParameter("TagId", tagId);
		}
	}

	public String getContentMD5() {
		return this.contentMD5;
	}

	public void setContentMD5(String contentMD5) {
		this.contentMD5 = contentMD5;
		if(contentMD5 != null){
			putHeaderParameter("Content-MD5", contentMD5);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putHeaderParameter("Content-Type", contentType);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putPathParameter("Language", language);
		}
	}

	public String getAccept() {
		return this.accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
		if(accept != null){
			putHeaderParameter("Accept", accept);
		}
	}

	@Override
	public Class<PutDocTagResponse> getResponseClass() {
		return PutDocTagResponse.class;
	}

}
