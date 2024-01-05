package application;


import db.DB;
import db.DbIntegretyException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department"
                    +" WHERE "
                    + "Id = ?"
                    );
            st.setInt(1,2);



            int rowsAffected = st.executeUpdate();

            System.out.println("Done! rowns Affected: " + rowsAffected);
        }
        catch(SQLException e){
            throw new DbIntegretyException(e.getMessage());
        }
        finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }


    }
}
