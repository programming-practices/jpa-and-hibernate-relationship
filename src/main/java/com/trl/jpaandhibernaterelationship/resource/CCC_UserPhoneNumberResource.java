package com.trl.jpaandhibernaterelationship.resource;

import com.trl.jpaandhibernaterelationship.entity.CCC_PhoneNumber;
import com.trl.jpaandhibernaterelationship.service.CCC_UserPhoneNumberService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(params = "/cc_user/phonenumber")
public class CCC_UserPhoneNumberResource {

    private final CCC_UserPhoneNumberService service;

    public CCC_UserPhoneNumberResource(CCC_UserPhoneNumberService service) {
        this.service = service;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CCC_PhoneNumber>> getAllPhoneNumbersByUserId(@RequestParam(name = "userId") Long userId) {


        return ResponseEntity.ok(service.getAllPhoneNumbersByUserId(userId));
    }
}
