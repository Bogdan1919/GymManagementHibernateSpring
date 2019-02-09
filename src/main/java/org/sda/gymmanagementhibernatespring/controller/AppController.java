package org.sda.gymmanagementhibernatespring.controller;

import java.util.List;

import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;
import org.sda.gymmanagementhibernatespring.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppController 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ){
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dataBase.xml");
        ClientService clientService = applicationContext.getBean(ClientService.class);
        
        List<ClientEntity> clients = clientService.getAllClients();
        
        for(ClientEntity c : clients) {
        	System.out.println("Client ID: "+c.getId());
        	System.out.println("First Name: "+c.getFirstName());
        	System.out.println("Last Name: "+c.getLastName());
        	System.out.println("Phone: "+c.getPhone());
        	System.out.println("Email: "+c.getEmail());
        	System.out.println("---------");
        }
    }
}
