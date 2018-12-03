
package fr.univ.nantes.iut;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lieu_quartier",
    "ville",
    "h_lsf",
    "heure_fin",
    "h_psychique",
    "url_internet_1",
    "lieu",
    "gratuit",
    "courriel_1",
    "precisions_tarifs",
    "h_visuel",
    "heure_debut",
    "location",
    "type",
    "h_intellectuel",
    "nom",
    "accueil_enfant",
    "description",
    "emetteur",
    "adresse",
    "rubrique",
    "annule",
    "date",
    "lien_agenda",
    "internet_1",
    "h_hyperacousie",
    "code_postal",
    "media_1",
    "id_manif",
    "h_moteur",
    "reporte",
    "libelle_courriel_1",
    "precisions_public",
    "carte_blanche",
    "complet",
    "h_auditif",
    "organisateurs",
    "info_suppl",
    "lieu_siteweb",
    "lieu_tel"
})
public class Fields {

    @JsonProperty("lieu_quartier")
    private String lieuQuartier;
    @JsonProperty("ville")
    private String ville;
    @JsonProperty("h_lsf")
    private String hLsf;
    @JsonProperty("heure_fin")
    private String heureFin;
    @JsonProperty("h_psychique")
    private String hPsychique;
    @JsonProperty("url_internet_1")
    private String urlInternet1;
    @JsonProperty("lieu")
    private String lieu;
    @JsonProperty("gratuit")
    private String gratuit;
    @JsonProperty("courriel_1")
    private String courriel1;
    @JsonProperty("precisions_tarifs")
    private String precisionsTarifs;
    @JsonProperty("h_visuel")
    private String hVisuel;
    @JsonProperty("heure_debut")
    private String heureDebut;
    @JsonProperty("location")
    private String location;
    @JsonProperty("type")
    private String type;
    @JsonProperty("h_intellectuel")
    private String hIntellectuel;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("accueil_enfant")
    private String accueilEnfant;
    @JsonProperty("description")
    private String description;
    @JsonProperty("emetteur")
    private String emetteur;
    @JsonProperty("adresse")
    private String adresse;
    @JsonProperty("rubrique")
    private String rubrique;
    @JsonProperty("annule")
    private String annule;
    @JsonProperty("date")
    private String date;
    @JsonProperty("lien_agenda")
    private String lienAgenda;
    @JsonProperty("internet_1")
    private String internet1;
    @JsonProperty("h_hyperacousie")
    private String hHyperacousie;
    @JsonProperty("code_postal")
    private String codePostal;
    @JsonProperty("media_1")
    private String media1;
    @JsonProperty("id_manif")
    private String idManif;
    @JsonProperty("h_moteur")
    private String hMoteur;
    @JsonProperty("reporte")
    private String reporte;
    @JsonProperty("libelle_courriel_1")
    private String libelleCourriel1;
    @JsonProperty("precisions_public")
    private String precisionsPublic;
    @JsonProperty("carte_blanche")
    private String carteBlanche;
    @JsonProperty("complet")
    private String complet;
    @JsonProperty("h_auditif")
    private String hAuditif;
    @JsonProperty("organisateurs")
    private String organisateurs;
    @JsonProperty("info_suppl")
    private String infoSuppl;
    @JsonProperty("lieu_siteweb")
    private String lieuSiteweb;
    @JsonProperty("lieu_tel")
    private String lieuTel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lieu_quartier")
    public String getLieuQuartier() {
        return lieuQuartier;
    }

    @JsonProperty("lieu_quartier")
    public void setLieuQuartier(String lieuQuartier) {
        this.lieuQuartier = lieuQuartier;
    }

    public Fields withLieuQuartier(String lieuQuartier) {
        this.lieuQuartier = lieuQuartier;
        return this;
    }

    @JsonProperty("ville")
    public String getVille() {
        return ville;
    }

    @JsonProperty("ville")
    public void setVille(String ville) {
        this.ville = ville;
    }

    public Fields withVille(String ville) {
        this.ville = ville;
        return this;
    }

    @JsonProperty("h_lsf")
    public String getHLsf() {
        return hLsf;
    }

    @JsonProperty("h_lsf")
    public void setHLsf(String hLsf) {
        this.hLsf = hLsf;
    }

    public Fields withHLsf(String hLsf) {
        this.hLsf = hLsf;
        return this;
    }

    @JsonProperty("heure_fin")
    public String getHeureFin() {
        return heureFin;
    }

    @JsonProperty("heure_fin")
    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public Fields withHeureFin(String heureFin) {
        this.heureFin = heureFin;
        return this;
    }

    @JsonProperty("h_psychique")
    public String getHPsychique() {
        return hPsychique;
    }

    @JsonProperty("h_psychique")
    public void setHPsychique(String hPsychique) {
        this.hPsychique = hPsychique;
    }

    public Fields withHPsychique(String hPsychique) {
        this.hPsychique = hPsychique;
        return this;
    }

    @JsonProperty("url_internet_1")
    public String getUrlInternet1() {
        return urlInternet1;
    }

    @JsonProperty("url_internet_1")
    public void setUrlInternet1(String urlInternet1) {
        this.urlInternet1 = urlInternet1;
    }

    public Fields withUrlInternet1(String urlInternet1) {
        this.urlInternet1 = urlInternet1;
        return this;
    }

    @JsonProperty("lieu")
    public String getLieu() {
        return lieu;
    }

    @JsonProperty("lieu")
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Fields withLieu(String lieu) {
        this.lieu = lieu;
        return this;
    }

    @JsonProperty("gratuit")
    public String getGratuit() {
        return gratuit;
    }

    @JsonProperty("gratuit")
    public void setGratuit(String gratuit) {
        this.gratuit = gratuit;
    }

    public Fields withGratuit(String gratuit) {
        this.gratuit = gratuit;
        return this;
    }

    @JsonProperty("courriel_1")
    public String getCourriel1() {
        return courriel1;
    }

    @JsonProperty("courriel_1")
    public void setCourriel1(String courriel1) {
        this.courriel1 = courriel1;
    }

    public Fields withCourriel1(String courriel1) {
        this.courriel1 = courriel1;
        return this;
    }

    @JsonProperty("precisions_tarifs")
    public String getPrecisionsTarifs() {
        return precisionsTarifs;
    }

    @JsonProperty("precisions_tarifs")
    public void setPrecisionsTarifs(String precisionsTarifs) {
        this.precisionsTarifs = precisionsTarifs;
    }

    public Fields withPrecisionsTarifs(String precisionsTarifs) {
        this.precisionsTarifs = precisionsTarifs;
        return this;
    }

    @JsonProperty("h_visuel")
    public String getHVisuel() {
        return hVisuel;
    }

    @JsonProperty("h_visuel")
    public void setHVisuel(String hVisuel) {
        this.hVisuel = hVisuel;
    }

    public Fields withHVisuel(String hVisuel) {
        this.hVisuel = hVisuel;
        return this;
    }

    @JsonProperty("heure_debut")
    public String getHeureDebut() {
        return heureDebut;
    }

    @JsonProperty("heure_debut")
    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Fields withHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Fields withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Fields withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("h_intellectuel")
    public String getHIntellectuel() {
        return hIntellectuel;
    }

    @JsonProperty("h_intellectuel")
    public void setHIntellectuel(String hIntellectuel) {
        this.hIntellectuel = hIntellectuel;
    }

    public Fields withHIntellectuel(String hIntellectuel) {
        this.hIntellectuel = hIntellectuel;
        return this;
    }

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Fields withNom(String nom) {
        this.nom = nom;
        return this;
    }

    @JsonProperty("accueil_enfant")
    public String getAccueilEnfant() {
        return accueilEnfant;
    }

    @JsonProperty("accueil_enfant")
    public void setAccueilEnfant(String accueilEnfant) {
        this.accueilEnfant = accueilEnfant;
    }

    public Fields withAccueilEnfant(String accueilEnfant) {
        this.accueilEnfant = accueilEnfant;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Fields withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("emetteur")
    public String getEmetteur() {
        return emetteur;
    }

    @JsonProperty("emetteur")
    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public Fields withEmetteur(String emetteur) {
        this.emetteur = emetteur;
        return this;
    }

    @JsonProperty("adresse")
    public String getAdresse() {
        return adresse;
    }

    @JsonProperty("adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Fields withAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    @JsonProperty("rubrique")
    public String getRubrique() {
        return rubrique;
    }

    @JsonProperty("rubrique")
    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }

    public Fields withRubrique(String rubrique) {
        this.rubrique = rubrique;
        return this;
    }

    @JsonProperty("annule")
    public String getAnnule() {
        return annule;
    }

    @JsonProperty("annule")
    public void setAnnule(String annule) {
        this.annule = annule;
    }

    public Fields withAnnule(String annule) {
        this.annule = annule;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Fields withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("lien_agenda")
    public String getLienAgenda() {
        return lienAgenda;
    }

    @JsonProperty("lien_agenda")
    public void setLienAgenda(String lienAgenda) {
        this.lienAgenda = lienAgenda;
    }

    public Fields withLienAgenda(String lienAgenda) {
        this.lienAgenda = lienAgenda;
        return this;
    }

    @JsonProperty("internet_1")
    public String getInternet1() {
        return internet1;
    }

    @JsonProperty("internet_1")
    public void setInternet1(String internet1) {
        this.internet1 = internet1;
    }

    public Fields withInternet1(String internet1) {
        this.internet1 = internet1;
        return this;
    }

    @JsonProperty("h_hyperacousie")
    public String getHHyperacousie() {
        return hHyperacousie;
    }

    @JsonProperty("h_hyperacousie")
    public void setHHyperacousie(String hHyperacousie) {
        this.hHyperacousie = hHyperacousie;
    }

    public Fields withHHyperacousie(String hHyperacousie) {
        this.hHyperacousie = hHyperacousie;
        return this;
    }

    @JsonProperty("code_postal")
    public String getCodePostal() {
        return codePostal;
    }

    @JsonProperty("code_postal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Fields withCodePostal(String codePostal) {
        this.codePostal = codePostal;
        return this;
    }

    @JsonProperty("media_1")
    public String getMedia1() {
        return media1;
    }

    @JsonProperty("media_1")
    public void setMedia1(String media1) {
        this.media1 = media1;
    }

    public Fields withMedia1(String media1) {
        this.media1 = media1;
        return this;
    }

    @JsonProperty("id_manif")
    public String getIdManif() {
        return idManif;
    }

    @JsonProperty("id_manif")
    public void setIdManif(String idManif) {
        this.idManif = idManif;
    }

    public Fields withIdManif(String idManif) {
        this.idManif = idManif;
        return this;
    }

    @JsonProperty("h_moteur")
    public String getHMoteur() {
        return hMoteur;
    }

    @JsonProperty("h_moteur")
    public void setHMoteur(String hMoteur) {
        this.hMoteur = hMoteur;
    }

    public Fields withHMoteur(String hMoteur) {
        this.hMoteur = hMoteur;
        return this;
    }

    @JsonProperty("reporte")
    public String getReporte() {
        return reporte;
    }

    @JsonProperty("reporte")
    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public Fields withReporte(String reporte) {
        this.reporte = reporte;
        return this;
    }

    @JsonProperty("libelle_courriel_1")
    public String getLibelleCourriel1() {
        return libelleCourriel1;
    }

    @JsonProperty("libelle_courriel_1")
    public void setLibelleCourriel1(String libelleCourriel1) {
        this.libelleCourriel1 = libelleCourriel1;
    }

    public Fields withLibelleCourriel1(String libelleCourriel1) {
        this.libelleCourriel1 = libelleCourriel1;
        return this;
    }

    @JsonProperty("precisions_public")
    public String getPrecisionsPublic() {
        return precisionsPublic;
    }

    @JsonProperty("precisions_public")
    public void setPrecisionsPublic(String precisionsPublic) {
        this.precisionsPublic = precisionsPublic;
    }

    public Fields withPrecisionsPublic(String precisionsPublic) {
        this.precisionsPublic = precisionsPublic;
        return this;
    }

    @JsonProperty("carte_blanche")
    public String getCarteBlanche() {
        return carteBlanche;
    }

    @JsonProperty("carte_blanche")
    public void setCarteBlanche(String carteBlanche) {
        this.carteBlanche = carteBlanche;
    }

    public Fields withCarteBlanche(String carteBlanche) {
        this.carteBlanche = carteBlanche;
        return this;
    }

    @JsonProperty("complet")
    public String getComplet() {
        return complet;
    }

    @JsonProperty("complet")
    public void setComplet(String complet) {
        this.complet = complet;
    }

    public Fields withComplet(String complet) {
        this.complet = complet;
        return this;
    }

    @JsonProperty("h_auditif")
    public String getHAuditif() {
        return hAuditif;
    }

    @JsonProperty("h_auditif")
    public void setHAuditif(String hAuditif) {
        this.hAuditif = hAuditif;
    }

    public Fields withHAuditif(String hAuditif) {
        this.hAuditif = hAuditif;
        return this;
    }

    @JsonProperty("organisateurs")
    public String getOrganisateurs() {
        return organisateurs;
    }

    @JsonProperty("organisateurs")
    public void setOrganisateurs(String organisateurs) {
        this.organisateurs = organisateurs;
    }

    public Fields withOrganisateurs(String organisateurs) {
        this.organisateurs = organisateurs;
        return this;
    }

    @JsonProperty("info_suppl")
    public String getInfoSuppl() {
        return infoSuppl;
    }

    @JsonProperty("info_suppl")
    public void setInfoSuppl(String infoSuppl) {
        this.infoSuppl = infoSuppl;
    }

    public Fields withInfoSuppl(String infoSuppl) {
        this.infoSuppl = infoSuppl;
        return this;
    }

    @JsonProperty("lieu_siteweb")
    public String getLieuSiteweb() {
        return lieuSiteweb;
    }

    @JsonProperty("lieu_siteweb")
    public void setLieuSiteweb(String lieuSiteweb) {
        this.lieuSiteweb = lieuSiteweb;
    }

    public Fields withLieuSiteweb(String lieuSiteweb) {
        this.lieuSiteweb = lieuSiteweb;
        return this;
    }

    @JsonProperty("lieu_tel")
    public String getLieuTel() {
        return lieuTel;
    }

    @JsonProperty("lieu_tel")
    public void setLieuTel(String lieuTel) {
        this.lieuTel = lieuTel;
    }

    public Fields withLieuTel(String lieuTel) {
        this.lieuTel = lieuTel;
        return this;
    }

    /*@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Fields withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lieuQuartier).append(ville).append(hLsf).append(heureFin).append(hPsychique).append(urlInternet1).append(lieu).append(gratuit).append(courriel1).append(precisionsTarifs).append(hVisuel).append(heureDebut).append(location).append(type).append(hIntellectuel).append(nom).append(accueilEnfant).append(description).append(emetteur).append(adresse).append(rubrique).append(annule).append(date).append(lienAgenda).append(internet1).append(hHyperacousie).append(codePostal).append(media1).append(idManif).append(hMoteur).append(reporte).append(libelleCourriel1).append(precisionsPublic).append(carteBlanche).append(complet).append(hAuditif).append(organisateurs).append(infoSuppl).append(lieuSiteweb).append(lieuTel).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fields) == false) {
            return false;
        }
        Fields rhs = ((Fields) other);
        return new EqualsBuilder().append(lieuQuartier, rhs.lieuQuartier).append(ville, rhs.ville).append(hLsf, rhs.hLsf).append(heureFin, rhs.heureFin).append(hPsychique, rhs.hPsychique).append(urlInternet1, rhs.urlInternet1).append(lieu, rhs.lieu).append(gratuit, rhs.gratuit).append(courriel1, rhs.courriel1).append(precisionsTarifs, rhs.precisionsTarifs).append(hVisuel, rhs.hVisuel).append(heureDebut, rhs.heureDebut).append(location, rhs.location).append(type, rhs.type).append(hIntellectuel, rhs.hIntellectuel).append(nom, rhs.nom).append(accueilEnfant, rhs.accueilEnfant).append(description, rhs.description).append(emetteur, rhs.emetteur).append(adresse, rhs.adresse).append(rubrique, rhs.rubrique).append(annule, rhs.annule).append(date, rhs.date).append(lienAgenda, rhs.lienAgenda).append(internet1, rhs.internet1).append(hHyperacousie, rhs.hHyperacousie).append(codePostal, rhs.codePostal).append(media1, rhs.media1).append(idManif, rhs.idManif).append(hMoteur, rhs.hMoteur).append(reporte, rhs.reporte).append(libelleCourriel1, rhs.libelleCourriel1).append(precisionsPublic, rhs.precisionsPublic).append(carteBlanche, rhs.carteBlanche).append(complet, rhs.complet).append(hAuditif, rhs.hAuditif).append(organisateurs, rhs.organisateurs).append(infoSuppl, rhs.infoSuppl).append(lieuSiteweb, rhs.lieuSiteweb).append(lieuTel, rhs.lieuTel).append(additionalProperties, rhs.additionalProperties).isEquals();
    }*/

}
