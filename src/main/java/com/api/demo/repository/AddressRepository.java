package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.demo.model.Endereço;

public interface AddressRepository extends JpaRepository<Endereço, Long> {
}
