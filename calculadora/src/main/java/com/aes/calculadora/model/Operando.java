
package com.aes.calculadora.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;


/**
 * Operandos
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "num1",
    "num2"
})
public class Operando {

    /**
     * Operando 1
     * (Required)
     * 
     */
    @JsonProperty("num1")
    @JsonPropertyDescription("Operando 1")
    private Integer num1;
    /**
     * Operando 2
     * (Required)
     * 
     */
    @JsonProperty("num2")
    @JsonPropertyDescription("Operando 2")
    private Integer num2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Operando 1
     * (Required)
     * 
     */
    @JsonProperty("num1")
    public Integer getNum1() {
        return num1;
    }

    /**
     * Operando 1
     * (Required)
     * 
     */
    @JsonProperty("num1")
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Operando withNum1(Integer num1) {
        this.num1 = num1;
        return this;
    }

    /**
     * Operando 2
     * (Required)
     * 
     */
    @JsonProperty("num2")
    public Integer getNum2() {
        return num2;
    }

    /**
     * Operando 2
     * (Required)
     * 
     */
    @JsonProperty("num2")
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Operando withNum2(Integer num2) {
        this.num2 = num2;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Operando withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
