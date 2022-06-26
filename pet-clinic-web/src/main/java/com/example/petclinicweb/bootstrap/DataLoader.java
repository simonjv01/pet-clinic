package com.example.petclinicweb.bootstrap;

import com.example.petclinicdata.services.OwnerService;
import com.example.petclinicdata.services.VetService;
import com.example.petclinicdata.services.map.OwnerServiceMap;
import com.example.petclinicdata.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
