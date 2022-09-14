package phuc.com.shoponline.service;



import phuc.com.shoponline.model.account.AppUser;

import java.util.List;

public interface IAppUserService {

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param
     * @return  AppUser list
     */
    List<AppUser> getAllUser();

    AppUser findAppUserByUserName(String userName);

    void saveAppUser(AppUser appUser);
//
//    AppUser findAppUserByUsername(String username);
}
