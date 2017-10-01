package stajProje;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DbLogin")
public class DbLogin implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	
	@Column(name="db_adi")
	public String db_adi;
	
	
	@Column(name="db_sifre")
	public String db_sifre;
	
	
	@Column(name="db_yetki")
	public String db_yetki;

	public String getDb_adi() {
		return db_adi;
	}

	public void setDb_adi(String db_adi) {
		this.db_adi = db_adi;
	}


	public String getDb_yetki() {
		return db_yetki;
	}

	public void setDb_yetki(String db_yetki) {
		this.db_yetki = db_yetki;
	}

	public String getDb_sifre() {
		return db_sifre;
	}

	public void setDb_sifre(String db_sifre) {
		this.db_sifre = db_sifre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



}
