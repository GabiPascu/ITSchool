package ro.itschool.project.unit_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ro.itschool.project.unit_test.DependencyOne;
import ro.itschool.project.unit_test.DependencyTwo;
import ro.itschool.project.unit_test.MyClass;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyClassTest {

    @Mock
    private DependencyOne dependencyOne;

    @Mock
    private DependencyTwo dependencyTwo;

    @InjectMocks
    private MyClass myClass;

    @Test
    void testUseDependencies() {
        //GIVEN
        when(dependencyOne.doSomething()).thenReturn("Mocked DependencyOne");
        when(dependencyTwo.doSomething()).thenReturn("Mocked DependencyTwo");


        //WHEN
        String result = myClass.useDependencies();


        //THEN
        Assertions.assertEquals("Mocked DependencyOne Mocked DependencyTwo", result);
    }
}