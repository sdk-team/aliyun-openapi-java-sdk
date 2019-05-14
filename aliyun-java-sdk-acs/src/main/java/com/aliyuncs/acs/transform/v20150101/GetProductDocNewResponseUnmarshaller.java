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

import com.aliyuncs.acs.model.v20150101.GetProductDocNewResponse;
import com.aliyuncs.acs.model.v20150101.GetProductDocNewResponse.DomainDoc;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductDocNewResponseUnmarshaller {

	public static GetProductDocNewResponse unmarshall(GetProductDocNewResponse getProductDocNewResponse, UnmarshallerContext context) {
		
		getProductDocNewResponse.setProduct(context.stringValue("GetProductDocNewResponse.product"));
		getProductDocNewResponse.setTitle(context.stringValue("GetProductDocNewResponse.title"));
		getProductDocNewResponse.setLanguage(context.stringValue("GetProductDocNewResponse.language"));
		getProductDocNewResponse.setUseRam(context.booleanValue("GetProductDocNewResponse.useRam"));
		getProductDocNewResponse.setRamDescription(context.stringValue("GetProductDocNewResponse.RamDescription"));
		getProductDocNewResponse.setDescription(context.stringValue("GetProductDocNewResponse.Description"));

		List<DomainDoc> domainDocList = new ArrayList<DomainDoc>();
		for (int i = 0; i < context.lengthValue("GetProductDocNewResponse.DomainDocList.Length"); i++) {
			DomainDoc domainDoc = new DomainDoc();
			domainDoc.setDomain(context.stringValue("GetProductDocNewResponse.DomainDocList["+ i +"].domain"));
			domainDoc.setTagName(context.stringValue("GetProductDocNewResponse.DomainDocList["+ i +"].tagName"));

			domainDocList.add(domainDoc);
		}
		getProductDocNewResponse.setDomainDocList(domainDocList);
	 
	 	return getProductDocNewResponse;
	}
}