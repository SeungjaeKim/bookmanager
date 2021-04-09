package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){  //create, read, update, delete
       //List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);
//        User user1 = new User("jack", "jack@mail.com");
//        User user2 = new User("steve", "steve@mail.com");

//        userRepository.save(user1);
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

//        User user = userRepository.findById(1L).orElse(null);
//        System.out.println(user);
//
//        Long count = userRepository.count();
//        System.out.println(count);
//
//        boolean isExists = userRepository.existsById(1L);
//        System.out.println(isExists);

//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.deleteAllInBatch();

//        Page<User> users = userRepository.findAll(PageRequest.of(0,3));
//
//        System.out.println("page : " + users);
//        System.out.println("totalElements : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//
//        users.getContent().forEach(System.out::println);
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//        Example<User> example = Example.of(new User("ma", "mail.com"), matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);
        userRepository.save(new User("david", "david@mail.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin@mail.com");

        userRepository.save(user);

    }

}