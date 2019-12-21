package com.zhao.qq.service;

import com.zhao.qq.models.QZoneLogShip;

public interface QZoneLogShipService
{
    /*
    添加空间与日志的关系
     */
    Integer addQZoneLogShip(QZoneLogShip qZoneLogShip);
    /*
    删除日志与空间的关系
     */
    Integer deleteQZoneLogShip(Integer id);
    /*
    根据空间id找到关系表然后找到日志id再去日志表里面找到日志内容
     */
    QZoneLogShip findByQZoneId(String qZoneId);
    /*
    根据日志id找到关系表拿到空间id进入空间表中查找对应空间
     */
    QZoneLogShip findByLogId(String logId);
}
