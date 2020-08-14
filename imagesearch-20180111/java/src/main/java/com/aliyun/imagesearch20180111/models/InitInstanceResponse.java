// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class InitInstanceResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public InitInstanceResponseData data;

    public static InitInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitInstanceResponse self = new InitInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class InitInstanceResponseData extends TeaModel {
        // id
        @NameInMap("InstacneId")
        @Validation(required = true)
        public Long instacneId;

        // status
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static InitInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            InitInstanceResponseData self = new InitInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
