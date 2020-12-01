
package API_programs;

import java.sql.*;


public class java_sql {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from tblemployee");

            while (rs.next()) {

                Object o[] = {rs.getString("emp_id"), rs.getString("fname"), rs.getString("lname"), rs.getString("email"), rs.getString("contact"),
                    rs.getString("hire_date"), rs.getString("job_id"), rs.getString("salary"), rs.getString("comm_id"), rs.getString("mangr_id"),
                    rs.getString("dept_id")};

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
