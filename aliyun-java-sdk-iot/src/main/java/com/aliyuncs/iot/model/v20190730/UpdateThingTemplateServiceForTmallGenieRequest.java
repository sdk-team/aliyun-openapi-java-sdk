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

/**
 * @author auto create
 * @version 
 */
public class UpdateThingTemplateServiceForTmallGenieRequest extends RpcAcsRequest<UpdateThingTemplateServiceForTmallGenieResponse> {
	
	public UpdateThingTemplateServiceForTmallGenieRequest() {
		super("Iot", "2019-07-30", "UpdateThingTemplateServiceForTmallGenie", "iot");
	}

	private String identifier;

	private String thingTemplateKey;

	private List<InputParams> inputParamss;

	private String iotInstanceId;

	private String name;

	private String callType;

	private List<OutputParams> outputParamss;

	private List<Tags> tagss;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putQueryParameter("Identifier", identifier);
		}
	}

	public String getThingTemplateKey() {
		return this.thingTemplateKey;
	}

	public void setThingTemplateKey(String thingTemplateKey) {
		this.thingTemplateKey = thingTemplateKey;
		if(thingTemplateKey != null){
			putQueryParameter("ThingTemplateKey", thingTemplateKey);
		}
	}

	public List<InputParams> getInputParamss() {
		return this.inputParamss;
	}

	public void setInputParamss(List<InputParams> inputParamss) {
		this.inputParamss = inputParamss;	
		if (inputParamss != null) {
			for (int depth1 = 0; depth1 < inputParamss.size(); depth1++) {
				putQueryParameter("InputParams." + (depth1 + 1) + ".Identifier" , inputParamss.get(depth1).getIdentifier());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataSpecs" , inputParamss.get(depth1).getDataSpecs());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataType" , inputParamss.get(depth1).getDataType());
				putQueryParameter("InputParams." + (depth1 + 1) + ".Name" , inputParamss.get(depth1).getName());
				putQueryParameter("InputParams." + (depth1 + 1) + ".DataSpecsList" , inputParamss.get(depth1).getDataSpecsList());
				putQueryParameter("InputParams." + (depth1 + 1) + ".ParaOrder" , inputParamss.get(depth1).getParaOrder());
				putQueryParameter("InputParams." + (depth1 + 1) + ".Direction" , inputParamss.get(depth1).getDirection());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType);
		}
	}

	public List<OutputParams> getOutputParamss() {
		return this.outputParamss;
	}

	public void setOutputParamss(List<OutputParams> outputParamss) {
		this.outputParamss = outputParamss;	
		if (outputParamss != null) {
			for (int depth1 = 0; depth1 < outputParamss.size(); depth1++) {
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Identifier" , outputParamss.get(depth1).getIdentifier());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataSpecs" , outputParamss.get(depth1).getDataSpecs());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataType" , outputParamss.get(depth1).getDataType());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Name" , outputParamss.get(depth1).getName());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".DataSpecsList" , outputParamss.get(depth1).getDataSpecsList());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".ParaOrder" , outputParamss.get(depth1).getParaOrder());
				putQueryParameter("OutputParams." + (depth1 + 1) + ".Direction" , outputParamss.get(depth1).getDirection());
			}
		}	
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".TagValue" , tagss.get(depth1).getTagValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".TagKey" , tagss.get(depth1).getTagKey());
			}
		}	
	}

	public static class InputParams {

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

	public static class OutputParams {

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

	public static class Tags {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public Class<UpdateThingTemplateServiceForTmallGenieResponse> getResponseClass() {
		return UpdateThingTemplateServiceForTmallGenieResponse.class;
	}

}
