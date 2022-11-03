package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boissonP, int argent) {
		super(nom, boissonP, argent);
		// TODO Auto-generated constructor stub
	}

	public int seFaireExtorquer() {
		int argentV=argent;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		argent=0;
		return argentV;
	}

	public void recevoir(int argent) {
		parler(argent + "sous ! Je te remercie généreux donateur!");
	}
}
