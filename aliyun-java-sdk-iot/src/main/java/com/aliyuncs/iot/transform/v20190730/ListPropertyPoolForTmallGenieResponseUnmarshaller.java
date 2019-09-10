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

	public static ListPropertyPoolForTmallGenieResponse unmarshall(ListPropertyPoolForTmallGenieResponse listPropertyPoolForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		listPropertyPoolForTmallGenieResponse.setRequestId(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.RequestId"));
		listPropertyPoolForTmallGenieResponse.setSuccess(_ctx.booleanValue("ListPropertyPoolForTmallGenieResponse.Success"));
		listPropertyPoolForTmallGenieResponse.setCode(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Code"));
		listPropertyPoolForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.ErrorMessage"));
		listPropertyPoolForTmallGenieResponse.setTotal(_ctx.integerValue("ListPropertyPoolForTmallGenieResponse.Total"));
		listPropertyPoolForTmallGenieResponse.setPageId(_ctx.integerValue("ListPropertyPoolForTmallGenieResponse.PageId"));
		listPropertyPoolForTmallGenieResponse.setPageSize(_ctx.integerValue("ListPropertyPoolForTmallGenieResponse.PageSize"));

		List<Property> properties = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("ListPropertyPoolForTmallGenieResponse.Properties.Length"); i++) {
			Property property = new Property();
			property.setTmallFunctionId(_ctx.longValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].TmallFunctionId"));
			property.setThingTemplateKey(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].ThingTemplateKey"));
			property.setDataType(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataType"));
			property.setIdentifier(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Identifier"));
			property.setDescription(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Description"));
			property.setRwType(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].RwType"));
			property.setName(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Name"));
			property.setDataSpecs(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataSpecs"));
			property.setDataSpecsList(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].DataSpecsList"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ListPropertyPoolForTmallGenieResponse.Properties["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			property.setTags(tags);

			properties.add(property);
		}
		listPropertyPoolForTmallGenieResponse.setProperties(properties);
	 
	 	return listPropertyPoolForTmallGenieResponse;
	}
}