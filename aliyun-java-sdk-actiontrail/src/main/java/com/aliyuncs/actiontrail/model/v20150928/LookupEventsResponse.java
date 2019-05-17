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

package com.aliyuncs.actiontrail.model.v20150928;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20150928.LookupEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LookupEventsResponse extends AcsResponse {

	private String requestId;

	private String events;

	private String nextToken;

	private String startTime;

	private String endTime;

	private String param;

	private String result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEvents() {
		return this.events;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public LookupEventsResponse getInstance(UnmarshallerContext context) {
		return	LookupEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
