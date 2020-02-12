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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteMemoryResouceRequest extends RpcAcsRequest<DeleteMemoryResouceResponse> {
	   

	private String requst_id;
	public DeleteMemoryResouceRequest() {
		super("EcsDemo", "2019-06-20", "DeleteMemoryResouce");
		setMethod(MethodType.POST);
	}

	public String getRequst_id() {
		return this.requst_id;
	}

	public void setRequst_id(String requst_id) {
		this.requst_id = requst_id;
		if(requst_id != null){
			putQueryParameter("requst_id", requst_id);
		}
	}

	@Override
	public Class<DeleteMemoryResouceResponse> getResponseClass() {
		return DeleteMemoryResouceResponse.class;
	}

}
