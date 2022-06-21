package model;

import java.util.ArrayList;

public class Render {
	
	public Render(ArrayList<String> materijal, ArrayList<String> kamere, ArrayList<String> objekti, String naziv) {
		super();
		Materijal = materijal;
		Kamere = kamere;
		Objekti = objekti;
		Naziv = naziv;
	}
	private static final long serialVersionUID = -6015214315107758967L;
    public enum Status{B,S}
   
    private ArrayList<String> Materijal ;
    private ArrayList<String> Kamere ;
    private ArrayList<String> Objekti;
    private String Naziv;
	public ArrayList<String> getMaterijal() {
		return Materijal;
	}
	public void setMaterijal(ArrayList<String> materijal) {
		Materijal = materijal;
	}
	public ArrayList<String> getKamere() {
		return Kamere;
	}
	public void setKamere(ArrayList<String> kamere) {
		Kamere = kamere;
	}
	public ArrayList<String> getObjekti() {
		return Objekti;
	}
	public void setObjekti(ArrayList<String> objekti) {
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
