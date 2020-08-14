// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // data
    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeRegionsResponseRegions regions;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRegionsResponseRegionsRegion extends TeaModel {
        // regionId
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        // localName
        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        public static DescribeRegionsResponseRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegion self = new DescribeRegionsResponseRegionsRegion();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        // Region
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRegion> region;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

    }

}
