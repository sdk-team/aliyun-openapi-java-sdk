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

package com.aliyuncs.ecsdemo.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsdemo.model.v20190620.SvResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SvResponseUnmarshaller {

	public static SvResponse unmarshall(SvResponse svResponse, UnmarshallerContext _ctx) {
		
		svResponse.setRequestId(_ctx.stringValue("SvResponse.RequestId"));

		List<String> aa = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SvResponse.Aa.Length"); i++) {
			aa.add(_ctx.stringValue("SvResponse.Aa["+ i +"]"));
		}
		svResponse.setAa(aa);
	 
	 	return svResponse;
	}
}