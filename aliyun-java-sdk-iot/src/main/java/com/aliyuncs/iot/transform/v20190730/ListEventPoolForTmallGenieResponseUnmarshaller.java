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

	public static ListEventPoolForTmallGenieResponse unmarshall(ListEventPoolForTmallGenieResponse listEventPoolForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		listEventPoolForTmallGenieResponse.setRequestId(_ctx.stringValue("ListEventPoolForTmallGenieResponse.RequestId"));
		listEventPoolForTmallGenieResponse.setSuccess(_ctx.booleanValue("ListEventPoolForTmallGenieResponse.Success"));
		listEventPoolForTmallGenieResponse.setCode(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Code"));
		listEventPoolForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ListEventPoolForTmallGenieResponse.ErrorMessage"));
		listEventPoolForTmallGenieResponse.setPageNo(_ctx.integerValue("ListEventPoolForTmallGenieResponse.PageNo"));
		listEventPoolForTmallGenieResponse.setTotal(_ctx.integerValue("ListEventPoolForTmallGenieResponse.Total"));
		listEventPoolForTmallGenieResponse.setPageSize(_ctx.integerValue("ListEventPoolForTmallGenieResponse.PageSize"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("ListEventPoolForTmallGenieResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setTmallFunctionId(_ctx.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].TmallFunctionId"));
			event.setThingTemplateKey(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].ThingTemplateKey"));
			event.setEventType(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].EventType"));
			event.setName(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Name"));
			event.setIdentifier(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Identifier"));

			List<Argument> outputData = new ArrayList<Argument>();
			for (int j = 0; j < _ctx.lengthValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData.Length"); j++) {
				Argument argument = new Argument();
				argument.setId(_ctx.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Id"));
				argument.setDataType(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataType"));
				argument.setIdentifier(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Identifier"));
				argument.setName(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].Name"));
				argument.setParaOrder(_ctx.integerValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].ParaOrder"));
				argument.setDataSpecs(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecs"));
				argument.setDataSpecsList(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].DataSpecsList"));
				argument.setTmallFunctionId(_ctx.longValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].OutputData["+ j +"].TmallFunctionId"));

				outputData.add(argument);
			}
			event.setOutputData(outputData);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListEventPoolForTmallGenieResponse.Events["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			event.setTags(tags);

			events.add(event);
		}
		listEventPoolForTmallGenieResponse.setEvents(events);
	 
	 	return listEventPoolForTmallGenieResponse;
	}
}