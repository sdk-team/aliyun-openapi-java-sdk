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

import com.aliyuncs.iot.model.v20190730.ListThingTemplateForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateForTmallGenieResponse.ThingTemplate;
import com.aliyuncs.iot.model.v20190730.ListThingTemplateForTmallGenieResponse.ThingTemplate.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListThingTemplateForTmallGenieResponseUnmarshaller {

	public static ListThingTemplateForTmallGenieResponse unmarshall(ListThingTemplateForTmallGenieResponse listThingTemplateForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		listThingTemplateForTmallGenieResponse.setRequestId(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.RequestId"));
		listThingTemplateForTmallGenieResponse.setSuccess(_ctx.booleanValue("ListThingTemplateForTmallGenieResponse.Success"));
		listThingTemplateForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.ErrorMessage"));
		listThingTemplateForTmallGenieResponse.setCode(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Code"));
		listThingTemplateForTmallGenieResponse.setPage(_ctx.integerValue("ListThingTemplateForTmallGenieResponse.Page"));
		listThingTemplateForTmallGenieResponse.setPageSize(_ctx.integerValue("ListThingTemplateForTmallGenieResponse.PageSize"));
		listThingTemplateForTmallGenieResponse.setTotal(_ctx.integerValue("ListThingTemplateForTmallGenieResponse.Total"));

		List<ThingTemplate> data = new ArrayList<ThingTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListThingTemplateForTmallGenieResponse.Data.Length"); i++) {
			ThingTemplate thingTemplate = new ThingTemplate();
			thingTemplate.setThingTemplateKey(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateKey"));
			thingTemplate.setThingTemplateName(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateName"));
			thingTemplate.setThingTemplateId(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			thingTemplate.setTags(tags);

			data.add(thingTemplate);
		}
		listThingTemplateForTmallGenieResponse.setData(data);
	 
	 	return listThingTemplateForTmallGenieResponse;
	}
}