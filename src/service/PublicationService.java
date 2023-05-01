package service;

import data_base.DataBase;
import model.Publication;

// TODO: 14.04.2023
//  Класс для публикаций.
//  Реализовать все методы
public class PublicationService {
    private DataBase dataBase = new DataBase();
    private int index;

    // TODO: 14.04.2023 Сохранить публикацию в мини базе данных (dataBase)!!!
    public void create(Publication publication) {
      Publication[] publications = dataBase.getPublications();
        for (int index = 0; index < publications.length; index++) {

        }
        publications[index]=publication;
        System.out.println(publication);
    }

    // TODO: 14.04.2023 Добавить возможность изменить описание публикации!!!
    public void updateDescription(int id, String descriptoin) {
        Publication[] publications = dataBase.getPublications();
        // цикл for для того чтобы пройтись по каждой публикации, if проверяет не равна ли нулю публикация и имее тот же id что задан в параметре
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] != null && publications[i].getId() == id) {
                publications[i].setDescription(descriptoin); // через метод setDescription обновляем описание
                System.out.println("Description updated successfully!");
                return; // выход из цикла
            }
        }
        System.out.println("Publication with id " + id + " not found."); //это выводится на консоль если не найдена публикацтя
    }




    // TODO: 14.04.2023 Добавить возможность поставить лайк к публикации!!!
    public void addLikeToPublication(int Id, int like){
        Publication[] publications = dataBase.getPublications();
        // цикл for для того чтобы пройтись по каждой публикации, if проверяет не равна ли нулю публикация и имее тот же id что задан в параметре
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] != null && publications[i].getId() == Id) {
                publications[i].setLike(publications[i].getLike() + like);// добавляем заданные через параметр лайки к нынешнему кол-во лайков
                

            }
        }
        System.out.println("Publication with id " + Id + " not found.");
    }



    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
