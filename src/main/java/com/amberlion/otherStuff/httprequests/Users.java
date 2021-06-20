package com.amberlion.otherStuff.httprequests;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Users {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/users");


            try (CloseableHttpResponse response = httpClient.execute(request)) {
                // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    String result = EntityUtils.toString(entity);
                    System.out.println(result);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
