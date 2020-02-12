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

package com.aliyuncs.ecsdemo.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsdemo.model.v20190620.GetTestRDSDBInstanceResponse;
import com.aliyuncs.ecsdemo.model.v20190620.GetTestRDSDBInstanceResponse.DBInstanceAttribute;
import com.aliyuncs.ecsdemo.model.v20190620.GetTestRDSDBInstanceResponse.DBInstanceAttribute.Extra;
import com.aliyuncs.ecsdemo.model.v20190620.GetTestRDSDBInstanceResponse.DBInstanceAttribute.ReadOnlyDBInstanceId;
import com.aliyuncs.ecsdemo.model.v20190620.GetTestRDSDBInstanceResponse.DBInstanceAttribute.SlaveZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTestRDSDBInstanceResponseUnmarshaller {

	public static GetTestRDSDBInstanceResponse unmarshall(GetTestRDSDBInstanceResponse getTestRDSDBInstanceResponse, UnmarshallerContext _ctx) {
		
		getTestRDSDBInstanceResponse.setRequestId(_ctx.stringValue("GetTestRDSDBInstanceResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("GetTestRDSDBInstanceResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setIPType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].IPType"));
			dBInstanceAttribute.setDBInstanceDiskUsed(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceDiskUsed"));
			dBInstanceAttribute.setGuardDBInstanceName(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].GuardDBInstanceName"));
			dBInstanceAttribute.setCanTempUpgrade(_ctx.booleanValue("GetTestRDSDBInstanceResponse.Items["+ i +"].CanTempUpgrade"));
			dBInstanceAttribute.setTempUpgradeTimeStart(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeTimeStart"));
			dBInstanceAttribute.setTempUpgradeTimeEnd(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeTimeEnd"));
			dBInstanceAttribute.setTempUpgradeRecoveryTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryTime"));
			dBInstanceAttribute.setTempUpgradeRecoveryClass(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryClass"));
			dBInstanceAttribute.setTempUpgradeRecoveryCpu(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryCpu"));
			dBInstanceAttribute.setTempUpgradeRecoveryMemory(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryMemory"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxIOPS(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryMaxIOPS"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxConnections(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempUpgradeRecoveryMaxConnections"));
			dBInstanceAttribute.setInsId(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].InsId"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setVpcCloudInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setReplicateId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ReplicateId"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setDBInstanceStorageType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstanceAttribute.setAdvancedFeatures(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].AdvancedFeatures"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setSupportCreateSuperAccount(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SupportCreateSuperAccount"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setCurrentKernelVersion(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].CurrentKernelVersion"));
			dBInstanceAttribute.setLatestKernelVersion(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].LatestKernelVersion"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setReadonlyInstanceSQLDelayedTime(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceAttribute.setSecurityIPMode(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SecurityIPMode"));
			dBInstanceAttribute.setTimeZone(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].TimeZone"));
			dBInstanceAttribute.setCollation(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Collation"));
			dBInstanceAttribute.setDispenseMode(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DispenseMode"));
			dBInstanceAttribute.setMasterZone(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MasterZone"));
			dBInstanceAttribute.setAutoUpgradeMinorVersion(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstanceAttribute.setProxyType(_ctx.integerValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ProxyType"));
			dBInstanceAttribute.setConsoleVersion(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ConsoleVersion"));
			dBInstanceAttribute.setMultipleTempUpgrade(_ctx.booleanValue("GetTestRDSDBInstanceResponse.Items["+ i +"].MultipleTempUpgrade"));
			dBInstanceAttribute.setOriginConfiguration(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].OriginConfiguration"));
			dBInstanceAttribute.setDedicatedHostGroupId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].DedicatedHostGroupId"));

			Extra extra = new Extra();
			extra.setReplicaGroupID(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Extra.ReplicaGroupID"));
			extra.setReplicaGroupStatus(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Extra.ReplicaGroupStatus"));
			extra.setActiveReplicaDBInstanceID(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Extra.ActiveReplicaDBInstanceID"));

			List<String> dBInstanceId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Extra.DBInstanceId.Length"); j++) {
				dBInstanceId.add(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].Extra.DBInstanceId["+ j +"]"));
			}
			extra.setDBInstanceId(dBInstanceId);
			dBInstanceAttribute.setExtra(extra);

			List<SlaveZone> slaveZones = new ArrayList<SlaveZone>();
			for (int j = 0; j < _ctx.lengthValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SlaveZones.Length"); j++) {
				SlaveZone slaveZone = new SlaveZone();
				slaveZone.setZoneId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].SlaveZones["+ j +"].ZoneId"));

				slaveZones.add(slaveZone);
			}
			dBInstanceAttribute.setSlaveZones(slaveZones);

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("GetTestRDSDBInstanceResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstanceAttribute);
		}
		getTestRDSDBInstanceResponse.setItems(items);
	 
	 	return getTestRDSDBInstanceResponse;
	}
}