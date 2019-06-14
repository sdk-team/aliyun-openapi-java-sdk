/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeAliCloudCertificatesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAliCloudCertificatesResponse.AliCloudCertificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAliCloudCertificatesResponseUnmarshaller {

	public static DescribeAliCloudCertificatesResponse unmarshall(DescribeAliCloudCertificatesResponse describeAliCloudCertificatesResponse, UnmarshallerContext context) {
		
		describeAliCloudCertificatesResponse.setRequestId(context.stringValue("DescribeAliCloudCertificatesResponse.RequestId"));

		List<AliCloudCertificate> aliCloudCertificates = new ArrayList<AliCloudCertificate>();
		for (int i = 0; i < context.lengthValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates.Length"); i++) {
			AliCloudCertificate aliCloudCertificate = new AliCloudCertificate();
			aliCloudCertificate.setAliCloudCertificateId(context.longValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].AliCloudCertificateId"));
			aliCloudCertificate.setAliCloudCertificateName(context.stringValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].AliCloudCertificateName"));
			aliCloudCertificate.setFingerprint(context.stringValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].Fingerprint"));
			aliCloudCertificate.setDomainName(context.stringValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].DomainName"));
			aliCloudCertificate.setIssuer(context.stringValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].Issuer"));
			aliCloudCertificate.setLastTime(context.longValue("DescribeAliCloudCertificatesResponse.AliCloudCertificates["+ i +"].LastTime"));

			aliCloudCertificates.add(aliCloudCertificate);
		}
		describeAliCloudCertificatesResponse.setAliCloudCertificates(aliCloudCertificates);
	 
	 	return describeAliCloudCertificatesResponse;
	}
}