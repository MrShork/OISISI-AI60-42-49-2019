package model;

public class Cetkica {
	
	  private static final long serialVersionUID = -6015214315107758967L;
	    public enum Status{B,S}
	   
	    private String Naziv;
	    private String Namena;
	    private String Boja;
		public String getNaziv() {
			return Naziv;
		}
		public void setNaziv(String naziv) {
			Naziv = naziv;
		}
		public String getNamena() {
			return Namena;
		}
		public void setNamena(String namena) {
			Namena = namena;
		}
		public String getBoja() {
			return Boja;
		}
		public void setBoja(String boja) {
			Boja = boja;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Cetkica(String naziv, String namena, String boja) {
			super();
			Naziv = naziv;
			Namena = namena;
			Boja = boja;
		}
	   
}
