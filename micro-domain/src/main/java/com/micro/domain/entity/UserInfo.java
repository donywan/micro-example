package com.micro.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

//在postgresql当中存在user表，为避免冲突改为userinfo
@Table(name = "userinfo")// ,schema = "public"
@Entity
public class UserInfo implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;
    @Column
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
