package com.njood.TreeDigitalAssignment.controller;

import com.njood.TreeDigitalAssignment.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.http.HttpResponse;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@RestController("/accounts")
public class AccountController {


    @GetMapping("/list/{id}")
    public List<Account> getAccountsList(){
        List<Account> response = new LinkedList<Account>();


        return response;
    }
}
