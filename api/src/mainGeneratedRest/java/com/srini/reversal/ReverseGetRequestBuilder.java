
package com.srini.reversal;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class ReverseGetRequestBuilder
    extends GetRequestBuilderBase<java.lang.String, ReversedWord, ReverseGetRequestBuilder>
{


    public ReverseGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, ReversedWord.class, resourceSpec, requestOptions);
    }

}
