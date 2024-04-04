package fr.voxi.admin;

public class Lecteur {

	private int numero ;
	private String nom ;
	private String prenom ;
	private int nbAudiobooks = 0 ;

	public Lecteur(int numero, String nom, String prenom, int nbAudiobooks) {
	super();
	this.numero = numero;
	this.nom = nom;
	this.prenom = prenom;
	this.nbAudiobooks = nbAudiobooks;
	}

			

	public Lecteur(int numero, String nom, String prenom) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNbAudiobooks() {
		return nbAudiobooks;
	}

	public void setNbAudiobooks(int nbAudiobooks) {
		this.nbAudiobooks = nbAudiobooks;
	}
			@Override
	public String toString() {
		return "Lecteur [" + numero + ", " + nom + ", " + prenom + "," + nbAudiobooks
					+ "]";
	}

	public boolean estActif() {
		if(nbAudiobooks >= 10) {
			return true ;
		}

		else {
			return false ;
		}
	}

	public void produireUnAudioBooks(int nbAudiobooksAjoute) {
			nbAudiobooks=nbAudiobooks+nbAudiobooksAjoute ;
	}
}

