package com.zhao.qq.service;

import com.zhao.qq.models.QqGroup;
import java.util.List;

public interface QqGroupService
{
    /*
    添加分组
     */
    Integer addGroup(QqGroup group);
    /*
    得到全部的分组
     */
    List<QqGroup> getAllGroup();
    /*
    删除分组
     */
    Integer deleteGroupById(Integer id);
}
