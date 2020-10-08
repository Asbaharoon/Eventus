/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventus;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hussein Lenovo
 */
class DBconnect {
     static Connection connect = null;
    static Statement statement = null;
    static String query = "insert into users (Name ,username , password , id)" + "values (?,?,?,?)";
    static String InsertToUsers = "insert into user (id ,username ,password ,email ,firstname ,lastname ,dateofbirth ,gender ,nationality)" + "values(?,?,?,?,?,?,?,?,?)";
    static String imgquery = " insert into images (id,name,image)" + "values (?,?,?)";
    static String retriveImageQuery = "select image from images";
    PreparedStatement preparedStatement = null;

    static ResultSet resultSet = null;

    public static void connect() {
        try {


            // create a java mysql database connection
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Connecting >>>");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventos", "root", "");
            System.out.println("Connected to mysql");
            statement = connect.createStatement();
            
            resultSet = statement.executeQuery("select * from user");
            //writeResultSet(resultSet);

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //close();
        }

    }
    public static void insert(String c1 , String c2 , String c3 , String c4){
        try{

            java.sql.PreparedStatement insertImasgeStatement = connect.prepareStatement(imgquery);
            java.sql.PreparedStatement insertStatement = connect.prepareStatement(query);
            insertStatement.setString(1,c1);
            insertStatement.setString(2,c2);
            insertStatement.setString(3,c3);
            insertStatement.setInt(4,1231);
            insertStatement.execute();
        }catch(SQLException e){
            System.err.println(e);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public static void insertImage(){
        try{
            File img = new File("src/pack/Test/1.jpg");
            FileInputStream fileInputStream = new FileInputStream(img);
            java.sql.PreparedStatement insertImasgeStatement = connect.prepareStatement(imgquery);
            insertImasgeStatement.setBinaryStream(3, (InputStream)fileInputStream,(int)img.length());
            insertImasgeStatement.execute();
            System.out.println("picture inserted successfuly");
        }catch(SQLException e){
            System.err.println(e);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public static void insertImage(File img ){
        try{

            FileInputStream fileInputStream = new FileInputStream(img);
            java.sql.PreparedStatement insertImasgeStatement = connect.prepareStatement(imgquery);
            insertImasgeStatement.setInt(1,0);
            insertImasgeStatement.setInt(2,0);
            insertImasgeStatement.setBinaryStream(3, (InputStream)fileInputStream,(int)img.length());
            insertImasgeStatement.execute();
            System.out.println("picture inserted successfuly");
        }catch(SQLException e){
            System.err.println(e);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public static void retriveImage(){
        try{

            java.sql.PreparedStatement retriveStatement = connect.prepareStatement(retriveImageQuery);
            ResultSet rs = retriveStatement.executeQuery(retriveImageQuery);
            int i = 0;
            while (rs.next()){
                InputStream in = rs.getBinaryStream("image");
                OutputStream outputStream = new FileOutputStream(new File("test" + i + ".jpg"));
                i++;
                int c = 0;
                while ((c = in.read()) > -1){
                    outputStream.write(c);
                }
                outputStream.close();
                in.close();
            }

            System.out.println("picture retrived");

        }catch(SQLException e){
            System.err.println(e);
        }catch (Exception e){
            System.err.println(e);
        }
    }


    private static void close() {
        try {
            if (resultSet != null){
                resultSet.close();
            }
            if(statement != null)
            {
                statement.close();
            }
            if (connect != null)
            {
                connect.close();
            }
        } catch (SQLException e){

        }
    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        System.out.println("Columns are");
        System.out.println("table : " + resultSet.getMetaData().getTableName(1));
        for (int i = 0; i <= resultSet.getMetaData().getColumnCount(); i++) {
            System.out.print("columns :" + i + " " + resultSet.getMetaData().getColumnLabel(i));
        }
        System.out.println();
    }

    public static void writeResultSet(ResultSet resultSet) throws SQLException {
        int rowIndex = 0;
        while (resultSet.next()) {

            String name = resultSet.getString("Name");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            int id = resultSet.getInt("id");

            System.out.println("x---------------------x");
            System.out.println("|         " + rowIndex + "       |");
            System.out.println("x---------------------x");
            System.out.println("x---------------------x");
            System.out.println("|          Name       |");
            System.out.println("x---------------------x");
            System.out.println(" " + rowIndex + " : " + name);
            System.out.println("x---------------------x");
            System.out.println("|       Username      |");
            System.out.println("x---------------------x");
            System.out.println(" " + rowIndex + " : " + username);
            System.out.println("x---------------------x");
            System.out.println("|       Password      |");
            System.out.println("x---------------------x");
            System.out.println(" " + rowIndex + " : " + password);
            System.out.println("x---------------------x");
            System.out.println("|          ID         |");
            System.out.println("x---------------------x");
            System.out.println(" " + rowIndex + " : " + id);
            System.out.println();
            System.out.println();
            System.out.println();

            rowIndex++;
        }

    }

    public static boolean checkUsername(String s) {
        String s1 = s;
        int x=0;
        boolean isAuser;
        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                String word = resultSet.getString("username");
                System.out.println(word +"  db "+ " \n");
                if (word ==  s1 && (word.length() > 0)) {
                    x++;
                    break;
                }
            }
            if(x==1) {
               isAuser =true;
            }
            else{
                isAuser = true;
            }
            return true;
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    public static boolean checkPassword(String s) {
        String s1 = s;
        int x=0;
        boolean isAuser;
        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                System.out.println(password +"  db "+ " \n");
                if (password.equals(s1) && checkUsername(username)) {
                    x++;
                    break;
                }
            }
            if(x==1) {
                isAuser =true;
            }
            else{
                isAuser = true;
            }
            return true;
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    public static void registerd(int id, String username , String password, String email, String firstname , String lastname, 
            String dateofbirth, String gender, String nationality){
        try{

            java.sql.PreparedStatement insertStatement = connect.prepareStatement(InsertToUsers);
            insertStatement.setInt(1, id);
            insertStatement.setString(2,username);
            insertStatement.setString(3,password);
            insertStatement.setString(4,email);
            insertStatement.setString(5,firstname);
            insertStatement.setString(6,lastname);
            insertStatement.setString(7,dateofbirth);
             insertStatement.setString(8,gender);
            insertStatement.setString(9,nationality);
            insertStatement.execute();
            close();
        }catch(SQLException e){
            System.err.println(e);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    
}
