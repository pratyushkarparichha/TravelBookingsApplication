package com.nit.service;

import java.util.List;

import com.nit.model.Role;
import com.nit.model.User;

public interface IRoleService {
	
	List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long roleId);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);

}
