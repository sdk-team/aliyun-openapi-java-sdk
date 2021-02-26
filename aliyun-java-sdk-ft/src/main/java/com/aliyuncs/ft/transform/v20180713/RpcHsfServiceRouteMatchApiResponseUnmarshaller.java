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

import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.L1ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.L1ArrayItem.L1Struct;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.L1ArrayItem.L2ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.L1ArrayItem.L2ArrayItem.L3ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.NullToEmptyStructValue;
import com.aliyuncs.ft.model.v20180713.RpcHsfServiceRouteMatchApiResponse.StructValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class RpcHsfServiceRouteMatchApiResponseUnmarshaller {

	public static RpcHsfServiceRouteMatchApiResponse unmarshall(RpcHsfServiceRouteMatchApiResponse rpcHsfServiceRouteMatchApiResponse, UnmarshallerContext _ctx) {
		
		rpcHsfServiceRouteMatchApiResponse.setAge(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.Age"));
		rpcHsfServiceRouteMatchApiResponse.setCheckNumberValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.CheckNumberValue"));
		rpcHsfServiceRouteMatchApiResponse.setCode(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.Code"));
		rpcHsfServiceRouteMatchApiResponse.setDefaultValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.DefaultValue"));
		rpcHsfServiceRouteMatchApiResponse.setEnumValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.EnumValue"));
		rpcHsfServiceRouteMatchApiResponse.setHttpStatusCode(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.HttpStatusCode"));
		rpcHsfServiceRouteMatchApiResponse.setIntValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.IntValue"));
		rpcHsfServiceRouteMatchApiResponse.setJsonListStrig(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.JsonListStrig"));
		rpcHsfServiceRouteMatchApiResponse.setMessage(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.Message"));
		rpcHsfServiceRouteMatchApiResponse.setName(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.Name"));
		rpcHsfServiceRouteMatchApiResponse.setNullToEmptyValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.NullToEmptyValue"));
		rpcHsfServiceRouteMatchApiResponse.setNumberRange(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.NumberRange"));
		rpcHsfServiceRouteMatchApiResponse.setRegionId(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.RegionId"));
		rpcHsfServiceRouteMatchApiResponse.setRequiredValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.RequiredValue"));
		rpcHsfServiceRouteMatchApiResponse.setResultSwitchValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.ResultSwitchValue"));
		rpcHsfServiceRouteMatchApiResponse.setStringValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.StringValue"));
		rpcHsfServiceRouteMatchApiResponse.setSuccess(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.Success"));
		rpcHsfServiceRouteMatchApiResponse.setSwitchValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.SwitchValue"));
		rpcHsfServiceRouteMatchApiResponse.setAk_mfa_present(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.ak_mfa_present"));
		rpcHsfServiceRouteMatchApiResponse.setApp_ip(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.app_ip"));
		rpcHsfServiceRouteMatchApiResponse.setCallerBid(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.callerBid"));
		rpcHsfServiceRouteMatchApiResponse.setCallerParentId(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.callerParentId"));
		rpcHsfServiceRouteMatchApiResponse.setCallerType(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.callerType"));
		rpcHsfServiceRouteMatchApiResponse.setCallerUid(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.callerUid"));
		rpcHsfServiceRouteMatchApiResponse.setProxy_original_security_transport(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.proxy_original_security_transport"));
		rpcHsfServiceRouteMatchApiResponse.setProxy_original_source_ip(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.proxy_original_source_ip"));
		rpcHsfServiceRouteMatchApiResponse.setProxy_trust_transport_info(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.proxy_trust_transport_info"));
		rpcHsfServiceRouteMatchApiResponse.setRequestId(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.requestId"));
		rpcHsfServiceRouteMatchApiResponse.setResourceOwnerId(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.resourceOwnerId"));
		rpcHsfServiceRouteMatchApiResponse.setSecurity_transport(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.security_transport"));

		NullToEmptyStructValue nullToEmptyStructValue = new NullToEmptyStructValue();
		nullToEmptyStructValue.setNullToEmptyStructChildValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.NullToEmptyStructValue.NullToEmptyStructChildValue"));
		rpcHsfServiceRouteMatchApiResponse.setNullToEmptyStructValue(nullToEmptyStructValue);

		StructValue structValue = new StructValue();
		structValue.setStructChildValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.StructValue.StructChildValue"));
		rpcHsfServiceRouteMatchApiResponse.setStructValue(structValue);

		List<ArrayItem> arrayValue = new ArrayList<ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcHsfServiceRouteMatchApiResponse.ArrayValue.Length"); i++) {
			ArrayItem arrayItem = new ArrayItem();
			arrayItem.setArrayChildValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.ArrayValue["+ i +"].ArrayChildValue"));

			arrayValue.add(arrayItem);
		}
		rpcHsfServiceRouteMatchApiResponse.setArrayValue(arrayValue);

		List<L1ArrayItem> l1Array = new ArrayList<L1ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcHsfServiceRouteMatchApiResponse.L1Array.Length"); i++) {
			L1ArrayItem l1ArrayItem = new L1ArrayItem();
			l1ArrayItem.setL1Member1(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L1Member1"));

			L1Struct l1Struct = new L1Struct();
			l1Struct.setL1StructMember(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L1Struct.L1StructMember"));
			l1ArrayItem.setL1Struct(l1Struct);

			List<L2ArrayItem> l2Array = new ArrayList<L2ArrayItem>();
			for (int j = 0; j < _ctx.lengthValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L2Array.Length"); j++) {
				L2ArrayItem l2ArrayItem = new L2ArrayItem();
				l2ArrayItem.setL2Member1(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L2Array["+ j +"].L2Member1"));

				List<L3ArrayItem> l3Array = new ArrayList<L3ArrayItem>();
				for (int k = 0; k < _ctx.lengthValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L2Array["+ j +"].L3Array.Length"); k++) {
					L3ArrayItem l3ArrayItem = new L3ArrayItem();
					l3ArrayItem.setL3Member1(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.L1Array["+ i +"].L2Array["+ j +"].L3Array["+ k +"].L3Member1"));

					l3Array.add(l3ArrayItem);
				}
				l2ArrayItem.setL3Array(l3Array);

				l2Array.add(l2ArrayItem);
			}
			l1ArrayItem.setL2Array(l2Array);

			l1Array.add(l1ArrayItem);
		}
		rpcHsfServiceRouteMatchApiResponse.setL1Array(l1Array);

		List<ArrayItem> nullArrayValue = new ArrayList<ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcHsfServiceRouteMatchApiResponse.NullArrayValue.Length"); i++) {
			ArrayItem arrayItem_ = new ArrayItem();
			arrayItem_.setArrayChildValue(_ctx.stringValue("RpcHsfServiceRouteMatchApiResponse.NullArrayValue["+ i +"].ArrayChildValue"));

			nullArrayValue.add(arrayItem_);
		}
		rpcHsfServiceRouteMatchApiResponse.setNullArrayValue(nullArrayValue);
	 
	 	return rpcHsfServiceRouteMatchApiResponse;
	}
}