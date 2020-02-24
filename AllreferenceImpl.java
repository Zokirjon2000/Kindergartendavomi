package Kindergarten.Implement;

import Kindergarten.Childeren;
import Kindergarten.Interface.AllReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllreferenceImpl implements AllReference {
    private Scanner sc = new Scanner(System.in);
    private List<Childeren> childerenList = new ArrayList<>();


    @Override
    public void AllChild() {
        System.out.println(" Enter FirstName ");
        sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        System.out.println(" LastName ");
        sc = new Scanner(System.in);
        String lastname = sc.nextLine();
        System.out.println(" Age ");
        sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Nationality");
        String nationality = sc.next();
        System.out.println("Group");
        sc = new Scanner(System.in);
        String group = sc.nextLine();
        System.out.println("Security");
        sc = new Scanner(System.in);
        String security = sc.nextLine();
        Childeren childeren = new Childeren(FirstName, lastname, age, nationality, group, security);
        childerenList.add(childeren);
    }

    @Override
    public void ShowAllChild() {
        for (int i = 0; i < childerenList.size(); i++) {
            System.out.println(childerenList.get(i));
        }
    }

    @Override
    public void RegistrationGroup() {
        System.out.println(" Siz qaysi guruh o'quvchilarni kormmoqchisiz");
        sc = new Scanner(System.in);
        String group = sc.nextLine();
        for (int i = 0; i < childerenList.size(); i++) {
            if (childerenList.get(i).getGroup().equals(group)) {
                System.out.println(childerenList.get(i));
            }
        }
    }

    @Override
    public void DeleteChild() {
        System.out.println(" O'chiraydigon bolani Familiyasini kiriting ");
        sc = new Scanner(System.in);
        String fisrtName = sc.nextLine();
        System.out.println(" O'chiraydigon  bolani Ismini kiriting ");
        sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        System.out.println(" Group ni kiriting ");
        sc = new Scanner(System.in);
        String group = sc.nextLine();
        for (int i = 0; i < childerenList.size(); i++) {
            if (childerenList.get(i).getGroup().equals(group) && childerenList.get(i).getFirstName().equals(fisrtName) && childerenList.get(i).getLastName().equals(lastName)) {
                childerenList.remove(i);
            }
        }
    }

    @Override
    public void EditChild() {
        System.out.println("  Familiyasini  kiriting ");
        sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.println("  Ismini kiriting  ");
        sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        System.out.println("  Groupni kiriting  ");
        sc = new Scanner(System.in);
        String group = sc.nextLine();
        for (int i = 0; i < childerenList.size(); i++) {
            if (childerenList.get(i).getGroup().equals(group) && childerenList.get(i).getFirstName().equals(firstName) && childerenList.get(i).getLastName().equals(lastName)) {
                System.out.println(" Yangi groupni kiriting ");
                sc = new Scanner(System.in);
                String newGroup = sc.nextLine();
                childerenList.get(i).setGroup(newGroup);
            }
        }
    }

    @Override
    public void sortChilds() {
        Collections.sort(childerenList);
        for (Childeren childeren : childerenList) {
            System.out.println(childeren);
        }
    }

}
