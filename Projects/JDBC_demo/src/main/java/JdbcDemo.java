import java.sql.*;

public class JdbcDemo {

    public  static void main(String[] args) throws Exception {
/*
import package
load and register driver
create connection
create statement
execute query
process the result
close
 */

        String url="jdbc:postgresql://localhost:5432/Demo";//jdbc:typeOfSql: //ipAdress:portnumber/nameofdb
        String uname="postgres";
        String pass="Ice-hockey";
        String query="delete from student where sid=1;";

        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");;
        Statement st=con.createStatement();


        //1.Read
//        ResultSet rs=st.executeQuery(query);
////        rs.next();
////        System.out.println(rs.getString("sname"));
//
//        while(rs.next()){
//            System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getInt(3));
//        }


        //2.Insert/Update/Delete
        System.out.println(st.execute(query));


        //PreparedStatement




        con.close();
        System.out.println("Connection Closed");;



    }
}