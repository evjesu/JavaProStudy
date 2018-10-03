package jdev.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PointDTO {
    private double lat;
    private double lon;
    private String autoID;
    private String driver;

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLon() {
        return lon;
    }

    public void setAutoID(String autoID) {
        this.autoID = autoID;
    }

    public String getAutoID() {
        return autoID;
    }

    public String toJson() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper(  );
        return mapper.writeValueAsString( this );
    }

    @Override
    public String toString(){
        return "PointDTO(" +
                "lat = " + lat +
                ", lon = " + lon +
                ", autoID = '" + autoID + '\''
                + ")";

    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }
}
