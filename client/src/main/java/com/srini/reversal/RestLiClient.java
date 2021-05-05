package com.srini.reversal;

import com.linkedin.common.callback.FutureCallback;
import com.linkedin.common.util.None;
import com.linkedin.r2.transport.common.Client;
import com.linkedin.r2.transport.common.bridge.client.TransportClient;
import com.linkedin.r2.transport.common.bridge.client.TransportClientAdapter;
import com.linkedin.r2.transport.http.client.HttpClientFactory;
import com.linkedin.restli.client.Request;
import com.linkedin.restli.client.Response;
import com.linkedin.restli.client.ResponseFuture;
import com.linkedin.restli.client.RestClient;
import com.srini.reversal.ReverseRequestBuilders;
import com.srini.reversal.ReverseRequestBuilders;
import java.util.Collections;

public class RestLiClient {
    /**
     * This stand-alone app demos the client-side Rest.li API.
     * To see the demo, run the server, then start the client
     */
    public static void main(String[] args) throws Exception {
        // Create an HttpClient and wrap it in an abstraction layer
        final HttpClientFactory http = new HttpClientFactory();
        final Client r2Client = new TransportClientAdapter(
                http.getClient(Collections.<String, String>emptyMap()));

        // Create a RestClient to talk to localhost:8080
        RestClient restClient = new RestClient(r2Client, "http://localhost:8080/");

        ReverseGetRequestBuilder getBuilder = revBuilders.get();
        Request<ReversedWord> getRequest = getBuilder.id("racecard").build();

        // Send the request and wait for a response
        final ResponseFuture<ReversedWord> getFuture = restClient.sendRequest(getRequest);
        final Response<ReversedWord> response = getFuture.getResponse();

        // Print the response
        System.out.println(response.getEntity());

        restClient.shutdown(new FutureCallback<None>());
        http.shutdown(new FutureCallback<None>());

    }

    private static final ReverseRequestBuilders revBuilders = new ReverseRequestBuilders();
}