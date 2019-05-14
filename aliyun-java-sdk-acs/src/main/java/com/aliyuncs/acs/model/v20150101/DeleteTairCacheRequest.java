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
public class DeleteTairCacheRequest extends RoaAcsRequest<DeleteTairCacheResponse> {
	
	public DeleteTairCacheRequest() {
		super("Acs", "2015-01-01", "DeleteTairCache");
		setUriPattern("/TairCache");
		setMethod(MethodType.DELETE);
	}

	private String xacscachekey;

	private String accept;

	public String getXacscachekey() {
		return this.xacscachekey;
	}

	public void setXacscachekey(String xacscachekey) {
		this.xacscachekey = xacscachekey;
		if(xacscachekey != null){
			putHeaderParameter("x-acs-cache-key", xacscachekey);
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
	public Class<DeleteTairCacheResponse> getResponseClass() {
		return DeleteTairCacheResponse.class;
	}

}
