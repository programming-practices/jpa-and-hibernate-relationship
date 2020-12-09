package com.trl.jpaandhibernaterelationship.reposytory;

import com.trl.jpaandhibernaterelationship.entity.CCC_PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CCC_PhoneNumberRepository extends JpaRepository<CCC_PhoneNumber, Long> {

    List<CCC_PhoneNumber> findAllByCCCUser_Id(Long userId);
}
