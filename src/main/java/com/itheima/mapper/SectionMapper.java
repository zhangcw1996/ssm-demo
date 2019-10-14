package com.itheima.mapper;

import com.itheima.domain.Illnesser;
import org.apache.ibatis.annotations.Param;

/**
 * @author jj
 * @version 1.0
 * @date 2019/10/10 20:31
 */
public interface SectionMapper {
//    public Illnesser findAll();
    public void insertIllnesser(@Param("name") String name, @Param("age")
            Integer birthday, @Param("gender") String gender , @Param("sectionId") Integer sectionId);
}
