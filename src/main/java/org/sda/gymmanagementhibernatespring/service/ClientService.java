package org.sda.gymmanagementhibernatespring.service;

import java.util.List;

import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;

public interface ClientService {

	public void saveClient(ClientEntity client);

	public List<ClientEntity> getAllClients();
	
}
