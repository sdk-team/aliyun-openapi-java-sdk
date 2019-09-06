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
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service.Argument4;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service.Argument5;
import com.aliyuncs.iot.model.v20190730.QueryProductInfoForTmallGenieResponse.Service.Tag6;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductInfoForTmallGenieResponseUnmarshaller {

	public static QueryProductInfoForTmallGenieResponse unmarshall(QueryProductInfoForTmallGenieResponse queryProductInfoForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		queryProductInfoForTmallGenieResponse.setRequestId(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.RequestId"));
		queryProductInfoForTmallGenieResponse.setSuccess(_ctx.booleanValue("QueryProductInfoForTmallGenieResponse.Success"));
		queryProductInfoForTmallGenieResponse.setCode(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Code"));
		queryProductInfoForTmallGenieResponse.setErrorMessage(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ErrorMessage"));
		queryProductInfoForTmallGenieResponse.setDslString(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.DslString"));

		ProductInfo productInfo = new ProductInfo();
		productInfo.setGmtCreate(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.GmtCreate"));
		productInfo.setDataFormat(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.DataFormat"));
		productInfo.setDescription(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Description"));
		productInfo.setNodeType(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.NodeType"));
		productInfo.setProductKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductKey"));
		productInfo.setProductName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductName"));
		productInfo.setBrand(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Brand"));
		productInfo.setProductModel(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductModel"));
		productInfo.setProductSecret(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductSecret"));
		productInfo.setCategoryName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.CategoryName"));
		productInfo.setCategoryKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.CategoryKey"));
		productInfo.setAliyunCommodityCode(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.AliyunCommodityCode"));
		productInfo.setId2(_ctx.booleanValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Id2"));
		productInfo.setProtocolType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProtocolType"));
		productInfo.setProductStatus(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ProductStatus"));
		productInfo.setScriptId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.ProductInfo.ScriptId"));
		productInfo.setOwner(_ctx.booleanValue("QueryProductInfoForTmallGenieResponse.ProductInfo.Owner"));
		productInfo.setNetType(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.ProductInfo.NetType"));
		queryProductInfoForTmallGenieResponse.setProductInfo(productInfo);

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Properties.Length"); i++) {
			Property property = new Property();
			property.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].TmallFunctionId"));
			property.setThingTemplateKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].ThingTemplateKey"));
			property.setDataType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataType"));
			property.setRwType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].RwType"));
			property.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Name"));
			property.setDataSpecs(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataSpecs"));
			property.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Identifier"));
			property.setDescription(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Description"));
			property.setDataSpecsList(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			property.setTags(tags);

			properties.add(property);
		}
		queryProductInfoForTmallGenieResponse.setProperties(properties);

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].TmallFunctionId"));
			event.setThingTemplateKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].ThingTemplateKey"));
			event.setEventType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].EventType"));
			event.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Name"));
			event.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Identifier"));
			event.setDescription(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Description"));

			List<Argument> outputData = new ArrayList<Argument>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Id"));
				argument.setDataType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataType"));
				argument.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Identifier"));
				argument.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Name"));
				argument.setParaOrder(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument.setDataSpecs(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument.setDataSpecsList(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecsList"));
				argument.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].TmallFunctionId"));

				outputData.add(argument);
			}
			event.setOutputData(outputData);

			List<Tag2> tags1 = new ArrayList<Tag2>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags.Length"); j++) {
				Tag2 tag2 = new Tag2();
				tag2.setTagKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagKey"));
				tag2.setTagValue(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagValue"));

				tags1.add(tag2);
			}
			event.setTags1(tags1);

			events.add(event);
		}
		queryProductInfoForTmallGenieResponse.setEvents(events);

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].TmallFunctionId"));
			service.setThingTemplateKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].ThingTemplateKey"));
			service.setCallType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].CallType"));
			service.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Name"));
			service.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Identifier"));
			service.setDescription(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Description"));

			List<Argument4> inputParams = new ArrayList<Argument4>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams.Length"); j++) {
				Argument4 argument4 = new Argument4();
				argument4.setId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Id"));
				argument4.setDataType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataType"));
				argument4.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Identifier"));
				argument4.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Name"));
				argument4.setParaOrder(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].ParaOrder"));
				argument4.setDirection(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].Direction"));
				argument4.setDataSpecs(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecs"));
				argument4.setDataSpecsList(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].DataSpecsList"));
				argument4.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].InputParams["+ j +"].TmallFunctionId"));

				inputParams.add(argument4);
			}
			service.setInputParams(inputParams);

			List<Argument5> outputParams = new ArrayList<Argument5>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams.Length"); j++) {
				Argument5 argument5 = new Argument5();
				argument5.setId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Id"));
				argument5.setDataType(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataType"));
				argument5.setIdentifier(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Identifier"));
				argument5.setParaOrder(_ctx.integerValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].ParaOrder"));
				argument5.setDirection(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Direction"));
				argument5.setName(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].Name"));
				argument5.setDataSpecs(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecs"));
				argument5.setDataSpecsList(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].DataSpecsList"));
				argument5.setTmallFunctionId(_ctx.longValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].OutputParams["+ j +"].TmallFunctionId"));

				outputParams.add(argument5);
			}
			service.setOutputParams(outputParams);

			List<Tag6> tags3 = new ArrayList<Tag6>();
			for (int j = 0; j < _ctx.lengthValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Tags.Length"); j++) {
				Tag6 tag6 = new Tag6();
				tag6.setTagKey(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Tags["+ j +"].TagKey"));
				tag6.setTagValue(_ctx.stringValue("QueryProductInfoForTmallGenieResponse.Services["+ i +"].Tags["+ j +"].TagValue"));

				tags3.add(tag6);
			}
			service.setTags3(tags3);

			services.add(service);
		}
		queryProductInfoForTmallGenieResponse.setServices(services);
	 
	 	return queryProductInfoForTmallGenieResponse;
	}
}