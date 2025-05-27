package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class OperationRoles {
    private String id;
    private Operation operation;
    private RoleType role;
    private int level;
}
