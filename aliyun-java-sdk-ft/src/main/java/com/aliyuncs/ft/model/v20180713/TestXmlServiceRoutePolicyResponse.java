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

package com.aliyuncs.ft.model.v20180713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.TestXmlServiceRoutePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TestXmlServiceRoutePolicyResponse extends AcsResponse {

	private List<Sdw> db;

	private List<Integer> ban;

	private Add add;

	public List<Sdw> getDb() {
		return this.db;
	}

	public void setDb(List<Sdw> db) {
		this.db = db;
	}

	public List<Integer> getBan() {
		return this.ban;
	}

	public void setBan(List<Integer> ban) {
		this.ban = ban;
	}

	public Add getAdd() {
		return this.add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

	public static class Sdw {

		private Integer _import;

		public Integer get_Import() {
			return this._import;
		}

		public void set_Import(Integer _import) {
			this._import = _import;
		}
	}

	public static class Add {

		private String o;

		public String getO() {
			return this.o;
		}

		public void setO(String o) {
			this.o = o;
		}
	}

	@Override
	public TestXmlServiceRoutePolicyResponse getInstance(UnmarshallerContext context) {
		return	TestXmlServiceRoutePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
