package com.jdbc.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "insert into student values('30','prince','��')";//SQL���  
        db = new DBHelper(sql);//����DBHelper����  
      ret=db.pst.executeUpdate(sql);
    System.out.println("ch�ɹ�����"+ret+"��");
    
    }
    
    

}
