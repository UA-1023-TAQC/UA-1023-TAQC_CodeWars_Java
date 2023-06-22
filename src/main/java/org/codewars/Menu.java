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

    }

    public void run() {
        Reader reader = new Reader();
        boolean isRun = true;
        while (isRun){
            int commandId = reader.readInt();
            switch (commandId){
                case 0: {
                    isRun = false;
                    break;
                }
            }
        }

    }
}
