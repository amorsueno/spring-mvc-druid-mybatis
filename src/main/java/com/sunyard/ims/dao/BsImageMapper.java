package com.sunyard.ims.dao;

import com.sunyard.ims.model.BsImage;

public interface BsImageMapper {
    int deleteByPrimaryKey(String imageId);

    int insert(BsImage record);

    int insertSelective(BsImage record);

    BsImage selectByPrimaryKey(String imageId);

    int updateByPrimaryKeySelective(BsImage record);

    int updateByPrimaryKey(BsImage record);
}