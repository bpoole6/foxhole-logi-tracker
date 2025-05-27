package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class Operation  extends BasicWarEntity{
    private String id;
    private String name;
    private String description;
    private boolean active;
}
