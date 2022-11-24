package petitPrince;


import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet {
	private String nom = "Petit prince non joueur";
	private int argent = 100;
	private ConsoleJavaBoy console;
	private int cpt = 0 ;
	
	public PetitPrince0() {
		this.console= new ConsoleJavaBoy(this);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}

	@Override
	public int getArgent() {
		// TODO Auto-generated method stub
		return this.argent;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.cpt++;
		this.console.parler("[tour "+cpt+"]" + " Dessine moi un mouton!");
		this.console.seDirigerVers(0);
	}
}
