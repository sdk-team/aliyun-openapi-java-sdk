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

package com.aliyuncs.rds.transform.v20130528;

import com.aliyuncs.rds.model.v20130528.CreateBackupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupResponseUnmarshaller {

	public static CreateBackupResponse unmarshall(CreateBackupResponse createBackupResponse, UnmarshallerContext context) {
		
		createBackupResponse.setRequestId(context.stringValue("CreateBackupResponse.RequestId"));
		createBackupResponse.setBackupRetentionPeriod(context.longValue("CreateBackupResponse.BackupRetentionPeriod"));
	 
	 	return createBackupResponse;
	}
}