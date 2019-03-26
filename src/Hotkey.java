import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

public class Hotkey extends JFrame implements HotkeyListener {

    public static boolean pause;
    private static final int WINDOWS_A = 88;
    private static final int ALT_SHIFT_B = 89;
    private static final int CTRL_SHIFT_C = 90;
    private static final int PRINT_SCREEN = 91;
    private static final int F11 = 92;
    private static final int F12 = 93;
    private static final int SEMICOLON = 94;
    private static final int TICK = 95;

    /**
     * Creates new form.
     */
    public Hotkey () {
        JIntellitype.getInstance().registerHotKey(F11, "F11");
        JIntellitype.getInstance().addHotKeyListener(this);
    }

    /*
     * (non-Javadoc)
     * @see com.melloware.jintellitype.HotkeyListener#onHotKey(int)
     */
    public void onHotKey(int aIdentifier) {
        if ((aIdentifier == F11) && (pause == true)) {
            pause = false;
            Main.matthew.keyPress(KeyEvent.VK_CONTROL);
            Main.matthew.keyPress(KeyEvent.VK_W);
            Main.matthew.delay(100);
            Main.matthew.keyRelease(KeyEvent.VK_CONTROL);
            Main.matthew.keyRelease(KeyEvent.VK_W);
        }
    }

}
