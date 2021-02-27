/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author Ioannis Kyriazis 3212018107
 */

public class Tragoudi {
    private String kallitexnhs;
    private String titlos;
    private String diarkeia;
    private String album;
    
    public Tragoudi(String kallitexnhs, String titlos, String diarkeia, String album) //ΔΟΜΗΤΗΣ ΤΡΑΓΟΥΔΙΟΥ
	{
		this.kallitexnhs=kallitexnhs;
		this.titlos=titlos;
		this.diarkeia=diarkeia;
		this.album=album;
	}
    //ΒΟΗΘΗΤΙΚΕΣ ΣΥΝΑΡΤΗΣΕΙΣ ΓΙΑ ΕΙΣΑΓΩΓΗ ΚΑΙ ΕΞΑΓΩΓΗ ΣΤΟΙΧΕΙΩΝ
    public void setKallitexnhs(String kallitexnhs){
        this.kallitexnhs=kallitexnhs;
    }
    public String getKallitexnhs(){
        return kallitexnhs;
    }
    public void setTitlos(String titlos){
        this.titlos=titlos;
    }
    public String getTitlos(){
        return this.titlos;
    }
    public void setDiarkeia(String diarkeia){
        this.diarkeia=diarkeia;
    }
    public String getDiarkeia(){
        return this.diarkeia;
    }
    public void setAlbum(String album){
        this.album=album;
    }
    public String getAlbum(){
        return this.album;
    }
    public String toString()
    {
        return "Titlos:  "+this.titlos+"   Kallitexnhs: "+this.kallitexnhs+ "   Diarkeia:  "+getDiarkeia();
    }
}
