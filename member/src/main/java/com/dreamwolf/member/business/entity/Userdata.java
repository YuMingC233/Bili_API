package com.dreamwolf.member.business.entity;

import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户个人数据
 * </p>
 *
 * @author zhaolin
 * @since 2021-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Userdata implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableField("uID")
    private Integer uID;

    /**
     * 用户等级
     */
    @TableField("Level")
    private Integer Level;

    /**
     * 用户现有经验
     */
    @TableField("Exp")
    private Long Exp;

    /**
     * 用户现有硬币数量
     */
    @TableField("CoinsNum")
    private Double CoinsNum;

    /**
     * 用户现有B币数量
     */
    @TableField("BCoinsNum")
    private Long BCoinsNum;

    /**
     * 用户总关注up主数量
     */
    @TableField("tFollowNum")
    private Long tFollowNum;

    /**
     * 用户总粉丝数量
     */
    @TableField("tFansNum")
    private Long tFansNum;

    /**
     * 用户总获赞数
     */
    @TableField("tLikeNum")
    private Long tLikeNum;

    /**
     * 用户上传的视频的总播放数
     */
    @TableField("tPlaysNum")
    private Long tPlaysNum;

    /**
     * 用户撰写的专栏的总阅读数
     */
    @TableField("tReadNum")
    private Long tReadNum;

    /**
     * 用户简介
     */
    @TableField("uDescription")
    private String uDescription;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getuID() {
        return uID;
    }

    public void setuID(Integer uID) {
        this.uID = uID;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Long getExp() {
        return Exp;
    }

    public void setExp(Long exp) {
        Exp = exp;
    }

    public Double getCoinsNum() {
        return CoinsNum;
    }

    public void setCoinsNum(Double coinsNum) {
        CoinsNum = coinsNum;
    }

    public Long getBCoinsNum() {
        return BCoinsNum;
    }

    public void setBCoinsNum(Long BCoinsNum) {
        this.BCoinsNum = BCoinsNum;
    }

    public Long gettFollowNum() {
        return tFollowNum;
    }

    public void settFollowNum(Long tFollowNum) {
        this.tFollowNum = tFollowNum;
    }

    public Long gettFansNum() {
        return tFansNum;
    }

    public void settFansNum(Long tFansNum) {
        this.tFansNum = tFansNum;
    }

    public Long gettLikeNum() {
        return tLikeNum;
    }

    public void settLikeNum(Long tLikeNum) {
        this.tLikeNum = tLikeNum;
    }

    public Long gettPlaysNum() {
        return tPlaysNum;
    }

    public void settPlaysNum(Long tPlaysNum) {
        this.tPlaysNum = tPlaysNum;
    }

    public Long gettReadNum() {
        return tReadNum;
    }

    public void settReadNum(Long tReadNum) {
        this.tReadNum = tReadNum;
    }

    public String getuDescription() {
        return uDescription;
    }

    public void setuDescription(String uDescription) {
        this.uDescription = uDescription;
    }
}
