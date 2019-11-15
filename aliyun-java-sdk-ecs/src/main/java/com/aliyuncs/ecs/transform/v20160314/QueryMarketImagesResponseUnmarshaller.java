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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.QueryMarketImagesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMarketImagesResponseUnmarshaller {

	public static QueryMarketImagesResponse unmarshall(QueryMarketImagesResponse queryMarketImagesResponse, UnmarshallerContext _ctx) {
		
		queryMarketImagesResponse.setRequestId(_ctx.stringValue("QueryMarketImagesResponse.RequestId"));
		queryMarketImagesResponse.setResult(_ctx.stringValue("QueryMarketImagesResponse.Result"));
		queryMarketImagesResponse.setTotalCount(_ctx.integerValue("QueryMarketImagesResponse.TotalCount"));
		queryMarketImagesResponse.setPageNumber(_ctx.integerValue("QueryMarketImagesResponse.PageNumber"));
		queryMarketImagesResponse.setPageSize(_ctx.integerValue("QueryMarketImagesResponse.PageSize"));
	 
	 	return queryMarketImagesResponse;
	}
}