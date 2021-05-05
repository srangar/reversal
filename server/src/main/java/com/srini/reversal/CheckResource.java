package com.srini.reversal;

import com.linkedin.restli.server.annotations.RestLiSimpleResource;
import com.linkedin.restli.server.resources.SimpleResourceTemplate;

/**
 * Simple Rest.li Resource that serves up a reversed word
 */

@RestLiSimpleResource(name = "check", namespace = "com.srini.reversal")
public class CheckResource extends SimpleResourceTemplate<StringCheck> {
}
