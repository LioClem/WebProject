
package fr.univ.nantes.iut;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "records",
})
public class LesEvenements {

    @JsonProperty("records")
    private List<RecordEvt> records = null;

    @JsonProperty("records")
    public List<RecordEvt> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<RecordEvt> records) {
        this.records = records;
    }

}
