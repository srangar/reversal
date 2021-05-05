
package com.srini.reversal;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.srini.reversal.AnagramGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AnagramGetBuilder
    extends GetRequestBuilderBase<java.lang.String, StringCheck, AnagramGetBuilder>
{


    public AnagramGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, StringCheck.class, resourceSpec, requestOptions);
    }

    public AnagramGetBuilder comparisonParam(java.lang.String value) {
        super.setReqParam("comparison", value, java.lang.String.class);
        return this;
    }

}
