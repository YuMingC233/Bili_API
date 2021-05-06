package com.dreamwolf.entity.video.web_interface;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoMap {

    private Integer item_id;//视频id
    private String type;//类型
    private String title;   //标题
    private String desc;//描述
    private String image;//封面图
    private String uri;//链接
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;  //发表视频时间

}
