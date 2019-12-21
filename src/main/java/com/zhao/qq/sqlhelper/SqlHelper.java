package com.zhao.qq.sqlhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlHelper
{
    private static final String DBRIVER="com.mysql.jdbc.Driver";
    private static final String Url="jdbc:mysql://101.132.33.149:3306/ZhaoXuDong";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    public static Integer update(String sql)
    {
        Connection connection=null;
        Statement statement=null;
        try
        {
            Class.forName(DBRIVER);
            connection= DriverManager.getConnection(Url,USERNAME,PASSWORD);
            statement=connection.createStatement();
            Integer result=statement.executeUpdate(sql);
            return result;
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }
        finally
        {
            try{statement.close();connection.close();}catch (Exception ex){ex.fillInStackTrace();}
        }
        return null;
    }
    public static ResultSet queryBySql(String sql)
    {
        Connection connection=null;
        Statement statement=null;
        try
        {
            Class.forName(DBRIVER);
            connection=DriverManager.getConnection(Url,USERNAME,PASSWORD);
            statement=connection.createStatement();
            ResultSet result=statement.executeQuery(sql);
            return result;
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }
        return null;
    }

}
