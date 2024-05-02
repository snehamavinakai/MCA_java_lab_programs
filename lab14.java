import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class lab14{
public static void main(String[] args){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Test1","student","");
System.out.println("Connected");
Statement st=con.createStatement();
// st.executeUpdate("drop table emp01");
st.executeUpdate("create table emp03(emp01_id int, emp01_name varchar(10), emp01_sal int)");
System.out.println("Table created");
st.executeUpdate("insert into emp01 values(101,'abc',1000)");
st.executeUpdate("insert into emp01 values(102,'def',2000)");
st.executeUpdate("insert into emp01 values(103,'ghi',3000)");
System.out.println("Inserted 3 rows");
ResultSet rs=st.executeQuery("select*from emp01");
while(rs.next()){
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getInt(3));
}
st.executeUpdate("update emp01 set emp01_sal=2000 where emp01_name='abc'");
System.out.println("\n After Update\n");
ResultSet rs1=st.executeQuery("select * from emp01");
while (rs1.next()){
System.out.println(rs1.getInt(1));
System.out.println(rs1.getString(2));
System.out.println(rs1.getInt(3));
}
st.executeUpdate("delete from emp01 where emp01_name='def'");
System.out.println("\n After Delete\n");
ResultSet rs2=st.executeQuery("select * from emp01");
while (rs2.next()){
System.out.println(rs2.getInt(1));
System.out.println(rs2.getString(2));
System.out.println(rs2.getInt(3));
}
st.close();
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
