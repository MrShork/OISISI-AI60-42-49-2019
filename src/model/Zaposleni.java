package model;
import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;

public class Zaposleni {

	
	private static final long serialVersionUID = -6015214315107758967L;
	public enum Status{B,S}
	private String ime;
	private String prezime;
	private Date datum_rodjenja;
	private Adresa adresa_stanovanja;
	private String email_adresa;
	private ArrayList<Softver> softveri;
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public String getEmail_adresa() {
		return email_adresa;
	}

	public void setEmail_adresa(String email_adresa) {
		this.email_adresa = email_adresa;
	}

	public ArrayList<Softver> getSoftveri() {
		return softveri;
	}

	public void setSoftveri(ArrayList<Softver> softveri) {
		this.softveri = softveri;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Zaposleni(String ime, String prezime, Date datum_rodjenja,Adresa adresa_stanovanja, String email_adresa,
			ArrayList<Softver> softveri) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datum_rodjenja = datum_rodjenja;
		this.email_adresa = email_adresa;
		this.softveri = softveri;
	}

	public Zaposleni() {
		super();
	}
	
	
	


}
