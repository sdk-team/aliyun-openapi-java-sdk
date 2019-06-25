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

import com.aliyuncs.iot.model.v20190730.ListEventPoolForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListEventPoolForTmallGenieResponse.Event;
import com.aliyuncs.iot.model.v20190730.ListEventPoolForTmallGenieResponse.Event.Argument;
import com.aliyuncs.iot.model.v20190730.ListEventPoolForTmallGenieResponse.Event.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventPoolForTmallGenieResponseUnmarshaller {

	public static ListEventPoolForTmallGenieResponse unmarshall(ListEventPoolForTmallGenieResponse listEventPoolForTmallGenieResponse, UnmarshallerContext context) {
		
		listEventPoolForTmallGenieResponse.setRequestId(context.stringValue("ListEventPoolForTmallGenieResponse.RequestId"));
		listEventPoolForTmallGenieResponse.setSuccess(context.booleanValue("ListEventPoolForTmallGenieResponse.Success"));
		listEventPoolForTmallGenieResponse.setCode(context.stringValue("ListEventPoolForTmallGenieResponse.Code"));
		listEventPoolForTmallGenieResponse.setErrorMessage(context.stringValue("ListEventPoolForTmallGenieResponse.ErrorMessage"));
		listEventPoolForTmallGenieResponse.setPageNo(context.integerValue("ListEventPoolForTmallGenieResponse.PageNo"));
		listEventPoolForTmallGenieResponse.setTotal(context.integerValue("ListEventPoolForTmallGenieResponse.Total"));
		listEventPoolForTmallGenieResponse.setPageSize(context.integerValue("ListEventPoolForTmallGenieResponse.PageSize"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("ListEventPoolForTmallGenieResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setTmallFunctionId(context.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].TmallFunctionId"));
			event.setThingTemplateKey(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].ThingTemplateKey"));
			event.setEventType(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].EventType"));
			event.setName(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Name"));
			event.setIdentifier(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Identifier"));

			List<Argument> outputData = new ArrayList<Argument>();
			for (int j = 0; j < context.lengthValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(context.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Id"));
				argument.setDataType(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataType"));
				argument.setIdentifier(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Identifier"));
				argument.setName(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Name"));
				argument.setParaOrder(context.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument.setDataSpecs(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument.setDataSpecsList(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecsList"));

				outputData.add(argument);
			}
			event.setOutputData(outputData);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			event.setTags(tags);

			events.add(event);
		}
		listEventPoolForTmallGenieResponse.setEvents(events);
	 
	 	return listEventPoolForTmallGenieResponse;
	}
}