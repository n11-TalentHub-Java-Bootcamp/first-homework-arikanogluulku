package applications;

import entity.User;
import entityService.UserEntityService;

import java.util.List;

public class FindAllUserApp {
    public static void main(String[] args) {
        UserEntityService service = new UserEntityService();
        List<User> users = service.findAll();

        for(User user : users){
            System.out.println(user);
        }
    }
}
