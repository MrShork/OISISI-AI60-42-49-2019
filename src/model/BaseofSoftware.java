package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Softver.Naziv;
//import model.Cetkica.Naziv;
//import model.Softver.Renderer;
import view.MainFrame;

public class BaseofSoftware {
	private static BaseofSoftware instance = null;

	public static BaseofSoftware getInstance() {
		if (instance == null) {
			instance = new BaseofSoftware();
		}
		return instance;
	}
	//private List<Softver> software;
	private List<String> kolone;
	//private List<Cetkica> cetkica;
	private List<Render> render;
	public static ArrayList<Softver> softveri = new ArrayList<Softver>();
	public static ArrayList<Cetkica> cetkice = new ArrayList<Cetkica>();
	
	static Cetkica c1 = new Cetkica("Smooth, Pull, Crease", "Smoothing", "Providna");
	static Cetkica c2 = new Cetkica("Standard, Bend", "Dodaje masu", "Siva");
	static Cetkica c3 = new Cetkica("Deform", "Deformise masu", "Crna");
	
	static Softver s1 = new Softver(Naziv.Max3Ds, new ArrayList<Cetkica>(List.of(c1)), ".max", "Inverse Kinematics", new Render("Kamen", "2", "Kockasti", "Vray"));
	static Softver s2 =new Softver(Naziv.ZBrush, new ArrayList<Cetkica>(List.of(c2)), ".ma", "Sculpting", new Render("Mermer", "1", "Organski", "Corona"));
	static Softver s3 =new Softver(Naziv.Blender, new ArrayList<Cetkica>(List.of(c3)), ".blend", "Skinning", new Render("Drvo", "3", "Neorganski", "Scanline"));
	
	
	public static void popuniListe() {
		

		cetkice.add(c1);
		cetkice.add(c1);
		cetkice.add(c1);
		softveri.add(s1);
		softveri.add(s2);
		softveri.add(s3);
		
	}
		
		private BaseofSoftware() {

		
		
		
		
		this.kolone = new ArrayList<String>();
		this.kolone.add("Naziv Softvera");
		this.kolone.add("Cetkica");
		this.kolone.add("Format");
		this.kolone.add("Alat");
		this.kolone.add("Renderer");
}
	public int getColumnCount() {
		return 5;
	}
	public List<String> getColumns(){
		return kolone;
	}
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public static ArrayList<Cetkica> getCetkice() {
		return cetkice;
	}
	
	public static ArrayList<Softver> getSoftveri() {
		return softveri;
	}
}