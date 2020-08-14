// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class UntagResourcesResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UntagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponse self = new UntagResourcesResponse();
        return TeaModel.build(map, self);
    }

}
