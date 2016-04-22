package demo.annotations;

import javax.inject.Named;

import static demo.annotations.Genre.User.TEACHER;

@Named
@Genre(user = TEACHER)
public class TeacherDao implements IUserDao {
    @Override
    public int count() {
        System.out.println("===TeacherDao===");
        return 0;
    }
}
