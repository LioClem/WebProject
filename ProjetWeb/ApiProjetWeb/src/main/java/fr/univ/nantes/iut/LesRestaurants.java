
package fr.univ.nantes.iut;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "records",
})
public class LesRestaurants {

    @JsonProperty("records")
    private List<RecordRest> records = null;


    @JsonProperty("records")
    public List<RecordRest> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<RecordRest> records) {
        this.records = records;
    }
}
