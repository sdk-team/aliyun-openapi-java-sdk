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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.InnerMonitorDataDescribeDiskResponse;
import com.aliyuncs.ecs.model.v20160314.InnerMonitorDataDescribeDiskResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerMonitorDataDescribeDiskResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerMonitorDataDescribeDiskResponse.Item.Item2Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMonitorDataDescribeDiskResponseUnmarshaller {

	public static InnerMonitorDataDescribeDiskResponse unmarshall(InnerMonitorDataDescribeDiskResponse innerMonitorDataDescribeDiskResponse, UnmarshallerContext _ctx) {
		
		innerMonitorDataDescribeDiskResponse.setRequestId(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.RequestId"));
		innerMonitorDataDescribeDiskResponse.setCount(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerMonitorDataDescribeDiskResponse.errorCode.isSuccess"));
		innerMonitorDataDescribeDiskResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerMonitorDataDescribeDiskResponse.data.Length"); i++) {
			Item item = new Item();
			item.setTimeStamp(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].timeStamp"));
			item.setResourceStatus(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].resourceStatus"));
			item.setResourceId(_ctx.stringValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].resourceId"));

			Item2Value item2Value = new Item2Value();
			item2Value.setBPSRead(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSRead"));
			item2Value.setBPSWrite(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSWrite"));
			item2Value.setIOPSRead(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSRead"));
			item2Value.setIOPSWrite(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSWrite"));
			item2Value.setLatencyRead(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyRead"));
			item2Value.setLatencyWrite(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyWrite"));
			item2Value.setIOBlockRead(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockRead"));
			item2Value.setIOBlockWrite(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockWrite"));
			item2Value.setBPSTotal(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.BPSTotal"));
			item2Value.setIOPSTotal(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOPSTotal"));
			item2Value.setIOBlockTotal(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.IOBlockTotal"));
			item2Value.setReadPercent(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.ReadPercent"));
			item2Value.setWritePercent(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.WritePercent"));
			item2Value.setLatencyTotal(_ctx.integerValue("InnerMonitorDataDescribeDiskResponse.data["+ i +"].item2Value.LatencyTotal"));
			item.setItem2Value(item2Value);

			data.add(item);
		}
		innerMonitorDataDescribeDiskResponse.setData(data);
	 
	 	return innerMonitorDataDescribeDiskResponse;
	}
}