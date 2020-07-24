package fr.mydomain.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import fr.mydomain.user.model.User;

@Mapper
public interface UserMapper {

	User findById(@Param("id") Long id);
}
