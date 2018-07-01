package main.repository.impl;

import main.entities.User;
import main.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> listUser() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(BigInteger.valueOf(1L));
            user.setUsername("Tom" + i + 1);
            user.setPassword("abc" + i);
            user.setGmtCreate(Timestamp.from(Instant.now()));
            user.setBirthday(new Date(System.currentTimeMillis()));
            users.add(user);
        }
        System.out.println("call repository listUser: " + users.size());
        return users;
    }
}
