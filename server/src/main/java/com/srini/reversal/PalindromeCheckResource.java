package com.srini.reversal;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a reversed word
 */
@RestLiCollection(parent=CheckResource.class, name = "palindrome", namespace = "com.srini.reversal")
public class PalindromeCheckResource extends CollectionResourceTemplate<String, StringCheck> {

    private boolean isPalindrome(String word) {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(word);
        sbuilder.reverse();

        return word.equals(sbuilder.toString());
    }

    @Override
    public StringCheck get(String word) {
        return new StringCheck().setIsValid(isPalindrome(word));
    }
}
