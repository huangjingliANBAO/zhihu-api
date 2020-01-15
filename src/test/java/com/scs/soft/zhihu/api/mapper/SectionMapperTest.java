package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Section;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class SectionMapperTest {
@Resource SectionMapper sectionMapper;
    @Test
    void getSectionsBySpecialId() {
        List<Section> sectionList = sectionMapper.getSectionsBySpecialId("19558008");
        sectionList.forEach(System.out::println);

    }
}