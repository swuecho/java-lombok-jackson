package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;


public  class Main {
// https://stackoverflow.com/questions/32270422/jackson-renames-primitive-boolean-field-by-removing-is
public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Status status = new Status(true, "System online");

        String json = mapper.writeValueAsString(status);
        System.out.println(json);
        // Output: {"message":"System online","active":true} // Note: "active", not "isActive"
    }
}
