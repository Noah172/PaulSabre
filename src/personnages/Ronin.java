package personnages;

public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, String boissonP, int argent) {
		super(nom, boissonP, argent);
	}
	public void donner(Commercant beneficiaire) {
		int don=argent/10;
		argent=argent-don;
		System.out.println(beneficiaire.getNom()+" prend ces "+don+"sous");
		beneficiaire.recevoir(don);		
	}
	public void provoquer(Yakuza adversaire) {
		int force=2*honneur;
		if (force>=adversaire.getRep()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
			argent=argent+adversaire.getArgent();
			honneur+=1;
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			honneur-=1;
			int argentA=argent;
			argent=0;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argentA);
		}
	}

}
