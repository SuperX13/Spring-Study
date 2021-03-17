package com.yyx.mapper;

import com.yyx.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
//在原来我们的所有操作都使用sqlSession来执行，现在都使用sqlSessionTemplate
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
