//package nl.novi.jp;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings;
    private ArrayList<Person> children;
    private ArrayList<Pet> pets;

    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age() {
        this.age++;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addParents(Person mother, Person father){
        this.setMother(mother);
        this.setFather(father);
        mother.addChild(this);
        father.addChild(this);
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public void AddSibling(Person sibling){
        ArrayList<Person> tempSiblings = new ArrayList<>();
        if(this.getSiblings() != null){
            tempSiblings.addAll(this.getSiblings());
        }
        tempSiblings.add(sibling);
        this.setSiblings(tempSiblings);
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void addChild(Person child) {
        ArrayList<Person> tempChildren = new ArrayList<>();
        if(this.getChildren() != null){
            tempChildren.addAll(this.getChildren());
        }
        tempChildren.add(child);
        this.setChildren(tempChildren);
        if (this.getSex() == 'f' && child.getMother() != this){
            child.setMother(this);
        } else if (child.getFather() != this){
            child.setFather(this);
        }
    }

    public ArrayList<Person> getGrandChildren(){
        ArrayList<Person> grandChildren = new ArrayList<>();
        if (this.getChildren()!= null){
            for (Person child : this.getChildren()) {
                if (child.getChildren()!= null){
                    for (Person grandChild : child.getChildren()) {
                        grandChildren.add(grandChild);
                    }
                }
            }
        }
        return  grandChildren;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    public void addPet(Pet pet){
        ArrayList<Pet> tempPets = new ArrayList<>();
        if(this.getPets() != null){
            tempPets.addAll(this.getPets());
        }
        tempPets.add(pet);
        this.setPets(tempPets);
    }
}
