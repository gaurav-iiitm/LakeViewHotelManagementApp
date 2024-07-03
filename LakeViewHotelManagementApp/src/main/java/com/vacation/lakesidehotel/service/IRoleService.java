package com.vacation.lakesidehotel.service;

import com.vacation.lakesidehotel.model.Role;
import com.vacation.lakesidehotel.model.User;

import java.util.List;

/**
 * @author Gaurav Yadav
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
