package com.zhao.qq.service;

import com.zhao.qq.models.QqMember;
import com.zhao.qq.models.QqMemberZoneShip;

public interface QqMemberZoneShipService
{
    /*
    一对一分配空间
     */
    Integer addQqMemberZoneShip(QqMemberZoneShip qqMemberZoneShip);
    /*
    根据qq号查找空间
     */
    QqMemberZoneShip findByqqMemerId(String qqMemberId);
    /*
    注销空间
     */
    Integer cancelQqZone(Integer id);
    /*
    根据qq空间查找本人qq号码去添加好友
     */
    QqMemberZoneShip findQqMemberIdByZoneId(String qqZoneId);
}
