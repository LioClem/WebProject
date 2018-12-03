
package fr.univ.nantes.iut;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lieu_quartier",
    "ville",
    "heure_fin",
    "heure_debut",
    "location",
    "type",
    "nom",
    "description",
    "adresse",
    "date",
})
public class Fields {

    @JsonProperty("lieu_quartier")
    private String lieuQuartier;
    @JsonProperty("ville")
    private String ville;
    @JsonProperty("heure_fin")
    private String heureFin;
    @JsonProperty("heure_debut")
    private String heureDebut;
    @JsonProperty("location")
    private String location;
    @JsonProperty("type")
    private String type;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("description")
    private String description;
    @JsonProperty("adresse")
    private String adresse;
    @JsonProperty("date")
    private String date;
    

    @JsonProperty("lieu_quartier")
    public String getLieuQuartier() {
        return lieuQuartier;
    }

    @JsonProperty("lieu_quartier")
    public void setLieuQuartier(String lieuQuartier) {
        this.lieuQuartier = lieuQuartier;
    }

    @JsonProperty("ville")
    public String getVille() {
        return ville;
    }

    @JsonProperty("ville")
    public void setVille(String ville) {
        this.ville = ville;
    }

    @JsonProperty("heure_fin")
    public String getHeureFin() {
        return heureFin;
    }

    @JsonProperty("heure_fin")
    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    @JsonProperty("heure_debut")
    public String getHeureDebut() {
        return heureDebut;
    }

    @JsonProperty("heure_debut")
    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("adresse")
    public String getAdresse() {
        return adresse;
    }

    @JsonProperty("adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

}
