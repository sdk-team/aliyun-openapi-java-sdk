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

package com.aliyuncs.sdk.model.v20180101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sdk.transform.v20180101.DemoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DemoResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> tetMap;

	private List<Map<Object,Object>> listMap;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getTetMap() {
		return this.tetMap;
	}

	public void setTetMap(Map<Object,Object> tetMap) {
		this.tetMap = tetMap;
	}

	public List<Map<Object,Object>> getListMap() {
		return this.listMap;
	}

	public void setListMap(List<Map<Object,Object>> listMap) {
		this.listMap = listMap;
	}

	@Override
	public DemoResponse getInstance(UnmarshallerContext context) {
		return	DemoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
