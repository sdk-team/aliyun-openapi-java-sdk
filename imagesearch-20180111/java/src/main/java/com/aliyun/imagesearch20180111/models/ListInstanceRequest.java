// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    // serviceType
    @NameInMap("ServiceType")
    @Validation(required = true)
    public Integer serviceType;

    // name
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    // pageSize
    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    // pageNumber
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    // tags
    @NameInMap("Tag")
    public java.util.List<ListInstanceRequestTag> tag;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public static class ListInstanceRequestTag extends TeaModel {
        // key
        @NameInMap("Key")
        public String key;

        // value
        @NameInMap("Value")
        public String value;

        public static ListInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRequestTag self = new ListInstanceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
