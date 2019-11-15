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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.InnerIsChannelMerchantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerIsChannelMerchantResponse extends AcsResponse {

	private String requestId;

	private EcsChannel ecsChannel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EcsChannel getEcsChannel() {
		return this.ecsChannel;
	}

	public void setEcsChannel(EcsChannel ecsChannel) {
		this.ecsChannel = ecsChannel;
	}

	public static class EcsChannel {

		private Boolean isChannelMerchant;

		private Long aliUid;

		private String bid;

		private String channel;

		private String instanceId;

		public Boolean getIsChannelMerchant() {
			return this.isChannelMerchant;
		}

		public void setIsChannelMerchant(Boolean isChannelMerchant) {
			this.isChannelMerchant = isChannelMerchant;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public InnerIsChannelMerchantResponse getInstance(UnmarshallerContext context) {
		return	InnerIsChannelMerchantResponseUnmarshaller.unmarshall(this, context);
	}
}
