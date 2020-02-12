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

import com.aliyuncs.ecsdemo.model.v20190620.AsdwqwResponse;
import com.aliyuncs.ecsdemo.model.v20190620.AsdwqwResponse.Vv;
import com.aliyuncs.ecsdemo.model.v20190620.AsdwqwResponse.Vv.Asdqd;
import com.aliyuncs.ecsdemo.model.v20190620.AsdwqwResponse.Vv.Dsss;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AsdwqwResponseUnmarshaller {

	public static AsdwqwResponse unmarshall(AsdwqwResponse asdwqwResponse, UnmarshallerContext _ctx) {
		
		asdwqwResponse.setAdd(_ctx.stringValue("AsdwqwResponse.Add"));
		asdwqwResponse.setDda(_ctx.floatValue("AsdwqwResponse.Dda"));

		List<Map<Object, Object>> dds = _ctx.listMapValue("AsdwqwResponse.Dds");
		asdwqwResponse.setDds(dds);

		List<String> ko = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AsdwqwResponse.Ko.Length"); i++) {
			ko.add(_ctx.stringValue("AsdwqwResponse.Ko["+ i +"]"));
		}
		asdwqwResponse.setKo(ko);

		List<Vv> aBC = new ArrayList<Vv>();
		for (int i = 0; i < _ctx.lengthValue("AsdwqwResponse.ABC.Length"); i++) {
			Vv vv = new Vv();
			vv.setDDsssfcao(_ctx.longValue("AsdwqwResponse.ABC["+ i +"].DDsssfcao"));

			List<String> sDfsdw = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AsdwqwResponse.ABC["+ i +"].SDfsdw.Length"); j++) {
				sDfsdw.add(_ctx.stringValue("AsdwqwResponse.ABC["+ i +"].SDfsdw["+ j +"]"));
			}
			vv.setSDfsdw(sDfsdw);

			Asdqd asdqd = new Asdqd();
			asdqd.setSsdas(_ctx.booleanValue("AsdwqwResponse.ABC["+ i +"].Asdqd.Ssdas"));
			vv.setAsdqd(asdqd);

			List<Dsss> aasdsdfs11 = new ArrayList<Dsss>();
			for (int j = 0; j < _ctx.lengthValue("AsdwqwResponse.ABC["+ i +"].Aasdsdfs11.Length"); j++) {
				Dsss dsss = new Dsss();
				dsss.setADasdafsgs(_ctx.mapValue("AsdwqwResponse.ABC["+ i +"].Aasdsdfs11["+ j +"].ADasdafsgs"));
				dsss.setKKasdasd(_ctx.booleanValue("AsdwqwResponse.ABC["+ i +"].Aasdsdfs11["+ j +"].KKasdasd"));

				aasdsdfs11.add(dsss);
			}
			vv.setAasdsdfs11(aasdsdfs11);

			aBC.add(vv);
		}
		asdwqwResponse.setABC(aBC);
	 
	 	return asdwqwResponse;
	}
}