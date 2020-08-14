// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListInstanceResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public ListInstanceResponseData data;

    public static ListInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponse self = new ListInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class ListInstanceResponseDataInstancesInstanceTagsTag extends TeaModel {
        // key
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        // value
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListInstanceResponseDataInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseDataInstancesInstanceTagsTag self = new ListInstanceResponseDataInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class ListInstanceResponseDataInstancesInstanceTags extends TeaModel {
        // Tag
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<ListInstanceResponseDataInstancesInstanceTagsTag> tag;

        public static ListInstanceResponseDataInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseDataInstancesInstanceTags self = new ListInstanceResponseDataInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

    }

    public static class ListInstanceResponseDataInstancesInstance extends TeaModel {
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

        // serviceType
        @NameInMap("ServiceType")
        @Validation(required = true)
        public Integer serviceType;

        // dataplusInstanceId
        @NameInMap("DataplusInstanceId")
        @Validation(required = true)
        public String dataplusInstanceId;

        // version
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        // freeTrial
        @NameInMap("FreeTrial")
        @Validation(required = true)
        public Boolean freeTrial;

        // utcExpireTime
        @NameInMap("UtcExpireTime")
        @Validation(required = true)
        public String utcExpireTime;

        // tags
        @NameInMap("Tags")
        @Validation(required = true)
        public ListInstanceResponseDataInstancesInstanceTags tags;

        public static ListInstanceResponseDataInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseDataInstancesInstance self = new ListInstanceResponseDataInstancesInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class ListInstanceResponseDataInstances extends TeaModel {
        // Instance
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<ListInstanceResponseDataInstancesInstance> instance;

        public static ListInstanceResponseDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseDataInstances self = new ListInstanceResponseDataInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class ListInstanceResponseData extends TeaModel {
        // pageSize
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        // pageNumber
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        // totalCount
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        // instances
        @NameInMap("Instances")
        @Validation(required = true)
        public ListInstanceResponseDataInstances instances;

        public static ListInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseData self = new ListInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
