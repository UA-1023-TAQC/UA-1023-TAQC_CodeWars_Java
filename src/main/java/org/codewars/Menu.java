package org.codewars;

import org.codewars.utils.Reader;
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
        System.out.println("Available users:");

        for (int i = 1; i <= Users.values().length; i++){
            System.out.format("%2d | %s%n", i, Users.getById(i).getName());
        }
    }

    public void showUserInfo(int id) {

    }

    public void showTaskList() {

    }

    public void showTaskInfo(int id) {

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
