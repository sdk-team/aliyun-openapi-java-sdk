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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AsdwqwRequest extends RpcAcsRequest<AsdwqwResponse> {
	   

	private String clusterId;

	private Float sas;

	private List<Res> ress;

	private List<ResB> resBs;
	public AsdwqwRequest() {
		super("EcsDemo", "2019-06-20", "Asdwqw");
		setMethod(MethodType.PUT);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Float getSas() {
		return this.sas;
	}

	public void setSas(Float sas) {
		this.sas = sas;
		if(sas != null){
			putBodyParameter("Sas", sas.toString());
		}
	}

	public List<Res> getRess() {
		return this.ress;
	}

	public void setRess(List<Res> ress) {
		this.ress = ress;	
		if (ress != null) {
			for (int depth1 = 0; depth1 < ress.size(); depth1++) {
				if (ress.get(depth1).getSsss() != null) {
					for (int depth2 = 0; depth2 < ress.get(depth1).getSsss().size(); depth2++) {
						if (ress.get(depth1).getSsss().get(depth2).getAcaonimas() != null) {
							for (int depth3 = 0; depth3 < ress.get(depth1).getSsss().get(depth2).getAcaonimas().size(); depth3++) {
								if (ress.get(depth1).getSsss().get(depth2).getAcaonimas().get(depth3).getTcaonimas() != null) {
									for (int i = 0; i < ress.get(depth1).getSsss().get(depth2).getAcaonimas().get(depth3).getTcaonimas().size(); i++) {
										putQueryParameter("Res." + (depth1 + 1) + ".Sss." + (depth2 + 1) + ".Acaonima." + (depth3 + 1) + ".Tcaonima." + (i + 1) , ress.get(depth1).getSsss().get(depth2).getAcaonimas().get(depth3).getTcaonimas().get(i));
									}
								}
							}
						}
					}
				}
				putQueryParameter("Res." + (depth1 + 1) + ".Asda1" , ress.get(depth1).getAsda1());
			}
		}	
	}

	public List<ResB> getResBs() {
		return this.resBs;
	}

	public void setResBs(List<ResB> resBs) {
		this.resBs = resBs;	
		if (resBs != null) {
			for (int depth1 = 0; depth1 < resBs.size(); depth1++) {
				putBodyParameter("ResB." + (depth1 + 1) + ".ResBB" , resBs.get(depth1).getResBB());
				if (resBs.get(depth1).getROSs() != null) {
					for (int i = 0; i < resBs.get(depth1).getROSs().size(); i++) {
						putBodyParameter("ResB." + (depth1 + 1) + ".ROS." + (i + 1) , resBs.get(depth1).getROSs().get(i));
					}
				}
				putBodyParameter("ResB." + (depth1 + 1) + ".ResBA" , resBs.get(depth1).getResBA());
			}
		}	
	}

	public static class Res {

		private List<Sss> ssss;

		private Float asda1;

		public List<Sss> getSsss() {
			return this.ssss;
		}

		public void setSsss(List<Sss> ssss) {
			this.ssss = ssss;
		}

		public Float getAsda1() {
			return this.asda1;
		}

		public void setAsda1(Float asda1) {
			this.asda1 = asda1;
		}

		public static class Sss {

			private List<Acaonima> acaonimas;

			public List<Acaonima> getAcaonimas() {
				return this.acaonimas;
			}

			public void setAcaonimas(List<Acaonima> acaonimas) {
				this.acaonimas = acaonimas;
			}

			public static class Acaonima {

				private List<Gson> tcaonimas;

				public List<Gson> getTcaonimas() {
					return this.tcaonimas;
				}

				public void setTcaonimas(List<Gson> tcaonimas) {
					this.tcaonimas = tcaonimas;
				}
			}
		}
	}

	public static class ResB {

		private String resBB;

		private List<Gson> rOSs;

		private String resBA;

		public String getResBB() {
			return this.resBB;
		}

		public void setResBB(String resBB) {
			this.resBB = resBB;
		}

		public List<Gson> getROSs() {
			return this.rOSs;
		}

		public void setROSs(List<Gson> rOSs) {
			this.rOSs = rOSs;
		}

		public String getResBA() {
			return this.resBA;
		}

		public void setResBA(String resBA) {
			this.resBA = resBA;
		}
	}

	@Override
	public Class<AsdwqwResponse> getResponseClass() {
		return AsdwqwResponse.class;
	}

}
