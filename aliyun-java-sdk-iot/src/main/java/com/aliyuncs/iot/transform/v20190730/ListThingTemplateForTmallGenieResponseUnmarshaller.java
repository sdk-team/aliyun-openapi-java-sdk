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

	public static ListThingTemplateForTmallGenieResponse unmarshall(ListThingTemplateForTmallGenieResponse listThingTemplateForTmallGenieResponse, UnmarshallerContext context) {
		
		listThingTemplateForTmallGenieResponse.setRequestId(context.stringValue("ListThingTemplateForTmallGenieResponse.RequestId"));
		listThingTemplateForTmallGenieResponse.setSuccess(context.booleanValue("ListThingTemplateForTmallGenieResponse.Success"));
		listThingTemplateForTmallGenieResponse.setErrorMessage(context.stringValue("ListThingTemplateForTmallGenieResponse.ErrorMessage"));
		listThingTemplateForTmallGenieResponse.setCode(context.stringValue("ListThingTemplateForTmallGenieResponse.Code"));
		listThingTemplateForTmallGenieResponse.setPage(context.integerValue("ListThingTemplateForTmallGenieResponse.Page"));
		listThingTemplateForTmallGenieResponse.setPageSize(context.integerValue("ListThingTemplateForTmallGenieResponse.PageSize"));
		listThingTemplateForTmallGenieResponse.setTotal(context.integerValue("ListThingTemplateForTmallGenieResponse.Total"));

		List<ThingTemplate> data = new ArrayList<ThingTemplate>();
		for (int i = 0; i < context.lengthValue("ListThingTemplateForTmallGenieResponse.Data.Length"); i++) {
			ThingTemplate thingTemplate = new ThingTemplate();
			thingTemplate.setThingTemplateKey(context.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateKey"));
			thingTemplate.setThingTemplateName(context.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateName"));
			thingTemplate.setThingTemplateId(context.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].ThingTemplateId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("ListThingTemplateForTmallGenieResponse.Data["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			thingTemplate.setTags(tags);

			data.add(thingTemplate);
		}
		listThingTemplateForTmallGenieResponse.setData(data);
	 
	 	return listThingTemplateForTmallGenieResponse;
	}
}