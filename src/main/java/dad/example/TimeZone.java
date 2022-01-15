
package dad.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TimeZone {

	@SerializedName("id")
	@Expose private String id;
	@SerializedName("current_time")
	@Expose private String currentTime;
	@SerializedName("gmt_offset")
	@Expose private Integer gmtOffset;
	@SerializedName("code")
	@Expose  String code;
	@SerializedName("is_daylight_saving")
	@Expose private Boolean isDaylightSaving;
    
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public Integer getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsDaylightSaving() {
        return isDaylightSaving;
    }

    public void setIsDaylightSaving(Boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
    }

    
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

   
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
