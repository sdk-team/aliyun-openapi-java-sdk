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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse.QosGroupInfo;
import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEniQosGroupInfoResponseUnmarshaller {

	public static DescribeEniQosGroupInfoResponse unmarshall(DescribeEniQosGroupInfoResponse describeEniQosGroupInfoResponse, UnmarshallerContext context) {
		
		describeEniQosGroupInfoResponse.setRequestId(context.stringValue("DescribeEniQosGroupInfoResponse.RequestId"));

		QosGroupInfo qosGroupInfo = new QosGroupInfo();
		qosGroupInfo.setInstanceId(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.InstanceId"));

		List<String> networkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.NetworkInterfaceIds.Length"); i++) {
			networkInterfaceIds.add(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.NetworkInterfaceIds["+ i +"]"));
		}
		qosGroupInfo.setNetworkInterfaceIds(networkInterfaceIds);

		QosGroup qosGroup = new QosGroup();
		qosGroup.setQosGroupName(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.QosGroupName"));
		qosGroup.setRx(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Rx"));
		qosGroup.setTx(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Tx"));
		qosGroup.setRxPps(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.RxPps"));
		qosGroup.setTxPps(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.TxPps"));
		qosGroup.setType(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Type"));
		qosGroup.setGmtCreate(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.GmtCreate"));
		qosGroup.setGmtModify(context.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.GmtModify"));
		qosGroupInfo.setQosGroup(qosGroup);
		describeEniQosGroupInfoResponse.setQosGroupInfo(qosGroupInfo);
	 
	 	return describeEniQosGroupInfoResponse;
	}
}