package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import controller.ProfessorsController;
//import controller.StudentsController;
import model.Zaposleni;
import model.BaseofSoftware;
import model.Adresa;
//import model.Predmet.Semestar;
//import model.Student.Status;
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
		
		
		
		//ArrayList<Student> nisu_polozili = new ArrayList<Student>();
	//	nisu_polozili.add(new Student("Ognjen","Golubovic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
		

//		this.students.add(new Student("Ognjen","Golubovic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 151/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		this.students.add(new Student("Marko","Markovic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 150/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		
//		this.students.add(new Student("Imenko","Prezimenic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 152/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		
//		this.studentsBackup.add(new Student("Ognjen","Golubovic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 151/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		this.studentsBackup.add(new Student("Marko","Markovic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 150/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		this.studentsBackup.add(new Student("Imenko","Prezimenic",d,new Adresa("Balzakova",1,"NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 152/2019",2019,3,Status.B,8.3F,polozeni_predmeti,nepolozeni_predmeti));
//		
//		this.students.add(new Student("Ognjen","Golubovic",d,new Adresa("Balzakova","1","NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 151/2019",2019,3,Status.B,8.3F));
//		this.students.add(new Student("Marko","Markovic",d,new Adresa("Balzakova","1","NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 150/2019",2019,3,Status.B,8.3F));
//		
//		this.students.add(new Student("Imenko","Prezimenic",d,new Adresa("Balzakova","1","NoviSad","Srbija")
//				,"+384949","ognjen@gmail.com","ra 152/2019",2019,3,Status.B,8.3F));
		
		//this.zaposleni.add(new Zaposleni("Luka","Peric","184987135" ,d,new Adresa("Jug Bogdana","24","Novi Sad"),"LukaLukic@Lukoslav.com", Zaposleni.Softver.Max3Ds));
		//this.zaposleni.add(new Zaposleni("Vasilije","Vulin","6516851" ,d,new Adresa("Svetog Petra","9","Novi Sad"),"pomoziboze@raj.com", Zaposleni.Softver.ZBrush));
		//this.zaposleni.add(new Zaposleni("Ratko","Lazarevic","98351684" ,d,new Adresa("Brace Krkljus","14","Novi Sad"),"palacinjak.krem@plazma.com", Zaposleni.Softver.Blender));
		//initColumns();
		
		
} 
	
	static Adresa a1 = new Adresa("13", "Nevinih Zrtava", "Beograd");
	static Adresa a2 = new Adresa("21", "Maloga Momira", "Ruma");
	static Adresa a3 = new Adresa("56", "Begecka", "Novi Sad");
	
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
//	public void initColumns() {
//		this.kolone = new ArrayList<String>();
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone11"));
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone12"));
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone13"));
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone14"));
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone15"));
//		this.kolone.add(MainFrame.getInstance().getResourceBundle().getString("kolone16"));
//
//		this.kolone1 = new ArrayList<String>();
//		this.kolone1.add(MainFrame.getInstance().getResourceBundle().getString("kolone21"));
//		this.kolone1.add(MainFrame.getInstance().getResourceBundle().getString("kolone22"));
//		this.kolone1.add(MainFrame.getInstance().getResourceBundle().getString("kolone23"));
//		this.kolone1.add(MainFrame.getInstance().getResourceBundle().getString("kolone24"));
//		this.kolone1.add(MainFrame.getInstance().getResourceBundle().getString("kolone25"));
//		
//		this.kolone2 = new ArrayList<String>();
//		this.kolone2.add(MainFrame.getInstance().getResourceBundle().getString("kolone21"));
//		this.kolone2.add(MainFrame.getInstance().getResourceBundle().getString("kolone22"));
//		this.kolone2.add(MainFrame.getInstance().getResourceBundle().getString("kolone23"));
//		this.kolone2.add(MainFrame.getInstance().getResourceBundle().getString("kolone34"));
//		this.kolone2.add(MainFrame.getInstance().getResourceBundle().getString("kolone35"));		
//	}
	public int getColumnCount() {
		return 6;
	} 
	public int getColumnCount1() {
		return 5;
	} 
	public int getColumnCount2() {
		return 5;
	} 
//	public int getRowCount() {
//		Zaposleni zap = StudentsController.getInstance().showStudent();
//		
//	}
//	public int getRowCount1() {
//		
//		Zaposleni zap = StudentsController.getInstance().showStudent();
//		
//	}
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
//	public Zaposleni getStudIndex(String index) {
//		for(Zaposleni s : zaposleni) {
//			if(s.getBroj_indeksa().equals(index))return s;
//		}
//		return null;
//	}
	
//	public Softver getRow2(int rowIndex)
//	{
//		Zaposleni zaposleni = StudentsController.getInstance().showStudent();
//		
//	}
//	public String getValueAt1(int row, int column) {
//		Zaposleni stud = StudentsController.getInstance().showStudent();
//		ArrayList<Ocena> grades = stud.getSpisak_polozenih_ispita();
//		Ocena grade = grades.get(row);
//		switch (column) {
//		case 0:
//			return grade.getPredmet().getSifra_predmeta();
//		case 1:
//			return grade.getPredmet().getNaziv_predmeta();
//		case 2:
//			return Integer.toString(grade.getPredmet().getBroj_ESPB_bodova());
//		case 3:
//			return Integer.toString(grade.getOcena());
//		case 4:
//			return parseDate(grade.getDatum_polaganja());
//		default:
//			return "";
//		}
//	}
//	public String getValueAt(int row, int column) {
//		Student student = this.students.get(row);
//			switch (column) {
//			case 0:
//				return student.getBroj_indeksa();
//			case 1:
//				return student.getIme();
//			case 2:
//				return student.getPrezime();
//			case 3:
//				return Integer.toString(student.getTrenutna_godina_studija());
//			case 4:
//				if(student.getStatus() == Status.B ) 
//					return "B";
//				else return "S";
//			case 5:
//				return Double.toString(avgGrade(student));
//			default:
//				return "";
//			}
//		
//	}
//	public String getValueAt2(int row, int column) {
//		Student student = StudentsController.getInstance().showStudent();
//		ArrayList<Predmet> predmeti = student.getSpisak_nepolozenih_ispita();
//		Predmet subject = predmeti.get(row);
//		switch (column) {
//		case 0:
//			return subject.getSifra_predmeta();
//		case 1:
//			return subject.getNaziv_predmeta();
//		case 2:
//			return Integer.toString(subject.getBroj_ESPB_bodova());
//		case 3:
//			return Integer.toString(subject.getGodina_studija());
//		case 4:
//			if(subject.getSemestar() == Semestar.zimski ) 
//				return MainFrame.getInstance().getResourceBundle().getString("semester1");
//			else return MainFrame.getInstance().getResourceBundle().getString("semester2");
//		default:
//			return "";
//		}
//	
//}
	
	public static ArrayList<Adresa> getAdrese() {
		return adrese;
	}
	public static ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
	public static void setZaposleni(int i, Zaposleni novi) {
		zaposleni.set(i, novi);
	}

	
//	public List<Zaposleni> getZaposleni() {
//		return zaposleni;
//	}
//
//	public void setZaposleni(List<Zaposleni> zaposleni) {
//		this.zaposleni = zaposleni;
//	}

	public Zaposleni getRow(int rowIndex) {
		return this.zaposleni.get(rowIndex);
	}
	
	
}
