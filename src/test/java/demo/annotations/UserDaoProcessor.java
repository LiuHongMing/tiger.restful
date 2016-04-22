package demo.annotations;

import javax.inject.Inject;
import javax.inject.Named;

import static demo.annotations.Genre.User.TEACHER;

@Named
public class UserDaoProcessor {

    @Inject
    private @Genre(user = TEACHER) IUserDao userDao;

    public int getCount() {
        return userDao.count();
    }

}
