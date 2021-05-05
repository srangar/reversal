package com.srini.reversal;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a reversed word
 */
@RestLiCollection(name = "reverse", namespace = "com.srini.reversal")
public class ReversalResource extends CollectionResourceTemplate<String, ReversedWord> {

    private String reverse(String word) {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(word);
        sbuilder.reverse();

        return sbuilder.toString();
    }

    @Override
    public ReversedWord get(String word) {
        String reversed = reverse(word);
        return new ReversedWord().setReversed(reversed);
    }
}
