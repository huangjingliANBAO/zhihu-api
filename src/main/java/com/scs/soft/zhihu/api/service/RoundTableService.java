package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-01-18
 **/
public interface RoundTableService {
    /**
     * 查看最新圆桌讨论
     * @return List<RoundTable>
     */
    List<RoundTable> selectRecent();

    /**
     * 查看所有圆桌讨论
     * @return List<Map>
     */
    List<Map> selectAll();

}
