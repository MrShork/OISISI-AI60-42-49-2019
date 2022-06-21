package model;
import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;

public class Adresa {


    private static final long serialVersionUID = -6015214315107758967L;
    public enum Status{B,S}
    //private String ime;
    //private String prezime;
   // private Date datum_rodjenja;
    private String broj;
    private String ulica;
    private String grad;
    //private String broj_indeksa;


    public Adresa(){}

    public Adresa(String ulica, String broj, String grad, String drzava) {
        super();
        this.ulica = ulica;
        this.broj = broj;
        this.grad = grad;
       
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }
    public String getGrad() {
        return grad;
    }
    public void setGrad(String grad) {
        this.grad = grad;
    }
   
   
    

    @Override
    public String toString() {
        return "" + ulica + "," + broj + "," + grad + "";
    }







}