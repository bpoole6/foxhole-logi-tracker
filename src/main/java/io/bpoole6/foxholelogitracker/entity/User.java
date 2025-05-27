package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class User {
    private String id;
    private String steamId;
    private String inGameName;
    private String email;
    private String active;
    private String password;//bcrypt
}
