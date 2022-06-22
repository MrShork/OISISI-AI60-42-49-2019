package model;

import java.util.ArrayList;

public class Render {
	
	public Render(String materijal,String kamere, String objekti, String naziv) {
		super();
		Materijal = materijal;
		Kamere = kamere;
		Objekti = objekti;
		Naziv = naziv;
	}
	private static final long serialVersionUID = -6015214315107758967L;
    //public enum Renderer{Vray,Arnold,Scanline}
   
    private String Materijal ;
    private String Kamere ;
    private String Objekti;
    private String Naziv;
	public String getMaterijal() {
		return Materijal;
	}
	public void setMaterijal(String materijal) {
		Materijal = materijal;
	}
	public String getKamere() {
		return Kamere;
	}
	public void setKamere(String kamere) {
		Kamere = kamere;
	}
	public String getObjekti() {
		return Objekti;
	}
	public void setObjekti(String objekti) {
		Objekti = objekti;
	}
	public String getNaziv() {
		return Naziv;
	}
	public void setNaziv(String naziv) {
		Naziv = naziv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
