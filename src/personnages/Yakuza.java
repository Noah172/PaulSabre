package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int rep=0;

	public Yakuza(String nom, String boissonP, int argent, String clan) {
		super(nom, boissonP, argent);
		this.clan=clan;
	}
	
	public int getRep() {
		return rep;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argent1 = victime.seFaireExtorquer();
		parler ("J’ai piqué les " + argent1+ " sous de Marco, ce qui me fait " + (argent+argent1) + " sous dans ma poche. Hi ! Hi !");
		rep ++;
	}
	public int perdre() {
		int argentAvant=argent;
		argent=0;
		rep--;
		System.out.println("J’ai perdu mon duel et mes "+ argentAvant+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		return rep;
	}
	public void gagner(int gain) {
		rep+=1;
		argent=argent+gain;
		parler("Ce ronin pensait vraiment battre"+getNom()+" du clan de "+clan+". Je l'ai dépouillé de ses " +gain+" sous");
	}
		
}
