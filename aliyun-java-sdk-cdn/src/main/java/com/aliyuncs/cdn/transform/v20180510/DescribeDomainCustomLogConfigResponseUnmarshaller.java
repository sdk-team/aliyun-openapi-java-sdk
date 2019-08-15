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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainCustomLogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCustomLogConfigResponseUnmarshaller {

	public static DescribeDomainCustomLogConfigResponse unmarshall(DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfigResponse, UnmarshallerContext _ctx) {
		
		describeDomainCustomLogConfigResponse.setRequestId(_ctx.stringValue("DescribeDomainCustomLogConfigResponse.RequestId"));
		describeDomainCustomLogConfigResponse.setConfigId(_ctx.stringValue("DescribeDomainCustomLogConfigResponse.ConfigId"));
		describeDomainCustomLogConfigResponse.setRemark(_ctx.stringValue("DescribeDomainCustomLogConfigResponse.Remark"));
		describeDomainCustomLogConfigResponse.setSample(_ctx.stringValue("DescribeDomainCustomLogConfigResponse.Sample"));
		describeDomainCustomLogConfigResponse.setTag(_ctx.stringValue("DescribeDomainCustomLogConfigResponse.Tag"));
	 
	 	return describeDomainCustomLogConfigResponse;
	}
}