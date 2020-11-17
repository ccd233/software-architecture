package com.java.nyx.adapterpattern;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 13:52 2020/11/13
 * @Modified By:
 **/
public class RegularMember {
    public UUID id;
    public String name;
    public RegularMember(){

    }

    public RegularMember(RegularMember target) {
        this.id = target.id;
        this.name = target.name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void queue() {
        System.out.println("queueing...");
    }
}
