package com.soris.SORIS_planing.admin.dashboard.models;

import com.soris.SORIS_planing.dbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class serviceUpdateModel extends dbInit{

    public serviceUpdateModel() throws SQLException, ClassNotFoundException {
        super();

    }

    public void deteleServiceById(String id)
    {
        try{
            String query = String.format("DELETE FROM service WHERE sid='%s'",id);
            Statement st = this.con.createStatement();
            int res = st.executeUpdate(query);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public void updateServiceStatus(String id, String status)
    {
        try{
            String query = String.format("UPDATE service SET status = '%s' WHERE sid='%s'",status,id);
            Statement st = this.con.createStatement();
            int res = st.executeUpdate(query);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
