package org.codewars.kata.Menu.Skripts;

import org.codewars.kata.Menu.Interfaces.IRunTask;
import org.codewars.kata.Menu.Interfaces.IStartProgram;
import org.codewars.kata.Menu.Interfaces.ITaskInfoShow;
import org.codewars.kata.Menu.Interfaces.IUserInfoShow;

public class Menu implements IRunTask, IStartProgram, ITaskInfoShow, IUserInfoShow
{
    private int userID;
    private int taskID;

    public int getUserID() {
        return userID;
    }
    //In setter need to check is value is valid
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTaskID() {
        return taskID;
    }

    //In setter need to check is value is valid
    public void setTaskID(int taskID) {
        this.taskID = taskID;
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

    }
}
