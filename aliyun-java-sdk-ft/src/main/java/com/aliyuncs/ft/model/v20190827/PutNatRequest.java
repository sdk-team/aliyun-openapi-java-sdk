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

package com.aliyuncs.ft.model.v20190827;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutNatRequest extends RoaAcsRequest<PutNatResponse> {
	   

	private Integer personAge;

	private Float personHeight;

	private List<String> personSonss;

	private String personFood;

	private Long personDate;

	private Boolean personGender;

	private String personName;
	public PutNatRequest() {
		super("Ft", "2019-08-27", "PutNat");
		setUriPattern("/web/queryData");
		setMethod(MethodType.PUT);
	}

	public Integer getPersonAge() {
		return this.personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
		if(personAge != null){
			putQueryParameter("PersonAge", personAge.toString());
		}
	}

	public Float getPersonHeight() {
		return this.personHeight;
	}

	public void setPersonHeight(Float personHeight) {
		this.personHeight = personHeight;
		if(personHeight != null){
			putBodyParameter("PersonHeight", personHeight.toString());
		}
	}

	public List<String> getPersonSonss() {
		return this.personSonss;
	}

	public void setPersonSonss(List<String> personSonss) {
		this.personSonss = personSonss;	
		if (personSonss != null) {
			for (int i = 0; i < personSonss.size(); i++) {
				putQueryParameter("PersonSons." + (i + 1) , personSonss.get(i));
			}
		}	
	}

	public String getPersonFood() {
		return this.personFood;
	}

	public void setPersonFood(String personFood) {
		this.personFood = personFood;
		if(personFood != null){
			putQueryParameter("PersonFood", personFood);
		}
	}

	public Long getPersonDate() {
		return this.personDate;
	}

	public void setPersonDate(Long personDate) {
		this.personDate = personDate;
		if(personDate != null){
			putBodyParameter("PersonDate", personDate.toString());
		}
	}

	public Boolean getPersonGender() {
		return this.personGender;
	}

	public void setPersonGender(Boolean personGender) {
		this.personGender = personGender;
		if(personGender != null){
			putQueryParameter("PersonGender", personGender.toString());
		}
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
		if(personName != null){
			putQueryParameter("PersonName", personName);
		}
	}

	@Override
	public Class<PutNatResponse> getResponseClass() {
		return PutNatResponse.class;
	}

}
