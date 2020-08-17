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

package com.aliyuncs.sdk.model.v20180101;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DemoRequest extends RoaAcsRequest<DemoResponse> {
	   

	private String price;

	private String name;

	private List<ContentList> contentLists;
	public DemoRequest() {
		super("SDK", "2018-01-01", "Demo");
		setUriPattern("/helloworld");
		setMethod(MethodType.POST);
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
		if(price != null){
			putQueryParameter("Price", price);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<ContentList> getContentLists() {
		return this.contentLists;
	}

	public void setContentLists(List<ContentList> contentLists) {
		this.contentLists = contentLists;	
		if (contentLists != null) {
			for (int depth1 = 0; depth1 < contentLists.size(); depth1++) {
				putBodyParameter("ContentList." + (depth1 + 1) + ".Tag" , contentLists.get(depth1).getTag());
				if (contentLists.get(depth1).getLetterss() != null) {
					for (int i = 0; i < contentLists.get(depth1).getLetterss().size(); i++) {
						putBodyParameter("ContentList." + (depth1 + 1) + ".Letters." + (i + 1) , contentLists.get(depth1).getLetterss().get(i));
					}
				}
			}
		}	
	}

	public static class ContentList {

		private String tag;

		private List<String> letterss;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public List<String> getLetterss() {
			return this.letterss;
		}

		public void setLetterss(List<String> letterss) {
			this.letterss = letterss;
		}
	}

	@Override
	public Class<DemoResponse> getResponseClass() {
		return DemoResponse.class;
	}

}
