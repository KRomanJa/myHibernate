package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Ivan", "Durov", (byte) 25);
        service.saveUser("Vladimir", "Kurov", (byte) 40);
        service.saveUser("Innokentiy", "Lee", (byte) 31);
        service.saveUser("John", "Weak", (byte) 55);
        System.out.println(service.getAllUsers());
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
