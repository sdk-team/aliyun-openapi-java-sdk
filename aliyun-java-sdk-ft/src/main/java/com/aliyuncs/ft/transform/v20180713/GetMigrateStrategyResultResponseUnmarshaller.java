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

package com.aliyuncs.ft.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ft.model.v20180713.GetMigrateStrategyResultResponse;
import com.aliyuncs.ft.model.v20180713.GetMigrateStrategyResultResponse.Data;
import com.aliyuncs.ft.model.v20180713.GetMigrateStrategyResultResponse.Data.DataListItem;
import com.aliyuncs.ft.model.v20180713.GetMigrateStrategyResultResponse.Data.DataListItem.Modifier;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMigrateStrategyResultResponseUnmarshaller {

	public static GetMigrateStrategyResultResponse unmarshall(GetMigrateStrategyResultResponse getMigrateStrategyResultResponse, UnmarshallerContext _ctx) {
		
		getMigrateStrategyResultResponse.setRequestId(_ctx.stringValue("GetMigrateStrategyResultResponse.RequestId"));
		getMigrateStrategyResultResponse.setSuccess(_ctx.booleanValue("GetMigrateStrategyResultResponse.Success"));
		getMigrateStrategyResultResponse.setCode(_ctx.stringValue("GetMigrateStrategyResultResponse.Code"));
		getMigrateStrategyResultResponse.setMessage(_ctx.stringValue("GetMigrateStrategyResultResponse.Message"));
		getMigrateStrategyResultResponse.setMessageCN(_ctx.stringValue("GetMigrateStrategyResultResponse.MessageCN"));
		getMigrateStrategyResultResponse.setNullValue(_ctx.stringValue("GetMigrateStrategyResultResponse.NullValue"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetMigrateStrategyResultResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("GetMigrateStrategyResultResponse.Data.CurrentPage"));
		data.setTotalItem(_ctx.integerValue("GetMigrateStrategyResultResponse.Data.TotalItem"));
		data.setTestNull(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.TestNull"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMigrateStrategyResultResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setId(_ctx.longValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setCreateTime(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].CreateTime"));
			dataListItem.setModifiedTime(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].ModifiedTime"));
			dataListItem.setRecordVersion(_ctx.integerValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].RecordVersion"));
			dataListItem.setEnv(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Env"));
			dataListItem.setProduct(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Product"));
			dataListItem.setVersion(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Version"));
			dataListItem.setApi(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Api"));
			dataListItem.setStrategyName(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].StrategyName"));
			dataListItem.setParentName(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].ParentName"));
			dataListItem.setType(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Type"));
			dataListItem.setFlowSpecial(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].FlowSpecial"));
			dataListItem.setDataItem(_ctx.mapValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].DataItem"));
			dataListItem.setStatus(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Status"));

			Modifier modifier = new Modifier();
			modifier.setId(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Modifier.Id"));
			modifier.setName(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Modifier.Name"));
			modifier.setBucId(_ctx.stringValue("GetMigrateStrategyResultResponse.Data.DataList["+ i +"].Modifier.BucId"));
			dataListItem.setModifier(modifier);

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		getMigrateStrategyResultResponse.setData(data);
	 
	 	return getMigrateStrategyResultResponse;
	}
}