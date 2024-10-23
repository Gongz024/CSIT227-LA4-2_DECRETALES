package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void giveRaise(List<Person> persons, String manager, String employee, double salary) {
        Person foundManager = null;
        Person foundEmployee = null;

        for (Person p : persons) {
            if (p.getName().equals(manager)) {
                foundManager = p;
            }
            if (p.getName().equals(employee)) {
                foundEmployee = p;
            }
        }

        if (foundManager == null) {
            throw new NoSuchElementException(manager + " does not exist");
        }
        if (foundEmployee == null) {
            throw new NoSuchElementException(employee + " does not exist");
        }

        if (!(foundManager instanceof Manager)) {
            throw new ClassCastException(manager + " is not a manager");
        }
        if (!(foundEmployee instanceof Employee)) {
            throw new ClassCastException(employee + " is not an employee");
        }

        ((Manager) foundManager).giveRaise((Employee) foundEmployee, salary);
    }

    public static void assignPM(List<Person> persons, String developer, String manager) {
        Person foundDeveloper = null;
        Person foundManager = null;

        for (Person p : persons) {
            if (p.getName().equals(developer)) {
                foundDeveloper = p;
            }
            if (p.getName().equals(manager)) {
                foundManager = p;
            }
        }

        if (foundDeveloper == null) {
            throw new NoSuchElementException(developer + "does not found");
        }
        if (foundManager == null) {
            throw new NoSuchElementException(manager + " does not exist");
        }

        if (!(foundManager instanceof Manager)) {
            throw new ClassCastException(manager + " is not a manager");
        }
        if (!(foundDeveloper instanceof Developer)) {
            throw new ClassCastException(developer + " is not a Developer");
        }

        ((Developer) foundDeveloper).setProjectManager((Manager) foundManager);
    }


    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Person foundCustomer = null;
        Person foundEmployee = null;

        for (Person p : persons) {
            if (p.getName().equals(customer)) {
                foundCustomer = p;
            }
            if (p.getName().equals(employee)) {
                foundEmployee = p;
            }
        }

        if (foundCustomer == null) {
            throw new NoSuchElementException(customer + " does not exist");
        }
        if (foundEmployee == null) {
            throw new NoSuchElementException(employee + " does not exist");
        }

        if (!(foundCustomer instanceof Customer)) {
            throw new ClassCastException(customer + " is not a customer");
        }
        if (!(foundEmployee instanceof Employee)) {
            throw new ClassCastException(employee + " is not an employee");
        }

        return ((Customer) foundCustomer).speak((Employee) foundEmployee);
    }
}
