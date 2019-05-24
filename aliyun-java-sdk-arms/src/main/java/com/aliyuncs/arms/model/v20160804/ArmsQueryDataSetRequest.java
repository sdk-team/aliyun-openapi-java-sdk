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

package com.aliyuncs.arms.model.v20160804;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ArmsQueryDataSetRequest extends RpcAcsRequest<ArmsQueryDataSetResponse> {
	
	public ArmsQueryDataSetRequest() {
		super("ARMS", "2016-08-04", "ArmsQueryDataSet");
	}

	private Long dateStr;

	private Long minTime;

	private Long maxTime;

	private List<String> measuress;

	private Integer intervalInSec;

	private Long datasetId;

	private List<Dimensions> dimensionss;

	public Long getDateStr() {
		return this.dateStr;
	}

	public void setDateStr(Long dateStr) {
		this.dateStr = dateStr;
		if(dateStr != null){
			putQueryParameter("DateStr", dateStr.toString());
		}
	}

	public Long getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Long minTime) {
		this.minTime = minTime;
		if(minTime != null){
			putQueryParameter("MinTime", minTime.toString());
		}
	}

	public Long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
		if(maxTime != null){
			putQueryParameter("MaxTime", maxTime.toString());
		}
	}

	public List<String> getMeasuress() {
		return this.measuress;
	}

	public void setMeasuress(List<String> measuress) {
		this.measuress = measuress;	
		if (measuress != null) {
			for (int i = 0; i < measuress.size(); i++) {
				putQueryParameter("Measures." + (i + 1) , measuress.get(i));
			}
		}	
	}

	public Integer getIntervalInSec() {
		return this.intervalInSec;
	}

	public void setIntervalInSec(Integer intervalInSec) {
		this.intervalInSec = intervalInSec;
		if(intervalInSec != null){
			putQueryParameter("IntervalInSec", intervalInSec.toString());
		}
	}

	public Long getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putQueryParameter("DatasetId", datasetId.toString());
		}
	}

	public List<Dimensions> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<Dimensions> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int depth1 = 0; depth1 < dimensionss.size(); depth1++) {
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensionss.get(depth1).getValue());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensionss.get(depth1).getKey());
			}
		}	
	}

	public static class Dimensions {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ArmsQueryDataSetResponse> getResponseClass() {
		return ArmsQueryDataSetResponse.class;
	}

}