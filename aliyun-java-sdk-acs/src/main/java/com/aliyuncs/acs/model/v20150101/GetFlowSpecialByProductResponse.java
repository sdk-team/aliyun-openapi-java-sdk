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
import com.aliyuncs.acs.transform.v20150101.GetFlowSpecialByProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowSpecialByProductResponse extends AcsResponse {

	private List<String> flowSpecials;

	public List<String> getFlowSpecials() {
		return this.flowSpecials;
	}

	public void setFlowSpecials(List<String> flowSpecials) {
		this.flowSpecials = flowSpecials;
	}

	@Override
	public GetFlowSpecialByProductResponse getInstance(UnmarshallerContext context) {
		return	GetFlowSpecialByProductResponseUnmarshaller.unmarshall(this, context);
	}
}
