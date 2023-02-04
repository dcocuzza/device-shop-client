package com.shop.deviceshopclient;

import com.shop.deviceshopclient.api.Service;
import com.shop.deviceshopclient.data.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DeviceShopClientApplication {
	private static final Scanner scanner = new Scanner(System.in);
	private static final Service service = new Service();

	public static void main(String[] args) {
		SpringApplication.run(DeviceShopClientApplication.class, args);

		String nome;


		System.out.println("Inserisci il tuo nome");
		nome = scanner.next();
		System.out.println(nome.charAt(nome.length()-1));

		Client client = new Client(nome, service);

		char c;

		do{
			System.out.println("Visualizza carrello: [a] \nVisualizza tutti i dispositivi: [b] \n");
			c = scanner.next().charAt(0);

			switch (c){
				case 'a':

					break;
				case 'b':
					client.getAllDevices();
					break;

				default: break;
			}


		}while (c != 'z');





	}

}
