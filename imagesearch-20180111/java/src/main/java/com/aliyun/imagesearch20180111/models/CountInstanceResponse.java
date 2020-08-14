// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class CountInstanceResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public CountInstanceResponseData data;

    public static CountInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CountInstanceResponse self = new CountInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class CountInstanceResponseData extends TeaModel {
        // id
        @NameInMap("InstacneId")
        @Validation(required = true)
        public Long instacneId;

        // totalCount
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        public static CountInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CountInstanceResponseData self = new CountInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
