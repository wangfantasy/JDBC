package com.jdbc.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "insert into student values('30','prince','男')";//SQL语句  
        db = new DBHelper(sql);//创建DBHelper对象  
      ret=db.pst.executeUpdate(sql);
    System.out.println("ch成功加入"+ret+"行");
    
    }
    
    

}
