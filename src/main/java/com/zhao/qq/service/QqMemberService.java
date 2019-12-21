package com.zhao.qq.service;
import com.zhao.qq.models.QqMember;

import java.util.List;

public interface QqMemberService
{
    QqMember login(String qqNum,String qqPwd);
    List<QqMember> getQqByName(String qqName);
    Integer delete(String qqNum);
    Integer modifyQq(QqMember qqMember);
    Integer addQq(QqMember qqMember);
}
