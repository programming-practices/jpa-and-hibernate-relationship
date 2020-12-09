package com.trl.jpaandhibernaterelationship.reposytory;

import com.trl.jpaandhibernaterelationship.entity.AAA_PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAA_PhoneNumberRepository extends JpaRepository<AAA_PhoneNumber, Long> {

}
