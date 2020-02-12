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
public class GetTestResource004Request extends RpcAcsRequest<GetTestResource004Response> {
	   

	private Boolean paramG;

	private String paramE;

	private Long paramF;

	private Integer paramC;

	private Float paramD;

	private String paramA;

	private String paramB;
	public GetTestResource004Request() {
		super("EcsDemo", "2019-06-20", "GetTestResource004");
		setMethod(MethodType.POST);
	}

	public Boolean getParamG() {
		return this.paramG;
	}

	public void setParamG(Boolean paramG) {
		this.paramG = paramG;
		if(paramG != null){
			putQueryParameter("ParamG", paramG.toString());
		}
	}

	public String getParamE() {
		return this.paramE;
	}

	public void setParamE(String paramE) {
		this.paramE = paramE;
		if(paramE != null){
			putQueryParameter("ParamE", paramE);
		}
	}

	public Long getParamF() {
		return this.paramF;
	}

	public void setParamF(Long paramF) {
		this.paramF = paramF;
		if(paramF != null){
			putQueryParameter("ParamF", paramF.toString());
		}
	}

	public Integer getParamC() {
		return this.paramC;
	}

	public void setParamC(Integer paramC) {
		this.paramC = paramC;
		if(paramC != null){
			putQueryParameter("ParamC", paramC.toString());
		}
	}

	public Float getParamD() {
		return this.paramD;
	}

	public void setParamD(Float paramD) {
		this.paramD = paramD;
		if(paramD != null){
			putQueryParameter("ParamD", paramD.toString());
		}
	}

	public String getParamA() {
		return this.paramA;
	}

	public void setParamA(String paramA) {
		this.paramA = paramA;
		if(paramA != null){
			putQueryParameter("ParamA", paramA);
		}
	}

	public String getParamB() {
		return this.paramB;
	}

	public void setParamB(String paramB) {
		this.paramB = paramB;
		if(paramB != null){
			putQueryParameter("ParamB", paramB);
		}
	}

	@Override
	public Class<GetTestResource004Response> getResponseClass() {
		return GetTestResource004Response.class;
	}

}
