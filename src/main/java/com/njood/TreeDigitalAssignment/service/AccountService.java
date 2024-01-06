package com.njood.TreeDigitalAssignment.service;

import com.njood.TreeDigitalAssignment.dao.repo.AccountRepository;
import com.njood.TreeDigitalAssignment.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepo;

    public List<Account> getAccountsList(int id, String role){

        List<Account> accounts = new LinkedList<Account>();

        switch (role){
            case "ADMIN":
                break;
            case "USER":
                break;
        }
        return accounts;
    }
}
