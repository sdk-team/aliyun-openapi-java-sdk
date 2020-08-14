// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class IncreaseInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

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

    // taskType
    @NameInMap("TaskType")
    public Integer taskType;

    public static IncreaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceRequest self = new IncreaseInstanceRequest();
        return TeaModel.build(map, self);
    }

}
