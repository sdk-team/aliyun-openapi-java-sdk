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

import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.EventInfo;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.EventInfo.Argument5;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.EventInfo.Tag6;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfo;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfo.Tag;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfo;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfo.Argument;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfo.Argument2;
import com.aliyuncs.iot.model.v20190730.GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfo.Tag3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPoolFunctionsByIdListForTmallGenieResponseUnmarshaller {

	public static GetPoolFunctionsByIdListForTmallGenieResponse unmarshall(GetPoolFunctionsByIdListForTmallGenieResponse getPoolFunctionsByIdListForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		getPoolFunctionsByIdListForTmallGenieResponse.setRequestId(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.RequestId"));
		getPoolFunctionsByIdListForTmallGenieResponse.setSuccess(_ctx.booleanValue("GetPoolFunctionsByIdListForTmallGenieResponse.Success"));
		getPoolFunctionsByIdListForTmallGenieResponse.setCode(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.Code"));
		getPoolFunctionsByIdListForTmallGenieResponse.setErrorMessage(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ErrorMessage"));

		List<PropertyInfo> propertyInfos = new ArrayList<PropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].TmallFunctionId"));
			propertyInfo.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Identifier"));
			propertyInfo.setThingTemplateKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].ThingTemplateKey"));
			propertyInfo.setDataType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].DataType"));
			propertyInfo.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Name"));
			propertyInfo.setRwType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].RwType"));
			propertyInfo.setDescription(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Description"));
			propertyInfo.setDataSpecs(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].DataSpecs"));
			propertyInfo.setDataSpecsList(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.PropertyInfos["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			propertyInfo.setTags(tags);

			propertyInfos.add(propertyInfo);
		}
		getPoolFunctionsByIdListForTmallGenieResponse.setPropertyInfos(propertyInfos);

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].TmallFunctionId"));
			serviceInfo.setThingTemplateKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].ThingTemplateKey"));
			serviceInfo.setCallType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].CallType"));
			serviceInfo.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].Name"));
			serviceInfo.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].Identifier"));

			List<Argument> inputParams = new ArrayList<Argument>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams.Length"); j++) {
				Argument argument = new Argument();
				argument.setDataType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].DataType"));
				argument.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].Identifier"));
				argument.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].Name"));
				argument.setParaOrder(_ctx.integerValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument.setDirection(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].Direction"));
				argument.setDataSpecs(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument.setDataSpecsList(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].DataSpecsList"));
				argument.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].InputParams["+ j +"].TmallFunctionId"));

				inputParams.add(argument);
			}
			serviceInfo.setInputParams(inputParams);

			List<Argument2> outputParams = new ArrayList<Argument2>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams.Length"); j++) {
				Argument2 argument2 = new Argument2();
				argument2.setDataType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].DataType"));
				argument2.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].Identifier"));
				argument2.setParaOrder(_ctx.integerValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument2.setDirection(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].Direction"));
				argument2.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].Name"));
				argument2.setDataSpecs(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument2.setDataSpecsList(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].DataSpecsList"));
				argument2.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].OutputParams["+ j +"].TmallFunctionId"));

				outputParams.add(argument2);
			}
			serviceInfo.setOutputParams(outputParams);

			List<Tag3> tags1 = new ArrayList<Tag3>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].Tags.Length"); j++) {
				Tag3 tag3 = new Tag3();
				tag3.setTagKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].Tags["+ j +"].TagKey"));
				tag3.setTagValue(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.ServiceInfos["+ i +"].Tags["+ j +"].TagValue"));

				tags1.add(tag3);
			}
			serviceInfo.setTags1(tags1);

			serviceInfos.add(serviceInfo);
		}
		getPoolFunctionsByIdListForTmallGenieResponse.setServiceInfos(serviceInfos);

		List<EventInfo> eventInfos = new ArrayList<EventInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].TmallFunctionId"));
			eventInfo.setThingTemplateKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].ThingTemplateKey"));
			eventInfo.setEventType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].EventType"));
			eventInfo.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].Name"));
			eventInfo.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].Identifier"));

			List<Argument5> outputData = new ArrayList<Argument5>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData.Length"); j++) {
				Argument5 argument5 = new Argument5();
				argument5.setDataType(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].DataType"));
				argument5.setIdentifier(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].Identifier"));
				argument5.setName(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].Name"));
				argument5.setParaOrder(_ctx.integerValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument5.setDataSpecs(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument5.setDataSpecsList(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].DataSpecsList"));
				argument5.setTmallFunctionId(_ctx.longValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].OutputData["+ j +"].TmallFunctionId"));

				outputData.add(argument5);
			}
			eventInfo.setOutputData(outputData);

			List<Tag6> tags4 = new ArrayList<Tag6>();
			for (int j = 0; j < _ctx.lengthValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].Tags.Length"); j++) {
				Tag6 tag6 = new Tag6();
				tag6.setTagKey(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].Tags["+ j +"].TagKey"));
				tag6.setTagValue(_ctx.stringValue("GetPoolFunctionsByIdListForTmallGenieResponse.EventInfos["+ i +"].Tags["+ j +"].TagValue"));

				tags4.add(tag6);
			}
			eventInfo.setTags4(tags4);

			eventInfos.add(eventInfo);
		}
		getPoolFunctionsByIdListForTmallGenieResponse.setEventInfos(eventInfos);
	 
	 	return getPoolFunctionsByIdListForTmallGenieResponse;
	}
}