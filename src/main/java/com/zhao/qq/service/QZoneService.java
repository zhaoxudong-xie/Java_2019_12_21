package com.zhao.qq.service;

import com.zhao.qq.models.QZone;

public interface QZoneService
{
    /*
    增添空间
     */
    Integer addQZone(QZone qZone);
    /*
    删除空间
     */
    Integer deleteQZone(Integer id);
    /*
    根据id号查找空间
     */
    QZone findById(Integer id);
    /*
    更新空间
     */
    Integer updateQZone(QZone qZone);
}
