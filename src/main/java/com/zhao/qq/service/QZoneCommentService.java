package com.zhao.qq.service;

import com.zhao.qq.models.QZoneComments;

import java.util.List;

public interface QZoneCommentService
{
    /*
    添加评论
     */
    Integer addComments(QZoneComments qZoneComments);
    /*
    删除评论
     */
    Integer deleteComments(Integer id);
    /*
    根据评论人的id找到他所有评论的内容
     */
    List<QZoneComments> getAllCommentsByWriterId(String writerId);
    /*
    根据被评论者的id号找到他所有的被评论的内容
     */
    List<QZoneComments> getAllCommentsByReceiveId(String receiveId);

}
