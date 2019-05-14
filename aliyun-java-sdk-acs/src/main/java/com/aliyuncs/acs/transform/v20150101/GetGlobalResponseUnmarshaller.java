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

package com.aliyuncs.acs.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.acs.model.v20150101.GetGlobalResponse;
import com.aliyuncs.acs.model.v20150101.GetGlobalResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetGlobalResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetGlobalResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetGlobalResponse.Product;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGlobalResponseUnmarshaller {

	public static GetGlobalResponse unmarshall(GetGlobalResponse getGlobalResponse, UnmarshallerContext context) {
		

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetGlobalResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetGlobalResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetGlobalResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetGlobalResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetGlobalResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetGlobalResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetGlobalResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetGlobalResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetGlobalResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetGlobalResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetGlobalResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetGlobalResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getGlobalResponse.setErrorMapping(errorMapping);

		List<Product> products = new ArrayList<Product>();
		for (int i = 0; i < context.lengthValue("GetGlobalResponse.Products.Length"); i++) {
			Product product = new Product();
			product.setName(context.stringValue("GetGlobalResponse.Products["+ i +"].name"));
			product.setDomain(context.stringValue("GetGlobalResponse.Products["+ i +"].domain"));

			products.add(product);
		}
		getGlobalResponse.setProducts(products);
	 
	 	return getGlobalResponse;
	}
}