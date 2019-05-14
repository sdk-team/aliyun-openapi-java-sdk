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

import com.aliyuncs.acs.model.v20150101.GetProductResponse;
import com.aliyuncs.acs.model.v20150101.GetProductResponse.Version;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductResponseUnmarshaller {

	public static GetProductResponse unmarshall(GetProductResponse getProductResponse, UnmarshallerContext context) {
		
		getProductResponse.setName(context.stringValue("GetProductResponse.name"));
		getProductResponse.setDomain(context.stringValue("GetProductResponse.domain"));
		getProductResponse.setType(context.stringValue("GetProductResponse.type"));

		List<Version> versions = new ArrayList<Version>();
		for (int i = 0; i < context.lengthValue("GetProductResponse.Versions.Length"); i++) {
			Version version = new Version();
			version.setName(context.stringValue("GetProductResponse.Versions["+ i +"].name"));

			versions.add(version);
		}
		getProductResponse.setVersions(versions);
	 
	 	return getProductResponse;
	}
}