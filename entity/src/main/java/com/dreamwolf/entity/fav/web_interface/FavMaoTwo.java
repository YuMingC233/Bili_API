package com.dreamwolf.entity.fav.web_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavMaoTwo {
    private Integer id;////固定值：普通收藏夹为1，稍后再看为2
    private MediaListResponse mediaListResponse;

}
