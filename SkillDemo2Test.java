import static org.junit.Assert.*;
import org.junit.Test;

/*
javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" SkillDemo2.java SkillDemo2.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore SkillDemo2Test

 javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemo2Test.java SkillDemo2.java
 java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemo2Test 

*/

public class SkillDemo2Test {
    @Test
    public void subtractTest() {
        assertEquals(2,SkillDemo2.subtract(2,4)) ;
    }
}
