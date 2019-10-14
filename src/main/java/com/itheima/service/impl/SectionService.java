package com.itheima.service.impl;

import com.itheima.domain.Illnesser;
import com.itheima.mapper.SectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author jj
 * @version 1.0
 * @date 2019/10/10 20:17
 */
@Service("sectionService")
@Transactional(readOnly = false)
public class SectionService {

    @Resource
    private SectionMapper sectionMapper;

    /**
     * 添加患者信息
     */
    public void addRegist(String name, String birthday,String gender ,String sid){
        Integer age = Integer.valueOf(birthday);
        Integer sectionId = Integer.valueOf(sid);
        sectionMapper.insertIllnesser(name,age,gender,sectionId);
    }
}
