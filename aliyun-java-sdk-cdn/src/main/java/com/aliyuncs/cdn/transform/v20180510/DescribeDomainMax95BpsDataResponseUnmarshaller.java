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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainMax95BpsDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainMax95BpsDataResponseUnmarshaller {

	public static DescribeDomainMax95BpsDataResponse unmarshall(DescribeDomainMax95BpsDataResponse describeDomainMax95BpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainMax95BpsDataResponse.setRequestId(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.RequestId"));
		describeDomainMax95BpsDataResponse.setDomainName(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.DomainName"));
		describeDomainMax95BpsDataResponse.setStartTime(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.StartTime"));
		describeDomainMax95BpsDataResponse.setEndTime(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.EndTime"));
		describeDomainMax95BpsDataResponse.setMax95Bps(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.Max95Bps"));
		describeDomainMax95BpsDataResponse.setDomesticMax95Bps(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.DomesticMax95Bps"));
		describeDomainMax95BpsDataResponse.setOverseasMax95Bps(_ctx.stringValue("DescribeDomainMax95BpsDataResponse.OverseasMax95Bps"));
	 
	 	return describeDomainMax95BpsDataResponse;
	}
}