package com.jdbc.demo;

import java.sql.SQLException;

public class Update {
	static String sql = null;  
    static DBHelper db = null;  
    static int ret = 0;  
    
    public static void main(String[] args) throws SQLException {  
        sql = "update student set stuname='prince2017' where stuno='30'";//SQL���  
        db = new DBHelper(sql);//����DBHelper����  
      ret=db.pst.executeUpdate(sql);
    System.out.println("ch�޸�"+ret+"��");
    
    }
    
}
