
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
    "dataset",
    "timezone",
    "rows",
    "format",
    "facet"
})
public class Parameters {

    @JsonProperty("dataset")
    private List<String> dataset = new ArrayList<String>();
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("rows")
    private Integer rows;
    @JsonProperty("format")
    private String format;
    @JsonProperty("facet")
    private List<String> facet = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataset")
    public List<String> getDataset() {
        return dataset;
    }

    @JsonProperty("dataset")
    public void setDataset(List<String> dataset) {
        this.dataset = dataset;
    }

    public Parameters withDataset(List<String> dataset) {
        this.dataset = dataset;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Parameters withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("rows")
    public Integer getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Parameters withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Parameters withFormat(String format) {
        this.format = format;
        return this;
    }

    @JsonProperty("facet")
    public List<String> getFacet() {
        return facet;
    }

    @JsonProperty("facet")
    public void setFacet(List<String> facet) {
        this.facet = facet;
    }

    public Parameters withFacet(List<String> facet) {
        this.facet = facet;
        return this;
    }

   /* @Override
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

    public Parameters withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataset).append(timezone).append(rows).append(format).append(facet).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters) == false) {
            return false;
        }
        Parameters rhs = ((Parameters) other);
        return new EqualsBuilder().append(dataset, rhs.dataset).append(timezone, rhs.timezone).append(rows, rhs.rows).append(format, rhs.format).append(facet, rhs.facet).append(additionalProperties, rhs.additionalProperties).isEquals();
    }*/

}
