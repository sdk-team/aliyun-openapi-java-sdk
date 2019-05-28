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

package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun.model.v20150416.DeleteCNameWafResponse;
import com.aliyuncs.yundun.model.v20150416.DeleteCNameWafResponse.WafInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCNameWafResponseUnmarshaller {

	public static DeleteCNameWafResponse unmarshall(DeleteCNameWafResponse deleteCNameWafResponse, UnmarshallerContext context) {
		
		deleteCNameWafResponse.setRequestId(context.stringValue("DeleteCNameWafResponse.RequestId"));

		List<WafInfo> wafInfoList = new ArrayList<WafInfo>();
		for (int i = 0; i < context.lengthValue("DeleteCNameWafResponse.WafInfoList.Length"); i++) {
			WafInfo wafInfo = new WafInfo();
			wafInfo.setId(context.integerValue("DeleteCNameWafResponse.WafInfoList["+ i +"].Id"));
			wafInfo.setDomain(context.stringValue("DeleteCNameWafResponse.WafInfoList["+ i +"].Domain"));
			wafInfo.setCname(context.stringValue("DeleteCNameWafResponse.WafInfoList["+ i +"].Cname"));
			wafInfo.setStatus(context.integerValue("DeleteCNameWafResponse.WafInfoList["+ i +"].Status"));

			wafInfoList.add(wafInfo);
		}
		deleteCNameWafResponse.setWafInfoList(wafInfoList);
	 
	 	return deleteCNameWafResponse;
	}
}