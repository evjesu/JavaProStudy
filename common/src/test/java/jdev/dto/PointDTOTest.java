package jdev.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PointDTOTest {

    private String check = "{\"lat\":12.0,\"lon\":233.0,\"autoID\":\"a456as70\",\"driver\":\"Ivanov\"}";
    private String autoID = "a456as70";
    private String driver = "Ivanov";

    @Test
    public void toJson() throws Exception{
        PointDTO point = new PointDTO();
        point.setLat( 12 );
        point.setLon( 233 );
        point.setAutoID("a456as70");
        point.setDriver("Ivanov");
        assertTrue(point.toJson().contains( "\"lat\":12" ));
        assertTrue(point.toJson().contains( "\"driver\":\"Ivanov\"" ));
        System.out.println(point.toJson());
    }

    @Test
    public void decodeDTO() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        PointDTO point = mapper.readValue( check,PointDTO.class );
        assertEquals( autoID,point.getAutoID() );
        assertEquals( driver,point.getDriver() );
    }
}
