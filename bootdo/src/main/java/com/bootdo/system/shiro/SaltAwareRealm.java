package com.bootdo.system.shiro;

import com.bootdo.law.entity.User;
import com.bootdo.system.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


public class SaltAwareRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernameToken = (UsernamePasswordToken) token;

		User user = userService.getUser(usernameToken.getUsername());

		if (user == null) {
			throw new UnknownAccountException("用户不存在");
		}
		return new SimpleAuthenticationInfo(user.getLoginName(), user.getLoginPassword(),
				ByteSource.Util.bytes(user.getSalt()), this.getName());
	}

//	@Autowired
//	private AuthroticationService authroticationService;
	 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		String userName = principals.getPrimaryPrincipal().toString();
//		List<SystemResource> lstResource = authroticationService.listResource( userName );
//		for( SystemResource each : lstResource ) {
//			info.addStringPermission( each.getCode() );
//		}
		return info;
	}

}
