package com.jdbc.demo;

import java.sql.SQLException;

public class Delete {
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "delete from student  where stusex='��'";//SQL���  
        db = new DBHelper(sql);//����DBHelper����  
      ret=db.pst.executeUpdate(sql);
    System.out.println("chɾ��"+ret+"��");
    
    }
}
