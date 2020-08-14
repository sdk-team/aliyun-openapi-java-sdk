// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    // tags
    @NameInMap("Tag")
    @Validation(required = true)
    public java.util.List<TagResourcesRequestTag> tag;

    // resourceIds
    @NameInMap("ResourceId")
    @Validation(required = true)
    public java.util.List<String> resourceId;

    // resourceType
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public static class TagResourcesRequestTag extends TeaModel {
        // key
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        // value
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

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
