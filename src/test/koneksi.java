/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author LENOVO
 */
public class koneksi {
    Connection con;
    public koneksi(){
        String id, pass, driver, url;
        id="root";
        pass="";
        driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/tebak_gambar?userTimezone=true&serverTimezone=UTC";
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url, id, pass);
            if(con==null){
                System.out.println("Koneksi GAGAL");
            }
            else{
                System.out.println("Koneksi BERHASIL");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main (String []args){
        koneksi k= new koneksi();
    }
}
