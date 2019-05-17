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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class LookupEventsRequest extends RpcAcsRequest<LookupEventsResponse> {
	
	public LookupEventsRequest() {
		super("Actiontrail", "2015-09-28", "LookupEvents");
	}

	private String request;

	private String startTime;

	private String type;

	private String eventName;

	private String nextToken;

	private String serviceName;

	private String event;

	private String format;

	private String eventAccessKeyId;

	private String endTime;

	private String eventRW;

	private String version;

	private String resourceType;

	private String help;

	private String maxResults;

	private String eventType;

	private String resourceName;

	private String user;

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
		if(request != null){
			putQueryParameter("Request", request);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
		if(eventName != null){
			putQueryParameter("EventName", eventName);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
		if(event != null){
			putQueryParameter("Event", event);
		}
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
		if(format != null){
			putQueryParameter("Format", format);
		}
	}

	public String getEventAccessKeyId() {
		return this.eventAccessKeyId;
	}

	public void setEventAccessKeyId(String eventAccessKeyId) {
		this.eventAccessKeyId = eventAccessKeyId;
		if(eventAccessKeyId != null){
			putQueryParameter("EventAccessKeyId", eventAccessKeyId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getEventRW() {
		return this.eventRW;
	}

	public void setEventRW(String eventRW) {
		this.eventRW = eventRW;
		if(eventRW != null){
			putQueryParameter("EventRW", eventRW);
		}
	}

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
		if(help != null){
			putQueryParameter("Help", help);
		}
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<LookupEventsResponse> getResponseClass() {
		return LookupEventsResponse.class;
	}

}
