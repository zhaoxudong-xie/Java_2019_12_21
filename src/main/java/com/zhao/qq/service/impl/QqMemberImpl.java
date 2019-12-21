package com.zhao.qq.service.impl;

import com.zhao.qq.dal.QqMemberDao;

import com.zhao.qq.models.QqMember;
import com.zhao.qq.service.QqMemberService;

import java.util.List;

public class QqMemberImpl implements QqMemberService
{
    QqMemberDao qqMemberDao;
    public QqMemberImpl()
    {
        qqMemberDao=new QqMemberDao();
    }
    public QqMember login(String qqNum,String qqPwd)
    {
        QqMember qqMember=QqMemberDao.login(qqNum,qqPwd);
        return qqMember;
    }

    public List<QqMember> getQqByName(String qqName) {
        List<QqMember> list=QqMemberDao.getQqByName(qqName);
        return list;
    }
    public Integer delete(String qqNum)
    {
        return QqMemberDao.deleteQqByQqNum(qqNum);
    }
    public Integer modifyQq(QqMember qqMember)
    {
        return QqMemberDao.modifyQq(qqMember);
    }
    public Integer addQq(QqMember qqMember)
    {
        return QqMemberDao.addQq(qqMember);
    }
}
