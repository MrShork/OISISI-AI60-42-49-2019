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
	private List<Softver> software;
	private List<String> kolone;
	private List<Cetkica> cetkica;
	private List<Render> render;
	
	
	private BaseofSoftware() {

		this.software = new ArrayList<Softver>();
		
//		this.software.add(new Softver("E298","OISISI",6,2,new Zaposleni("Mika", "Mikic", d, a, "+281818","1848499","prof@gmail.com","Zaposleni"),Renderer.zimski));
//		this.software.add(new Softver("E299","Baze Podataka 1",8,1,new Zaposleni("Mika", "Mikic", d, a, "+281818","1848499","prof@gmail.com","Zaposleni"),Renderer.zimski));
//		this.software.add(new Softver("E297","Metode Optimizacija",8,3,new Zaposleni(),Renderer.zimski));
//		this.software.add(new Softver("E296","NANS",4,4,new Zaposleni(),Renderer.zimski));
		this.software.add(new Softver(Naziv.Max3Ds, new Cetkica("Smooth", "Smoothing", "Providna"), ".max", "Inverse Kinematics", new Render("Kamen", "2", "Kockasti", "Vray")));
		this.software.add(new Softver(Naziv.ZBrush, new Cetkica("Standard", "Dodaje masu", "Siva"), ".ma", "Sculpting", new Render("Mermer", "1", "Organski", "Corona")));
		this.software.add(new Softver(Naziv.Blender, new Cetkica("Deform", "Deformise masu", "Crna"), ".blend", "Skinning", new Render("Drvo", "3", "Neorganski", "Scanline")));
		
		
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
	public List<Softver> getSubjects() {
		return software;
	}
	public Softver getRow(int rowIndex) {
		return this.software.get(rowIndex);
	}
	public String getValueAt(int row, int column) {
		Softver softver = this.software.get(row);
		Cetkica cetkica = this.cetkica.get(row);
		Render render = this.render.get(row);
			switch (column) {
			case 0:
				if(softver.getNaziv() == Naziv.Max3Ds ) 
					return "Max3Ds";
				else if(softver.getNaziv() == Naziv.ZBrush )
					return "ZBrush";
				else return "Blender";
			case 1:
				return cetkica.getNaziv();
			case 2:
				return softver.getFormat();
			case 3:
				return softver.getAlatiZaAnimaciju();
			case 4:
				return render.getNaziv();
		
			default:
				return "";
			}
		
	
			
			
			
			
	}	
}