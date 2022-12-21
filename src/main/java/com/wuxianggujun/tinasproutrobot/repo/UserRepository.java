package com.wuxianggujun.tinasproutrobot.repo;

import com.wuxianggujun.tinasproutrobot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author WuXiangGuJun
 * @create 2022-12-21 16:54
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
