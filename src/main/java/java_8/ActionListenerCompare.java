package java_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerCompare {

    public ActionListener makeListener() {
        // Java 7
        ActionListener al7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        };
        // Java 8
        return e -> System.out.println(e.getActionCommand());
    }

    public static void main(String[] args) {
        ActionListenerCompare c = new ActionListenerCompare();
        c.makeListener();
    }
}
