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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsdemo.transform.v20190620.GetTestResource004ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTestResource004Response extends AcsResponse {

	private String requestId;

	private String paramA;

	private String paramB;

	private String paramH;

	private List<Karr> paramY;

	private List<String> paramJ;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getParamA() {
		return this.paramA;
	}

	public void setParamA(String paramA) {
		this.paramA = paramA;
	}

	public String getParamB() {
		return this.paramB;
	}

	public void setParamB(String paramB) {
		this.paramB = paramB;
	}

	public String getParamH() {
		return this.paramH;
	}

	public void setParamH(String paramH) {
		this.paramH = paramH;
	}

	public List<Karr> getParamY() {
		return this.paramY;
	}

	public void setParamY(List<Karr> paramY) {
		this.paramY = paramY;
	}

	public List<String> getParamJ() {
		return this.paramJ;
	}

	public void setParamJ(List<String> paramJ) {
		this.paramJ = paramJ;
	}

	public static class Karr {

		private String yy1;

		public String getYy1() {
			return this.yy1;
		}

		public void setYy1(String yy1) {
			this.yy1 = yy1;
		}
	}

	@Override
	public GetTestResource004Response getInstance(UnmarshallerContext context) {
		return	GetTestResource004ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
