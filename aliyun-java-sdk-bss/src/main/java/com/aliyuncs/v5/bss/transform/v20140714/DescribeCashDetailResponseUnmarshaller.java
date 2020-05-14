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

package com.aliyuncs.v5.bss.transform.v20140714;

import com.aliyuncs.v5.bss.model.v20140714.DescribeCashDetailResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeCashDetailResponseUnmarshaller {

	public static DescribeCashDetailResponse unmarshall(DescribeCashDetailResponse describeCashDetailResponse, UnmarshallerContext _ctx) {
		
		describeCashDetailResponse.setRequestId(_ctx.stringValue("DescribeCashDetailResponse.RequestId"));
		describeCashDetailResponse.setBalanceAmount(_ctx.stringValue("DescribeCashDetailResponse.BalanceAmount"));
		describeCashDetailResponse.setAmountOwed(_ctx.stringValue("DescribeCashDetailResponse.AmountOwed"));
		describeCashDetailResponse.setEnableThresholdAlert(_ctx.stringValue("DescribeCashDetailResponse.EnableThresholdAlert"));
		describeCashDetailResponse.setMiniAlertThreshold(_ctx.longValue("DescribeCashDetailResponse.MiniAlertThreshold"));
		describeCashDetailResponse.setFrozenAmount(_ctx.stringValue("DescribeCashDetailResponse.FrozenAmount"));
		describeCashDetailResponse.setCreditCardAmount(_ctx.stringValue("DescribeCashDetailResponse.CreditCardAmount"));
		describeCashDetailResponse.setRemmitanceAmount(_ctx.stringValue("DescribeCashDetailResponse.RemmitanceAmount"));
		describeCashDetailResponse.setCreditLimit(_ctx.stringValue("DescribeCashDetailResponse.CreditLimit"));
		describeCashDetailResponse.setAvailableCredit(_ctx.stringValue("DescribeCashDetailResponse.AvailableCredit"));
	 
	 	return describeCashDetailResponse;
	}
}