
package com.srini.reversal;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AnagramGetRequestBuilder
    extends GetRequestBuilderBase<java.lang.String, StringCheck, AnagramGetRequestBuilder>
{


    public AnagramGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, StringCheck.class, resourceSpec, requestOptions);
    }

    public AnagramGetRequestBuilder comparisonParam(java.lang.String value) {
        super.setReqParam("comparison", value, java.lang.String.class);
        return this;
    }

}
