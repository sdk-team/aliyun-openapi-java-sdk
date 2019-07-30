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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindCredentialsListResponse;
import com.aliyuncs.csb.model.v20171118.FindCredentialsListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindCredentialsListResponse.Data.Credential;
import com.aliyuncs.csb.model.v20171118.FindCredentialsListResponse.Data.Credential.CurrentCredential;
import com.aliyuncs.csb.model.v20171118.FindCredentialsListResponse.Data.Credential.NewCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCredentialsListResponseUnmarshaller {

	public static FindCredentialsListResponse unmarshall(FindCredentialsListResponse findCredentialsListResponse, UnmarshallerContext _ctx) {
		
		findCredentialsListResponse.setRequestId(_ctx.stringValue("FindCredentialsListResponse.RequestId"));
		findCredentialsListResponse.setCode(_ctx.integerValue("FindCredentialsListResponse.Code"));
		findCredentialsListResponse.setMessage(_ctx.stringValue("FindCredentialsListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindCredentialsListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindCredentialsListResponse.Data.PageNumber"));

		List<Credential> credentialList = new ArrayList<Credential>();
		for (int i = 0; i < _ctx.lengthValue("FindCredentialsListResponse.Data.CredentialList.Length"); i++) {
			Credential credential = new Credential();
			credential.setGmtCreate(_ctx.longValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].GmtCreate"));
			credential.setId(_ctx.longValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].Id"));
			credential.setName(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].Name"));
			credential.setOwnerAttr(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].OwnerAttr"));
			credential.setUserId(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].UserId"));

			CurrentCredential currentCredential = new CurrentCredential();
			currentCredential.setAccessKey(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].CurrentCredential.AccessKey"));
			currentCredential.setSecretKey(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].CurrentCredential.SecretKey"));
			credential.setCurrentCredential(currentCredential);

			NewCredential newCredential = new NewCredential();
			newCredential.setAccessKey(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].NewCredential.AccessKey"));
			newCredential.setSecretKey(_ctx.stringValue("FindCredentialsListResponse.Data.CredentialList["+ i +"].NewCredential.SecretKey"));
			credential.setNewCredential(newCredential);

			credentialList.add(credential);
		}
		data.setCredentialList(credentialList);
		findCredentialsListResponse.setData(data);
	 
	 	return findCredentialsListResponse;
	}
}