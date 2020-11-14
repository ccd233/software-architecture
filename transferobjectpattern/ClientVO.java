package com.java.nyx.transferobjectpattern;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: Transfer object
 * @Date: Created in 14:49 2020/11/13
 * @Modified By:
 **/
public class ClientVO {
    public UUID id;
    public String name;
    public ClientVO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
