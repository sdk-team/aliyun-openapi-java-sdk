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

import com.aliyuncs.ecsdemo.model.v20190620.GetTestResource004Response;
import com.aliyuncs.ecsdemo.model.v20190620.GetTestResource004Response.Karr;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTestResource004ResponseUnmarshaller {

	public static GetTestResource004Response unmarshall(GetTestResource004Response getTestResource004Response, UnmarshallerContext _ctx) {
		
		getTestResource004Response.setRequestId(_ctx.stringValue("GetTestResource004Response.RequestId"));
		getTestResource004Response.setParamA(_ctx.stringValue("GetTestResource004Response.ParamA"));
		getTestResource004Response.setParamB(_ctx.stringValue("GetTestResource004Response.ParamB"));
		getTestResource004Response.setParamH(_ctx.stringValue("GetTestResource004Response.ParamH"));

		List<String> paramJ = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTestResource004Response.ParamJ.Length"); i++) {
			paramJ.add(_ctx.stringValue("GetTestResource004Response.ParamJ["+ i +"]"));
		}
		getTestResource004Response.setParamJ(paramJ);

		List<Karr> paramY = new ArrayList<Karr>();
		for (int i = 0; i < _ctx.lengthValue("GetTestResource004Response.ParamY.Length"); i++) {
			Karr karr = new Karr();
			karr.setYy1(_ctx.stringValue("GetTestResource004Response.ParamY["+ i +"].yy1"));

			paramY.add(karr);
		}
		getTestResource004Response.setParamY(paramY);
	 
	 	return getTestResource004Response;
	}
}