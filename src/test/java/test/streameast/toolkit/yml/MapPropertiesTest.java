package test.streameast.toolkit.yml;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import test.streameast.toolkit.help.ObjectTag;

import com.streameast.toolkit.yml.MapProperties;

public class MapPropertiesTest {
    
    Map<String, Object> properties;
    
    @Before
    public void initMap() {
        properties = new MapProperties<String, Object>("properties.yml");
    }
    
    @Test
    public void testCargaProperties() {
        String version = properties.get("version").toString();
        System.out.println("Mapa: " + properties.toString());
        assertEquals("La propiedad no es la esperada " + version, "1.0", version);
    }
    
    @Test
    public void testCargaPropTags() {
        ObjectTag object = (ObjectTag) properties.get("object");
        System.out.println("Object: " + object.toString());
        assertEquals("No se cargo bien el nombre", object.getNombre(), "Juan");
        assertEquals("No se cargo bien la edad", object.getEdad(), 27);
    }
}