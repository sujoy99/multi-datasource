package com.starter.demo.database2.repositories;

import com.starter.demo.database2.entity.Tbl2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb02Repository extends JpaRepository<Tbl2, Long> {
}
