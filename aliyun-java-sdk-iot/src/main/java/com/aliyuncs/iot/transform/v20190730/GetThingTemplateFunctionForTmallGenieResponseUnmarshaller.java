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

import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.EventInfo;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Argument5;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Tag6;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Tag;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Argument;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Argument2;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Tag3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingTemplateFunctionForTmallGenieResponseUnmarshaller {

	public static GetThingTemplateFunctionForTmallGenieResponse unmarshall(GetThingTemplateFunctionForTmallGenieResponse getThingTemplateFunctionForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		getThingTemplateFunctionForTmallGenieResponse.setRequestId(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.RequestId"));
		getThingTemplateFunctionForTmallGenieResponse.setSuccess(_ctx.booleanValue("GetThingTemplateFunctionForTmallGenieResponse.Success"));
		getThingTemplateFunctionForTmallGenieResponse.setCode(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Code"));
		getThingTemplateFunctionForTmallGenieResponse.setErrorMessage(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ErrorMessage"));

		PropertyInfo propertyInfo = new PropertyInfo();
		propertyInfo.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.TmallFunctionId"));
		propertyInfo.setThingTemplateKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.ThingTemplateKey"));
		propertyInfo.setDataType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.DataType"));
		propertyInfo.setRwType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.RwType"));
		propertyInfo.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Identifier"));
		propertyInfo.setDescription(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Description"));
		propertyInfo.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Name"));
		propertyInfo.setDataSpecs(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.DataSpecs"));
		propertyInfo.setDataSpecsList(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.DataSpecsList"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.PropertyInfo.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		propertyInfo.setTags(tags);
		getThingTemplateFunctionForTmallGenieResponse.setPropertyInfo(propertyInfo);

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.TmallFunctionId"));
		serviceInfo.setThingTemplateKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.ThingTemplateKey"));
		serviceInfo.setCallType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.CallType"));
		serviceInfo.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Name"));
		serviceInfo.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Identifier"));

		List<Argument> inputParams = new ArrayList<Argument>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams.Length"); i++) {
			Argument argument = new Argument();
			argument.setId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Id"));
			argument.setDataType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataType"));
			argument.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Identifier"));
			argument.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Name"));
			argument.setParaOrder(_ctx.integerValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].ParaOrder"));
			argument.setDirection(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Direction"));
			argument.setDataSpecs(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataSpecs"));
			argument.setDataSpecsList(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataSpecsList"));
			argument.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].TmallFunctionId"));

			inputParams.add(argument);
		}
		serviceInfo.setInputParams(inputParams);

		List<Argument2> outputParams = new ArrayList<Argument2>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams.Length"); i++) {
			Argument2 argument2 = new Argument2();
			argument2.setId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Id"));
			argument2.setDataType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataType"));
			argument2.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Identifier"));
			argument2.setParaOrder(_ctx.integerValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].ParaOrder"));
			argument2.setDirection(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Direction"));
			argument2.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Name"));
			argument2.setDataSpecs(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataSpecs"));
			argument2.setDataSpecsList(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataSpecsList"));
			argument2.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].TmallFunctionId"));

			outputParams.add(argument2);
		}
		serviceInfo.setOutputParams(outputParams);

		List<Tag3> tags1 = new ArrayList<Tag3>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Tags.Length"); i++) {
			Tag3 tag3 = new Tag3();
			tag3.setTagKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Tags["+ i +"].TagKey"));
			tag3.setTagValue(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ServiceInfo.Tags["+ i +"].TagValue"));

			tags1.add(tag3);
		}
		serviceInfo.setTags1(tags1);
		getThingTemplateFunctionForTmallGenieResponse.setServiceInfo(serviceInfo);

		EventInfo eventInfo = new EventInfo();
		eventInfo.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.TmallFunctionId"));
		eventInfo.setThingTemplateKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.ThingTemplateKey"));
		eventInfo.setEventType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.EventType"));
		eventInfo.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Name"));
		eventInfo.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Identifier"));

		List<Argument5> outputData = new ArrayList<Argument5>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData.Length"); i++) {
			Argument5 argument5 = new Argument5();
			argument5.setId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].Id"));
			argument5.setDataType(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].DataType"));
			argument5.setIdentifier(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].Identifier"));
			argument5.setName(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].Name"));
			argument5.setParaOrder(_ctx.integerValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].ParaOrder"));
			argument5.setDataSpecs(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].DataSpecs"));
			argument5.setDataSpecsList(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].DataSpecsList"));
			argument5.setTmallFunctionId(_ctx.longValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.OutputData["+ i +"].TmallFunctionId"));

			outputData.add(argument5);
		}
		eventInfo.setOutputData(outputData);

		List<Tag6> tags4 = new ArrayList<Tag6>();
		for (int i = 0; i < _ctx.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Tags.Length"); i++) {
			Tag6 tag6 = new Tag6();
			tag6.setTagKey(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Tags["+ i +"].TagKey"));
			tag6.setTagValue(_ctx.stringValue("GetThingTemplateFunctionForTmallGenieResponse.EventInfo.Tags["+ i +"].TagValue"));

			tags4.add(tag6);
		}
		eventInfo.setTags4(tags4);
		getThingTemplateFunctionForTmallGenieResponse.setEventInfo(eventInfo);
	 
	 	return getThingTemplateFunctionForTmallGenieResponse;
	}
}