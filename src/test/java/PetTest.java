import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        //Arrange
        Pet Alma = new Pet("Alma",4,"Cat");

        //Act
        String name = Alma.getName();

        //Assert
        assertEquals("Alma", name);
    }

    @Test
    void setName() {
        //Arrange
        Pet bongo = new Pet("Bongo",53,"Tortoise");

        //Act
        bongo.setName("Pangea");
        String name = bongo.getName();

        //Assert
        assertEquals("Pangea", name);
    }

    @Test
    void getAge() {
        //Arrange
        Pet Alma = new Pet("Alma",4,"Cat");

        //Act
        int age = Alma.getAge();

        //Assert
        assertEquals(4, age);
    }

    @Test
    void setAge() {
        //Arrange
        Pet bongo = new Pet("Bongo",53,"Tortoise");

        //Act
        bongo.setAge(67);
        int age = bongo.getAge();

        //Assert
        assertEquals(67, age);
    }

    @Test
    void getSpecies() {
        //Arrange
        Pet Alma = new Pet("Alma",4,"Cat");

        //Act
        String species = Alma.getSpecies();

        //Assert
        assertEquals("Cat", species);
    }

    @Test
    void setSpecies() {
        //Arrange
        Pet bongo = new Pet("Bongo",53,"Tortoise");

        //Act
        bongo.setSpecies("Turtle");
        String species = bongo.getSpecies();

        //Assert
        assertEquals("Turtle", species);
    }

    @Test
    void getOwner() {
        //Arrange
        Pet Alma = new Pet("Alma",4,"Cat");

        //Act
        Person owner = Alma.getOwner();

        //Assert
        assertEquals(null, owner);
    }

    @Test
    void setOwner() {
        //Arrange
        Pet bongo = new Pet("Bongo",53,"Tortoise");
        Person robin = new Person("Robin","van Asselt",'f',24);
        //I don't fit in the sex binary, but I'll make it simple for ya.

        //Act
        bongo.setOwner(robin);
        String ownerName = bongo.getOwner().getName();

        //Assert
        assertEquals("Robin", ownerName);
    }
}