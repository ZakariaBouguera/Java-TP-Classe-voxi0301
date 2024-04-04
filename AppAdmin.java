package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		Lecteur lecteur1 = new Lecteur (101 , "SANTERRE","Jean",20);

		System.out.println (lecteur1.toString());

		System.out.println ("Nom du lecteur numéro"+lecteur1.getNumero()+" : "+lecteur1.getNom());

		

		Lecteur lecteur2 = new Lecteur (102 , "NONATO","Isabella",0);

		System.out.println (lecteur2.toString());

		System.out.println ("Nom du lecteur numéro"+lecteur2.getNumero()+" : "+lecteur2.getNom());

		lecteur2.setNom("SANTERRE");

		System.out.println("La lectrice numéro "+ lecteur2.getNumero() +" vient de se marier et se nomme maintenant "+lecteur1.getNom());
		System.out.println("Nom du lecteur numero "+lecteur2.getNumero()+" : " +lecteur2.getNom());

	

		if(lecteur1.estActif()==true) {

			System.out.println("Lecteur " + lecteur1.getNumero() + " actif");

			}

		else {

			System.out.println("Lecteur " + lecteur1.getNumero() + " inactif");

			}
		if(lecteur2.estActif()==true) {
			System.out.println("Lecteur " + lecteur2.getNumero() + " actif");
			}
		else {
			System.out.println("Lecteur " + lecteur2.getNumero() + " inactif");

			}
		System.out.print("nombre d'audiobooks produit par le lecteur " + lecteur1.getNumero() + " : " + lecteur1.getNbAudiobooks() + "\n");
		lecteur1.setNbAudiobooks(21);
		System.out.print("nombre d'audiobooks produit par le lecteur " + lecteur1.getNumero() + " : " + lecteur1.getNbAudiobooks());
	}

}
