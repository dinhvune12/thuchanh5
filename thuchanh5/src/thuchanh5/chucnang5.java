package thuchanh5;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class chucnang5 extends JFrame{

	public chucnang5() {
        setTitle("Form chuc nang 5");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

            }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
    	chucnang5 frame = new chucnang5();
        frame.setVisible(true);
    }

}
