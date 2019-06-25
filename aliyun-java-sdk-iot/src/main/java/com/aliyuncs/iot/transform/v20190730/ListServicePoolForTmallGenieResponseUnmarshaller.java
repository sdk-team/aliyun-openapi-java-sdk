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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicePoolForTmallGenieResponseUnmarshaller {

	public static ListServicePoolForTmallGenieResponse unmarshall(ListServicePoolForTmallGenieResponse listServicePoolForTmallGenieResponse, UnmarshallerContext context) {
		
		listServicePoolForTmallGenieResponse.setRequestId(context.stringValue("ListServicePoolForTmallGenieResponse.RequestId"));
		listServicePoolForTmallGenieResponse.setSuccess(context.booleanValue("ListServicePoolForTmallGenieResponse.Success"));
		listServicePoolForTmallGenieResponse.setCode(context.stringValue("ListServicePoolForTmallGenieResponse.Code"));
		listServicePoolForTmallGenieResponse.setErrorMessage(context.stringValue("ListServicePoolForTmallGenieResponse.ErrorMessage"));
		listServicePoolForTmallGenieResponse.setPageNo(context.integerValue("ListServicePoolForTmallGenieResponse.PageNo"));
		listServicePoolForTmallGenieResponse.setTotal(context.integerValue("ListServicePoolForTmallGenieResponse.Total"));
		listServicePoolForTmallGenieResponse.setPageSize(context.integerValue("ListServicePoolForTmallGenieResponse.PageSize"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("ListServicePoolForTmallGenieResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setTmallFunctionId(context.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].TmallFunctionId"));
			service.setThingTemplateKey(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].ThingTemplateKey"));
			service.setCallType(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].CallType"));
			service.setName(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Name"));
			service.setIdentifier(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].Identifier"));

			List<Argument> inputParams = new ArrayList<Argument>();
			for (int j = 0; j < context.lengthValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(context.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Id"));
				argument.setDataType(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataType"));
				argument.setIdentifier(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Identifier"));
				argument.setName(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Name"));
				argument.setParaOrder(context.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument.setDirection(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Direction"));
				argument.setDataSpecs(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument.setDataSpecsList(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecsList"));

				inputParams.add(argument);
			}
			service.setInputParams(inputParams);

			List<Argument1> outputParams = new ArrayList<Argument1>();
			for (int j = 0; j < context.lengthValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams.Length"); j++) {
				Argument1 argument1 = new Argument1();
				argument1.setId(context.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Id"));
				argument1.setDataType(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataType"));
				argument1.setIdentifier(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Identifier"));
				argument1.setParaOrder(context.longValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument1.setDirection(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Direction"));
				argument1.setName(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Name"));
				argument1.setDataSpecs(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument1.setDataSpecsList(context.stringValue("ListServicePoolForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecsList"));

				outputParams.add(argument1);
			}
			service.setOutputParams(outputParams);

			services.add(service);
		}
		listServicePoolForTmallGenieResponse.setServices(services);
	 
	 	return listServicePoolForTmallGenieResponse;
	}
}