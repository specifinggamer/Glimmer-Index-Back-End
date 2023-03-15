package org.glimmer.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.glimmer.domain.User;
@Mapper
@TableName("sys_user")
public interface UserMapper extends BaseMapper<User> {
}
