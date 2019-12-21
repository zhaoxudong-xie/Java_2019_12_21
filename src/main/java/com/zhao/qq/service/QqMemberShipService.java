package com.zhao.qq.service;

import com.zhao.qq.models.QqMember;
import com.zhao.qq.models.QqMemberShip;

import java.util.List;

public interface QqMemberShipService
{
    /*
    添加好友
     */
    Integer addQqFriend(QqMemberShip qqMemberShip);
    /*
    删除好友
     */
    Integer deleteQqFriend(Integer id);
    /*
    根据自己的qq号找到所有好友
     */
    List<QqMemberShip> getAllFriends(String qqMemberId);
    /*
    更新好友关系
     */
    Integer updateQqFriendShip(QqMemberShip qqMemberShip);
}
