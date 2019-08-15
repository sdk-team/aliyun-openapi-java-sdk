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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainQpsDataByLayerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainQpsDataByLayerResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private String layer;

	private List<DataModule> qpsDataInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
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

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getLayer() {
		return this.layer;
	}

	public void setLayer(String layer) {
		this.layer = layer;
	}

	public List<DataModule> getQpsDataInterval() {
		return this.qpsDataInterval;
	}

	public void setQpsDataInterval(List<DataModule> qpsDataInterval) {
		this.qpsDataInterval = qpsDataInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String value;

		private String domesticValue;

		private String overseasValue;

		private String accValue;

		private String accDomesticValue;

		private String accOverseasValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}

		public String getAccValue() {
			return this.accValue;
		}

		public void setAccValue(String accValue) {
			this.accValue = accValue;
		}

		public String getAccDomesticValue() {
			return this.accDomesticValue;
		}

		public void setAccDomesticValue(String accDomesticValue) {
			this.accDomesticValue = accDomesticValue;
		}

		public String getAccOverseasValue() {
			return this.accOverseasValue;
		}

		public void setAccOverseasValue(String accOverseasValue) {
			this.accOverseasValue = accOverseasValue;
		}
	}

	@Override
	public DescribeDomainQpsDataByLayerResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainQpsDataByLayerResponseUnmarshaller.unmarshall(this, context);
	}
}
