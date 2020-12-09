package com.trl.jpaandhibernaterelationship.reposytory;

import com.trl.jpaandhibernaterelationship.entity.AAA_User;
import com.trl.jpaandhibernaterelationship.entity.CCC_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAA_UserRepository extends JpaRepository<AAA_User, Long> {

}
