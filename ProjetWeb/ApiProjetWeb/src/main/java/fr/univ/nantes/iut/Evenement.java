/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.Date;
import java.util.List;

/**
 * @author e187417p
 *
 */
public class Evenement {
	
	private int id;
	private String nom;
	private String description;
	private String adresse;
	private List<Double> coord;
	private String ville;
	private Date date;
	private String heure_debut;
	private String heure_fin;
	private String type;
	private String lieu;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the coord
	 */
	public List<Double> getCoord() {
		return coord;
	}
	/**
	 * @param coord the coord to set
	 */
	public void setCoord(List<Double> coord) {
		this.coord = coord;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
	
	
	

}
