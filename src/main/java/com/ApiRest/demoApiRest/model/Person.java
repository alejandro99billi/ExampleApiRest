package com.ApiRest.demoApiRest.model;

import java.util.Date;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "date_registry")
    @CreatedDate
    private String date;

    public Person() {

    }

    public Person(Long id, String name, String userName, String date) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //ottimizar con lombok y la annotacion data

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", userName=" + userName + ", date=" + date + "]";
    }

}