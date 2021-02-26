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

import com.aliyuncs.ft.model.v20180713.FtIpFlowControlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FtIpFlowControlResponseUnmarshaller {

	public static FtIpFlowControlResponse unmarshall(FtIpFlowControlResponse ftIpFlowControlResponse, UnmarshallerContext _ctx) {
		
		ftIpFlowControlResponse.setRequestId(_ctx.stringValue("FtIpFlowControlResponse.RequestId"));

		List<String> names = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("FtIpFlowControlResponse.Names.Length"); i++) {
			names.add(_ctx.stringValue("FtIpFlowControlResponse.Names["+ i +"]"));
		}
		ftIpFlowControlResponse.setNames(names);

		List<String> names01 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("FtIpFlowControlResponse.Names01.Length"); i++) {
			names01.add(_ctx.stringValue("FtIpFlowControlResponse.Names01["+ i +"]"));
		}
		ftIpFlowControlResponse.setNames01(names01);

		List<Integer> integerList = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("FtIpFlowControlResponse.IntegerList.Length"); i++) {
			integerList.add(_ctx.integerValue("FtIpFlowControlResponse.IntegerList["+ i +"]"));
		}
		ftIpFlowControlResponse.setIntegerList(integerList);

		List<Integer> integerList1 = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("FtIpFlowControlResponse.IntegerList1.Length"); i++) {
			integerList1.add(_ctx.integerValue("FtIpFlowControlResponse.IntegerList1["+ i +"]"));
		}
		ftIpFlowControlResponse.setIntegerList1(integerList1);
	 
	 	return ftIpFlowControlResponse;
	}
}