package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class BasicWarEntity {
    private String warId;
    private long createEpoch;
}