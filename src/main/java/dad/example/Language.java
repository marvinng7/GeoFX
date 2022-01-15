
package dad.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Language {

	@SerializedName("code")
	@Expose private String code;
	@SerializedName("name")
	@Expose private String name;
	@SerializedName("native")
	@Expose private String _native;
	
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

    public String getNative() {
        return _native;
    }

    public void setNative(String _native) {
        this._native = _native;
    }

    
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

  
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
