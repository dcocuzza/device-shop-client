package com.shop.deviceshopclient.data;

import com.shop.deviceshopclient.api.Service;

public class Client {
    private final String name;
    private final Service service;

    public Client(String name, Service http){
        this.name = name;
        this.service = http;
    }

    public void getAllDevices(){
        service.getAllDevices();
    }

    public void visualizzaCarrello(){
        service.visualizzaCarrello(name);
    }
    public void aggiungiAlCarrello(String disp){
        service.aggiungiAlCarrello(name, disp);
    }
    public void cercaDispositivi(String cerca){
        service.cercaDispositivi(cerca);
    }
}
