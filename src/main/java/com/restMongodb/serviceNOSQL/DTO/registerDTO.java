package com.restMongodb.serviceNOSQL.DTO;

public class registerDTO {
    private String username;
    private boolean isActive ;

    public registerDTO(String username, boolean isActive) {
        this.username = username;
        this.isActive = isActive;
    }

    // getters
    public String getUsername() { return username; }
    public boolean getisActive() { return isActive; }
}
