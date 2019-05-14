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
public class PutPolicyRequest extends RoaAcsRequest<PutPolicyResponse> {
	
	public PutPolicyRequest() {
		super("Acs", "2015-01-01", "PutPolicy");
		setUriPattern("/Policy");
		setMethod(MethodType.PUT);
	}

	private Integer contentLength;

	private String bodyContent;

	private String contentMD5;

	private String contentType;

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

	public String getBodyContent() {
		return this.bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
		if(bodyContent != null){
			putBodyParameter("BodyContent", bodyContent);
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
	public Class<PutPolicyResponse> getResponseClass() {
		return PutPolicyResponse.class;
	}

}
