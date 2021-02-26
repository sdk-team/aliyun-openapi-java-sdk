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

package com.aliyuncs.ft.model.v20180713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.FtIpFlowControlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FtIpFlowControlResponse extends AcsResponse {

	private String requestId;

	private List<String> names;

	private List<String> names01;

	private List<Integer> integerList;

	private List<Integer> integerList1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNames01() {
		return this.names01;
	}

	public void setNames01(List<String> names01) {
		this.names01 = names01;
	}

	public List<Integer> getIntegerList() {
		return this.integerList;
	}

	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}

	public List<Integer> getIntegerList1() {
		return this.integerList1;
	}

	public void setIntegerList1(List<Integer> integerList1) {
		this.integerList1 = integerList1;
	}

	@Override
	public FtIpFlowControlResponse getInstance(UnmarshallerContext context) {
		return	FtIpFlowControlResponseUnmarshaller.unmarshall(this, context);
	}
}
