package com.example.repository;

import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;



    @Test
    void testFindUserById() {
        User user = new User("A111456", "Jane", "Smith", "1116543210");
        userRepository.save(user);

        Optional<User> foundUser = userRepository.findById("A111456");
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getLastName()).isEqualTo("Smith");
    }

    @Test
    void testDeleteUser() {
        User user = new User("A222789", "Mike", "Johnson", "2221234567");
        userRepository.save(user);

        userRepository.deleteById("A222789");
        Optional<User> foundUser = userRepository.findById("A222789");
        assertThat(foundUser).isNotPresent();
    }
}
