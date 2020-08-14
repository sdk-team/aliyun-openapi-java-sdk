// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class InitInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    public static InitInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitInstanceRequest self = new InitInstanceRequest();
        return TeaModel.build(map, self);
    }

}
