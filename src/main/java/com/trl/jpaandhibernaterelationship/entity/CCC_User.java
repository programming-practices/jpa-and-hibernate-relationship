package com.trl.jpaandhibernaterelationship.entity;

import javax.persistence.CascadeType;
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
@Table(name = "ccc_usr")
public class CCC_User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;

    @OneToMany(
            mappedBy = "CCCUser",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<CCC_PhoneNumber> CCCPhoneNumbers;

    public CCC_User() {
    }

    public CCC_User(Long id, String firstname, Set<CCC_PhoneNumber> CCCPhoneNumbers) {
        this.id = id;
        this.firstname = firstname;
        this.CCCPhoneNumbers = CCCPhoneNumbers;
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

    public Set<CCC_PhoneNumber> getPhoneNumbers() {
        return CCCPhoneNumbers;
    }

    public void setPhoneNumbers(Set<CCC_PhoneNumber> CCCPhoneNumbers) {
        this.CCCPhoneNumbers = CCCPhoneNumbers;
    }

    public void addPhoneNumber(CCC_PhoneNumber CCCPhoneNumber) {
        CCCPhoneNumbers.add(CCCPhoneNumber);
        CCCPhoneNumber.setUser(this);
    }

    public void removePhoneNumber(CCC_PhoneNumber CCCPhoneNumber) {
        CCCPhoneNumbers.remove(CCCPhoneNumber);
        CCCPhoneNumber.setUser(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CCC_User that = (CCC_User) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, CCCPhoneNumbers);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CCC_User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstname='" + firstname + "'")
                .add("phoneNumbers=" + CCCPhoneNumbers)
                .toString();
    }

}
