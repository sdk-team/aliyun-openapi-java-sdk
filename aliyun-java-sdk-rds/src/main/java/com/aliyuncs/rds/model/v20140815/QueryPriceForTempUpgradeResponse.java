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
import com.aliyuncs.rds.transform.v20140815.QueryPriceForTempUpgradeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceForTempUpgradeResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	private Order order;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public static class Rule {

		private Long ruleDescId;

		private String name;

		private String title;

		public Long getRuleDescId() {
			return this.ruleDescId;
		}

		public void setRuleDescId(Long ruleDescId) {
			this.ruleDescId = ruleDescId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	public static class Order {

		private String currency;

		private Float originalAmount;

		private Float tradeAmount;

		private Float discountAmount;

		private Float discountAmount1;

		private List<Coupon> coupons;

		private List<String> ruleIds;

		private ActivityInfo activityInfo;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public Float getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(Float tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public Float getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(Float discountAmount) {
			this.discountAmount = discountAmount;
		}

		public Float getDiscountAmount1() {
			return this.discountAmount1;
		}

		public void setDiscountAmount1(Float discountAmount1) {
			this.discountAmount1 = discountAmount1;
		}

		public List<Coupon> getCoupons() {
			return this.coupons;
		}

		public void setCoupons(List<Coupon> coupons) {
			this.coupons = coupons;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public ActivityInfo getActivityInfo() {
			return this.activityInfo;
		}

		public void setActivityInfo(ActivityInfo activityInfo) {
			this.activityInfo = activityInfo;
		}

		public static class Coupon {

			private String couponNo;

			private String name;

			private String description;

			private String isSelected;

			public String getCouponNo() {
				return this.couponNo;
			}

			public void setCouponNo(String couponNo) {
				this.couponNo = couponNo;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIsSelected() {
				return this.isSelected;
			}

			public void setIsSelected(String isSelected) {
				this.isSelected = isSelected;
			}
		}

		public static class ActivityInfo {

			private String checkErrMsg;

			private String errorCode;

			private String success;

			public String getCheckErrMsg() {
				return this.checkErrMsg;
			}

			public void setCheckErrMsg(String checkErrMsg) {
				this.checkErrMsg = checkErrMsg;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getSuccess() {
				return this.success;
			}

			public void setSuccess(String success) {
				this.success = success;
			}
		}
	}

	@Override
	public QueryPriceForTempUpgradeResponse getInstance(UnmarshallerContext context) {
		return	QueryPriceForTempUpgradeResponseUnmarshaller.unmarshall(this, context);
	}
}
