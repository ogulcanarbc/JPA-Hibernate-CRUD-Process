package stajProje;

import java.util.Random;

public class GuvenlikKod {

	private Integer bir;
	private Integer iki;
	private Integer toplam;
	private Integer toplamGir;
		
	private Random rnd = new Random();
		

	public Integer getBir() {
		return this.bir = rnd.nextInt(20);
	}

	public void setBir(Integer bir) {
		this.bir = bir;
	}

	public Integer getIki() {
		return this.iki =rnd.nextInt(20);
	}

	public void setIki(Integer iki) {
		this.iki = iki;
	}

	public Random getRnd() {
		return rnd;
	}

	public void setRnd(Random rnd) {
		this.rnd = rnd;
	}

	public Integer getToplam() {
		return this.toplam = bir + iki;
	}

	public void setToplam(Integer toplam) {
		this.toplam = toplam;
	}

	public Integer getToplamGir() {
		return toplamGir;
	}

	public void setToplamGir(Integer toplamGir) {
		this.toplamGir = toplamGir;
	}
}
