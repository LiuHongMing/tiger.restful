package demo.annotations;

import javax.inject.Named;

import static demo.annotations.Genre.User.STUDENT;

@Named
@Genre(user = STUDENT)
public class StudentDao implements IUserDao {
    @Override
    public int count() {
        System.out.println("===StudentDao===");
        return 0;
    }
}
