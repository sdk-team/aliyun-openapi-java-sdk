// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ClearInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    public static ClearInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceRequest self = new ClearInstanceRequest();
        return TeaModel.build(map, self);
    }

}
