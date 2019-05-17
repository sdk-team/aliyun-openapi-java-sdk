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

import com.aliyuncs.rds.model.v20130528.CreateImportDataUploadResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImportDataUploadResponseUnmarshaller {

	public static CreateImportDataUploadResponse unmarshall(CreateImportDataUploadResponse createImportDataUploadResponse, UnmarshallerContext context) {
		
		createImportDataUploadResponse.setRequestId(context.stringValue("CreateImportDataUploadResponse.RequestId"));
		createImportDataUploadResponse.setFtpServer(context.stringValue("CreateImportDataUploadResponse.FtpServer"));
		createImportDataUploadResponse.setPort(context.integerValue("CreateImportDataUploadResponse.Port"));
		createImportDataUploadResponse.setUserName(context.stringValue("CreateImportDataUploadResponse.UserName"));
		createImportDataUploadResponse.setPassword(context.stringValue("CreateImportDataUploadResponse.Password"));
		createImportDataUploadResponse.setFileName(context.stringValue("CreateImportDataUploadResponse.FileName"));
	 
	 	return createImportDataUploadResponse;
	}
}