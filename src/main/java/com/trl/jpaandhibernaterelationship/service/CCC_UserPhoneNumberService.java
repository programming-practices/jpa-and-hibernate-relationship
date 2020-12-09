package com.trl.jpaandhibernaterelationship.service;

import com.trl.jpaandhibernaterelationship.entity.CCC_PhoneNumber;

import java.util.List;

public interface CCC_UserPhoneNumberService {

    List<CCC_PhoneNumber> getAllPhoneNumbersByUserId(Long userId);

}
