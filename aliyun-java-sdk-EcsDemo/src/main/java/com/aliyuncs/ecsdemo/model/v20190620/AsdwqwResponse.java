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

package com.aliyuncs.ecsdemo.model.v20190620;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsdemo.transform.v20190620.AsdwqwResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AsdwqwResponse extends AcsResponse {

	private String add;

	private Float dda;

	private List<Vv> aBC;

	private List<Map<Object,Object>> dds;

	private List<String> ko;

	public String getAdd() {
		return this.add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Float getDda() {
		return this.dda;
	}

	public void setDda(Float dda) {
		this.dda = dda;
	}

	public List<Vv> getABC() {
		return this.aBC;
	}

	public void setABC(List<Vv> aBC) {
		this.aBC = aBC;
	}

	public List<Map<Object,Object>> getDds() {
		return this.dds;
	}

	public void setDds(List<Map<Object,Object>> dds) {
		this.dds = dds;
	}

	public List<String> getKo() {
		return this.ko;
	}

	public void setKo(List<String> ko) {
		this.ko = ko;
	}

	public static class Vv {

		private Long dDsssfcao;

		private List<Dsss> aasdsdfs11;

		private List<String> sDfsdw;

		private Asdqd asdqd;

		public Long getDDsssfcao() {
			return this.dDsssfcao;
		}

		public void setDDsssfcao(Long dDsssfcao) {
			this.dDsssfcao = dDsssfcao;
		}

		public List<Dsss> getAasdsdfs11() {
			return this.aasdsdfs11;
		}

		public void setAasdsdfs11(List<Dsss> aasdsdfs11) {
			this.aasdsdfs11 = aasdsdfs11;
		}

		public List<String> getSDfsdw() {
			return this.sDfsdw;
		}

		public void setSDfsdw(List<String> sDfsdw) {
			this.sDfsdw = sDfsdw;
		}

		public Asdqd getAsdqd() {
			return this.asdqd;
		}

		public void setAsdqd(Asdqd asdqd) {
			this.asdqd = asdqd;
		}

		public static class Dsss {

			private Map<Object,Object> aDasdafsgs;

			private Boolean kKasdasd;

			public Map<Object,Object> getADasdafsgs() {
				return this.aDasdafsgs;
			}

			public void setADasdafsgs(Map<Object,Object> aDasdafsgs) {
				this.aDasdafsgs = aDasdafsgs;
			}

			public Boolean getKKasdasd() {
				return this.kKasdasd;
			}

			public void setKKasdasd(Boolean kKasdasd) {
				this.kKasdasd = kKasdasd;
			}
		}

		public static class Asdqd {

			private Boolean ssdas;

			public Boolean getSsdas() {
				return this.ssdas;
			}

			public void setSsdas(Boolean ssdas) {
				this.ssdas = ssdas;
			}
		}
	}

	@Override
	public AsdwqwResponse getInstance(UnmarshallerContext context) {
		return	AsdwqwResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
