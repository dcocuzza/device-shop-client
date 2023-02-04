package com.shop.deviceshopclient.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Service {
    private String uri = "http://localhost:8080/device";

    public void getAllDevices(){
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(java.net.http.HttpClient.Version.HTTP_2).build();

        HttpClient client = HttpClient.newBuilder().build();

        try {
            HttpResponse resp = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println("Esito Richiesta: " + resp.statusCode());
            System.out.println("Dati: " + resp.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}