package org.sda.gymmanagementhibernatespring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.sda.gymmanagementhibernatespring.dao.ClientDao;
import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory sesionFactory;
	
	public void saveClient(ClientEntity client) {
		
	}

	public List<ClientEntity> getAllClients() {

		@SuppressWarnings("unchecked")
		Query<ClientEntity> query = sesionFactory.getCurrentSession().createQuery("From ClientEntity");
		return query.list();
	}

	public SessionFactory getSesionFactory() {
		return sesionFactory;
	}

	public void setSesionFactory(SessionFactory sesionFactory) {
		this.sesionFactory = sesionFactory;
	}

}
