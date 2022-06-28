package com.example.petclinicweb.services.map;

import com.example.petclinicdata.model.Owner;
import com.example.petclinicweb.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {

        return super.save(object);
    }


    @Override
    public Owner findByLastName(String lastName) {

        return this.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return null;
    }
}
