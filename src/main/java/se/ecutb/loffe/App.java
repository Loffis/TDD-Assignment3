package se.ecutb.loffe;

import se.ecutb.loffe.entity.AppUser;
import se.ecutb.loffe.entity.AppUserRole;
import se.ecutb.loffe.entity.TodoItem;

import java.time.LocalDate;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // Setup some sets
        Set<AppUserRole> setOfRoles = new HashSet<>();
        Set<TodoItem> setOfTodos = new HashSet<>();

        // Examples of AppUser instantiation
        AppUser appUser1 = new AppUser.Builder(UUID.randomUUID(), "test1", "your password").build();

        AppUser appUser2 = new AppUser.Builder(UUID.randomUUID(), "test2", "your password")
                .withLastName("Anka")
                .withFirstName("Arne")
                .build();

        AppUser appUser3 = new AppUser.Builder(UUID.randomUUID(), "test3", "your password")
                .withFirstName("Anna")
                .withLastName("Anka")
                .registeredDate(LocalDate.parse("2020-12-24"))
                .hasBalance(20000)
                .withRoles(setOfRoles)
                .withTodos(setOfTodos)
                .build();

        System.out.println(appUser1 + "\n" + appUser2 + "\n" + appUser3);
    }
}
