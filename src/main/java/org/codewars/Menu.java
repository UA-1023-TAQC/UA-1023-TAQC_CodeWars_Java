package org.codewars;

import org.codewars.utils.Reader;
import org.codewars.utils.Tasks;
import org.codewars.utils.Users;

public class Menu {
    private Users user;


    public int getUserId() {
        return user.getId();
    }

    //In setter need to check is value is valid
    public void setUserById(int userID) {
        this.user = Users.getById(userID);
    }

    public void showUsersList() {

    }

    public void showUserInfo(int id) {

    }

    public void showTaskList() {

    }

    public void showTaskInfo(int id) {
        Tasks task = Tasks.getTaskById(id);
        System.out.println(task.getTaskName());
        System.out.println(task.getDescription());
    }

    public void runTask(int id) {

    }

    public void showMenu() {
        System.out.println("Run!!!");
    }

    public void run() {
        Reader reader = new Reader();
        boolean isRun = true;
        while (isRun){
            this.showMenu();
            System.out.print("set command id: ");
            int commandId = reader.readInt();
            switch (commandId){
                case 0: {
                    isRun = false;
                    System.out.println("Bye!!!");
                    break;
                }
            }
        }

    }
}
