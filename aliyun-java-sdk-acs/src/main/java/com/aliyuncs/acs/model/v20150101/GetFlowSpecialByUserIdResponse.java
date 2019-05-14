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
import com.aliyuncs.acs.transform.v20150101.GetFlowSpecialByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowSpecialByUserIdResponse extends AcsResponse {

	private List<FlowSpecial> flowSpecials;

	public List<FlowSpecial> getFlowSpecials() {
		return this.flowSpecials;
	}

	public void setFlowSpecials(List<FlowSpecial> flowSpecials) {
		this.flowSpecials = flowSpecials;
	}

	public static class FlowSpecial {

		private String name;

		private String product;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBizProduct() {
			return this.product;
		}

		public void setBizProduct(String product) {
			this.product = product;
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
		}
	}

	@Override
	public GetFlowSpecialByUserIdResponse getInstance(UnmarshallerContext context) {
		return	GetFlowSpecialByUserIdResponseUnmarshaller.unmarshall(this, context);
	}
}
