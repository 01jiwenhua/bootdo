package com.bootdo.system.service;

import com.bootdo.law.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
//	UserDO get(Long id);
	User get(Long id);
	User getUser(String userName);

//	List<UserDO> list(Map<String, Object> map);
//
//	int count(Map<String, Object> map);
//
//	int save(UserDO user);
//
//	int update(UserDO user);
//
//	int remove(Long userId);
//
//	int batchremove(Long[] userIds);
//
//	boolean exit(Map<String, Object> params);
//
//	Set<String> listRoles(Long userId);
//
//	int resetPwd(UserVO userVO,UserDO userDO) throws Exception;
//	int adminResetPwd(UserVO userVO) throws Exception;
//	Tree<DeptDO> getTree();
//
//	/**
//	 * 更新个人信息
//	 * @param userDO
//	 * @return
//	 */
//	int updatePersonal(UserDO userDO);
//
//	/**
//	 * 更新个人图片
//	 * @param file 图片
//	 * @param avatar_data 裁剪信息
//	 * @param userId 用户ID
//	 * @throws Exception
//	 */
//    Map<String, Object> updatePersonalImg(MultipartFile file, String avatar_data, Long userId) throws Exception;
}
