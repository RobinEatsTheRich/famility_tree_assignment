import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {


    private Person person;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        //I don't fit in the sex binary, but I'll make it simple for ya.

        //Act
        String result = robin.getName();
        //By simply typing "result", I save myself some typing!

        //Assert
        assertEquals("Robin", result);
    }

    @Test
    void setName() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);

        //Act
        robin.setName("Heather");
        //Always liked that name for myself
        String result = robin.getName();

        //Assert
        assertEquals("Heather", result);
    }

    @Test
    void getMiddleName() {
        //Arrange
        Person robin = new Person("Robin","Gamer","van Asselt",'f',24);

        //Act
        String result = robin.getMiddleName();

        //Assert
        assertEquals("Gamer", result);
    }

    @Test
    void setMiddleName() {
        //Arrange
        Person robin = new Person("Robin","Gamer","van Asselt",'f',24);

        //Act
        robin.setMiddleName("Banjo Gamer");
        String result = robin.getMiddleName();

        //Assert
        assertEquals("Banjo Gamer", result);
    }

    @Test
    void getLastName() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);

        //Act
        String result = robin.getLastName();

        //Assert
        assertEquals("van Asselt", result);
    }

    @Test
    void setLastName() {
        //Arrange
        Person robin = new Person("Robin","Gamer","van Asselt",'f',24);

        //Act
        robin.setLastName("Den Toom");
        String result = robin.getLastName();

        //Assert
        assertEquals("Den Toom", result);
    }

    @Test
    void getSex() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);

        //Act
        int result = robin.getSex();

        //Assert
        assertEquals('f', result);
    }

    @Test
    void setSex() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'m',24);

        //Act
        robin.setSex('f');
        //true story!

        char result = robin.getSex();

        //Assert
        assertEquals('f', result);
    }

    @Test
    void getAge() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);

        //Act
        int result = robin.getAge();

        //Assert
        assertEquals(24, result);
    }

    @Test
    void setAge() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);

        //Act
        robin.setAge(25);
        int result = robin.getAge();

        //Assert
        assertEquals(25, result);
    }

    @Test
    void getMother() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);
        Person ron = new Person("Ron","Antonie Hendrick","Van Asselt",'m',48);
        robin.addParents(marjolein,ron);

        //Act
        String result = robin.getMother().getName();

        //Assert
        assertEquals("Marjolein", result);
    }

    @Test
    void setMother() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);

        //Act
        robin.setMother(marjolein);
        Person result = robin.getMother();

        //Assert
        assertEquals(marjolein, result);
    }

    @Test
    void getFather() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);
        Person ron = new Person("Ron","Antonie Hendrick","Van Asselt",'m',48);
        robin.addParents(marjolein,ron);

        //Act
        String result = robin.getFather().getName();

        //Assert
        assertEquals("Ron", result);
    }

    @Test
    void setFather() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person ron = new Person("Ron","Antonie Hendrick","Van Asselt",'m',48);

        //Act
        robin.setFather(ron);
        Person result = robin.getFather();

        //Assert
        assertEquals(ron, result);
    }

    @Test
    void addParents() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);
        Person ron = new Person("Ron","Antonie Hendrick","Van Asselt",'m',48);

        //Act
        robin.addParents(marjolein,ron);
        String result = robin.getMother().getName();

        //Assert
        assertEquals("Marjolein", result);
    }

    @Test
    void getSiblings() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        robin.AddSibling(nienke);
        ArrayList<Person> hypothesis = new ArrayList<Person>();
        hypothesis.add(nienke);

        //Act
        ArrayList<Person> result = robin.getSiblings();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void setSiblings() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        ArrayList<Person> newSiblings = new ArrayList<Person>();
        newSiblings.add(nienke);

        //Act
        robin.setSiblings(newSiblings);
        ArrayList<Person> result = robin.getSiblings();

        //Assert
        assertEquals(newSiblings, result);
    }

    @Test
    void addSibling() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        ArrayList<Person> hypothesis = new ArrayList<Person>();
        hypothesis.add(nienke);

        //Act
        robin.AddSibling(nienke);
        ArrayList<Person> result = robin.getSiblings();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void getChildren() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);

        marjolein.addChild(robin);
        marjolein.addChild(nienke);

        ArrayList<Person> hypothesis = new ArrayList<Person>();
        hypothesis.add(robin);
        hypothesis.add(nienke);

        //Act
        ArrayList<Person> result = marjolein.getChildren();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void setChildren() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);

        ArrayList<Person> newChildren = new ArrayList<Person>();
        newChildren.add(robin);
        newChildren.add(nienke);

        //Act
        marjolein.setChildren(newChildren);
        ArrayList<Person> result = marjolein.getChildren();

        //Assert
        assertEquals(newChildren, result);
    }

    @Test
    void addChild() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);

        ArrayList<Person> hypothesis = new ArrayList<Person>();
        hypothesis.add(robin);

        //Act
        marjolein.addChild(robin);
        ArrayList<Person> result = marjolein.getChildren();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void getGrandChildren() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Person nienke = new Person("Nienke","van Asselt",'f',22);
        Person marjolein = new Person("Marjolein","Magdalena","Den Toom",'f',47);
        Person opa = new Person("Pieter","Christiaan","Den Toom",'m',75);

        marjolein.addChild(robin);
        marjolein.addChild(nienke);
        opa.addChild(marjolein);

        ArrayList<Person> hypothesis = new ArrayList<Person>();
        hypothesis.add(robin);
        hypothesis.add(nienke);

        //Act
        ArrayList<Person> result = opa.getGrandChildren();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void getPets() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Pet bongo = new Pet("Bongo",53,"Tortoise");
        robin.addPet(bongo);
        ArrayList<Pet> hypothesis = new ArrayList<>();
        hypothesis.add(bongo);

        //Act
        ArrayList<Pet> result = robin.getPets();

        //Assert
        assertEquals(hypothesis, result);
    }

    @Test
    void setPets() {
        //Arrange
        Person robin = new Person("Robin","van Asselt",'f',24);
        Pet bongo = new Pet("Bongo",53,"Tortoise");
        ArrayList<Pet> newPets = new ArrayList<>();
        newPets.add(bongo);

        //Act
        robin.setPets(newPets);
        ArrayList<Pet> result = robin.getPets();

        //Assert
        assertEquals(newPets, result);
    }

    @Test
    void addPet() {
        Person robin = new Person("Robin","van Asselt",'f',24);
        Pet bongo = new Pet("Bongo",53,"Tortoise");
        ArrayList<Pet> hypothesis = new ArrayList<>();
        hypothesis.add(bongo);

        //Act
        robin.addPet(bongo);
        ArrayList<Pet> result = robin.getPets();

        //Assert
        assertEquals(hypothesis, result);
    }

}
