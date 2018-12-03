
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
    "datasetid",
    "recordid",
    "fields",
    "record_timestamp"
})
public class RecordEvt {

    @JsonProperty("datasetid")
    private String datasetid;
    @JsonProperty("recordid")
    private String recordid;
    @JsonProperty("fields")
    private Fields fields;
    @JsonProperty("record_timestamp")
    private String recordTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("datasetid")
    public String getDatasetid() {
        return datasetid;
    }

    @JsonProperty("datasetid")
    public void setDatasetid(String datasetid) {
        this.datasetid = datasetid;
    }

    public RecordEvt withDatasetid(String datasetid) {
        this.datasetid = datasetid;
        return this;
    }

    @JsonProperty("recordid")
    public String getRecordid() {
        return recordid;
    }

    @JsonProperty("recordid")
    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public RecordEvt withRecordid(String recordid) {
        this.recordid = recordid;
        return this;
    }

    @JsonProperty("fields")
    public Fields getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public RecordEvt withFields(Fields fields) {
        this.fields = fields;
        return this;
    }

    @JsonProperty("record_timestamp")
    public String getRecordTimestamp() {
        return recordTimestamp;
    }

    @JsonProperty("record_timestamp")
    public void setRecordTimestamp(String recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }

    public RecordEvt withRecordTimestamp(String recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
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

    public Record withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datasetid).append(recordid).append(fields).append(recordTimestamp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Record) == false) {
            return false;
        }
        Record rhs = ((Record) other);
        return new EqualsBuilder().append(datasetid, rhs.datasetid).append(recordid, rhs.recordid).append(fields, rhs.fields).append(recordTimestamp, rhs.recordTimestamp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }*/

}
