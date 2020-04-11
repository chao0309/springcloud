package cn.how2j.springcloud.dao;

import cn.how2j.springcloud.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);

//    @Select("select * from user")
//    List findAllUser();
    @Select("SELECT * FROM user")
    List<User> findAllUser();

    @Select("insert into user(name,age,money) values(#{name},#{age},#{money})")
    void insertUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money);

    @Update("UPDATE  user SET name = #{name},age = #{age},money= #{money} WHERE id = #{id}")
    void updateUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money,
                    @Param("id") int id);

    @Delete("DELETE from user WHERE id = #{id}")
    void deleteUser(@Param("id") int id);

}
