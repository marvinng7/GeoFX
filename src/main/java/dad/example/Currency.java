
package dad.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("jsonschema2pojo")
public class Currency {

	@SerializedName("code")
	@Expose
    private String code;
	@SerializedName("name")
	@Expose
    private String name;
	@SerializedName("plural")
	@Expose private String plural;
	@SerializedName("symbol")
	@Expose private String symbol;
	@SerializedName("symbol_native")
	@Expose private String symbolNative;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public String getCode() {
        return code;
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolNative() {
        return symbolNative;
    }

    public void setSymbolNative(String symbolNative) {
        this.symbolNative = symbolNative;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
