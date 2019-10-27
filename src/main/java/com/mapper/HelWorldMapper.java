package com.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.HelWorld;
import org.springframework.jdbc.core.RowMapper;
public class HelWorldMapper implements RowMapper<HelWorld> {
    public static final String BASE_SQL = //
            "Select * from HelWorld";

    @Override
    public HelWorld mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer id = rs.getInt(1);
        String message = rs.getString(2);
        return new HelWorld(id, message);
    }
}
