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

package com.aliyuncs.iot.transform.v20190730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20190730.QueryProductApplyListResponse;
import com.aliyuncs.iot.model.v20190730.QueryProductApplyListResponse.ApplyInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductApplyListResponseUnmarshaller {

	public static QueryProductApplyListResponse unmarshall(QueryProductApplyListResponse queryProductApplyListResponse, UnmarshallerContext _ctx) {
		
		queryProductApplyListResponse.setRequestId(_ctx.stringValue("QueryProductApplyListResponse.RequestId"));
		queryProductApplyListResponse.setSuccess(_ctx.booleanValue("QueryProductApplyListResponse.Success"));
		queryProductApplyListResponse.setErrorMessage(_ctx.stringValue("QueryProductApplyListResponse.ErrorMessage"));
		queryProductApplyListResponse.setCode(_ctx.stringValue("QueryProductApplyListResponse.Code"));
		queryProductApplyListResponse.setTotal(_ctx.stringValue("QueryProductApplyListResponse.Total"));

		List<ApplyInfoDTO> data = new ArrayList<ApplyInfoDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductApplyListResponse.Data.Length"); i++) {
			ApplyInfoDTO applyInfoDTO = new ApplyInfoDTO();
			applyInfoDTO.setApplyId(_ctx.longValue("QueryProductApplyListResponse.Data["+ i +"].ApplyId"));
			applyInfoDTO.setProductKey(_ctx.stringValue("QueryProductApplyListResponse.Data["+ i +"].ProductKey"));
			applyInfoDTO.setApplyStatus(_ctx.stringValue("QueryProductApplyListResponse.Data["+ i +"].ApplyStatus"));
			applyInfoDTO.setApplyCount(_ctx.stringValue("QueryProductApplyListResponse.Data["+ i +"].ApplyCount"));
			applyInfoDTO.setSuccessCount(_ctx.stringValue("QueryProductApplyListResponse.Data["+ i +"].SuccessCount"));

			data.add(applyInfoDTO);
		}
		queryProductApplyListResponse.setData(data);
	 
	 	return queryProductApplyListResponse;
	}
}