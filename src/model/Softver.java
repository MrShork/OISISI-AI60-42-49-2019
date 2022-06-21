package model;

import java.util.ArrayList;

public class Softver {
	
	  private static final long serialVersionUID = -6015214315107758967L;
	    public enum Status{B,S}
	   
	    public ArrayList<String> getCetkice() {
			return Cetkice;
		}
		public void setCetkice(ArrayList<String> cetkice) {
			Cetkice = cetkice;
		}
		public ArrayList<String> getAlatiZaAnimaciju() {
			return AlatiZaAnimaciju;
		}
		public void setAlatiZaAnimaciju(ArrayList<String> alatiZaAnimaciju) {
			AlatiZaAnimaciju = alatiZaAnimaciju;
		}
		public String getRender() {
			return Render;
		}
		public void setRender(String render) {
			Render = render;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public void setNaziv(String naziv) {
			Naziv = naziv;
		}
		public Softver(String naziv, ArrayList<String> cetkice, ArrayList<String> alatiZaAnimaciju, String render) {
			super();
			Naziv = naziv;
			Cetkice = cetkice;
			AlatiZaAnimaciju = alatiZaAnimaciju;
			Render = render;
		}
		private String Naziv;
	    private ArrayList<String> Cetkice;
	    private ArrayList<String> AlatiZaAnimaciju;
	    private String Render;
		public String getNaziv() {
			return Naziv;
		}
}
