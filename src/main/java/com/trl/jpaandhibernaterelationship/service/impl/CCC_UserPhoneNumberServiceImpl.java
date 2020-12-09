package com.trl.jpaandhibernaterelationship.service.impl;

import com.trl.jpaandhibernaterelationship.entity.CCC_PhoneNumber;
import com.trl.jpaandhibernaterelationship.reposytory.CCC_PhoneNumberRepository;
import com.trl.jpaandhibernaterelationship.service.CCC_UserPhoneNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CCC_UserPhoneNumberServiceImpl implements CCC_UserPhoneNumberService {

    private static final Logger LOG = LoggerFactory.getLogger(CCC_UserPhoneNumberServiceImpl.class);

    private final CCC_PhoneNumberRepository repository;

    public CCC_UserPhoneNumberServiceImpl(CCC_PhoneNumberRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CCC_PhoneNumber> getAllPhoneNumbersByUserId(Long userId) {
        List<CCC_PhoneNumber> resultList = repository.findAllByCCCUser_Id(userId);

        LOG.debug("*************************************************************** " + resultList);
        return resultList;
    }

}
