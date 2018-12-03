
package fr.univ.nantes.iut;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fields",

})
public class RecordRest {

    @JsonProperty("fields")
    private FieldsRestaurants fields;

    
    @JsonProperty("fields")
    public FieldsRestaurants getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(FieldsRestaurants fields) {
        this.fields = fields;
    }
}
