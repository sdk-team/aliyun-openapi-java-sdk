// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    // tags
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    // resourceIds
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // nextToken
    @NameInMap("NextToken")
    public String nextToken;

    // resourceType
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        // key
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        // value
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
