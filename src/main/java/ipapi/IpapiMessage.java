package ipapi;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import dad.example.Connection;
import dad.example.Currency;
import dad.example.Location;
import dad.example.Security;
import dad.example.TimeZone;


public class IpapiMessage {

	@SerializedName("ip")
	@Expose private String ip;
	@SerializedName("hostname")
	@Expose private String hostname;
	@SerializedName("type")
	@Expose private String type;
	@SerializedName("continent_code")
	@Expose private String continentCode;
	@SerializedName("continent_name")
	@Expose private String continentName;
	@SerializedName("country_code")
	@Expose private String countryCode;
	@SerializedName("country_name")
	@Expose  String countryName;
	@SerializedName("region_code")
	@Expose private String regionCode;
	@SerializedName("region_name")
	@Expose private String regionName;
	@SerializedName("city")
	@Expose private String city;
	@SerializedName("zip")
	@Expose private String zip;
	@SerializedName("latitude")
	@Expose private Double latitude;
	@SerializedName("longitude")
	@Expose private Double longitude;
	@SerializedName("location")
	@Expose private Location location;
	@SerializedName("time_zone")
	@Expose private TimeZone timeZone;
	@SerializedName("currency")
	@Expose private Currency currency;
	@SerializedName("connection")
	@Expose private Connection connection;
	@SerializedName("security")
	@Expose private Security security;
	
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
	public String toString() {
		return "IpapiMessage [ip=" + ip + ", hostname=" + hostname + ", type=" + type + ", continentCode="
				+ continentCode + ", continentName=" + continentName + ", countryCode=" + countryCode + ", countryName="
				+ countryName + ", regionCode=" + regionCode + ", regionName=" + regionName + ", city=" + city
				+ ", zip=" + zip + ", latitude=" + latitude + ", longitude=" + longitude + ", location=" + location
				+ ", timeZone=" + timeZone + ", currency=" + currency + ", connection=" + connection + ", security="
				+ security + "]";
	}

}
