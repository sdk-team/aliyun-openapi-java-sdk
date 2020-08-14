// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("Instance")
    @Validation(required = true)
    public DescribeInstanceResponseInstance instance;

    public static DescribeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponse self = new DescribeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceResponseInstanceMeasure extends TeaModel {
        // billingCycleStart
        @NameInMap("BillingCycleStart")
        @Validation(required = true)
        public String billingCycleStart;

        // billingCycleEnd
        @NameInMap("BillingCycleEnd")
        @Validation(required = true)
        public String billingCycleEnd;

        // packetCapacity
        @NameInMap("PacketCapacity")
        @Validation(required = true)
        public Long packetCapacity;

        // packetType
        @NameInMap("PacketType")
        @Validation(required = true)
        public String packetType;

        // packetUsed
        @NameInMap("PacketUsed")
        @Validation(required = true)
        public Long packetUsed;

        // excessAmount
        @NameInMap("ExcessAmount")
        @Validation(required = true)
        public Long excessAmount;

        // lastPostTime
        @NameInMap("LastPostTime")
        @Validation(required = true)
        public String lastPostTime;

        // packetUsedBySearch
        @NameInMap("PacketUsedBySearch")
        @Validation(required = true)
        public Long packetUsedBySearch;

        // packetUsedByAdd
        @NameInMap("PacketUsedByAdd")
        @Validation(required = true)
        public Long packetUsedByAdd;

        // excessAmountBySearch
        @NameInMap("ExcessAmountBySearch")
        @Validation(required = true)
        public Long excessAmountBySearch;

        // excessAmountByAdd
        @NameInMap("ExcessAmountByAdd")
        @Validation(required = true)
        public Long excessAmountByAdd;

        public static DescribeInstanceResponseInstanceMeasure build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseInstanceMeasure self = new DescribeInstanceResponseInstanceMeasure();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceResponseInstance extends TeaModel {
        // id
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        // utcCreate
        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        // utcModified
        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        // name
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        // status
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        // orderStatus
        @NameInMap("OrderStatus")
        @Validation(required = true)
        public String orderStatus;

        // updateStatus
        @NameInMap("UpdateStatus")
        @Validation(required = true)
        public String updateStatus;

        // totalCount
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        // dataplusInstanceId
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        // serviceType
        @NameInMap("ServiceType")
        @Validation(required = true)
        public Integer serviceType;

        // region
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        // dataplusInstanceId
        @NameInMap("DataplusInstanceId")
        @Validation(required = true)
        public String dataplusInstanceId;

        // incrementStatus
        @NameInMap("IncrementStatus")
        @Validation(required = true)
        public String incrementStatus;

        // incrementProgress
        @NameInMap("IncrementProgress")
        @Validation(required = true)
        public Float incrementProgress;

        // fullUpdateStatus
        @NameInMap("FullUpdateStatus")
        @Validation(required = true)
        public String fullUpdateStatus;

        // fullUpdatePullProgress
        @NameInMap("FullUpdatePullProgress")
        @Validation(required = true)
        public Float fullUpdatePullProgress;

        // version
        @NameInMap("Version")
        @Validation(required = true)
        public Integer version;

        // utcExpireTime
        @NameInMap("UtcExpireTime")
        @Validation(required = true)
        public String utcExpireTime;

        // freeAddAmount
        @NameInMap("FreeAddAmount")
        @Validation(required = true)
        public String freeAddAmount;

        // freeAddUsed
        @NameInMap("FreeAddUsed")
        @Validation(required = true)
        public String freeAddUsed;

        // qps
        @NameInMap("Qps")
        @Validation(required = true)
        public Integer qps;

        // capacity
        @NameInMap("Capacity")
        @Validation(required = true)
        public Integer capacity;

        // freeTrial
        @NameInMap("FreeTrial")
        @Validation(required = true)
        public Boolean freeTrial;

        // measure
        @NameInMap("Measure")
        @Validation(required = true)
        public DescribeInstanceResponseInstanceMeasure measure;

        public static DescribeInstanceResponseInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseInstance self = new DescribeInstanceResponseInstance();
            return TeaModel.build(map, self);
        }

    }

}
