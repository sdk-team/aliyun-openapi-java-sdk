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

import com.aliyuncs.iot.model.v20190730.QueryStandardUnitResponse;
import com.aliyuncs.iot.model.v20190730.QueryStandardUnitResponse.UnifyUnitSpecsDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStandardUnitResponseUnmarshaller {

	public static QueryStandardUnitResponse unmarshall(QueryStandardUnitResponse queryStandardUnitResponse, UnmarshallerContext _ctx) {
		
		queryStandardUnitResponse.setRequestId(_ctx.stringValue("QueryStandardUnitResponse.RequestId"));
		queryStandardUnitResponse.setSuccess(_ctx.booleanValue("QueryStandardUnitResponse.Success"));
		queryStandardUnitResponse.setErrorMessage(_ctx.stringValue("QueryStandardUnitResponse.ErrorMessage"));
		queryStandardUnitResponse.setCode(_ctx.stringValue("QueryStandardUnitResponse.Code"));

		List<UnifyUnitSpecsDTO> models = new ArrayList<UnifyUnitSpecsDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryStandardUnitResponse.Models.Length"); i++) {
			UnifyUnitSpecsDTO unifyUnitSpecsDTO = new UnifyUnitSpecsDTO();
			unifyUnitSpecsDTO.setName(_ctx.stringValue("QueryStandardUnitResponse.Models["+ i +"].Name"));
			unifyUnitSpecsDTO.setSymbol(_ctx.stringValue("QueryStandardUnitResponse.Models["+ i +"].Symbol"));

			models.add(unifyUnitSpecsDTO);
		}
		queryStandardUnitResponse.setModels(models);
	 
	 	return queryStandardUnitResponse;
	}
}