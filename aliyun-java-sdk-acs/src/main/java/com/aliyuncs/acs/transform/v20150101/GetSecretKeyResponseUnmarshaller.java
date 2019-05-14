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

import com.aliyuncs.acs.model.v20150101.GetSecretKeyResponse;
import com.aliyuncs.acs.model.v20150101.GetSecretKeyResponse.SecretKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretKeyResponseUnmarshaller {

	public static GetSecretKeyResponse unmarshall(GetSecretKeyResponse getSecretKeyResponse, UnmarshallerContext context) {
		

		List<SecretKey> secretKeys = new ArrayList<SecretKey>();
		for (int i = 0; i < context.lengthValue("GetSecretKeyResponse.SecretKeys.Length"); i++) {
			SecretKey secretKey = new SecretKey();
			secretKey.setProduct(context.stringValue("GetSecretKeyResponse.SecretKeys["+ i +"].Product"));
			secretKey.setKeyName(context.stringValue("GetSecretKeyResponse.SecretKeys["+ i +"].KeyName"));
			secretKey.setSecretKey(context.stringValue("GetSecretKeyResponse.SecretKeys["+ i +"].SecretKey"));
			secretKey.setDescription(context.stringValue("GetSecretKeyResponse.SecretKeys["+ i +"].Description"));

			secretKeys.add(secretKey);
		}
		getSecretKeyResponse.setSecretKeys(secretKeys);
	 
	 	return getSecretKeyResponse;
	}
}