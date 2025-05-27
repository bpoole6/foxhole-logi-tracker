package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class InventoryRequestFulfilment {
    private String id;
    private String inventoryRequestId;
    private String inventorySubmissionId;
}
