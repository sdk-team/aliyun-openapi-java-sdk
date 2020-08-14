// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListIncrementResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public ListIncrementResponseData data;

    public static ListIncrementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncrementResponse self = new ListIncrementResponse();
        return TeaModel.build(map, self);
    }

    public static class ListIncrementResponseDataIncrementsInstance extends TeaModel {
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
        public Long utcModified;

        // instanceId
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        // arn
        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        // bucketName
        @NameInMap("BucketName")
        @Validation(required = true)
        public String bucketName;

        // path
        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        // status
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        // msg
        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        // code
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        // errorUrl
        @NameInMap("ErrorUrl")
        @Validation(required = true)
        public String errorUrl;

        public static ListIncrementResponseDataIncrementsInstance build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseDataIncrementsInstance self = new ListIncrementResponseDataIncrementsInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class ListIncrementResponseDataIncrements extends TeaModel {
        // Instance
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<ListIncrementResponseDataIncrementsInstance> instance;

        public static ListIncrementResponseDataIncrements build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseDataIncrements self = new ListIncrementResponseDataIncrements();
            return TeaModel.build(map, self);
        }

    }

    public static class ListIncrementResponseData extends TeaModel {
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

        // increments
        @NameInMap("Increments")
        @Validation(required = true)
        public ListIncrementResponseDataIncrements increments;

        public static ListIncrementResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseData self = new ListIncrementResponseData();
            return TeaModel.build(map, self);
        }

    }

}
