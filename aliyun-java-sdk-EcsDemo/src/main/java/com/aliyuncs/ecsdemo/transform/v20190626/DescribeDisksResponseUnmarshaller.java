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

package com.aliyuncs.ecsdemo.transform.v20190626;

import com.aliyuncs.ecsdemo.model.v20190626.DescribeDisksResponse;
import com.aliyuncs.ecsdemo.model.v20190626.DescribeDisksResponse.Disks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisksResponseUnmarshaller {

	public static DescribeDisksResponse unmarshall(DescribeDisksResponse describeDisksResponse, UnmarshallerContext _ctx) {
		
		describeDisksResponse.setRequestId(_ctx.stringValue("DescribeDisksResponse.RequestId"));
		describeDisksResponse.setPageNumber(_ctx.integerValue("DescribeDisksResponse.PageNumber"));
		describeDisksResponse.setPageSize(_ctx.integerValue("DescribeDisksResponse.PageSize"));
		describeDisksResponse.setTotalCount(_ctx.integerValue("DescribeDisksResponse.TotalCount"));

		Disks disks = new Disks();
		disks.setDiskId(_ctx.stringValue("DescribeDisksResponse.Disks.DiskId"));
		disks.setDiskName(_ctx.stringValue("DescribeDisksResponse.Disks.DiskName"));
		disks.setCreationTime(_ctx.stringValue("DescribeDisksResponse.Disks.CreationTime"));
		describeDisksResponse.setDisks(disks);
	 
	 	return describeDisksResponse;
	}
}