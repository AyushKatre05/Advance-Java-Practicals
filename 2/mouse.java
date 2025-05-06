package mouseevent;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse {

    public static void main(String[] args) {
        Frame f = new Frame("MouseListener Demo");

        // Label to show event text
        Label la = new Label("Interact with the Frame using the mouse");
        la.setBounds(100, 100, 300, 50);

        f.setLayout(null);
        f.add(la);

        f.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                la.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
                f.setBackground(Color.CYAN);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                la.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
                f.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                la.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
                f.setBackground(Color.MAGENTA);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                la.setText("Mouse Entered the Frame");
                f.setBackground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                la.setText("Mouse Exited the Frame");
                f.setBackground(Color.LIGHT_GRAY);
            }
        });

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
