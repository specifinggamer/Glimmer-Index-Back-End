package org.glimmer.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.glimmer.domain.User;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
