
package dad.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Connection {

	@SerializedName("asn")
	@Expose
    private Integer asn;
	
	@SerializedName("isp")
	@Expose
    private String isp;
	
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public Integer getAsn() {
        return asn;
    }

    
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    
    public String getIsp() {
        return isp;
    }

    
    public void setIsp(String isp) {
        this.isp = isp;
    }

   
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
