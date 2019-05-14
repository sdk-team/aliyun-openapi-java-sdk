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

import com.aliyuncs.acs.model.v20150101.GetApiBackupListResponse;
import com.aliyuncs.acs.model.v20150101.GetApiBackupListResponse.ApiBackup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiBackupListResponseUnmarshaller {

	public static GetApiBackupListResponse unmarshall(GetApiBackupListResponse getApiBackupListResponse, UnmarshallerContext context) {
		

		List<ApiBackup> apiBackups = new ArrayList<ApiBackup>();
		for (int i = 0; i < context.lengthValue("GetApiBackupListResponse.ApiBackups.Length"); i++) {
			ApiBackup apiBackup = new ApiBackup();
			apiBackup.setBackupId(context.longValue("GetApiBackupListResponse.ApiBackups["+ i +"].backupId"));
			apiBackup.setName(context.stringValue("GetApiBackupListResponse.ApiBackups["+ i +"].name"));
			apiBackup.setTime(context.stringValue("GetApiBackupListResponse.ApiBackups["+ i +"].time"));

			apiBackups.add(apiBackup);
		}
		getApiBackupListResponse.setApiBackups(apiBackups);
	 
	 	return getApiBackupListResponse;
	}
}