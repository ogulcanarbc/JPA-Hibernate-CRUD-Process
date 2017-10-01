package stajProje;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class ALoginBean implements Serializable {

	GuvenlikKod guvenlikKod = new GuvenlikKod();
	ALogin alogin = new ALogin();
	DbLogin xDbLogin = new DbLogin();

	private List<ALogin> aloginListe = new ArrayList<ALogin>();


	
	Connection con;
	Statement ps;
	ResultSet rs;
	String SQL_str;

	public void sorgula() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stajproje", "root", "12345");
			ps = con.createStatement();
			SQL_str = "Select db_adi,db_sifre,db_yetki from DbLogin where db_adi like ('" + alogin.getK_adi() + "') and db_sifre like ('" + alogin.getK_sifre() + "') ";
			rs = ps.executeQuery(SQL_str);
			rs.next();
			
			xDbLogin.db_adi=rs.getString(1).toString();
			xDbLogin.db_sifre=rs.getString(2).toString();
			xDbLogin.db_yetki=rs.getString(3).toString();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Bulunan Hata :" + e);
		}

	}


	public String yonlendir() {

		try {
//			aloginKaydet();
			sorgula();
			if (guvenlikKod.getToplam().equals(guvenlikKod.getToplamGir())) {
				
			sorgula();
			
			
			if (xDbLogin.db_yetki.equalsIgnoreCase("Kullanýcý") && xDbLogin.db_yetki!=null) {
				if (xDbLogin.db_adi.equalsIgnoreCase(alogin.getK_adi()) && xDbLogin.db_sifre.equalsIgnoreCase(alogin.getK_sifre()) && xDbLogin.db_sifre != null) {
					alogin = new ALogin();
					return "Kullanici?faces-redirect=true";
				}
			}

			if (xDbLogin.db_yetki.equalsIgnoreCase("Yönetici") && xDbLogin.db_yetki!=null) {
				if (xDbLogin.db_adi.equalsIgnoreCase(alogin.getK_adi()) && xDbLogin.db_sifre.equalsIgnoreCase(alogin.getK_sifre()) && xDbLogin.db_adi != null) {
					alogin = new ALogin();
					return "Yonetici?faces-redirect=true";
				}
			}

			}
			
			
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Yanlis Bildin");
			return "Giris?faces-redirect=true";
		}
	
		return "Giris?faces-redirect=true";

	}
	
	
	
	
	
	
	
	
	
	
	

	public GuvenlikKod getGuvenlikKod() {
		return guvenlikKod;
	}

	public void setGuvenlikKod(GuvenlikKod guvenlikKod) {
		this.guvenlikKod = guvenlikKod;
	}

	public ALogin getAlogin() {
		return alogin;
	}

	public void setAlogin(ALogin alogin) {
		this.alogin = alogin;
	}

	public List<ALogin> getAloginListe() {
		return aloginListe;
	}

	public void setAloginListe(List<ALogin> aloginListe) {
		this.aloginListe = aloginListe;
	}

	public DbLogin getxDbLogin() {
		return xDbLogin;
	}

	public void setxDbLogin(DbLogin xDbLogin) {
		this.xDbLogin = xDbLogin;
	}
//
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getPs() {
		return ps;
	}

	public void setPs(Statement ps) {
		this.ps = ps;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getSQL_str() {
		return SQL_str;
	}

	public void setSQL_str(String sQL_str) {
		SQL_str = sQL_str;
	}

}
