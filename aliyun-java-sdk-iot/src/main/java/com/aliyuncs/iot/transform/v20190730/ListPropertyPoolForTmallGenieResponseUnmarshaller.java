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

import com.aliyuncs.iot.model.v20190730.ListPropertyPoolForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.ListPropertyPoolForTmallGenieResponse.Property;
import com.aliyuncs.iot.model.v20190730.ListPropertyPoolForTmallGenieResponse.Property.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPropertyPoolForTmallGenieResponseUnmarshaller {

	public static ListPropertyPoolForTmallGenieResponse unmarshall(ListPropertyPoolForTmallGenieResponse listPropertyPoolForTmallGenieResponse, UnmarshallerContext context) {
		
		listPropertyPoolForTmallGenieResponse.setRequestId(context.stringValue("ListPropertyPoolForTmallGenieResponse.RequestId"));
		listPropertyPoolForTmallGenieResponse.setSuccess(context.booleanValue("ListPropertyPoolForTmallGenieResponse.Success"));
		listPropertyPoolForTmallGenieResponse.setCode(context.stringValue("ListPropertyPoolForTmallGenieResponse.Code"));
		listPropertyPoolForTmallGenieResponse.setErrorMessage(context.stringValue("ListPropertyPoolForTmallGenieResponse.ErrorMessage"));
		listPropertyPoolForTmallGenieResponse.setTotal(context.integerValue("ListPropertyPoolForTmallGenieResponse.Total"));
		listPropertyPoolForTmallGenieResponse.setPageId(context.integerValue("ListPropertyPoolForTmallGenieResponse.PageId"));
		listPropertyPoolForTmallGenieResponse.setPageSize(context.integerValue("ListPropertyPoolForTmallGenieResponse.PageSize"));

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < context.lengthValue("ListPropertyPoolForTmallGenieResponse.Properties.Length"); i++) {
			Property property = new Property();
			property.setTmallFunctionId(context.longValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].TmallFunctionId"));
			property.setThingTemplateKey(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].ThingTemplateKey"));
			property.setDataType(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataType"));
			property.setRwType(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].RwType"));
			property.setName(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Name"));
			property.setDataSpecs(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataSpecs"));
			property.setDataSpecsList(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			property.setTags(tags);

			properties.add(property);
		}
		listPropertyPoolForTmallGenieResponse.setProperties(properties);
	 
	 	return listPropertyPoolForTmallGenieResponse;
	}
}