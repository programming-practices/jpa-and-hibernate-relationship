package com.trl.jpaandhibernaterelationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

@Entity
@Table(name = "aaa_usr")
public class AAA_User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;

    @OneToMany
    private Set<AAA_PhoneNumber> AAAPhoneNumbers;

    public AAA_User() {
    }

    public AAA_User(Long id, String firstname, Set<AAA_PhoneNumber> AAAPhoneNumbers) {
        this.id = id;
        this.firstname = firstname;
        this.AAAPhoneNumbers = AAAPhoneNumbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Set<AAA_PhoneNumber> getPhoneNumbers() {
        return AAAPhoneNumbers;
    }

    public void setPhoneNumbers(Set<AAA_PhoneNumber> AAAPhoneNumbers) {
        this.AAAPhoneNumbers = AAAPhoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AAA_User AAAUser = (AAA_User) o;
        return Objects.equals(id, AAAUser.id) && Objects.equals(firstname, AAAUser.firstname) && Objects.equals(AAAPhoneNumbers, AAAUser.AAAPhoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, AAAPhoneNumbers);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AAA_User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstname='" + firstname + "'")
                .add("phoneNumbers=" + AAAPhoneNumbers)
                .toString();
    }

}
