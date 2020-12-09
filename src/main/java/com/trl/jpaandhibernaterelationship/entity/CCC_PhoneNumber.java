package com.trl.jpaandhibernaterelationship.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "ccc_phone_numbers")
public class CCC_PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
//    @JoinColumn(name = "user_id")  // If your want to assign specific column name, you should use this annotation.
    private CCC_User CCCUser;

    public CCC_PhoneNumber() {
    }

    public CCC_PhoneNumber(Long id, String phoneNumber) {
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

    public CCC_User getUser() {
        return CCCUser;
    }

    public void setUser(CCC_User CCCUser) {
        this.CCCUser = CCCUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CCC_PhoneNumber that = (CCC_PhoneNumber) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CCC_PhoneNumber.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("phoneNumber='" + phoneNumber + "'")
                .toString();
    }

}
