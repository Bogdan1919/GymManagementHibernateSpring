package org.sda.gymmanagementhibernatespring.dao;

import java.util.List;

import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;

public interface ClientDao {
	public void saveClient(ClientEntity client);

	public List<ClientEntity> getAllClients();
	
	
}
