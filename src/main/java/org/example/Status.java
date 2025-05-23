package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // <-- Add this annotation
// @AllArgsConstructor // Optional: Add this if you want a constructor for ALL fields too
public class Status {
    private boolean isActive; // Java field name
    private String message;

    public boolean isMessageExists() {
        return !this.message.isEmpty();
    }

    public Status(boolean isActive, String message) {
        this.isActive = isActive;
        this.message = message;
    }

}