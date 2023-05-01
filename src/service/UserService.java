package service;

import data_base.DataBase;
import model.User;

// TODO: 14.04.2023
//  Класс для пользователя.
//  Реализовать все методы
public class UserService {
    private DataBase dataBase = new DataBase();


    // TODO: 14.04.2023 Сохранить пользователя(User) в мини базе данных!!!
    public void createUser(User user) {
        User[] users = getDataBase().getUsers();
        for (int index = 0; index < users.length; index++) {

            users[index] = user;
        }
        System.out.println(user);
    }

    // TODO: 14.04.2023 Добавить возможность изменить свойтсва пользователя!!!
    public void updateUser(int id, User user) {
        User[] users = dataBase.getUsers();
        // цикл перебирает пользователей и ищет заданный в параметре id
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                // изменение свойств
                users[i].setName(user.getName());
                users[i].setEmail(user.getEmail());
            }
        }
        System.out.println(user);
    }


    public void addToFriends(int userId, User newUser) {
        User[] users = dataBase.getUsers();
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == userId) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            User[] friends = users[index].getFriends();
            for (int i = 0; i < friends.length; i++) {
                if (friends[i] == null) {
                    friends[i] = newUser;
                    break;
                }
            }
        }
        }



    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
