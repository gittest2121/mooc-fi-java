import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("This is a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("This is a test");
        assertTrue(management.exerciseList().contains("This is a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("This is a test");
        management.markAsCompleted("This is a test");
        assertTrue(management.isCompleted("This is a test"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("This is a test");
        assertFalse(management.isCompleted("This is a test"));
    }
    
    @Test
    public void exerciseCanBeRemoved() {
        management.add("Tested 1");
        management.add("Exercise 2");
        management.add("Exercises Last - 3");
        management.remove("Exercise 2");
        
        assertEquals(2, management.exerciseList().size());
        assertFalse(management.exerciseList().contains("Exercise 2"));
        assertFalse(management.isCompleted("Exercise 2"));
    }
    
    @Test
    public void completedExerciseIsNotRemoved() {
        management.add("Tested 1");
        management.add("Exercise 2");
        management.add("Exercises Last - 3");
        
        management.markAsCompleted("Exercise 2");
        
        management.remove("Exercise 2");
       
        assertEquals(3, management.exerciseList().size());
        assertTrue(management.exerciseList().contains("Exercise 2"));
        assertTrue(management.isCompleted("Exercise 2"));
    }
}