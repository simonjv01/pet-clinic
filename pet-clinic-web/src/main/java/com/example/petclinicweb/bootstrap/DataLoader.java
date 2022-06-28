package com.example.petclinicweb.bootstrap;


import com.example.petclinicdata.model.*;
import com.example.petclinicweb.services.OwnerService;
import com.example.petclinicweb.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;


    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("George");
        owner1.setLastName("Harrison");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jim");
        owner2.setLastName("Johnson");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Carol");
        vet1.setLastName("Jefferson");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jane");
        vet2.setLastName("Janey");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
        System.out.println(vet1);
        System.out.println(vet2);

    }
}
