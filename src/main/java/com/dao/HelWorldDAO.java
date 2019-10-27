package com.dao;



import java.util.List;

import javax.sql.DataSource;

import com.mapper.HelWorldMapper;
import com.model.HelWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class HelWorldDAO extends JdbcDaoSupport {
    @Autowired
    public HelWorldDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    private int getMaxId() {
        String sql = "Select max(id) from HelWorld";

        Integer value = this.getJdbcTemplate().queryForObject(sql, Integer.class);
        if (value == null) {
            return 0;
        }
        return value;
    }


    public List<HelWorld> listDepartment() {
        String sql = HelWorldMapper.BASE_SQL;

        Object[] params = new Object[] {};
        HelWorldMapper mapper = new HelWorldMapper();

        List<HelWorld> list = this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }

    public void insertDepartment() {
        String sql = "Insert into HELWORLD (id, message) "//
                + " values (?,?) ";
        int id = this.getMaxId() + 1;
        String message = "Hello World" + id;
        Object[] params = new Object[] { id, message };
        this.getJdbcTemplate().update(sql, params);
    }
}
