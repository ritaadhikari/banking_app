package com.example.bankmanagement.repository;

import com.example.bankmanagement.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
