package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom,"th�", argent);
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
