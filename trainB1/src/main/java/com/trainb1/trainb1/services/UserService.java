package com.trainb1.trainb1.services;

import com.trainb1.trainb1.dtos.UserDto;
import com.trainb1.trainb1.entities.User;
import com.trainb1.trainb1.responsitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getList() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public User addNew(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
        return user;
    }

    public String delete(Long id) {
        userRepository.deleteById(id);
        return "Da xoa thanh cong";
    }

    public User update(UserDto userDto, Long id) {
        User user = userRepository.findById(id).get();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return user;
    }
}
