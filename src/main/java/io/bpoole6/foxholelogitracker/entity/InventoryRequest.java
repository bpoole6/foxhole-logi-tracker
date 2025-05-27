package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class InventoryRequest extends BasicWarEntity {
    private String id;
    private String itemId;//FK item table
    private Operation operation; //FK operation table. //nullable
    private Location location;
}
