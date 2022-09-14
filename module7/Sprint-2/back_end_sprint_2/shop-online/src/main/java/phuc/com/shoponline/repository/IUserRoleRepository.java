package phuc.com.shoponline.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import phuc.com.shoponline.model.account.AppUser;
import phuc.com.shoponline.model.account.UserRole;

import java.util.List;

public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {

    /**
     * @param appUser
     * @return
     * @author: PhucLV
     * @date-create 15/8/2022
     */
    @Query(value = " select ur.id, ur.is_deleted, ur.role_id, ur.user_id from user_role ur where user_id = :#{#appUser.id} ", nativeQuery = true)
    List<UserRole> findAllByAppUser(@Param("appUser") AppUser appUser);
}
