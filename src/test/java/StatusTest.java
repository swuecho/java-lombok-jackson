import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.example.Status;

import static org.junit.jupiter.api.Assertions.*;

public class StatusTest {

    @Test
    public void testIsGetterWriter()  throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Status status = new Status(true, "System online");
        String json = mapper.writeValueAsString(status);
        assertEquals(json, "{\"message\":\"System online\",\"active\":true,\"messageExists\":true}");
    }

    @Test
    public void TestIsGetterReader() throws  Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInput =  "{\"message\":\"System online\",\"active\":true,\"messageExists\":true}";

        // 2. Act: Deserialize the JSON string into a Status object
        Status deserializedStatus = mapper.readValue(jsonInput, Status.class);

        // 3. Assert: Verify the fields of the deserialized object
        assertNotNull(deserializedStatus);
        assertTrue(deserializedStatus.isActive(), "Deserialized status should be active");
        assertEquals("System online", deserializedStatus.getMessage(), "Deserialized message should match");

        // Also verify the derived property works correctly on the deserialized object
        assertTrue(deserializedStatus.isMessageExists(), "isMessageExists() should return true based on deserialized message");
    }

    @Test
    public void TestIsGetterReaderTrow() throws  Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInput =  "{\"message\":\"System online\",\"active\":true,\"messageExists\":true}";

        // 2. Act: Deserialize the JSON string into a Status object
        Status deserializedStatus = mapper.readValue(jsonInput, Status.class);

        // 3. Assert: Verify the fields of the deserialized object
        assertNotNull(deserializedStatus);
        assertTrue(deserializedStatus.isActive(), "Deserialized status should be active");
        assertEquals("System online", deserializedStatus.getMessage(), "Deserialized message should match");

        // Also verify the derived property works correctly on the deserialized object
        assertTrue(deserializedStatus.isMessageExists(), "isMessageExists() should return true based on deserialized message");
    }
}
