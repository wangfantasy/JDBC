package com.jdbc.demo;

import java.sql.SQLException;

public class Delete {
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "delete from student  where stusex='男'";//SQL语句  
        db = new DBHelper(sql);//创建DBHelper对象  
      ret=db.pst.executeUpdate(sql);
    System.out.println("ch删掉"+ret+"行");
    
    }
}
