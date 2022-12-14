package personnages;

public class Humain {
	private String nom;
	private String boissonP;
	protected int argent;
	private int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonP, int argent) {
		this.nom = nom;
		this.boissonP = boissonP;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom + " et j�aime boire du " + boissonP + ".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de" +  boissonP + "! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		argent+=perte;
	}
	public void acheter(String bien, int prix) {
		if (argent<prix) {
			parler("Je n'ai plus que" + argent + "sous en poche. Je ne peux m�me pas m'offrir un" + bien + " � " + prix + "sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + "sous.");
			argent-=prix;
		}
	}	
	private void memoriser(Humain humain) {
		if (nbConnaissance>=30) {
			for (int i = 0; i < nbConnaissance; i++) {
				memoire[i]=memoire[i+1];
			}
			nbConnaissance--;
		}
		memoire[nbConnaissance]=humain;
		nbConnaissance++;
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	public void faireConnaissanceAvec(Humain autrehumain) {
		direBonjour();
		autrehumain.repondre(this);
		memoriser(autrehumain);
	}
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.println(memoire[i].getNom()+",");
		}
	}



}
