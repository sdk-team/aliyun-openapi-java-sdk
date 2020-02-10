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

package com.aliyuncs.ecsdemo.model.v20190626;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AasdasdRequest extends RoaAcsRequest<AasdasdResponse> {
	   

	private String r;
	public AasdasdRequest() {
		super("EcsDemo", "2019-06-26", "Aasdasd");
		setUriPattern("/clusters/[ClusterId]/attach11");
		setMethod(MethodType.PUT);
	}

	public String getR() {
		return this.r;
	}

	public void setR(String r) {
		this.r = r;
		if(r != null){
			putPathParameter("R", r);
		}
	}

	@Override
	public Class<AasdasdResponse> getResponseClass() {
		return AasdasdResponse.class;
	}

}
