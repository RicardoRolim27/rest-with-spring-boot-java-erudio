package br.com.ricardorolim.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person implements Serializable {

private static final long serialVersionUID = 1l;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "first_name", nullable = false, length = 80)
private String name;

@Column(name = "last_name", nullable = false, length = 80)
private String lastName;

@Column(name = "gender", nullable = false, length = 6)
private String gender;

@Column(name = "adress", nullable = false, length = 100)
private String address;

public Person() {};

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastName(), getGender(), getAddress());
    }
}
