// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class DescribeInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    public static DescribeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRequest self = new DescribeInstanceRequest();
        return TeaModel.build(map, self);
    }

}
