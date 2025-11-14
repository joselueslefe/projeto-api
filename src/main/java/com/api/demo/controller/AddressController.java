package com.api.demo.controller;

import com.api.demo.model.Endereço;
import com.api.demo.model.User;
import com.api.demo.service.AddressService;
import com.api.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;
    private final UserService userService;

    public AddressController(AddressService addressService, UserService userService) {
        this.addressService = addressService;
        this.userService = userService;
    }

    @PostMapping("/user/{userId}")
    public Endereço create(@PathVariable Long userId, @RequestBody Endereço address) {
        User user = userService.getById(userId);
        address.setUser(user);
        return addressService.save(address);
    }
}
