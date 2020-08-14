// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    // tagKeys
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    // resourceIds
    @NameInMap("ResourceId")
    @Validation(required = true)
    public java.util.List<String> resourceId;

    // deleteAll
    @NameInMap("All")
    public String all;

    // resourceType
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

}
