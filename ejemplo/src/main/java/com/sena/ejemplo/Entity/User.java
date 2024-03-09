package com.sena.ejemplo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User extends ABaseEntity{

    @Column(name="name",length = 50, nullable = false)
    private String name;

    @Column(name="email",length = 50, nullable = false)
    private String email;

    @Column(name="gender",length = 10, nullable = false)
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
