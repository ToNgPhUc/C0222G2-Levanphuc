package phuc.com.shoponline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.account.AppUser;
import phuc.com.shoponline.repository.IAppUserRepository;

import java.util.List;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private IAppUserRepository IAppUserRepository;



    @Override
    public List<AppUser> getAllUser() {
        return null;
    }

    @Override
    public AppUser findAppUserByUserName(String userName) {
        return this.IAppUserRepository.findAppUserByUserName(userName);
    }

    @Override
    public void saveAppUser(AppUser appUser) {

    }
}
