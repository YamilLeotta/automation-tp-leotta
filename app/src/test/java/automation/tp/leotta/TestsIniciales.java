package automation.tp.leotta;

import org.testng.Assert;
import org.testng.annotations.Test;

class TestsIniciales {
    @Test void saludo() {
        App classUnderTest = new App();
        Assert.assertNotNull(classUnderTest.getGreeting(), "La aplicación no envió el saludo :(");
    }
}
