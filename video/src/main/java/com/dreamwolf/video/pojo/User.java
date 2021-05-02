package com.dreamwolf.video.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 老徐
 * @since 2021-04-14
 */
@Controller
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
@ApiModel(value="User对象", description="用户信息表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户唯一ID")
    @TableId(value = "uID", type = IdType.AUTO)
    private Integer uID;

    @ApiModelProperty(value = "用户名（唯一）")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    @TableField("nickName")
    private String nickName;

    @ApiModelProperty(value = "用户性别，1为男，2为女，0为私密")
    private Integer sex;

    @ApiModelProperty(value = "用户生日")
    private Date birthday;

    @ApiModelProperty(value = "被绑定邮箱")
    @TableField("boundEmail")
    private String boundEmail;

    @ApiModelProperty(value = "被绑定手机号")
    @TableField("boundPhone")
    private String boundPhone;

    @ApiModelProperty(value = "被绑定qq")
    @TableField("boundQQ")
    private String boundQQ;

    @ApiModelProperty(value = "用户头像路径")
    @TableField("headImgPath")
    private String headImgPath;


}
