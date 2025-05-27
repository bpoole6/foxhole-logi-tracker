package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class Location {
    private int id;
    private String name;
    private String regionId;
    private String description;//Should support markdown
    private boolean active;
}
