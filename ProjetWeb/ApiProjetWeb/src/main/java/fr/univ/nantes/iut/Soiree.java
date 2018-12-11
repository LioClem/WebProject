package fr.univ.nantes.iut;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Soiree {

	@Id
	public String id;

	public String nom;
	public String heure_debut;
	public Date date;
	public String heure_fin;
	public int numEvt;
	public int numResto;
	public Double distance;

	// Constructors
	public Soiree() {
	}

	/**
	 * @param nom
	 * @param heure_debut
	 * @param date
	 * @param heure_fin
	 * @param unEvt
	 * @param unResto
	 * @param distance
	 */
	public Soiree(String nom, String heure_debut,String heure_fin, Date date , int numEvt,
			int numResto, Double distance) {
		this.nom = nom;
		this.heure_debut = heure_debut;
		this.date = date;
		this.heure_fin = heure_fin;
		this.numEvt = numEvt;
		this.numResto = numResto;
		this.distance = distance;
	}
	
	public Soiree(String nom) {
		this.nom = nom;
	}
	
	// ObjectId needs to be converted to string
	public String get_id() {
		return id;
	}

	public void set_id(String id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the heure_debut
	 */
	public String getHeure_debut() {
		return heure_debut;
	}

	/**
	 * @param heure_debut the heure_debut to set
	 */
	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the heure_fin
	 */
	public String getHeure_fin() {
		return heure_fin;
	}

	/**
	 * @param heure_fin the heure_fin to set
	 */
	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
	}

	/**
	 * @return the unEvt
	 */
	public int getUnEvt() {
		return numEvt;
	}

	/**
	 * @param unEvt the unEvt to set
	 */
	public void setUnEvt(int unEvt) {
		this.numEvt = unEvt;
	}

	/**
	 * @return the unResto
	 */
	public int getUnResto() {
		return numResto;
	}

	/**
	 * @param unResto the unResto to set
	 */
	public void setUnResto(int unResto) {
		this.numResto = unResto;
	}

	/**
	 * @return the distance
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(Double distance) {
		this.distance = distance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Soiree [id=" + id + ", nom=" + nom + ", heure_debut=" + heure_debut + ", date=" + date + ", heure_fin="
				+ heure_fin + ", numEvt=" + numEvt + ", numResto=" + numResto + ", distance=" + distance + "]";
	}


	
	
	

}
