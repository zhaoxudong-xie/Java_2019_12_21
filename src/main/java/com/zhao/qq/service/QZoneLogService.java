package com.zhao.qq.service;

import com.zhao.qq.models.QZoneLog;

public interface QZoneLogService
{
    /*/
    增添日志
     */
    Integer addQZoneLog(QZoneLog qZoneLog);
    /*
    删除日志
     */
    Integer deleteZoneLog(Integer id);
    /*
    根据id查找日志
     */
    QZoneLog findById(Integer id);
    /*
    根据日志名称模糊查找日志
     */
    QZoneLog findByLogName(String LogName);
}
