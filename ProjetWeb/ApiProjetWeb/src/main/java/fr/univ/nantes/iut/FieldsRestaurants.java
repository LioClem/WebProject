
package fr.univ.nantes.iut;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categorie",
    "nomoffre",
    "localisation",
    "adresse2",
    "commune",
})
public class FieldsRestaurants {

   
    @JsonProperty("categorie")
    private String categorie;
    @JsonProperty("nomoffre")
    private String nomoffre;
    @JsonProperty("localisation")
    private List<Double> localisation = null;
    @JsonProperty("adresse2")
    private String adresse2;
    @JsonProperty("commune")
    private String commune;



    @JsonProperty("categorie")
    public String getCategorie() {
        return categorie;
    }

    @JsonProperty("categorie")
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @JsonProperty("nomoffre")
    public String getNomoffre() {
        return nomoffre;
    }

    @JsonProperty("nomoffre")
    public void setNomoffre(String nomoffre) {
        this.nomoffre = nomoffre;
    }

    @JsonProperty("localisation")
    public List<Double> getLocalisation() {
        return localisation;
    }

    @JsonProperty("localisation")
    public void setLocalisation(List<Double> localisation) {
        this.localisation = localisation;
    }

    @JsonProperty("adresse2")
    public String getAdresse2() {
        return adresse2;
    }

    @JsonProperty("adresse2")
    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }
    
    @JsonProperty("commune")
    public String getCommune() {
        return commune;
    }

    @JsonProperty("commune")
    public void setCommune(String commune) {
        this.commune = commune;
    }

}
