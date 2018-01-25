/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic.mapper;

import com.it355.jovanastricic.model.Usluga;
import com.datastax.driver.core.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jovana BGD
 */
public class UslugaMapper implements RowMapper<Usluga> {

    @Override
    public Usluga mapRow(java.sql.ResultSet rs, int arg1) throws SQLException {
        Usluga usluga = new Usluga();
        usluga.setId_usluga(rs.getInt("id_usluga"));
        usluga.setTip_usluga(rs.getString("tip_usluga"));
        usluga.setNaziv_usluga(rs.getString("naziv_usluga"));
        usluga.setCena_usluga(rs.getInt("cena_usluga"));
        return usluga;
    }

}
