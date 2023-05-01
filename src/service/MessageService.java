package service;

import data_base.DataBase;
import model.Message;

// TODO: 14.04.2023
//  Класс для сообщения.
//  Реализовать все методы
public class MessageService {
    private DataBase dataBase = new DataBase();
    int index = 0;

    // TODO: 14.04.2023 Сохранить сообщение в мини базе данных (dataBase);!!!
    public void sendMessage(Message message) {
      Message[] messages = dataBase.getMessages();
        for (int index = 0; index < messages.length; index++) {

        }
        messages[index]=message;
        System.out.println(message);
    }

    // TODO: 14.04.2023 Прочитать сообщение по ID!!!
    public void readMessage(int messageId){
     Message[] messages = dataBase.getMessages();
     //цикл чтобы найти сообщение по id
        for (int i = 0; i < messages.length; i++) {
            if(messages[i]!=null&&messages[i].getId()==messageId){
                messages[i].setRead(true); // вызываем метод и даем boolean isRead значение true
                System.out.println(messages[i]);
                }


    }}

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
