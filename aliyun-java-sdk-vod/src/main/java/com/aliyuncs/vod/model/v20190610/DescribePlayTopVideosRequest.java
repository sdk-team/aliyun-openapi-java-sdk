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

package com.aliyuncs.vod.model.v20190610;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePlayTopVideosRequest extends RpcAcsRequest<DescribePlayTopVideosResponse> {
	   

	private Long pageSize;

	private Long ownerId;

	private String bizDate;

	private Long pageNo;
	public DescribePlayTopVideosRequest() {
		super("vod", "2019-06-10", "DescribePlayTopVideos", "vod");
		setMethod(MethodType.POST);
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getBizDate() {
		return this.bizDate;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
		if(bizDate != null){
			putQueryParameter("BizDate", bizDate);
		}
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	@Override
	public Class<DescribePlayTopVideosResponse> getResponseClass() {
		return DescribePlayTopVideosResponse.class;
	}

}
