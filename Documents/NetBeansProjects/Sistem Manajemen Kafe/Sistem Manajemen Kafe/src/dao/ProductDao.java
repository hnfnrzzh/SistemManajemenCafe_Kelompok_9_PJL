/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;

/**
 *
 * @author Lenovo V14
 */
public class ProductDao {
    
    public static void save(Product product){
        String query = "insert into product(name,category,price) value('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
        DbOperations.setDataOrDelete(query, "product Added Succesfully");
    }
    
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from product");
            while (rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(Product product){
        String query = "update product set name ='"+product.getName()+"',category ='"+product.getCategory()+"',price ='"+product.getPrice()+"' where id ='"+product.getId()+"'";
        DbOperations.setDataOrDelete(query, "Product Updated Successfully");
        
    }
    
    public static void delete(String id){
        String query = "delete from product where id = '"+id+"'";
        DbOperations.setDataOrDelete(query, "Product Deleted Successfully");
       
    }
    
    public static  ArrayList<Product> getAllRecordsByCategory(String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from product where category='"+category+"'");
            while(rs.next()){
                Product product = new Product ();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
      public static  ArrayList<Product> filterProductByName(String name,String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from product where name like '%"+name+"%' and category ='"+category+"'");
            while(rs.next()){
                Product product = new Product ();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
      }
      
        public static Product getProductByName(String name){
            Product product = new Product();
            try{
                ResultSet rs = DbOperations.getData("select * from product where name ='"+name+"'");
                while(rs.next()){
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
                }
                
            }
            catch(Exception e){
                System.out.println(product.getName());
                System.out.println(product.getPrice());
                System.out.println(product.getName());
                JOptionPane.showMessageDialog(null, e);
            }
            return product;
        }

    public static Product getProductByname(String ProductName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Product> filterProductByname(String name, String category) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
    
    
    

      

