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

import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.EventInfos;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.EventInfos.Argument5;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.EventInfos.Tag6;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.PropertyInfo;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.PropertyInfo.Tag;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.ServiceInfo;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.ServiceInfo.Argument;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.ServiceInfo.Argument2;
import com.aliyuncs.iot.model.v20190730.GetProductFunctionForTmallGenieResponse.ServiceInfo.Tag3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductFunctionForTmallGenieResponseUnmarshaller {

	public static GetProductFunctionForTmallGenieResponse unmarshall(GetProductFunctionForTmallGenieResponse getProductFunctionForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		getProductFunctionForTmallGenieResponse.setRequestId(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.RequestId"));
		getProductFunctionForTmallGenieResponse.setSuccess(_ctx.booleanValue("GetProductFunctionForTmallGenieResponse.Success"));
		getProductFunctionForTmallGenieResponse.setCode(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.Code"));
		getProductFunctionForTmallGenieResponse.setErrorMessage(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ErrorMessage"));

		PropertyInfo propertyInfo = new PropertyInfo();
		propertyInfo.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.TmallFunctionId"));
		propertyInfo.setThingTemplateKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.ThingTemplateKey"));
		propertyInfo.setDataType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.DataType"));
		propertyInfo.setRwType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.RwType"));
		propertyInfo.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Identifier"));
		propertyInfo.setDescription(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Description"));
		propertyInfo.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Name"));
		propertyInfo.setDataSpecs(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.DataSpecs"));
		propertyInfo.setDataSpecsList(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.DataSpecsList"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.PropertyInfo.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		propertyInfo.setTags(tags);
		getProductFunctionForTmallGenieResponse.setPropertyInfo(propertyInfo);

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.TmallFunctionId"));
		serviceInfo.setThingTemplateKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.ThingTemplateKey"));
		serviceInfo.setCallType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.CallType"));
		serviceInfo.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.Name"));
		serviceInfo.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.Identifier"));

		List<Argument> inputParams = new ArrayList<Argument>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams.Length"); i++) {
			Argument argument = new Argument();
			argument.setId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Id"));
			argument.setDataType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataType"));
			argument.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Identifier"));
			argument.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Name"));
			argument.setParaOrder(_ctx.integerValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].ParaOrder"));
			argument.setDirection(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].Direction"));
			argument.setDataSpecs(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataSpecs"));
			argument.setDataSpecsList(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].DataSpecsList"));
			argument.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.InputParams["+ i +"].TmallFunctionId"));

			inputParams.add(argument);
		}
		serviceInfo.setInputParams(inputParams);

		List<Argument2> outputParams = new ArrayList<Argument2>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams.Length"); i++) {
			Argument2 argument2 = new Argument2();
			argument2.setId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Id"));
			argument2.setDataType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataType"));
			argument2.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Identifier"));
			argument2.setParaOrder(_ctx.integerValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].ParaOrder"));
			argument2.setDirection(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Direction"));
			argument2.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].Name"));
			argument2.setDataSpecs(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataSpecs"));
			argument2.setDataSpecsList(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].DataSpecsList"));
			argument2.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.OutputParams["+ i +"].TmallFunctionId"));

			outputParams.add(argument2);
		}
		serviceInfo.setOutputParams(outputParams);

		List<Tag3> tags1 = new ArrayList<Tag3>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.Tags.Length"); i++) {
			Tag3 tag3 = new Tag3();
			tag3.setTagKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.Tags["+ i +"].TagKey"));
			tag3.setTagValue(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.ServiceInfo.Tags["+ i +"].TagValue"));

			tags1.add(tag3);
		}
		serviceInfo.setTags1(tags1);
		getProductFunctionForTmallGenieResponse.setServiceInfo(serviceInfo);

		EventInfos eventInfos = new EventInfos();
		eventInfos.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.EventInfos.TmallFunctionId"));
		eventInfos.setThingTemplateKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.ThingTemplateKey"));
		eventInfos.setEventType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.EventType"));
		eventInfos.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.Name"));
		eventInfos.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.Identifier"));

		List<Argument5> outputData = new ArrayList<Argument5>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData.Length"); i++) {
			Argument5 argument5 = new Argument5();
			argument5.setId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].Id"));
			argument5.setDataType(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].DataType"));
			argument5.setIdentifier(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].Identifier"));
			argument5.setName(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].Name"));
			argument5.setParaOrder(_ctx.integerValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].ParaOrder"));
			argument5.setDataSpecs(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].DataSpecs"));
			argument5.setDataSpecsList(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].DataSpecsList"));
			argument5.setTmallFunctionId(_ctx.longValue("GetProductFunctionForTmallGenieResponse.EventInfos.OutputData["+ i +"].TmallFunctionId"));

			outputData.add(argument5);
		}
		eventInfos.setOutputData(outputData);

		List<Tag6> tags4 = new ArrayList<Tag6>();
		for (int i = 0; i < _ctx.lengthValue("GetProductFunctionForTmallGenieResponse.EventInfos.Tags.Length"); i++) {
			Tag6 tag6 = new Tag6();
			tag6.setTagKey(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.Tags["+ i +"].TagKey"));
			tag6.setTagValue(_ctx.stringValue("GetProductFunctionForTmallGenieResponse.EventInfos.Tags["+ i +"].TagValue"));

			tags4.add(tag6);
		}
		eventInfos.setTags4(tags4);
		getProductFunctionForTmallGenieResponse.setEventInfos(eventInfos);
	 
	 	return getProductFunctionForTmallGenieResponse;
	}
}