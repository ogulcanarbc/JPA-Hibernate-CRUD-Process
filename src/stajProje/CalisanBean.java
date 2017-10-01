package stajProje;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.EntityManager;

public class CalisanBean implements Serializable {

	Calisan calisan = new Calisan();

	private List<Calisan> getCalisanListesi() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Calisan").getResultList();

	}

	public void calisanKaydet() {

		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(calisan);
		em.getTransaction().commit();

		calisan = new Calisan();
	}

	public void calisanSil() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(calisan);
		em.getTransaction().commit();

		calisan = new Calisan();
	}

	public void calisanDuzenle() {
		EntityManager em = EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(calisan);
		em.getTransaction().commit();

		calisan = new Calisan();
	}

	public List<Calisan> getCalisanListe() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Calisan").getResultList();

	}

	public List<Calisan> getCalisanAdaGoreAra() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Calisan where ad like:ad").setParameter("ad", this.calisan.getAd() + "%")
				.getResultList();

	}

	public List<Calisan> getCalisanDeptGoreAra() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Calisan where departmanAd like:departmanAd")
				.setParameter("departmanAd", this.calisan.getDepartmanAd() + "%").getResultList();

	}

	public List<Calisan> getCalisanTcGoreAra() {
		EntityManager em = EntityUtil.getEntityManager();
		return em.createQuery("from Calisan where tcNo like:tcNo").setParameter("tcNo", this.calisan.getTcNo() + "%")
				.getResultList();

	}

	public Calisan getCalisan() {
		return calisan;
	}

	public void setCalisan(Calisan calisan) {
		this.calisan = calisan;
	}

}
