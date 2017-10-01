package stajProje;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

@Entity
@Table(name="Calisan")
public class Calisan implements Serializable {

	 
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="tcNo")
	private String tcNo;
	
	@Column(name="yas")
	private String yas;
	
	@Column(name="adres")
	private String adres;
	
	@Column(name="email")
	private String email;
	
	@Column(name="departmanAd")
	private String departmanAd;
	
	@Column(name="ucret")
	private String ucret;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getYas() {
		return yas;
	}


	public void setYas(String yas) {
		this.yas = yas;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDepartmanAd() {
		return departmanAd;
	}


	public void setDepartmanAd(String departmanAd) {
		this.departmanAd = departmanAd;
	}


	public String getUcret() {
		return ucret;
	}


	public void setUcret(String ucret) {
		this.ucret = ucret;
	}


	

}
