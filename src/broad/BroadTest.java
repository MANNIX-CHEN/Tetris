package broad;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.lang.System.exit;

public class BroadTest extends Frame {
    //窗口位置
    int x = 100;
    int y = 100;

    // 程序窗口大小
    public static final int WIDTH = 400;
    public static final int HEIGHT = 500;

    public void init(){
     this.setLocation(x,y);
     this.setSize(WIDTH,HEIGHT);

     this.addWindowListener(
         new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                exit(0);
            }
        }

     );
    }
}
