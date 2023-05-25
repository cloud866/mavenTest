package ru.skillfactory;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FileOperatorTest {

    @Test
    public void testWhenWeReadFileShouldGetSomeData() throws IOException {
        //A - assign
        //A - action
        //A - assert
        FileOperator fileOperator = new FileOperator();
        String line = fileOperator.read("/Users/Happy/12/1.txt");
        //assertEquals("SkillFactory", line);
        assertThat("Could not read file", line, is("SkillFactory"));
    }

    @Test
    public void testWhenWeReadFileAsLineShouldGetNotEmptyCollection() throws IOException {
        //A - assign
        //A - action
        //A - assert
        FileOperator fileOperator = new FileOperator();
        List<String> strings = fileOperator.readAsList("/Users/Happy/12/1.txt");
        //assertEquals("SkillFactory", line);
        assertThat("Could not read file", strings.size(), is(1));
    }

    @Test
    public void writeToFileTest() throws IOException {
        //A - assign
        //A - action
        //A - assert
        FileOperator fileOperator = new FileOperator();
        fileOperator.write("Zoom", "/Users/Happy/12/2.txt");
        //assertEquals("SkillFactory", line);
        String readData = fileOperator.read("/Users/Happy/12/2.txt");
        assertThat("Could not read file", readData, is("Zoom"));
    }
}