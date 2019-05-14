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

import com.aliyuncs.acs.model.v20150101.GetProductDocumentResponse;
import com.aliyuncs.acs.model.v20150101.GetProductDocumentResponse.DomainDoc;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductDocumentResponseUnmarshaller {

	public static GetProductDocumentResponse unmarshall(GetProductDocumentResponse getProductDocumentResponse, UnmarshallerContext context) {
		
		getProductDocumentResponse.setProduct(context.stringValue("GetProductDocumentResponse.product"));
		getProductDocumentResponse.setTitle(context.stringValue("GetProductDocumentResponse.title"));
		getProductDocumentResponse.setLanguage(context.stringValue("GetProductDocumentResponse.language"));
		getProductDocumentResponse.setSite(context.stringValue("GetProductDocumentResponse.site"));
		getProductDocumentResponse.setUseRam(context.booleanValue("GetProductDocumentResponse.useRam"));
		getProductDocumentResponse.setRamDescription(context.booleanValue("GetProductDocumentResponse.RamDescription"));
		getProductDocumentResponse.setDescription(context.stringValue("GetProductDocumentResponse.Description"));

		List<DomainDoc> domainDocList = new ArrayList<DomainDoc>();
		for (int i = 0; i < context.lengthValue("GetProductDocumentResponse.DomainDocList.Length"); i++) {
			DomainDoc domainDoc = new DomainDoc();
			domainDoc.setDomain(context.stringValue("GetProductDocumentResponse.DomainDocList["+ i +"].domain"));
			domainDoc.setTagName(context.stringValue("GetProductDocumentResponse.DomainDocList["+ i +"].tagName"));

			domainDocList.add(domainDoc);
		}
		getProductDocumentResponse.setDomainDocList(domainDocList);
	 
	 	return getProductDocumentResponse;
	}
}