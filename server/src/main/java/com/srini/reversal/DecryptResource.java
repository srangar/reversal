package com.srini.reversal;

import com.linkedin.restli.server.annotations.QueryParam;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a encrypted word
 */
@RestLiCollection(name = "decrypt", namespace = "com.srini.reversal")
public class DecryptResource extends CollectionResourceTemplate<String, Decrypted> {

    @RestMethod.Get
    public Decrypted get(String word, @QueryParam("offset") int offset) {
        Cipher cipher = new Cipher();
        return new Decrypted().setDecrypted(cipher.decrypt(word, offset));
    }
}
