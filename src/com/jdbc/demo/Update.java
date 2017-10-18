package com.jdbc.demo;

import java.sql.SQLException;

public class Update {
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "update student set stuname='prince2017' where stuno='30'";//SQL语句  
        db = new DBHelper(sql);//创建DBHelper对象  
      ret=db.pst.executeUpdate(sql);
    System.out.println("ch修改"+ret+"行");
    
    }
    
}
