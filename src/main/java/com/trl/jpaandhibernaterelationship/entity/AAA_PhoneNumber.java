package com.trl.jpaandhibernaterelationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "aaa_phone_numbers")
public class AAA_PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    public AAA_PhoneNumber() {
    }

    public AAA_PhoneNumber(Long id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AAA_PhoneNumber that = (AAA_PhoneNumber) o;
        return Objects.equals(id, that.id) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AAA_PhoneNumber.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("phoneNumber='" + phoneNumber + "'")
                .toString();
    }

}
