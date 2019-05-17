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
public class EchoRequest extends RpcAcsRequest<EchoResponse> {
	
	public EchoRequest() {
		super("Actiontrail", "2015-09-28", "Echo");
	}

	private String startLoggingTime;

	private String type;

	private String latestDeliveryTime;

	private String bucketName;

	private String keyPrefix;

	private String format;

	private String latestDeliveryError;

	private String isLogging;

	private String version;

	private String help;

	private String name;

	private String stopLoggingTime;

	private String status;

	public String getStartLoggingTime() {
		return this.startLoggingTime;
	}

	public void setStartLoggingTime(String startLoggingTime) {
		this.startLoggingTime = startLoggingTime;
		if(startLoggingTime != null){
			putQueryParameter("StartLoggingTime", startLoggingTime);
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

	public String getLatestDeliveryTime() {
		return this.latestDeliveryTime;
	}

	public void setLatestDeliveryTime(String latestDeliveryTime) {
		this.latestDeliveryTime = latestDeliveryTime;
		if(latestDeliveryTime != null){
			putQueryParameter("LatestDeliveryTime", latestDeliveryTime);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getKeyPrefix() {
		return this.keyPrefix;
	}

	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
		if(keyPrefix != null){
			putQueryParameter("KeyPrefix", keyPrefix);
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

	public String getLatestDeliveryError() {
		return this.latestDeliveryError;
	}

	public void setLatestDeliveryError(String latestDeliveryError) {
		this.latestDeliveryError = latestDeliveryError;
		if(latestDeliveryError != null){
			putQueryParameter("LatestDeliveryError", latestDeliveryError);
		}
	}

	public String getIsLogging() {
		return this.isLogging;
	}

	public void setIsLogging(String isLogging) {
		this.isLogging = isLogging;
		if(isLogging != null){
			putQueryParameter("IsLogging", isLogging);
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

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
		if(help != null){
			putQueryParameter("Help", help);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getStopLoggingTime() {
		return this.stopLoggingTime;
	}

	public void setStopLoggingTime(String stopLoggingTime) {
		this.stopLoggingTime = stopLoggingTime;
		if(stopLoggingTime != null){
			putQueryParameter("StopLoggingTime", stopLoggingTime);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<EchoResponse> getResponseClass() {
		return EchoResponse.class;
	}

}
