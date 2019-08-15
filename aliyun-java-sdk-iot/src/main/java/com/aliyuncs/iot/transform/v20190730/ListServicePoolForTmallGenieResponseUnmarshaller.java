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

import com.aliyuncs.iot.model.v20190730.ListServicePoolForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListServicePoolForTmallGenieResponse.Service;
import com.aliyuncs.iot.model.v20190730.ListServicePoolForTmallGenieResponse.Service.Argument;
import com.aliyuncs.iot.model.v20190730.ListServicePoolForTmallGenieResponse.Service.Argument1;
import com.aliyuncs.iot.model.v20190730.ListServicePoolForTmallGenieResponse.Service.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicePoolForTmallGenieResponseUnmarshaller {

	public static ListServicePoolForTmallGenieResponse unmarshall(ListServicePoolForTmallGenieResponse listServicePoolForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		listServicePoolForTmallGenieResponse.setRequestId(_ctx.stringValue("ListServicePoolForTmallGenieResponse.RequestId"));
		listServicePoolForTmallGenieResponse.setSuccess(_ctx.booleanValue("ListServicePoolForTmallGenieResponse.Success"));
		listServicePoolForTmallGenieResponse.setCode(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Code"));
		listServicePoolForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ListServicePoolForTmallGenieResponse.ErrorMessage"));
		listServicePoolForTmallGenieResponse.setPageNo(_ctx.integerValue("ListServicePoolForTmallGenieResponse.PageNo"));
		listServicePoolForTmallGenieResponse.setTotal(_ctx.integerValue("ListServicePoolForTmallGenieResponse.Total"));
		listServicePoolForTmallGenieResponse.setPageSize(_ctx.integerValue("ListServicePoolForTmallGenieResponse.PageSize"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListServicePoolForTmallGenieResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setTmallFunctionId(_ctx.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].TmallFunctionId"));
			service.setThingTemplateKey(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].ThingTemplateKey"));
			service.setCallType(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].CallType"));
			service.setName(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Name"));
			service.setIdentifier(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Identifier"));

			List<Argument> inputParams = new ArrayList<Argument>();
			for (int j = 0; j < _ctx.lengthValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(_ctx.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Id"));
				argument.setDataType(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataType"));
				argument.setIdentifier(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Identifier"));
				argument.setName(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Name"));
				argument.setParaOrder(_ctx.integerValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument.setDirection(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Direction"));
				argument.setDataSpecs(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument.setDataSpecsList(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecsList"));

				inputParams.add(argument);
			}
			service.setInputParams(inputParams);

			List<Argument1> outputParams = new ArrayList<Argument1>();
			for (int j = 0; j < _ctx.lengthValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams.Length"); j++) {
				Argument1 argument1 = new Argument1();
				argument1.setId(_ctx.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Id"));
				argument1.setDataType(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataType"));
				argument1.setIdentifier(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Identifier"));
				argument1.setParaOrder(_ctx.integerValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument1.setDirection(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Direction"));
				argument1.setName(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Name"));
				argument1.setDataSpecs(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument1.setDataSpecsList(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecsList"));

				outputParams.add(argument1);
			}
			service.setOutputParams(outputParams);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			service.setTags(tags);

			services.add(service);
		}
		listServicePoolForTmallGenieResponse.setServices(services);
	 
	 	return listServicePoolForTmallGenieResponse;
	}
}