package se.ecutb.loffe.entity;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public class AppUser {

    // Builder class for AppUser
    public static class Builder {
        private final UUID userId;
        private final String userName;
        private String firstName;
        private String lastName;
        private LocalDate regDate;
        private final String password;
        private double balance;
        private Set<AppUserRole> roleSet;
        private Set<TodoItem> todoItems;

        // Required fields: userId, userName & password
        public Builder(UUID userId, String userName, String password) {
            this.userId = userId;
            this.userName = userName;
            this.password = password;
        }


        // Methods for setting optional fields during instantiation

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder registeredDate(LocalDate regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder hasBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder withRoles(Set<AppUserRole> roleSet) {
            this.roleSet = roleSet;
            return this;
        }

        public Builder withTodos(Set<TodoItem> todoItems) {
            this.todoItems = todoItems;
            return this;
        }

        public AppUser build(){
            AppUser appUser = new AppUser();
            appUser.userId = this.userId;
            appUser.userName = this.userName;
            appUser.firstName = this.firstName;
            appUser.lastName = this.lastName;
            appUser.regDate = this.regDate;
            appUser.password = this.password;
            appUser.balance = this.balance;
            appUser.roleSet = this.roleSet;
            appUser.todoItems = this.todoItems;
            return appUser;
        }
    }

    private UUID userId;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate regDate;
    private String password;
    private double balance;
    private Set<AppUserRole> roleSet;
    private Set<TodoItem> todoItems;

    private AppUser(){}

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Set<AppUserRole> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<AppUserRole> roleSet) {
        this.roleSet = roleSet;
    }

    public Set<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(Set<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", regDate=" + regDate +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", roleSet=" + roleSet +
                ", todoItems=" + todoItems +
                '}';
    }
}
