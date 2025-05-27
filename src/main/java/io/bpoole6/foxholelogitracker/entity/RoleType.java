package io.bpoole6.foxholelogitracker.entity;

import lombok.Data;

/**
 * This is modifiable by the players. They can create roletypes but each type they create will get 5 role levels. 1,2,3,4,5. With one being the highest
 * I think there should be some special roles such as Field Marshal, generals just so its not a pain for the admins. generals can update user information while Field Marshal is the super user.
 */
@Data
public class RoleType {
    private String id;
    private String name;
    private String description;
    private boolean admin;
    private boolean superAdmin;
    private boolean deletable;
    private boolean active;
}
