package com.trl.jpaandhibernaterelationship.reposytory;

import com.trl.jpaandhibernaterelationship.entity.CCC_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CCC_UserRepository extends JpaRepository<CCC_User, Long> {

}
