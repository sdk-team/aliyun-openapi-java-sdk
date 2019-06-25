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

import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfo;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfo.Argument3;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfo.Tag4;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfo;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfo.Tag;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfo;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfo.Argument;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfo.Argument1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListThingTemplateFuncsForTmallGenieResponseUnmarshaller {

	public static ListThingTemplateFuncsForTmallGenieResponse unmarshall(ListThingTemplateFuncsForTmallGenieResponse listThingTemplateFuncsForTmallGenieResponse, UnmarshallerContext context) {
		
		listThingTemplateFuncsForTmallGenieResponse.setRequestId(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.RequestId"));
		listThingTemplateFuncsForTmallGenieResponse.setSuccess(context.booleanValue("ListThingTemplateFuncsForTmallGenieResponse.Success"));
		listThingTemplateFuncsForTmallGenieResponse.setCode(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Code"));
		listThingTemplateFuncsForTmallGenieResponse.setErrorMessage(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.ErrorMessage"));

		Data data = new Data();

		List<PropertyInfo> propertyInfos = new ArrayList<PropertyInfo>();
		for (int i = 0; i < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setTmallFunctionId(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].TmallFunctionId"));
			propertyInfo.setThingTemplateKey(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].ThingTemplateKey"));
			propertyInfo.setDataType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].DataType"));
			propertyInfo.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].Name"));
			propertyInfo.setDataSpecs(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].DataSpecs"));
			propertyInfo.setDataSpecsList(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.PropertyInfos["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			propertyInfo.setTags(tags);

			propertyInfos.add(propertyInfo);
		}
		data.setPropertyInfos(propertyInfos);

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setTmallFunctionId(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].TmallFunctionId"));
			serviceInfo.setThingTemplateKey(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].ThingTemplateKey"));
			serviceInfo.setCallType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].CallType"));
			serviceInfo.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].Name"));
			serviceInfo.setIdentifier(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].Identifier"));

			List<Argument> inputParams = new ArrayList<Argument>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams.Length"); j++) {
				Argument argument = new Argument();
				argument.setDataType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].DataType"));
				argument.setIdentifier(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].Identifier"));
				argument.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].Name"));
				argument.setParaOrder(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument.setDirection(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].Direction"));
				argument.setDataSpecs(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument.setDataSpecsList(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].InputParams["+ j +"].DataSpecsList"));

				inputParams.add(argument);
			}
			serviceInfo.setInputParams(inputParams);

			List<Argument1> outputParams = new ArrayList<Argument1>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams.Length"); j++) {
				Argument1 argument1 = new Argument1();
				argument1.setDataType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].DataType"));
				argument1.setIdentifier(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].Identifier"));
				argument1.setParaOrder(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument1.setDirection(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].Direction"));
				argument1.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].Name"));
				argument1.setDataSpecs(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument1.setDataSpecsList(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.ServiceInfos["+ i +"].OutputParams["+ j +"].DataSpecsList"));

				outputParams.add(argument1);
			}
			serviceInfo.setOutputParams(outputParams);

			serviceInfos.add(serviceInfo);
		}
		data.setServiceInfos(serviceInfos);

		List<EventInfo> eventInfos = new ArrayList<EventInfo>();
		for (int i = 0; i < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setTmallFunctionId(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].TmallFunctionId"));
			eventInfo.setThingTemplateKey(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].ThingTemplateKey"));
			eventInfo.setEventType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].EventType"));
			eventInfo.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].Name"));
			eventInfo.setIdentifier(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].Identifier"));

			List<Argument3> outputData = new ArrayList<Argument3>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData.Length"); j++) {
				Argument3 argument3 = new Argument3();
				argument3.setDataType(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].DataType"));
				argument3.setIdentifier(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].Identifier"));
				argument3.setName(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].Name"));
				argument3.setParaOrder(context.longValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument3.setDataSpecs(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument3.setDataSpecsList(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].OutputData["+ j +"].DataSpecsList"));

				outputData.add(argument3);
			}
			eventInfo.setOutputData(outputData);

			List<Tag4> tags2 = new ArrayList<Tag4>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].Tags.Length"); j++) {
				Tag4 tag4 = new Tag4();
				tag4.setTagKey(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].Tags["+ j +"].TagKey"));
				tag4.setTagValue(context.stringValue("ListThingTemplateFuncsForTmallGenieResponse.Data.EventInfos["+ i +"].Tags["+ j +"].TagValue"));

				tags2.add(tag4);
			}
			eventInfo.setTags2(tags2);

			eventInfos.add(eventInfo);
		}
		data.setEventInfos(eventInfos);
		listThingTemplateFuncsForTmallGenieResponse.setData(data);
	 
	 	return listThingTemplateFuncsForTmallGenieResponse;
	}
}