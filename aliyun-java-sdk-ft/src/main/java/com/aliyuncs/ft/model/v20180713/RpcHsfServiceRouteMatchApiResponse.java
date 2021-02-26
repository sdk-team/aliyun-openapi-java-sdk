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

package com.aliyuncs.ft.model.v20180713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.RpcHsfServiceRouteMatchApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RpcHsfServiceRouteMatchApiResponse extends AcsResponse {

	private String age;

	private String checkNumberValue;

	private String code;

	private String defaultValue;

	private String enumValue;

	private String httpStatusCode;

	private String intValue;

	private String jsonListStrig;

	private String message;

	private String name;

	private String nullToEmptyValue;

	private String numberRange;

	private String regionId;

	private String requiredValue;

	private String resultSwitchValue;

	private String stringValue;

	private String success;

	private String switchValue;

	private String ak_mfa_present;

	private String app_ip;

	private String callerBid;

	private String callerParentId;

	private String callerType;

	private String callerUid;

	private String proxy_original_security_transport;

	private String proxy_original_source_ip;

	private String proxy_trust_transport_info;

	private String requestId;

	private String resourceOwnerId;

	private String security_transport;

	private List<ArrayItem> arrayValue;

	private List<L1ArrayItem> l1Array;

	private List<ArrayItem> nullArrayValue;

	private NullToEmptyStructValue nullToEmptyStructValue;

	private StructValue structValue;

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCheckNumberValue() {
		return this.checkNumberValue;
	}

	public void setCheckNumberValue(String checkNumberValue) {
		this.checkNumberValue = checkNumberValue;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getEnumValue() {
		return this.enumValue;
	}

	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getIntValue() {
		return this.intValue;
	}

	public void setIntValue(String intValue) {
		this.intValue = intValue;
	}

	public String getJsonListStrig() {
		return this.jsonListStrig;
	}

	public void setJsonListStrig(String jsonListStrig) {
		this.jsonListStrig = jsonListStrig;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNullToEmptyValue() {
		return this.nullToEmptyValue;
	}

	public void setNullToEmptyValue(String nullToEmptyValue) {
		this.nullToEmptyValue = nullToEmptyValue;
	}

	public String getNumberRange() {
		return this.numberRange;
	}

	public void setNumberRange(String numberRange) {
		this.numberRange = numberRange;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequiredValue() {
		return this.requiredValue;
	}

	public void setRequiredValue(String requiredValue) {
		this.requiredValue = requiredValue;
	}

	public String getResultSwitchValue() {
		return this.resultSwitchValue;
	}

	public void setResultSwitchValue(String resultSwitchValue) {
		this.resultSwitchValue = resultSwitchValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSwitchValue() {
		return this.switchValue;
	}

	public void setSwitchValue(String switchValue) {
		this.switchValue = switchValue;
	}

	public String getAk_mfa_present() {
		return this.ak_mfa_present;
	}

	public void setAk_mfa_present(String ak_mfa_present) {
		this.ak_mfa_present = ak_mfa_present;
	}

	public String getApp_ip() {
		return this.app_ip;
	}

	public void setApp_ip(String app_ip) {
		this.app_ip = app_ip;
	}

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
	}

	public String getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(String callerParentId) {
		this.callerParentId = callerParentId;
	}

	public String getCallerType() {
		return this.callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
	}

	public String getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(String callerUid) {
		this.callerUid = callerUid;
	}

	public String getProxy_original_security_transport() {
		return this.proxy_original_security_transport;
	}

	public void setProxy_original_security_transport(String proxy_original_security_transport) {
		this.proxy_original_security_transport = proxy_original_security_transport;
	}

	public String getProxy_original_source_ip() {
		return this.proxy_original_source_ip;
	}

	public void setProxy_original_source_ip(String proxy_original_source_ip) {
		this.proxy_original_source_ip = proxy_original_source_ip;
	}

	public String getProxy_trust_transport_info() {
		return this.proxy_trust_transport_info;
	}

	public void setProxy_trust_transport_info(String proxy_trust_transport_info) {
		this.proxy_trust_transport_info = proxy_trust_transport_info;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	public String getSecurity_transport() {
		return this.security_transport;
	}

	public void setSecurity_transport(String security_transport) {
		this.security_transport = security_transport;
	}

	public List<ArrayItem> getArrayValue() {
		return this.arrayValue;
	}

	public void setArrayValue(List<ArrayItem> arrayValue) {
		this.arrayValue = arrayValue;
	}

	public List<L1ArrayItem> getL1Array() {
		return this.l1Array;
	}

	public void setL1Array(List<L1ArrayItem> l1Array) {
		this.l1Array = l1Array;
	}

	public List<ArrayItem> getNullArrayValue() {
		return this.nullArrayValue;
	}

	public void setNullArrayValue(List<ArrayItem> nullArrayValue) {
		this.nullArrayValue = nullArrayValue;
	}

	public NullToEmptyStructValue getNullToEmptyStructValue() {
		return this.nullToEmptyStructValue;
	}

	public void setNullToEmptyStructValue(NullToEmptyStructValue nullToEmptyStructValue) {
		this.nullToEmptyStructValue = nullToEmptyStructValue;
	}

	public StructValue getStructValue() {
		return this.structValue;
	}

	public void setStructValue(StructValue structValue) {
		this.structValue = structValue;
	}

	public static class ArrayItem {

		private String arrayChildValue;

		public String getArrayChildValue() {
			return this.arrayChildValue;
		}

		public void setArrayChildValue(String arrayChildValue) {
			this.arrayChildValue = arrayChildValue;
		}
	}

	public static class L1ArrayItem {

		private String l1Member1;

		private List<L2ArrayItem> l2Array;

		private L1Struct l1Struct;

		public String getL1Member1() {
			return this.l1Member1;
		}

		public void setL1Member1(String l1Member1) {
			this.l1Member1 = l1Member1;
		}

		public List<L2ArrayItem> getL2Array() {
			return this.l2Array;
		}

		public void setL2Array(List<L2ArrayItem> l2Array) {
			this.l2Array = l2Array;
		}

		public L1Struct getL1Struct() {
			return this.l1Struct;
		}

		public void setL1Struct(L1Struct l1Struct) {
			this.l1Struct = l1Struct;
		}

		public static class L2ArrayItem {

			private String l2Member1;

			private List<L3ArrayItem> l3Array;

			public String getL2Member1() {
				return this.l2Member1;
			}

			public void setL2Member1(String l2Member1) {
				this.l2Member1 = l2Member1;
			}

			public List<L3ArrayItem> getL3Array() {
				return this.l3Array;
			}

			public void setL3Array(List<L3ArrayItem> l3Array) {
				this.l3Array = l3Array;
			}

			public static class L3ArrayItem {

				private String l3Member1;

				public String getL3Member1() {
					return this.l3Member1;
				}

				public void setL3Member1(String l3Member1) {
					this.l3Member1 = l3Member1;
				}
			}
		}

		public static class L1Struct {

			private String l1StructMember;

			public String getL1StructMember() {
				return this.l1StructMember;
			}

			public void setL1StructMember(String l1StructMember) {
				this.l1StructMember = l1StructMember;
			}
		}
	}

	public static class NullToEmptyStructValue {

		private String nullToEmptyStructChildValue;

		public String getNullToEmptyStructChildValue() {
			return this.nullToEmptyStructChildValue;
		}

		public void setNullToEmptyStructChildValue(String nullToEmptyStructChildValue) {
			this.nullToEmptyStructChildValue = nullToEmptyStructChildValue;
		}
	}

	public static class StructValue {

		private String structChildValue;

		public String getStructChildValue() {
			return this.structChildValue;
		}

		public void setStructChildValue(String structChildValue) {
			this.structChildValue = structChildValue;
		}
	}

	@Override
	public RpcHsfServiceRouteMatchApiResponse getInstance(UnmarshallerContext context) {
		return	RpcHsfServiceRouteMatchApiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
