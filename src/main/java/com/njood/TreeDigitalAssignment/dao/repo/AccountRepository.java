package com.njood.TreeDigitalAssignment.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.njood.TreeDigitalAssignment.dao.entity.AccountEntity;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
}
