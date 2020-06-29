package com.study.java;

public class DoorLockManager {
    // 상태
    String currentPassword = "abc";

    // 행동
    public boolean checkPassword(String password) {
        return password == currentPassword;
    }

    public static void main(String[] args) {
        DoorLockManager doorLock = new DoorLockManager();

        boolean isCorrectPassword = doorLock.checkPassword("bbb");
        boolean isCorrectPassword2 = doorLock.checkPassword("abc");

        System.out.println(isCorrectPassword);
        System.out.println(isCorrectPassword2);
    }
}
