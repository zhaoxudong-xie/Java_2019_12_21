package com.zhao.qq.service;

import com.zhao.qq.models.QZoneLogCommentShip;

public interface QZoneLogCommentShipService
{
    /*
    增添日志与评论对应关系
     */
    Integer addQZoneLogCommentShip(QZoneLogCommentShip qZoneLogCommentShip);
    /*
    删除评论关系
     */
    Integer deleteZoneLogCommentShip(Integer id);
    /*
    根据日志Id找到关系表然后找到评论者id，根据评论者id找到评论的内容
     */
    QZoneLogCommentShip findByLogId(String logId);
    /*
    根据评论者id找到关系表然后找到日志id，查看对应的日志内容
     */
    QZoneLogCommentShip findByCommentId(String commmentId);
}
