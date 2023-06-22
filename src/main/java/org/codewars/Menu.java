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
        user = Users.getById(id);
        while (user == null) {
            Reader reader = new Reader();
            System.out.print("Wrong user id! Enter int from 1 to 11 included: ");
            id = reader.readInt();
            user = Users.getById(id);
        }
        System.out.println("id: " + user.getId());
        System.out.println("name: " + user.getName());
        System.out.println("github nickname: " + user.getNickname());
    }

    public void showTaskList() {

    }

    public void showTaskInfo(int id) {
        Tasks task = Tasks.getTaskById(id);
        while (task == null) {
            Reader reader = new Reader();
            System.out.print("Wrong task id! Enter int from 1 to 24 included: ");
            id = reader.readInt();
            task = Tasks.getTaskById(id);
        }
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
        while (isRun) {
            this.showMenu();
            System.out.print("Enter command id: ");
            int commandId = reader.readInt();
            switch (commandId) {
                case 0: {
                    isRun = false;
                    System.out.println("Bye!!!");
                    break;
                }
                case 1: {
                    showUsersList();
                    break;
                }
                case 2: {
                    showTaskList();
                    break;
                }
                case 3: {
                    System.out.print("Enter user id (int from 1 to 11 included): ");
                    int userId = reader.readInt();
                    showUserInfo(userId);
                    break;
                }
                case 4: {
                    System.out.print("Enter task id (int from 1 to 24 included): ");
                    int taskId = reader.readInt();
                    showTaskInfo(taskId);
                    break;
                }
                case 5: {
                    System.out.print("Enter user id (int from 1 to 11 included): ");
                    int userId = reader.readInt();
                    setUserById(userId);
                    break;
                }
                case 6: {
                    while (user == null) {
                        System.out.println("For running task user should be set!");
                        showUsersList();
                        System.out.print("Enter user id (int from 1 to 11 included): ");
                        int userId = reader.readInt();
                        setUserById(userId);
                    }
                    System.out.print("Enter task id (int from 1 to 24 included): ");
                    int taskId = reader.readInt();
                    runTask(taskId);
                    break;
                }
                default: {
                    System.out.println("Unknown action. Try again, please.");
                    break;
                }
            }
        }

    }
}
