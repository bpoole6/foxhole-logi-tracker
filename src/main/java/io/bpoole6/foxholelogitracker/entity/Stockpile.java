package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

@Data
public class Stockpile {
    private String id;
    private String name;
    private String nickName;
    private String subType;
    private String ammo;
    private Faction faction;
    private StockPileCategory stockPileCategory;
    private boolean active;
}
