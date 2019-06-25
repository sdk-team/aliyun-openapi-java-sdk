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
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Argument5;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Tag6;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Tag;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Argument;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Argument2;
import com.aliyuncs.iot.model.v20190730.GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Tag3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingTemplateFunctionForTmallGenieResponseUnmarshaller {

	public static GetThingTemplateFunctionForTmallGenieResponse unmarshall(GetThingTemplateFunctionForTmallGenieResponse getThingTemplateFunctionForTmallGenieResponse, UnmarshallerContext context) {
		
		getThingTemplateFunctionForTmallGenieResponse.setRequestId(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.RequestId"));
		getThingTemplateFunctionForTmallGenieResponse.setSuccess(context.booleanValue("GetThingTemplateFunctionForTmallGenieResponse.Success"));
		getThingTemplateFunctionForTmallGenieResponse.setCode(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Code"));
		getThingTemplateFunctionForTmallGenieResponse.setErrorMessage(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.ErrorMessage"));

		Data data = new Data();

		PropertyInfo propertyInfo = new PropertyInfo();
		propertyInfo.setTmallFunctionId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.TmallFunctionId"));
		propertyInfo.setThingTemplateKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.ThingTemplateKey"));
		propertyInfo.setDataType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.DataType"));
		propertyInfo.setRwType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.RwType"));
		propertyInfo.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Identifier"));
		propertyInfo.setDescription(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Description"));
		propertyInfo.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Name"));
		propertyInfo.setDataSpecs(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.DataSpecs"));
		propertyInfo.setDataSpecsList(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.DataSpecsList"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Tags["+ i +"].TagKey"));
			tag.setTagValue(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.PropertyInfo.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		propertyInfo.setTags(tags);
		data.setPropertyInfo(propertyInfo);

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setTmallFunctionId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.TmallFunctionId"));
		serviceInfo.setThingTemplateKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.ThingTemplateKey"));
		serviceInfo.setCallType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.CallType"));
		serviceInfo.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Name"));
		serviceInfo.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Identifier"));

		List<Argument> inputParams = new ArrayList<Argument>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams.Length"); i++) {
			Argument argument = new Argument();
			argument.setId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].Id"));
			argument.setDataType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].DataType"));
			argument.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].Identifier"));
			argument.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].Name"));
			argument.setParaOrder(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].ParaOrder"));
			argument.setDirection(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].Direction"));
			argument.setDataSpecs(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].DataSpecs"));
			argument.setDataSpecsList(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.InputParams["+ i +"].DataSpecsList"));

			inputParams.add(argument);
		}
		serviceInfo.setInputParams(inputParams);

		List<Argument2> outputParams = new ArrayList<Argument2>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams.Length"); i++) {
			Argument2 argument2 = new Argument2();
			argument2.setId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].Id"));
			argument2.setDataType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].DataType"));
			argument2.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].Identifier"));
			argument2.setParaOrder(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].ParaOrder"));
			argument2.setDirection(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].Direction"));
			argument2.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].Name"));
			argument2.setDataSpecs(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].DataSpecs"));
			argument2.setDataSpecsList(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.OutputParams["+ i +"].DataSpecsList"));

			outputParams.add(argument2);
		}
		serviceInfo.setOutputParams(outputParams);

		List<Tag3> tags1 = new ArrayList<Tag3>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Tags.Length"); i++) {
			Tag3 tag3 = new Tag3();
			tag3.setTagKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Tags["+ i +"].TagKey"));
			tag3.setTagValue(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.ServiceInfo.Tags["+ i +"].TagValue"));

			tags1.add(tag3);
		}
		serviceInfo.setTags1(tags1);
		data.setServiceInfo(serviceInfo);

		EventInfos eventInfos = new EventInfos();
		eventInfos.setTmallFunctionId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.TmallFunctionId"));
		eventInfos.setThingTemplateKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.ThingTemplateKey"));
		eventInfos.setEventType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.EventType"));
		eventInfos.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Name"));
		eventInfos.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Identifier"));

		List<Argument5> outputData = new ArrayList<Argument5>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData.Length"); i++) {
			Argument5 argument5 = new Argument5();
			argument5.setId(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].Id"));
			argument5.setDataType(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].DataType"));
			argument5.setIdentifier(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].Identifier"));
			argument5.setName(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].Name"));
			argument5.setParaOrder(context.longValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].ParaOrder"));
			argument5.setDataSpecs(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].DataSpecs"));
			argument5.setDataSpecsList(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.OutputData["+ i +"].DataSpecsList"));

			outputData.add(argument5);
		}
		eventInfos.setOutputData(outputData);

		List<Tag6> tags4 = new ArrayList<Tag6>();
		for (int i = 0; i < context.lengthValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Tags.Length"); i++) {
			Tag6 tag6 = new Tag6();
			tag6.setTagKey(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Tags["+ i +"].TagKey"));
			tag6.setTagValue(context.stringValue("GetThingTemplateFunctionForTmallGenieResponse.Data.EventInfos.Tags["+ i +"].TagValue"));

			tags4.add(tag6);
		}
		eventInfos.setTags4(tags4);
		data.setEventInfos(eventInfos);
		getThingTemplateFunctionForTmallGenieResponse.setData(data);
	 
	 	return getThingTemplateFunctionForTmallGenieResponse;
	}
}