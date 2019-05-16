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
import com.aliyuncs.ecs.transform.v20160314.CreateVolumes_GatedLaunchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateVolumes_GatedLaunchResponse extends AcsResponse {

	private String requestId;

	private List<String> volumeIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getVolumeIds() {
		return this.volumeIds;
	}

	public void setVolumeIds(List<String> volumeIds) {
		this.volumeIds = volumeIds;
	}

	@Override
	public CreateVolumes_GatedLaunchResponse getInstance(UnmarshallerContext context) {
		return	CreateVolumes_GatedLaunchResponseUnmarshaller.unmarshall(this, context);
	}
}
