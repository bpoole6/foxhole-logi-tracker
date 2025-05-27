package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class InventorySubmission extends BasicWarEntity {
    private String id;
    private String userId;
    private String itemId;
}
