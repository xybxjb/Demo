package cn.service.impl;

import cn.dao.UserDao;
import cn.model.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = userDao.findAll();
		return list;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public User update1(Integer id) {
		// TODO Auto-generated method stub
		User user = userDao.update1(id);
		return user;
	}

	@Override
	public void update2(User user) {
		// TODO Auto-generated method stub
		userDao.update2(user);
	}

}
