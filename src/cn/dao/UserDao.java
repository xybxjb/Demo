package cn.dao;

import java.util.List;



import cn.model.User;
public interface UserDao {

	void add(User user);

	List<User> findAll();

	void delete(Integer id);

	User update1(Integer id);

	void update2(User user);

}
