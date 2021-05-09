package com.srini.reversal;

import com.linkedin.restli.server.annotations.QueryParam;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a encrypted word
 */
@RestLiCollection(name = "encrypt", namespace = "com.srini.reversal")
public class EncryptResource extends CollectionResourceTemplate<String, Encrypted> {

    @RestMethod.Get
    public Encrypted get(String word, @QueryParam("offset") int offset) {
        Cipher cipher = new Cipher();
        return new Encrypted().setEncrypted(cipher.encrypt(word, offset));
    }
}
