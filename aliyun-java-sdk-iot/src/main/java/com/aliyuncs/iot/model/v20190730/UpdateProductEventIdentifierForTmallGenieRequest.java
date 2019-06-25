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

package com.aliyuncs.iot.model.v20190730;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;

/**
 * @author auto create
 * @version 
 */
public class UpdateProductEventIdentifierForTmallGenieRequest extends RpcAcsRequest<UpdateProductEventIdentifierForTmallGenieResponse> {
	
	public UpdateProductEventIdentifierForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateProductEventIdentifierForTmallGenie", "iot");
	}

	private String identifier;

	private List<OutputData> outputDatas;

	private String iotInstanceId;

	private String description;

	private Integer eventType;

	private String productKey;

	private Map<Object,Object> extendConfig;

	private String eventName;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public List<OutputData> getOutputDatas() {
		return this.outputDatas;
	}

	public void setOutputDatas(List<OutputData> outputDatas) {
		this.outputDatas = outputDatas;	
		if (outputDatas != null) {
			for (int depth1 = 0; depth1 < outputDatas.size(); depth1++) {
				putQueryParameter("OutputData." + (depth1 + 1) + ".Identifier" , outputDatas.get(depth1).getIdentifier());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataSpecs" , outputDatas.get(depth1).getDataSpecs());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataType" , outputDatas.get(depth1).getDataType());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Name" , outputDatas.get(depth1).getName());
				putQueryParameter("OutputData." + (depth1 + 1) + ".DataSpecsList" , outputDatas.get(depth1).getDataSpecsList());
				putQueryParameter("OutputData." + (depth1 + 1) + ".ParaOrder" , outputDatas.get(depth1).getParaOrder());
				putQueryParameter("OutputData." + (depth1 + 1) + ".Direction" , outputDatas.get(depth1).getDirection());
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Integer getEventType() {
		return this.eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putBodyParameter("EventType", eventType.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Map<Object,Object> getExtendConfig() {
		return this.extendConfig;
	}

	public void setExtendConfig(Map<Object,Object> extendConfig) {
		this.extendConfig = extendConfig;
		if(extendConfig != null){
			putBodyParameter("ExtendConfig", new Gson().toJson(extendConfig));
		}
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
		if(eventName != null){
			putBodyParameter("EventName", eventName);
		}
	}

	public static class OutputData {

		private String identifier;

		private String dataSpecs;

		private String dataType;

		private String name;

		private String dataSpecsList;

		private Integer paraOrder;

		private String direction;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDataSpecs() {
			return this.dataSpecs;
		}

		public void setDataSpecs(String dataSpecs) {
			this.dataSpecs = dataSpecs;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDataSpecsList() {
			return this.dataSpecsList;
		}

		public void setDataSpecsList(String dataSpecsList) {
			this.dataSpecsList = dataSpecsList;
		}

		public Integer getParaOrder() {
			return this.paraOrder;
		}

		public void setParaOrder(Integer paraOrder) {
			this.paraOrder = paraOrder;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
	}

	@Override
	public Class<UpdateProductEventIdentifierForTmallGenieResponse> getResponseClass() {
		return UpdateProductEventIdentifierForTmallGenieResponse.class;
	}

}
