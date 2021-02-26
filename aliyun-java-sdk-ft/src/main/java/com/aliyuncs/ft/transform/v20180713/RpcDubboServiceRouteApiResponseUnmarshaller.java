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

import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.L1ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.L1ArrayItem.L1Struct;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.L1ArrayItem.L2ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.L1ArrayItem.L2ArrayItem.L3ArrayItem;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.NullToEmptyStructValue;
import com.aliyuncs.ft.model.v20180713.RpcDubboServiceRouteApiResponse.StructValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class RpcDubboServiceRouteApiResponseUnmarshaller {

	public static RpcDubboServiceRouteApiResponse unmarshall(RpcDubboServiceRouteApiResponse rpcDubboServiceRouteApiResponse, UnmarshallerContext _ctx) {
		
		rpcDubboServiceRouteApiResponse.setAge(_ctx.stringValue("RpcDubboServiceRouteApiResponse.Age"));
		rpcDubboServiceRouteApiResponse.setCheckNumberValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.CheckNumberValue"));
		rpcDubboServiceRouteApiResponse.setCode(_ctx.stringValue("RpcDubboServiceRouteApiResponse.Code"));
		rpcDubboServiceRouteApiResponse.setDefaultValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.DefaultValue"));
		rpcDubboServiceRouteApiResponse.setEnumValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.EnumValue"));
		rpcDubboServiceRouteApiResponse.setHttpStatusCode(_ctx.stringValue("RpcDubboServiceRouteApiResponse.HttpStatusCode"));
		rpcDubboServiceRouteApiResponse.setIntValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.IntValue"));
		rpcDubboServiceRouteApiResponse.setJsonListStrig(_ctx.stringValue("RpcDubboServiceRouteApiResponse.JsonListStrig"));
		rpcDubboServiceRouteApiResponse.setMessage(_ctx.stringValue("RpcDubboServiceRouteApiResponse.Message"));
		rpcDubboServiceRouteApiResponse.setName(_ctx.stringValue("RpcDubboServiceRouteApiResponse.Name"));
		rpcDubboServiceRouteApiResponse.setNullToEmptyValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.NullToEmptyValue"));
		rpcDubboServiceRouteApiResponse.setNumberRange(_ctx.stringValue("RpcDubboServiceRouteApiResponse.NumberRange"));
		rpcDubboServiceRouteApiResponse.setRegionId(_ctx.stringValue("RpcDubboServiceRouteApiResponse.RegionId"));
		rpcDubboServiceRouteApiResponse.setRequiredValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.RequiredValue"));
		rpcDubboServiceRouteApiResponse.setResultSwitchValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.ResultSwitchValue"));
		rpcDubboServiceRouteApiResponse.setStringValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.StringValue"));
		rpcDubboServiceRouteApiResponse.setSuccess(_ctx.stringValue("RpcDubboServiceRouteApiResponse.Success"));
		rpcDubboServiceRouteApiResponse.setSwitchValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.SwitchValue"));
		rpcDubboServiceRouteApiResponse.setAk_mfa_present(_ctx.stringValue("RpcDubboServiceRouteApiResponse.ak_mfa_present"));
		rpcDubboServiceRouteApiResponse.setApp_ip(_ctx.stringValue("RpcDubboServiceRouteApiResponse.app_ip"));
		rpcDubboServiceRouteApiResponse.setCallerBid(_ctx.stringValue("RpcDubboServiceRouteApiResponse.callerBid"));
		rpcDubboServiceRouteApiResponse.setCallerParentId(_ctx.stringValue("RpcDubboServiceRouteApiResponse.callerParentId"));
		rpcDubboServiceRouteApiResponse.setCallerType(_ctx.stringValue("RpcDubboServiceRouteApiResponse.callerType"));
		rpcDubboServiceRouteApiResponse.setCallerUid(_ctx.stringValue("RpcDubboServiceRouteApiResponse.callerUid"));
		rpcDubboServiceRouteApiResponse.setProxy_original_security_transport(_ctx.stringValue("RpcDubboServiceRouteApiResponse.proxy_original_security_transport"));
		rpcDubboServiceRouteApiResponse.setProxy_original_source_ip(_ctx.stringValue("RpcDubboServiceRouteApiResponse.proxy_original_source_ip"));
		rpcDubboServiceRouteApiResponse.setProxy_trust_transport_info(_ctx.stringValue("RpcDubboServiceRouteApiResponse.proxy_trust_transport_info"));
		rpcDubboServiceRouteApiResponse.setRequestId(_ctx.stringValue("RpcDubboServiceRouteApiResponse.requestId"));
		rpcDubboServiceRouteApiResponse.setResourceOwnerId(_ctx.stringValue("RpcDubboServiceRouteApiResponse.resourceOwnerId"));
		rpcDubboServiceRouteApiResponse.setSecurity_transport(_ctx.stringValue("RpcDubboServiceRouteApiResponse.security_transport"));

		NullToEmptyStructValue nullToEmptyStructValue = new NullToEmptyStructValue();
		nullToEmptyStructValue.setNullToEmptyStructChildValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.NullToEmptyStructValue.NullToEmptyStructChildValue"));
		rpcDubboServiceRouteApiResponse.setNullToEmptyStructValue(nullToEmptyStructValue);

		StructValue structValue = new StructValue();
		structValue.setStructChildValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.StructValue.StructChildValue"));
		rpcDubboServiceRouteApiResponse.setStructValue(structValue);

		List<ArrayItem> arrayValue = new ArrayList<ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcDubboServiceRouteApiResponse.ArrayValue.Length"); i++) {
			ArrayItem arrayItem = new ArrayItem();
			arrayItem.setArrayChildValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.ArrayValue["+ i +"].ArrayChildValue"));

			arrayValue.add(arrayItem);
		}
		rpcDubboServiceRouteApiResponse.setArrayValue(arrayValue);

		List<L1ArrayItem> l1Array = new ArrayList<L1ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcDubboServiceRouteApiResponse.L1Array.Length"); i++) {
			L1ArrayItem l1ArrayItem = new L1ArrayItem();
			l1ArrayItem.setL1Member1(_ctx.stringValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L1Member1"));

			L1Struct l1Struct = new L1Struct();
			l1Struct.setL1StructMember(_ctx.stringValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L1Struct.L1StructMember"));
			l1ArrayItem.setL1Struct(l1Struct);

			List<L2ArrayItem> l2Array = new ArrayList<L2ArrayItem>();
			for (int j = 0; j < _ctx.lengthValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L2Array.Length"); j++) {
				L2ArrayItem l2ArrayItem = new L2ArrayItem();
				l2ArrayItem.setL2Member1(_ctx.stringValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L2Array["+ j +"].L2Member1"));

				List<L3ArrayItem> l3Array = new ArrayList<L3ArrayItem>();
				for (int k = 0; k < _ctx.lengthValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L2Array["+ j +"].L3Array.Length"); k++) {
					L3ArrayItem l3ArrayItem = new L3ArrayItem();
					l3ArrayItem.setL3Member1(_ctx.stringValue("RpcDubboServiceRouteApiResponse.L1Array["+ i +"].L2Array["+ j +"].L3Array["+ k +"].L3Member1"));

					l3Array.add(l3ArrayItem);
				}
				l2ArrayItem.setL3Array(l3Array);

				l2Array.add(l2ArrayItem);
			}
			l1ArrayItem.setL2Array(l2Array);

			l1Array.add(l1ArrayItem);
		}
		rpcDubboServiceRouteApiResponse.setL1Array(l1Array);

		List<ArrayItem> nullArrayValue = new ArrayList<ArrayItem>();
		for (int i = 0; i < _ctx.lengthValue("RpcDubboServiceRouteApiResponse.NullArrayValue.Length"); i++) {
			ArrayItem arrayItem_ = new ArrayItem();
			arrayItem_.setArrayChildValue(_ctx.stringValue("RpcDubboServiceRouteApiResponse.NullArrayValue["+ i +"].ArrayChildValue"));

			nullArrayValue.add(arrayItem_);
		}
		rpcDubboServiceRouteApiResponse.setNullArrayValue(nullArrayValue);
	 
	 	return rpcDubboServiceRouteApiResponse;
	}
}