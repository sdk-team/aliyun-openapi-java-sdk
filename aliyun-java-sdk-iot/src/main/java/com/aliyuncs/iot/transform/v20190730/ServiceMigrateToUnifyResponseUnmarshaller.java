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

package com.aliyuncs.iot.transform.v20190730;

import com.aliyuncs.iot.model.v20190730.ServiceMigrateToUnifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ServiceMigrateToUnifyResponseUnmarshaller {

	public static ServiceMigrateToUnifyResponse unmarshall(ServiceMigrateToUnifyResponse serviceMigrateToUnifyResponse, UnmarshallerContext _ctx) {
		
		serviceMigrateToUnifyResponse.setRequestId(_ctx.stringValue("ServiceMigrateToUnifyResponse.RequestId"));
		serviceMigrateToUnifyResponse.setSuccess(_ctx.booleanValue("ServiceMigrateToUnifyResponse.Success"));
		serviceMigrateToUnifyResponse.setCode(_ctx.stringValue("ServiceMigrateToUnifyResponse.Code"));
		serviceMigrateToUnifyResponse.setErrorMessage(_ctx.stringValue("ServiceMigrateToUnifyResponse.ErrorMessage"));
	 
	 	return serviceMigrateToUnifyResponse;
	}
}