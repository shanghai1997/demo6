package com.example.demo6.user;

import com.example.demo6.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping(value={"/user", "/api/user"})
    @ResponseBody
    public Object show() {
        return repository.findTop3ByOrderByScoreDesc();
    }

}
