package kata5v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KATA5V2 {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ArrayList<String> mailArray = new ArrayList<>();
        mailArray=kata5v2.MailListLoad.read();
        //System.out.println(mailArray.size());
        kata5v2.Histogram<String> histogram = kata5v2.MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).execute();

        
    }
  
}
