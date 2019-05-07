
package com.aes.calculadora.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Resultado
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resultado"
})
public class Resultado {

    /**
     * Resultado
     * (Required)
     * 
     */
    @JsonProperty("resultado")
    @JsonPropertyDescription("Resultado")
    private Integer resultado;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Resultado
     * (Required)
     * 
     */
    @JsonProperty("resultado")
    public Integer getResultado() {
        return resultado;
    }

    /**
     * Resultado
     * (Required)
     * 
     */
    @JsonProperty("resultado")
    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public Resultado withResultado(Integer resultado) {
        this.resultado = resultado;
        return this;
    }
    
    /*
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Resultado withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
    */

}
