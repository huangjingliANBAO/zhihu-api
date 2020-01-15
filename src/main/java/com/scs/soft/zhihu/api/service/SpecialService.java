package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-01-15
 **/
public interface SpecialService {
    /**
     * 查询所有专题
     * @return  List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     * @return List<Special>
     */
    List<Special> selectRecent();

}
