package com.jdbc.demo;

import java.sql.ResultSet;  
import java.sql.SQLException;  
  
public class Select {  
  
    static String sql = null;  
    static DBHelper db = null;  
    static ResultSet ret = null;  
  
    public static void main(String[] args) {  
        sql = "select *from student";//SQL语句  
        db = new DBHelper(sql);//创建DBHelper对象  
  
        try {  
            ret = db.pst.executeQuery();//执行语句，得到结果集  
            while (ret.next()) {  
                String id = ret.getString(1);  
                String name = ret.getString(2);  
                String sex = ret.getString(3);  
             
                System.out.println(id + "\t" + name + "\t" + sex  );  
            }//显示数据  
            ret.close();  
            db.close();//关闭连接  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
  
}  