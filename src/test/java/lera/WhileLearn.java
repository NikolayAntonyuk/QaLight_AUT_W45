package lera;

import org.testng.annotations.Test;

public class WhileLearn {
    @Test(groups = "test1", priority = 1)
    private void testMyMethod() {
        HomeTasks home = new HomeTasks();
        home.whileTask(50, 2);
    }

}
