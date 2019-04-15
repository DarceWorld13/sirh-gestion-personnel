package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	String matricule;
	String nom;
	String prenom;
	LocalDate date_De_Naissance;
	String adresse;
	String numero_de_Securite_Sociale;
	String emailPro;
	String photo;
	ZonedDateTime date_heure_creation;
	boolean actif;

	// constructeur
	public Collaborateur(String matricule, String nom, String prenom, LocalDate date_De_Naissance, String adresse,
			String numero_de_Securite_Sociale, String emailPro, String photo, ZonedDateTime date_heure_creation,
			boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date_De_Naissance = date_De_Naissance;
		this.adresse = adresse;
		this.numero_de_Securite_Sociale = numero_de_Securite_Sociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.date_heure_creation = date_heure_creation;
		this.actif = actif;
	}

	// getters and setters

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	public LocalDate getDate_De_Naissance() {
		return date_De_Naissance;
	}

	public void setDate_De_Naissance(LocalDate date_De_Naissance) {
		this.date_De_Naissance = date_De_Naissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumero_de_Securite_Sociale() {
		return numero_de_Securite_Sociale;
	}

	public void setNumero_de_Securite_Sociale(String numero_de_Securite_Sociale) {
		this.numero_de_Securite_Sociale = numero_de_Securite_Sociale;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDate_heure_creation() {
		return date_heure_creation;
	}

	public void setDate_heure_creation(ZonedDateTime date_heure_creation) {
		this.date_heure_creation = date_heure_creation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
