package keyboardevent;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard {

    public static void main(String[] args) {
        Frame fr = new Frame("KeyListener Demo");

        // Label to display key events
        Label l = new Label("Press any key...");
        l.setBounds(50, 100, 300, 30);

        fr.setLayout(null);
        fr.add(l);

        // Add KeyListener to the Frame
        fr.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                l.setText("Key Typed: '" + keyChar + "'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                l.setText("Key Released: " + KeyEvent.getKeyText(keyCode));
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                l.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
            }
        });

        // Frame settings
        fr.setSize(400, 300);
        fr.setVisible(true);

        // Ensure frame is focusable to capture key events
        fr.setFocusable(true);
        fr.requestFocus();
    }
}
