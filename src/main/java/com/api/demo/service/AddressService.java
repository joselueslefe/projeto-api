package com.api.demo.service;

import com.api.demo.model.Endereço;
import com.api.demo.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Endereço save(Endereço Address) {
        return addressRepository.save(Address);
    }
}

