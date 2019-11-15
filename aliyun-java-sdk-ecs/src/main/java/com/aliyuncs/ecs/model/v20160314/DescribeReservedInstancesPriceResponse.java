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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeReservedInstancesPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReservedInstancesPriceResponse extends AcsResponse {

	private String requestId;

	private List<ReservedInstance> reservedInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ReservedInstance> getReservedInstances() {
		return this.reservedInstances;
	}

	public void setReservedInstances(List<ReservedInstance> reservedInstances) {
		this.reservedInstances = reservedInstances;
	}

	public static class ReservedInstance {

		private String reservedInstanceId;

		private Float reservedInstanceHourPrice;

		private Float tradePrice;

		public String getReservedInstanceId() {
			return this.reservedInstanceId;
		}

		public void setReservedInstanceId(String reservedInstanceId) {
			this.reservedInstanceId = reservedInstanceId;
		}

		public Float getReservedInstanceHourPrice() {
			return this.reservedInstanceHourPrice;
		}

		public void setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
			this.reservedInstanceHourPrice = reservedInstanceHourPrice;
		}

		public Float getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Float tradePrice) {
			this.tradePrice = tradePrice;
		}
	}

	@Override
	public DescribeReservedInstancesPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeReservedInstancesPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
