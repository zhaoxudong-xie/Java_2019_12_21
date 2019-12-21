package com.zhao.qq.dal;

import com.zhao.qq.models.QqMember;
import com.zhao.qq.sqlhelper.SqlHelper;
import sun.awt.geom.AreaOp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QqMemberDao
{
    /*
    添加qq号
     */
   public static Integer addQq(QqMember qqMember)
   {
       String sql="INSERT INTO t_qqMember(img_url,qq_member,qq_name,qq_pwd,sex)"+"VALUES('"+qqMember.getImgUrl()+"','"+qqMember.getQqNumber()+"','" +
               qqMember.getQqName()+"','"+qqMember.getQqPwd()+"','"+qqMember.getSex()+"')";
       Integer result=SqlHelper.update(sql);
       return result;
   }
   /*
   删除qq号
    */
   public static Integer deleteQqByQqNum(String qqNum)
   {
       String sql="DELETE FROM t_qqmember WHERE qq_member='"+qqNum+"'";
       Integer deleteResult=SqlHelper.update(sql);
       return deleteResult;
   }
   /*
   更新qq号
    */
   public static Integer modifyQq(QqMember qqMember)
   {
       String sql="UPDATE t_qqmember SET img_url='"+qqMember.getImgUrl()+"',qq_name='"+qqMember.getQqName()+"',qq_pwd='"+qqMember.getQqPwd()+"',sex='"+qqMember.getSex()+"'" +
               " WHERE qq_member='"+qqMember.getQqNumber()+"'";
       Integer modifyResult=SqlHelper.update(sql);
       return modifyResult;
   }
   /*
   实现qq登录
    */
   public static QqMember login(String qqNum,String qqPwd)
   {
       String sql="SELECT * FROM t_qqmember WHERE qq_member='"+qqNum+"' AND qq_pwd='"+qqPwd+"'";
       ResultSet resultSet=SqlHelper.queryBySql(sql);
       try {
           while (resultSet.next()) {
               String imgUrl = resultSet.getString("img_url");
               String qqName=resultSet.getString("qq_name");
               String sex=resultSet.getString("sex");
               Integer id=resultSet.getInt("id");
               QqMember qqMember=new QqMember();
               qqMember.setImgUrl(imgUrl);
               qqMember.setQqNumber(qqName);
               qqMember.setSex(sex);
               qqMember.setId(id);
               qqMember.setQqNumber(qqNum);
               qqMember.setQqPwd(qqPwd);
               return qqMember;
           }
       }catch (Exception ex)
       {
           System.out.println(ex);
       }finally
       {
            try{resultSet.close(); }catch (Exception ex){System.out.print(ex);}
       }
       return null;
   }
   /*
   根据qq名称模糊查询qq信息
    */
   public static List<QqMember> getQqByName(String qqName)
   {
       String sql="SELECT * FROM t_qqmember WHERE qq_name LIKE '"+qqName+"'";
       ResultSet resultSet=SqlHelper.queryBySql(sql);
       List<QqMember> list=new ArrayList<QqMember>();
       try {
           while (resultSet.next()) {
               String imgUrl = resultSet.getString("img_url");
               String qqName1=resultSet.getString("qq_name");
               String sex=resultSet.getString("sex");
               Integer id=resultSet.getInt("id");
               String qqNum=resultSet.getString("qq_member");
               String qqPwd=resultSet.getString("qq_pwd");
               QqMember qqMember=new QqMember();
               qqMember.setImgUrl(imgUrl);
               qqMember.setQqName(qqName1);
               qqMember.setSex(sex);
               qqMember.setId(id);
               qqMember.setQqNumber(qqNum);
               qqMember.setQqPwd(qqPwd);
               list.add(qqMember);
               return list;
           }
       }catch (Exception ex)
       {
           System.out.println(ex);
       }finally
       {
           try{resultSet.close(); }catch (Exception ex){System.out.print(ex);}
       }
       return null;
   }

}
