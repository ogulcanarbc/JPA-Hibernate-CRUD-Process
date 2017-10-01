package stajProje;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ALogin {

	private String k_adi;
	private String k_sifre;
	private String k_yetki;

	public String getK_adi() {
		return k_adi;
	}

	public void setK_adi(String k_adi) {
		this.k_adi = k_adi;
	}

	public String getK_yetki() {
		return k_yetki;
	}

	public void setK_yetki(String k_yetki) {
		this.k_yetki = k_yetki;
	}

	public String getK_sifre() {
		return k_sifre;
	}

	public void setK_sifre(String k_sifre) {
		this.k_sifre = k_sifre;
	}
	public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Hoþgeldiniz  " +k_yetki+" "  + k_adi ));
    }

}
