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
import com.aliyuncs.acs.transform.v20150101.GetAccountBindingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountBindingResponse extends AcsResponse {

	private List<AccountBinding> accountBindings;

	public List<AccountBinding> getAccountBindings() {
		return this.accountBindings;
	}

	public void setAccountBindings(List<AccountBinding> accountBindings) {
		this.accountBindings = accountBindings;
	}

	public static class AccountBinding {

		private String aliyunUid;

		private String bucEmpId;

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getBucEmpId() {
			return this.bucEmpId;
		}

		public void setBucEmpId(String bucEmpId) {
			this.bucEmpId = bucEmpId;
		}
	}

	@Override
	public GetAccountBindingResponse getInstance(UnmarshallerContext context) {
		return	GetAccountBindingResponseUnmarshaller.unmarshall(this, context);
	}
}
