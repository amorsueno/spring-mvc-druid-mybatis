package com.sunyard.ims.model;

import java.math.BigDecimal;
import java.util.Date;

public class BsImage {
    private String imageId;

    private String imageName;

    private BigDecimal imageNum;

    private String picPath;

    private String sPicPath;

    private Double imageSize;

    private String imageType;

    private Date imageTime;

    private Date recordTime;

    private String similarStatus;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public BigDecimal getImageNum() {
        return imageNum;
    }

    public void setImageNum(BigDecimal imageNum) {
        this.imageNum = imageNum;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public String getsPicPath() {
        return sPicPath;
    }

    public void setsPicPath(String sPicPath) {
        this.sPicPath = sPicPath == null ? null : sPicPath.trim();
    }

    public Double getImageSize() {
        return imageSize;
    }

    public void setImageSize(Double imageSize) {
        this.imageSize = imageSize;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    public Date getImageTime() {
        return imageTime;
    }

    public void setImageTime(Date imageTime) {
        this.imageTime = imageTime;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getSimilarStatus() {
        return similarStatus;
    }

    public void setSimilarStatus(String similarStatus) {
        this.similarStatus = similarStatus == null ? null : similarStatus.trim();
    }
}