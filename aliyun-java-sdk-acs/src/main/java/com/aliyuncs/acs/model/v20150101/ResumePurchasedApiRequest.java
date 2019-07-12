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

package com.aliyuncs.acs.model.v20150101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResumePurchasedApiRequest extends RoaAcsRequest<ResumePurchasedApiResponse> {
	
	public ResumePurchasedApiRequest() {
		super("Acs", "2015-01-01", "ResumePurchasedApi", "12334");
		setUriPattern("/Api/ResumePurchasedApi");
		setMethod(MethodType.POST);
	}

	private String purchaseProduct;

	private String channel;

	private String purchaseVersion;

	private String purchaseApiName;

	public String getPurchaseProduct() {
		return this.purchaseProduct;
	}

	public void setPurchaseProduct(String purchaseProduct) {
		this.purchaseProduct = purchaseProduct;
		if(purchaseProduct != null){
			putQueryParameter("PurchaseProduct", purchaseProduct);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getPurchaseVersion() {
		return this.purchaseVersion;
	}

	public void setPurchaseVersion(String purchaseVersion) {
		this.purchaseVersion = purchaseVersion;
		if(purchaseVersion != null){
			putQueryParameter("PurchaseVersion", purchaseVersion);
		}
	}

	public String getPurchaseApiName() {
		return this.purchaseApiName;
	}

	public void setPurchaseApiName(String purchaseApiName) {
		this.purchaseApiName = purchaseApiName;
		if(purchaseApiName != null){
			putQueryParameter("PurchaseApiName", purchaseApiName);
		}
	}

	@Override
	public Class<ResumePurchasedApiResponse> getResponseClass() {
		return ResumePurchasedApiResponse.class;
	}

}
