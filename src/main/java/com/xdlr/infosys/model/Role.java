package com.xdlr.infosys.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Role extends MyModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role() {
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Role (Long id, String name){
        this.id = id;
        this.name = name;
    }
}
