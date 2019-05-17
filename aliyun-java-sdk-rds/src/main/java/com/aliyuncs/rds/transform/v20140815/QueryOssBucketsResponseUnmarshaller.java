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

import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse;
import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse.BucketItem;
import com.aliyuncs.rds.model.v20140815.QueryOssBucketsResponse.BucketItem.Owner;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOssBucketsResponseUnmarshaller {

	public static QueryOssBucketsResponse unmarshall(QueryOssBucketsResponse queryOssBucketsResponse, UnmarshallerContext context) {
		
		queryOssBucketsResponse.setRequestId(context.stringValue("QueryOssBucketsResponse.RequestId"));
		queryOssBucketsResponse.setDBInstanceId(context.stringValue("QueryOssBucketsResponse.DBInstanceId"));

		List<BucketItem> bucket = new ArrayList<BucketItem>();
		for (int i = 0; i < context.lengthValue("QueryOssBucketsResponse.Bucket.Length"); i++) {
			BucketItem bucketItem = new BucketItem();
			bucketItem.setName(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].Name"));
			bucketItem.setLocation(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].Location"));
			bucketItem.setStorageClass(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].StorageClass"));
			bucketItem.setExtranetEndpoint(context.longValue("QueryOssBucketsResponse.Bucket["+ i +"].ExtranetEndpoint"));
			bucketItem.setIntranetEndpoint(context.longValue("QueryOssBucketsResponse.Bucket["+ i +"].IntranetEndpoint"));
			bucketItem.setCreationDate(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].CreationDate"));

			Owner owner = new Owner();
			owner.setDisplayName(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].Owner.DisplayName"));
			owner.setID(context.stringValue("QueryOssBucketsResponse.Bucket["+ i +"].Owner.ID"));
			bucketItem.setOwner(owner);

			bucket.add(bucketItem);
		}
		queryOssBucketsResponse.setBucket(bucket);
	 
	 	return queryOssBucketsResponse;
	}
}