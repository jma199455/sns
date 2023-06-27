package com.fastcampus.sns.fixture;


import com.fastcampus.sns.model.entity.UserEntity;

// 가짜 테스트용 엔티티
public class UserEntityFixture {

    public static UserEntity get(String userName, String password, Integer userId) {
        UserEntity result = new UserEntity();
        result.setId(userId);
        result.setUserName(userName);
        result.setPassword(password);
        return result;
    }




}
