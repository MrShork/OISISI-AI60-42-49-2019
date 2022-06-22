package model;

import java.util.ArrayList;

public class Softver {
	
	  private static final long serialVersionUID = -6015214315107758967L;
	  
	  	//public enum Renderer{Vray,Arnold,Scanline}
	  	public enum Naziv{Max3Ds, ZBrush, Blender}
	  	private Naziv naziv;
	  	private Render renderer;
	  	private ArrayList<Cetkica> cetkice;
	  
	    public ArrayList<Cetkica> getCetkice() {
			return cetkice;
		}
		public void setCetkice(ArrayList<Cetkica> cetkice) {
			this.cetkice = cetkice;
		}
		public String getAlatiZaAnimaciju() {
			return AlatiZaAnimaciju;
		}
		public void setAlatiZaAnimaciju(String alatiZaAnimaciju) {
			AlatiZaAnimaciju = alatiZaAnimaciju;
		}
		public Render getRender() {
			return renderer;
		}
		public void setRender(Render renderer) {
			this.renderer = renderer;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public void setNaziv(Naziv naziv) {
			this.naziv = naziv;
		}
		public Softver(Naziv naziv, ArrayList<Cetkica> cetkice, String format , String alatiZaAnimaciju, Render renderer) {
			super();
			this.naziv = naziv;
			this.cetkice = cetkice;
			Format = format;
			AlatiZaAnimaciju = alatiZaAnimaciju;
			this.renderer = renderer;
		}
		//private String Naziv;
	    
	    private String Format;
	    
	    public String getFormat() {
			return Format;
		}
		public void setFormat(String format) {
			Format = format;
		}
		private String AlatiZaAnimaciju;
	   // private String Render;
		public Naziv getNaziv() {
			return naziv;
		}
}
