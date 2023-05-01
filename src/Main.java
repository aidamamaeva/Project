import model.Message;
import model.Publication;
import model.User;
import service.MessageService;
import service.PublicationService;
import service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        MessageService messageService = new MessageService();
        PublicationService publicationService = new PublicationService();


        User user = new User(1, "Meder", "meder@gmail.com");
        User user2 = new User(2, "Aida" , "aida@");
        userService.createUser(user);
        userService.createUser(user2);



        userService.updateUser(1, new User(1,"aida" , "hhh"));

        userService.addToFriends(2, user);
        userService.createUser(user2);



        Message message = new Message(1, "2020", "This message is for your application", false, user);
        messageService.sendMessage(message);
        messageService.readMessage(1);
        System.out.println(message.toString());

//
//        Publication publication = new Publication(1, "photo", 2, "I'm writing description for my first application", user);
//        publicationService.create(publication);
//        publicationService.updateDescription(1, "My new description");
//        publicationService.addLikeToPublication(1,8);
//        publicationService.create(publication);
//
//        System.out.println(user);
//        System.out.println(message.toString());
//        System.out.println(user.toString());
////        System.out.println(publication.toString());
////        publicationService.addLikeToPublication();
//        System.out.println(publication.toString());

    }
}