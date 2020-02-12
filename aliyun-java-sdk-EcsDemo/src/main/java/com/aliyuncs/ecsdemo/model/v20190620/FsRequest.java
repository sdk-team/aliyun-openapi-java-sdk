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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FsRequest extends RpcAcsRequest<FsResponse> {
	   

	private String imageId;

	private String clientToken;

	private String internetChargeType;

	private String fucker;
	public FsRequest() {
		super("EcsDemo", "2019-06-20", "Fs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putBodyParameter("ImageId", imageId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putBodyParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getFucker() {
		return this.fucker;
	}

	public void setFucker(String fucker) {
		this.fucker = fucker;
		if(fucker != null){
			putQueryParameter("Fucker", fucker);
		}
	}

	@Override
	public Class<FsResponse> getResponseClass() {
		return FsResponse.class;
	}

}
