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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeFCTriggerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFCTriggerResponse extends AcsResponse {

	private String requestId;

	private List<FCTrigger> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FCTrigger> getItems() {
		return this.items;
	}

	public void setItems(List<FCTrigger> items) {
		this.items = items;
	}

	public static class FCTrigger {

		private String triggerId;

		private String triggerArn;

		private String sourceArn;

		private String invocationRoleArn;

		private String functionArn;

		private String instanceId;

		private Integer retry;

		private Integer concurrency;

		private String eventFormat;

		private String region;

		private List<String> subscriptionObjects;

		public String getTriggerId() {
			return this.triggerId;
		}

		public void setTriggerId(String triggerId) {
			this.triggerId = triggerId;
		}

		public String getTriggerArn() {
			return this.triggerArn;
		}

		public void setTriggerArn(String triggerArn) {
			this.triggerArn = triggerArn;
		}

		public String getSourceArn() {
			return this.sourceArn;
		}

		public void setSourceArn(String sourceArn) {
			this.sourceArn = sourceArn;
		}

		public String getInvocationRoleArn() {
			return this.invocationRoleArn;
		}

		public void setInvocationRoleArn(String invocationRoleArn) {
			this.invocationRoleArn = invocationRoleArn;
		}

		public String getFunctionArn() {
			return this.functionArn;
		}

		public void setFunctionArn(String functionArn) {
			this.functionArn = functionArn;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getRetry() {
			return this.retry;
		}

		public void setRetry(Integer retry) {
			this.retry = retry;
		}

		public Integer getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}

		public String getEventFormat() {
			return this.eventFormat;
		}

		public void setEventFormat(String eventFormat) {
			this.eventFormat = eventFormat;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public List<String> getSubscriptionObjects() {
			return this.subscriptionObjects;
		}

		public void setSubscriptionObjects(List<String> subscriptionObjects) {
			this.subscriptionObjects = subscriptionObjects;
		}
	}

	@Override
	public DescribeFCTriggerResponse getInstance(UnmarshallerContext context) {
		return	DescribeFCTriggerResponseUnmarshaller.unmarshall(this, context);
	}
}
