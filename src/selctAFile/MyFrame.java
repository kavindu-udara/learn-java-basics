package selctAFile;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            // create a file chooser
            JFileChooser fileChooser = new JFileChooser();

            // set current directory
            // . -> this will go to project folder
            // fileChooser.setCurrentDirectory(new File("."));
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Kavindu\\Desktop"));

            // show open dialog
            // int response = fileChooser.showOpenDialog(null); // this will select file to open and this will return an int

            // show save dialog
            int response = fileChooser.showSaveDialog(null); // select file to save , this will create a file

            // check file is selcted
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                // sout file location
                System.out.println(file);
            }

        }
    }
}
