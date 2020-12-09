package com.trl.jpaandhibernaterelationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

@Entity
@Table(name = "bbb_usr")
public class BBB_User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;

    @OneToMany
    @JoinColumn(name = "usr_id")
    private Set<BBB_PhoneNumber> BBBPhoneNumbers;

    public BBB_User() {
    }

    public BBB_User(Long id, String firstname, Set<BBB_PhoneNumber> BBBPhoneNumbers) {
        this.id = id;
        this.firstname = firstname;
        this.BBBPhoneNumbers = BBBPhoneNumbers;
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

    public Set<BBB_PhoneNumber> getPhoneNumbers() {
        return BBBPhoneNumbers;
    }

    public void setPhoneNumbers(Set<BBB_PhoneNumber> BBBPhoneNumbers) {
        this.BBBPhoneNumbers = BBBPhoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BBB_User BBBUser = (BBB_User) o;
        return Objects.equals(id, BBBUser.id) && Objects.equals(firstname, BBBUser.firstname) && Objects.equals(BBBPhoneNumbers, BBBUser.BBBPhoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, BBBPhoneNumbers);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BBB_User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstname='" + firstname + "'")
                .add("phoneNumbers=" + BBBPhoneNumbers)
                .toString();
    }

}
