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
public class HiFucker4Request extends RpcAcsRequest<HiFucker4Response> {
	   

	private List<String> resourceTypeCodess;

	private String product;

	private Boolean fromCache;

	private String acceptLanguage;

	private Integer pageSize;

	private List<String> filterss;

	private String env;

	private String siteType;

	private Integer pageNumber;
	public HiFucker4Request() {
		super("EcsDemo", "2019-06-20", "HiFucker4");
		setMethod(MethodType.GET);
	}

	public List<String> getResourceTypeCodess() {
		return this.resourceTypeCodess;
	}

	public void setResourceTypeCodess(List<String> resourceTypeCodess) {
		this.resourceTypeCodess = resourceTypeCodess;	
		if (resourceTypeCodess != null) {
			for (int i = 0; i < resourceTypeCodess.size(); i++) {
				putQueryParameter("ResourceTypeCodes." + (i + 1) , resourceTypeCodess.get(i));
			}
		}	
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public Boolean getFromCache() {
		return this.fromCache;
	}

	public void setFromCache(Boolean fromCache) {
		this.fromCache = fromCache;
		if(fromCache != null){
			putQueryParameter("FromCache", fromCache.toString());
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getFilterss() {
		return this.filterss;
	}

	public void setFilterss(List<String> filterss) {
		this.filterss = filterss;	
		if (filterss != null) {
			for (int i = 0; i < filterss.size(); i++) {
				putQueryParameter("Filters." + (i + 1) , filterss.get(i));
			}
		}	
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public String getSiteType() {
		return this.siteType;
	}

	public void setSiteType(String siteType) {
		this.siteType = siteType;
		if(siteType != null){
			putQueryParameter("SiteType", siteType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<HiFucker4Response> getResponseClass() {
		return HiFucker4Response.class;
	}

}
