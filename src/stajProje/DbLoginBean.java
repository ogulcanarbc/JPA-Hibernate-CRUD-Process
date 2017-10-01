package stajProje;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityManager;


public class DbLoginBean implements Serializable{

	DbLogin dblogin = new DbLogin();
	
	private List<DbLogin> dblog = new ArrayList<DbLogin>();
	
	public void dbloginListeKaydet(){
			dblog.add(dblogin);
			
			dblogin = new DbLogin();
	}
	
	public void dbloginKaydet(){
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(dblogin);
		em.getTransaction().commit();
		
		dbloginListeKaydet();
		dblogin = new DbLogin();
		
	}
	
	public List<DbLogin> getDbLoginListe() {

		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from DbLogin").getResultList();
	}

	public DbLogin getDblogin() {
		return dblogin;
	}

	public void setDblogin(DbLogin dblogin) {
		this.dblogin = dblogin;
	}

	public List<DbLogin> getDblog() {
		return dblog;
	}

	public void setDblog(List<DbLogin> dblog) {
		this.dblog = dblog;
	}

	



}
