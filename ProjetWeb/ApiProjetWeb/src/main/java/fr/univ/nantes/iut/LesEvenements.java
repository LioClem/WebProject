
package fr.univ.nantes.iut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nhits",
    "parameters",
    "records",
    "facet_groups"
})
public class LesEvenements {

    @JsonProperty("nhits")
    private Integer nhits;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("records")
    private List<RecordEvt> records = new ArrayList<RecordEvt>();
    @JsonProperty("facet_groups")
    private List<FacetGroup> facetGroups = new ArrayList<FacetGroup>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nhits")
    public Integer getNhits() {
        return nhits;
    }

    @JsonProperty("nhits")
    public void setNhits(Integer nhits) {
        this.nhits = nhits;
    }

    public LesEvenements withNhits(Integer nhits) {
        this.nhits = nhits;
        return this;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public LesEvenements withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @JsonProperty("records")
    public List<RecordEvt> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<RecordEvt> records) {
        this.records = records;
    }

    public LesEvenements withRecords(List<RecordEvt> records) {
        this.records = records;
        return this;
    }

    @JsonProperty("facet_groups")
    public List<FacetGroup> getFacetGroups() {
        return facetGroups;
    }

    @JsonProperty("facet_groups")
    public void setFacetGroups(List<FacetGroup> facetGroups) {
        this.facetGroups = facetGroups;
    }

    public LesEvenements withFacetGroups(List<FacetGroup> facetGroups) {
        this.facetGroups = facetGroups;
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

    public LesEvenements withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nhits).append(parameters).append(records).append(facetGroups).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LesEvenements) == false) {
            return false;
        }
        LesEvenements rhs = ((LesEvenements) other);
        return new EqualsBuilder().append(nhits, rhs.nhits).append(parameters, rhs.parameters).append(records, rhs.records).append(facetGroups, rhs.facetGroups).append(additionalProperties, rhs.additionalProperties).isEquals();
    }*/

}
