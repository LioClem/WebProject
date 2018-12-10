package fr.univ.nantes.iut;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Soiree {

	@Id
	public ObjectId _id;

	public String nom;
	public String heure_debut;
	public Date date;
	public String heure_fin;
	public Evenement unEvt;
	public Restaurant unResto;
	public Double distance;

	// Constructors
	public Soiree() {
	}

	/**
	 * @param _id
	 * @param nom
	 * @param heure_debut
	 * @param date
	 * @param heure_fin
	 * @param unEvt
	 * @param unResto
	 * @param distance
	 */
	public Soiree(ObjectId _id, String nom, String heure_debut, Date date, String heure_fin, Evenement unEvt,
			Restaurant unResto, Double distance) {
		super();
		this._id = _id;
		this.nom = nom;
		this.heure_debut = heure_debut;
		this.date = date;
		this.heure_fin = heure_fin;
		this.unEvt = unEvt;
		this.unResto = unResto;
		this.distance = distance;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
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
	public Evenement getUnEvt() {
		return unEvt;
	}

	/**
	 * @param unEvt the unEvt to set
	 */
	public void setUnEvt(Evenement unEvt) {
		this.unEvt = unEvt;
	}

	/**
	 * @return the unResto
	 */
	public Restaurant getUnResto() {
		return unResto;
	}

	/**
	 * @param unResto the unResto to set
	 */
	public void setUnResto(Restaurant unResto) {
		this.unResto = unResto;
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
	
	

}
