// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class CountInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    public static CountInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CountInstanceRequest self = new CountInstanceRequest();
        return TeaModel.build(map, self);
    }

}
