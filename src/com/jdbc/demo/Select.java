package com.jdbc.demo;

import java.sql.ResultSet;  
import java.sql.SQLException;  
  
public class Select {  
  
    static String sql = null;  
    static DBHelper db = null;  
    static ResultSet ret = null;  
  
    public static void main(String[] args) {  
        sql = "select *from student";//SQL���  
        db = new DBHelper(sql);//����DBHelper����  
  
        try {  
            ret = db.pst.executeQuery();//ִ����䣬�õ������  
            while (ret.next()) {  
                String id = ret.getString(1);  
                String name = ret.getString(2);  
                String sex = ret.getString(3);  
             
                System.out.println(id + "\t" + name + "\t" + sex  );  
            }//��ʾ����  
            ret.close();  
            db.close();//�ر�����  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
  
}  