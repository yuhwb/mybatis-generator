package com.ehomepay.mybatis.dao;

import com.ehomepay.mybatis.model.TestAVO;
import com.ehomepay.mybatis.model.TestAVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestAVOMapper {
    long countByExample(TestAVOExample example);

    int deleteByExample(TestAVOExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(TestAVO record);

    int insertSelective(TestAVO record);

    List<TestAVO> selectByExample(TestAVOExample example);

    TestAVO selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") TestAVO record, @Param("example") TestAVOExample example);

    int updateByExample(@Param("record") TestAVO record, @Param("example") TestAVOExample example);

    int updateByPrimaryKeySelective(TestAVO record);

    int updateByPrimaryKey(TestAVO record);
}