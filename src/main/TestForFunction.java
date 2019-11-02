package main    ;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TestForFunction {

    //创建一个窗口，在窗口中添加一个按钮，按钮点击时，在JLabel输出helloword
    public static void main(String[] args) {
        //1.创建一个窗口(JFrame)
        JFrame frame=new JFrame("监听器例子");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 掉窗口推出java程序
        //2.设置窗口的位置和大小
        frame.setLocation(500, 500);
        frame.setSize(300, 250);
        //3.创建一个JLable和按钮
        final JLabel label=new JLabel("未点击");
        JButton btn=new JButton("点我!");
        //5.将按钮添加到窗口中
        frame.add(label);
        frame.add(btn);
        //6.创建一个监听器

        ActionListener listener = new ActionListener() {
            //事件处理器
            public void actionPerformed(ActionEvent e) {
                label.setText("HelloWord");
                System.out.println("HelloWord");
            }
        };
        /**
         * 事件源:按钮
         * 事件:按钮被点击
         * 监听器:Listener
         * 将监听器注册到按钮(事件源)上，监听器将会一直监听(监视)按钮的状态变化，一旦按钮被
         * 点击（事件发生），将会通知监听器，监听器将会调用特定的方法处理"按钮被点击"
         * 事件
         */
        //7.注册监听器(让监听器监听指定的按钮)
        btn.addActionListener(listener);
        //8.设置窗口为显示(状态)
        frame.setVisible(true);

    }

}