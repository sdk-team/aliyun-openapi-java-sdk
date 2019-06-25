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

import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Event;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Event.Argument;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Event.Tag2;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.ProductInfo;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Property;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Property.Tag;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service.Argument3;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service.Argument4;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductInfoForTmallGenieResponseUnmarshaller {

	public static QueryProductInfoForTmallGenieResponse unmarshall(QueryProductInfoForTmallGenieResponse queryProductInfoForTmallGenieResponse, UnmarshallerContext context) {
		
		queryProductInfoForTmallGenieResponse.setRequestId(context.stringValue("QueryProductInfoForTmallGenieResponse.RequestId"));
		queryProductInfoForTmallGenieResponse.setSuccess(context.booleanValue("QueryProductInfoForTmallGenieResponse.Success"));
		queryProductInfoForTmallGenieResponse.setCode(context.stringValue("QueryProductInfoForTmallGenieResponse.Code"));
		queryProductInfoForTmallGenieResponse.setErrorMessage(context.stringValue("QueryProductInfoForTmallGenieResponse.ErrorMessage"));
		queryProductInfoForTmallGenieResponse.setDslString(context.stringValue("QueryProductInfoForTmallGenieResponse.DslString"));
		queryProductInfoForTmallGenieResponse.setMapping(context.mapValue("QueryProductInfoForTmallGenieResponse.Mapping"));

		ProductInfo productInfo = new ProductInfo();
		productInfo.setGmtCreate(context.longValue("QueryProductInfoForTmallGenieResponse.ProductInfo.GmtCreate"));
		productInfo.setDataFormat(context.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.DataFormat"));
		productInfo.setDescription(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Description"));
		productInfo.setDeviceCount(context.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.DeviceCount"));
		productInfo.setNodeType(context.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.NodeType"));
		productInfo.setProductKey(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductKey"));
		productInfo.setProductName(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductName"));
		productInfo.setProductSecret(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductSecret"));
		productInfo.setCategoryName(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.CategoryName"));
		productInfo.setCategoryKey(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.CategoryKey"));
		productInfo.setAliyunCommodityCode(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.AliyunCommodityCode"));
		productInfo.setId2(context.booleanValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Id2"));
		productInfo.setProtocolType(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProtocolType"));
		productInfo.setProductStatus(context.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductStatus"));
		productInfo.setOwner(context.booleanValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Owner"));
		productInfo.setNetType(context.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.NetType"));
		queryProductInfoForTmallGenieResponse.setProductInfo(productInfo);

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < context.lengthValue("QueryProductInfoForTmallGenieResponse.Properties.Length"); i++) {
			Property property = new Property();
			property.setTmallFunctionId(context.longValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].TmallFunctionId"));
			property.setThingTemplateKey(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].ThingTemplateKey"));
			property.setDataType(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataType"));
			property.setRwType(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].RwType"));
			property.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Name"));
			property.setDataSpecs(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataSpecs"));
			property.setDataSpecsList(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			property.setTags(tags);

			properties.add(property);
		}
		queryProductInfoForTmallGenieResponse.setProperties(properties);

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("QueryProductInfoForTmallGenieResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setTmallFunctionId(context.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].TmallFunctionId"));
			event.setThingTemplateKey(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].ThingTemplateKey"));
			event.setEventType(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].EventType"));
			event.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Name"));
			event.setIdentifier(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Identifier"));

			List<Argument> outputData = new ArrayList<Argument>();
			for (int j = 0; j < context.lengthValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(context.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Id"));
				argument.setDataType(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataType"));
				argument.setIdentifier(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Identifier"));
				argument.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Name"));
				argument.setParaOrder(context.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument.setDataSpecs(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument.setDataSpecsList(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecsList"));

				outputData.add(argument);
			}
			event.setOutputData(outputData);

			List<Tag2> tags1 = new ArrayList<Tag2>();
			for (int j = 0; j < context.lengthValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags.Length"); j++) {
				Tag2 tag2 = new Tag2();
				tag2.setTagKey(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagKey"));
				tag2.setTagValue(context.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagValue"));

				tags1.add(tag2);
			}
			event.setTags1(tags1);

			events.add(event);
		}
		queryProductInfoForTmallGenieResponse.setEvents(events);

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("QueryProductInfoForTmallGenieResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setTmallFunctionId(context.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].TmallFunctionId"));
			service.setThingTemplateKey(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].ThingTemplateKey"));
			service.setCallType(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].CallType"));
			service.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Name"));
			service.setIdentifier(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Identifier"));

			List<Argument3> inputParams = new ArrayList<Argument3>();
			for (int j = 0; j < context.lengthValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams.Length"); j++) {
				Argument3 argument3 = new Argument3();
				argument3.setId(context.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Id"));
				argument3.setDataType(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataType"));
				argument3.setIdentifier(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Identifier"));
				argument3.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Name"));
				argument3.setParaOrder(context.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument3.setDirection(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Direction"));
				argument3.setDataSpecs(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument3.setDataSpecsList(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecsList"));

				inputParams.add(argument3);
			}
			service.setInputParams(inputParams);

			List<Argument4> outputParams = new ArrayList<Argument4>();
			for (int j = 0; j < context.lengthValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams.Length"); j++) {
				Argument4 argument4 = new Argument4();
				argument4.setId(context.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Id"));
				argument4.setDataType(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataType"));
				argument4.setIdentifier(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Identifier"));
				argument4.setParaOrder(context.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument4.setDirection(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Direction"));
				argument4.setName(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Name"));
				argument4.setDataSpecs(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument4.setDataSpecsList(context.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecsList"));

				outputParams.add(argument4);
			}
			service.setOutputParams(outputParams);

			services.add(service);
		}
		queryProductInfoForTmallGenieResponse.setServices(services);
	 
	 	return queryProductInfoForTmallGenieResponse;
	}
}