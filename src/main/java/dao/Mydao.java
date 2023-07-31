package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

import dto.UserInfo;

public class Mydao {
	@Autowired
	EntityManager manager;
public boolean save(UserInfo userInfo) {
//	try {
//		manager.getTransaction().begin();
//		manager.persist(userInfo);
//		manager.getTransaction().commit();
//		return true;
//	}
//	catch(Exception e) {
//		manager.getTransaction().commit();
//		return false;
//	}
	
	manager.getTransaction().begin();
	manager.persist(userInfo);
	manager.getTransaction().commit();
}
public UserInfo findByEmail(String  email)
{
	List<UserInfo> list= manager.createQuery("Select x from USerInfo x where email=?1  ").setParameter(1, email).getResultList();
	if(list.isEmpty()) {
		return null;
	
}
	else {
		return list.get(0);
	}
}
}