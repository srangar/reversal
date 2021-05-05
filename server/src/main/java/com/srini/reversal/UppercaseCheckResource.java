package com.srini.reversal;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a reversed word
 */
@RestLiCollection(parent=CheckResource.class, name = "uppercase", namespace = "com.srini.reversal")
public class UppercaseCheckResource extends CollectionResourceTemplate<String, StringCheck> {

    @Override
    public StringCheck get(String word) {
        StringOperator stringOperator = new StringOperator(word);
        return new StringCheck().setIsValid(stringOperator.isAllUpperCase());
    }
}
