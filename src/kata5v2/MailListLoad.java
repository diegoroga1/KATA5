/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailListLoad {
    public static ArrayList<String> read () throws ClassNotFoundException, SQLException{
        ArrayList<String> mailList = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");

	Connection conect = DriverManager.getConnection("jdbc:sqlite:KATA.DB");
        Statement state = conect.createStatement();

        String query = "SELECT * FROM MAILS";
        ResultSet rs = state.executeQuery(query);
        while (rs.next()) {
            mailList.add(rs.getString("MAILS"));
        }
        rs.close();
        state.close();
        conect.close();
        return mailList;
        
        
    }
        
        
}
