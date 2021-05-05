package com.srini.reversal;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.annotations.QueryParam;

import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a reversed word
 */
@RestLiCollection(parent=CheckResource.class, name = "anagram", namespace = "com.srini.reversal")
public class AnagramCheckResource extends CollectionResourceTemplate<String, StringCheck> {

    @RestMethod.Get
    public StringCheck get(String word, @QueryParam("comparison") String word2) {
        StringOperator stringOperator = new StringOperator(word);
        return new StringCheck().setIsValid(stringOperator.isAnagram(word2));
    }
}
