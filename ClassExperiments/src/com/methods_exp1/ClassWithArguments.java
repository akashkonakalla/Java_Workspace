package com.methods_exp1;
import java.util.Scanner;


public class ClassWithArguments {

    void name(String name) {
        System.out.println("Name: " + name);
    }

    void age(int age) {
        System.out.println("Age: " + age);
    }

    void gender(String gender) {
        System.out.println("Gender: " + gender);
    }

    void fatherName(String father) {
        System.out.println("Father Name: " + father);
    }

    void motherName(String mother) {
        System.out.println("Mother Name: " + mother);
    }

    void college(String college) {
        System.out.println("College: " + college);
    }

    void branch(String branch) {
        System.out.println("Branch: " + branch);
    }

    void year(int year) {
        System.out.println("Year: " + year);
    }

    void section(String section) {
        System.out.println("Section: " + section);
    }

    void rollNo(String roll) {
        System.out.println("Roll No: " + roll);
    }

    void regNo(String reg) {
        System.out.println("Registration No: " + reg);
    }

    void cgpa(double cgpa) {
        System.out.println("CGPA: " + cgpa);
    }

    void email(String email) {
        System.out.println("Email: " + email);
    }

    void phone(long phone) {
        System.out.println("Phone: " + phone);
    }

    void address(String address) {
        System.out.println("Address: " + address);
    }

    void city(String city) {
        System.out.println("City: " + city);
    }

    void state(String state) {
        System.out.println("State: " + state);
    }

    void country(String country) {
        System.out.println("Country: " + country);
    }

    void pincode(int pin) {
        System.out.println("Pincode: " + pin);
    }

    void nationality(String nationality) {
        System.out.println("Nationality: " + nationality);
    }

    void religion(String religion) {
        System.out.println("Religion: " + religion);
    }

    void bloodGroup(String bg) {
        System.out.println("Blood Group: " + bg);
    }

    void height(double height) {
        System.out.println("Height: " + height + " cm");
    }

    void weight(double weight) {
        System.out.println("Weight: " + weight + " kg");
    }

    void hobby(String hobby) {
        System.out.println("Hobby: " + hobby);
    }

    void favoriteColor(String color) {
        System.out.println("Favorite Color: " + color);
    }

    void favoriteFood(String food) {
        System.out.println("Favorite Food: " + food);
    }

    void favoriteMovie(String movie) {
        System.out.println("Favorite Movie: " + movie);
    }

    void favoriteHero(String hero) {
        System.out.println("Favorite Hero: " + hero);
    }

    void favoriteSport(String sport) {
        System.out.println("Favorite Sport: " + sport);
    }

    void favoriteBook(String book) {
        System.out.println("Favorite Book: " + book);
    }

    void language(String language) {
        System.out.println("Language: " + language);
    }

    void skill(String skill) {
        System.out.println("Skill: " + skill);
    }

    void strength(String strength) {
        System.out.println("Strength: " + strength);
    }

    void weakness(String weakness) {
        System.out.println("Weakness: " + weakness);
    }

    void goal(String goal) {
        System.out.println("Goal: " + goal);
    }

    void dreamCompany(String company) {
        System.out.println("Dream Company: " + company);
    }

    void programmingLanguage(String pl) {
        System.out.println("Programming Language: " + pl);
    }

    void database(String db) {
        System.out.println("Database: " + db);
    }

    void operatingSystem(String os) {
        System.out.println("Operating System: " + os);
    }

    void project(String project) {
        System.out.println("Project: " + project);
    }

    void internship(String internship) {
        System.out.println("Internship: " + internship);
    }

    void certification(String certification) {
        System.out.println("Certification: " + certification);
    }

    void github(String github) {
        System.out.println("GitHub: " + github);
    }

    void linkedin(String linkedin) {
        System.out.println("LinkedIn: " + linkedin);
    }

    void tenthPercentage(double tenth) {
        System.out.println("10th Percentage: " + tenth);
    }

    void twelfthPercentage(double twelfth) {
        System.out.println("12th Percentage: " + twelfth);
    }

    void graduationPercentage(double grad) {
        System.out.println("Graduation Percentage: " + grad);
    }

    void favoriteTeacher(String teacher) {
        System.out.println("Favorite Teacher: " + teacher);
    }

    void bestFriend(String friend) {
        System.out.println("Best Friend: " + friend);
    }

    void petName(String pet) {
        System.out.println("Pet Name: " + pet);
    }

    void bike(String bike) {
        System.out.println("Bike: " + bike);
    }

    void car(String car) {
        System.out.println("Car: " + car);
    }

    void mobile(String mobile) {
        System.out.println("Mobile: " + mobile);
    }

    void laptop(String laptop) {
        System.out.println("Laptop: " + laptop);
    }

    void favoriteSubject(String subject) {
        System.out.println("Favorite Subject: " + subject);
    }

    void leastFavoriteSubject(String subject) {
        System.out.println("Least Favorite Subject: " + subject);
    }

    void wakeupTime(String time) {
        System.out.println("Wakeup Time: " + time);
    }

    void sleepTime(String time) {
        System.out.println("Sleep Time: " + time);
    }

    void achievement(String achievement) {
        System.out.println("Achievement: " + achievement);
    }

    void ambition(String ambition) {
        System.out.println("Ambition: " + ambition);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClassWithArguments s = new ClassWithArguments();

        System.out.print("Enter Name: ");
        s.name(sc.nextLine());

        System.out.print("Enter Age: ");
        s.age(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Gender: ");
        s.gender(sc.nextLine());

        System.out.print("Enter Father Name: ");
        s.fatherName(sc.nextLine());

        System.out.print("Enter Mother Name: ");
        s.motherName(sc.nextLine());

        System.out.print("Enter College: ");
        s.college(sc.nextLine());

        System.out.print("Enter Branch: ");
        s.branch(sc.nextLine());

        System.out.print("Enter Year: ");
        s.year(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Section: ");
        s.section(sc.nextLine());

        System.out.print("Enter Roll No: ");
        s.rollNo(sc.nextLine());

        System.out.print("Enter CGPA: ");
        s.cgpa(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter Email: ");
        s.email(sc.nextLine());

        System.out.print("Enter Phone: ");
        s.phone(sc.nextLong());
        sc.nextLine();

        System.out.print("Enter Address: ");
        s.address(sc.nextLine());

        System.out.print("Enter City: ");
        s.city(sc.nextLine());

        System.out.print("Enter State: ");
        s.state(sc.nextLine());

        System.out.print("Enter Country: ");
        s.country(sc.nextLine());

        System.out.print("Enter Hobby: ");
        s.hobby(sc.nextLine());

        System.out.print("Enter Goal: ");
        s.goal(sc.nextLine());

        System.out.print("Enter Dream Company: ");
        s.dreamCompany(sc.nextLine());

        System.out.print("Enter Programming Language: ");
        s.programmingLanguage(sc.nextLine());

        System.out.print("Enter Database: ");
        s.database(sc.nextLine());

        System.out.print("Enter Project: ");
        s.project(sc.nextLine());

        System.out.print("Enter Internship: ");
        s.internship(sc.nextLine());

        System.out.print("Enter GitHub: ");
        s.github(sc.nextLine());

        System.out.print("Enter Laptop: ");
        s.laptop(sc.nextLine());

        System.out.print("Enter Mobile: ");
        s.mobile(sc.nextLine());

        System.out.print("Enter Achievement: ");
        s.achievement(sc.nextLine());

        System.out.print("Enter Ambition: ");
        s.ambition(sc.nextLine());

    }
}