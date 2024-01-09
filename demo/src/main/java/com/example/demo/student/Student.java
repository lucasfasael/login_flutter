package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    private String name;
    private String usuario;
    private String password;

    public Student() {
    }

    public Student(Long id, String name, String usuario, String password) {
        this.id = id;
        this.name = name;
        this.usuario = usuario;
        this.password = password;
    }

    public Student(String name, String usuario, String password) {
        this.name = name;
        this.usuario = usuario;
        this.password = password;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
