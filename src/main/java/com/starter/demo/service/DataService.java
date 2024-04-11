package com.starter.demo.service;

import com.starter.demo.database1.entity.Tbl1;
import com.starter.demo.database1.repositories.Tb01Repository;
import com.starter.demo.database2.entity.Tbl2;
import com.starter.demo.database2.repositories.Tb02Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private Tb01Repository tb01Repository;

    @Autowired
    private Tb02Repository tb02Repository;

    @Transactional
    public void saveData(String dbName) {
        if (dbName.equalsIgnoreCase("DB01")) {
            saveToDatabase1();
        } else if (dbName.equalsIgnoreCase("DB02")) {
            saveToDatabase2();
        }
    }

    private void saveToDatabase1() {
        Tbl1 one = new Tbl1();
        one.setName("table one");
        tb01Repository.save(one);
    }

    private void saveToDatabase2() {
        Tbl2 two = new Tbl2();
        two.setName("table two");
        tb02Repository.save(two);
    }
}
