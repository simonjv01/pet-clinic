package com.example.petclinicweb.services;

import com.example.petclinicdata.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);



}
