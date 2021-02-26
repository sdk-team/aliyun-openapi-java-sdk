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

package com.aliyuncs.ft.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ft.model.v20180713.TestXmlServiceRoutePolicyResponse;
import com.aliyuncs.ft.model.v20180713.TestXmlServiceRoutePolicyResponse.Add;
import com.aliyuncs.ft.model.v20180713.TestXmlServiceRoutePolicyResponse.Sdw;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestXmlServiceRoutePolicyResponseUnmarshaller {

	public static TestXmlServiceRoutePolicyResponse unmarshall(TestXmlServiceRoutePolicyResponse testXmlServiceRoutePolicyResponse, UnmarshallerContext _ctx) {
		

		List<Integer> ban = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("TestXmlServiceRoutePolicyResponse.Ban.Length"); i++) {
			ban.add(_ctx.integerValue("TestXmlServiceRoutePolicyResponse.Ban["+ i +"]"));
		}
		testXmlServiceRoutePolicyResponse.setBan(ban);

		Add add = new Add();
		add.setO(_ctx.stringValue("TestXmlServiceRoutePolicyResponse.Add.O"));
		testXmlServiceRoutePolicyResponse.setAdd(add);

		List<Sdw> db = new ArrayList<Sdw>();
		for (int i = 0; i < _ctx.lengthValue("TestXmlServiceRoutePolicyResponse.Db.Length"); i++) {
			Sdw sdw = new Sdw();
			sdw.set_Import(_ctx.integerValue("TestXmlServiceRoutePolicyResponse.Db["+ i +"].Import"));

			db.add(sdw);
		}
		testXmlServiceRoutePolicyResponse.setDb(db);
	 
	 	return testXmlServiceRoutePolicyResponse;
	}
}