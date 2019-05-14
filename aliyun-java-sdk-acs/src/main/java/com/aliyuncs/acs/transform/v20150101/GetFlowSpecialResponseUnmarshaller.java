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

package com.aliyuncs.acs.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.acs.model.v20150101.GetFlowSpecialResponse;
import com.aliyuncs.acs.model.v20150101.GetFlowSpecialResponse.Special;
import com.aliyuncs.acs.model.v20150101.GetFlowSpecialResponse.Special.Section;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowSpecialResponseUnmarshaller {

	public static GetFlowSpecialResponse unmarshall(GetFlowSpecialResponse getFlowSpecialResponse, UnmarshallerContext context) {
		
		getFlowSpecialResponse.setProduct(context.stringValue("GetFlowSpecialResponse.product"));
		getFlowSpecialResponse.setName(context.stringValue("GetFlowSpecialResponse.name"));
		getFlowSpecialResponse.setDescription(context.stringValue("GetFlowSpecialResponse.description"));

		List<Special> specials = new ArrayList<Special>();
		for (int i = 0; i < context.lengthValue("GetFlowSpecialResponse.Specials.Length"); i++) {
			Special special = new Special();
			special.setThreshold(context.stringValue("GetFlowSpecialResponse.Specials["+ i +"].threshold"));
			special.setWhitelist(context.booleanValue("GetFlowSpecialResponse.Specials["+ i +"].whitelist"));

			List<Section> sections = new ArrayList<Section>();
			for (int j = 0; j < context.lengthValue("GetFlowSpecialResponse.Specials["+ i +"].Sections.Length"); j++) {
				Section section = new Section();
				section.setKey(context.stringValue("GetFlowSpecialResponse.Specials["+ i +"].Sections["+ j +"].key"));
				section.setValue(context.stringValue("GetFlowSpecialResponse.Specials["+ i +"].Sections["+ j +"].value"));

				sections.add(section);
			}
			special.setSections(sections);

			specials.add(special);
		}
		getFlowSpecialResponse.setSpecials(specials);
	 
	 	return getFlowSpecialResponse;
	}
}