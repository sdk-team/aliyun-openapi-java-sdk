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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeClassListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeClassListResponse.ClassList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClassListResponseUnmarshaller {

	public static DescribeClassListResponse unmarshall(DescribeClassListResponse describeClassListResponse, UnmarshallerContext context) {
		
		describeClassListResponse.setRequestId(context.stringValue("DescribeClassListResponse.RequestId"));

		List<ClassList> items = new ArrayList<ClassList>();
		for (int i = 0; i < context.lengthValue("DescribeClassListResponse.Items.Length"); i++) {
			ClassList classList = new ClassList();
			classList.setClassGroup(context.stringValue("DescribeClassListResponse.Items["+ i +"].ClassGroup"));
			classList.setClassCode(context.stringValue("DescribeClassListResponse.Items["+ i +"].ClassCode"));
			classList.setCpu(context.stringValue("DescribeClassListResponse.Items["+ i +"].Cpu"));
			classList.setMaxConnections(context.stringValue("DescribeClassListResponse.Items["+ i +"].MaxConnections"));
			classList.setMaxIOPS(context.stringValue("DescribeClassListResponse.Items["+ i +"].MaxIOPS"));
			classList.setReferencePrice(context.stringValue("DescribeClassListResponse.Items["+ i +"].ReferencePrice"));
			classList.setMemoryClass(context.stringValue("DescribeClassListResponse.Items["+ i +"].MemoryClass"));

			items.add(classList);
		}
		describeClassListResponse.setItems(items);
	 
	 	return describeClassListResponse;
	}
}