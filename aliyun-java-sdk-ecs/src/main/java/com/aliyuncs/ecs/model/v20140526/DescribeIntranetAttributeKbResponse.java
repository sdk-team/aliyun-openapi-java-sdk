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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeIntranetAttributeKbResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIntranetAttributeKbResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String vlanId;

	private String intranetIpAddress;

	private Integer intranetMaxBandwidthIn;

	private Integer intranetMaxBandwidthOut;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getIntranetIpAddress() {
		return this.intranetIpAddress;
	}

	public void setIntranetIpAddress(String intranetIpAddress) {
		this.intranetIpAddress = intranetIpAddress;
	}

	public Integer getIntranetMaxBandwidthIn() {
		return this.intranetMaxBandwidthIn;
	}

	public void setIntranetMaxBandwidthIn(Integer intranetMaxBandwidthIn) {
		this.intranetMaxBandwidthIn = intranetMaxBandwidthIn;
	}

	public Integer getIntranetMaxBandwidthOut() {
		return this.intranetMaxBandwidthOut;
	}

	public void setIntranetMaxBandwidthOut(Integer intranetMaxBandwidthOut) {
		this.intranetMaxBandwidthOut = intranetMaxBandwidthOut;
	}

	@Override
	public DescribeIntranetAttributeKbResponse getInstance(UnmarshallerContext context) {
		return	DescribeIntranetAttributeKbResponseUnmarshaller.unmarshall(this, context);
	}
}
