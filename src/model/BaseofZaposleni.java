package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import model.Zaposleni;
import model.BaseofSoftware;
import model.Adresa;

import view.MainFrame;


public class BaseofZaposleni {
	private static BaseofZaposleni instance = null;

	public static BaseofZaposleni getInstance() {
		if (instance == null) {
			instance = new BaseofZaposleni();
		}
		return instance;
	}
	private String search;
	//private List<Zaposleni> zaposleni;
	private List<Softver> softver;
	private List<String> kolone;
	private List<String> kolone1;
	private List<String> kolone2;
	
	
	public static ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();
	public static ArrayList<Adresa> adrese = new ArrayList<Adresa>();
	private BaseofZaposleni() {

		this.zaposleni = new ArrayList<Zaposleni>();
		//this.softver = new ArrayList<Softver>();
		Date d = new Date();
		d.setDate(29);
		d.setMonth(07);
		d.setYear(2000);
		Date d1 = new Date();
		d1.setDate(16);
		d1.setMonth(06);
		d1.setYear(202);
		Date d2 = new Date();
		d2.setDate(11);
		d2.setMonth(03);
		d2.setYear(2005);
		
		
		
				
		
		//this.zaposleni.add(new Zaposleni("Luka","Peric","184987135" ,d,new Adresa("Jug Bogdana","24","Novi Sad"),"LukaLukic@Lukoslav.com", Zaposleni.Softver.Max3Ds));
		//this.zaposleni.add(new Zaposleni("Vasilije","Vulin","6516851" ,d,new Adresa("Svetog Petra","9","Novi Sad"),"pomoziboze@raj.com", Zaposleni.Softver.ZBrush));
		//this.zaposleni.add(new Zaposleni("Ratko","Lazarevic","98351684" ,d,new Adresa("Brace Krkljus","14","Novi Sad"),"palacinjak.krem@plazma.com", Zaposleni.Softver.Blender));
		//initColumns();
		
		
} 
	
	static Adresa a1 = new Adresa("24", "Jug Bogdana", "Novi Sad");
	static Adresa a2 = new Adresa("11", "Urosa Nejakog", "Indjija");
	static Adresa a3 = new Adresa("17", "Jovana Cvijica", "Banja Koviljaca");
	
	static Zaposleni z1 = new Zaposleni("Luka","Peric","184987135" ,new Date(2000,29,0),a1,"LukaLukic@Lukoslav.com", Zaposleni.Softver.Max3Ds);
	static Zaposleni z2 =new Zaposleni("Vasilije","Vulin","6516851" ,new Date(2002,06,16),a2,"pomoziboze@raj.com", Zaposleni.Softver.ZBrush);
	static Zaposleni z3 =new Zaposleni("Ratko","Lazarevic","98351684" ,new Date(2005,03,11),a3,"palacinjak.krem@plazma.com", Zaposleni.Softver.Blender);
	
	
	
	public static void popuniListe() {
		adrese.add(a1);
		adrese.add(a2);
		adrese.add(a3);

		zaposleni.add(z1);
		zaposleni.add(z2);
		zaposleni.add(z3);
	}
	

	public int getColumnCount() {
		return 6;
	} 
	public int getColumnCount1() {
		return 5;
	} 
	public int getColumnCount2() {
		return 5;
	} 

	public List<String> getColumns(){
		return kolone;
	}
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	public String getColumnName1(int index) {
		return this.kolone1.get(index);
	}
	public String getColumnName2(int index) {
		return this.kolone2.get(index);
	}

	
	public static ArrayList<Adresa> getAdrese() {
		return adrese;
	}
	public static ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
	public static void setZaposleni(int i, Zaposleni novi) {
		zaposleni.set(i, novi);
	}



	public Zaposleni getRow(int rowIndex) {
		return this.zaposleni.get(rowIndex);
	}
	
	
}
