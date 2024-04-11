package com.starter.demo.database1.repositories;

import com.starter.demo.database1.entity.Tbl1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb01Repository extends JpaRepository<Tbl1, Long> {
}
