package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-01-18
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tiny_Banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}