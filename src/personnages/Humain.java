package personnages;

public class Humain {
	private String nom;
	private String boissonP;
	private int argent;
	
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
	private void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle" + nom + "et j’aime boire du" + boissonP + ".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de" +  boissonP + "! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (argent<prix) {
			parler("Je n'ai plus que" + argent + "sous en poche. Je ne peux même pas m'offrir un" + bien + " à " + prix + "sous.");
		} else {
			parler("J'ai" + argent + "sous en poche. Je vais pouvoir m'offrir" + bien + " à " + prix + "sous.");
		}
	}
}
