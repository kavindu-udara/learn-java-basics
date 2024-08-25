package menuBar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editManu;
    JMenu helpManu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // set icons
        loadIcon = new ImageIcon("src/icon.png");
        saveIcon = new ImageIcon("src/galaxyIcon.png");
        exitIcon = new ImageIcon("src/icon3.png");

        // create a menu bar
        menuBar = new JMenuBar();

        // create menus
        fileMenu = new JMenu("File");
        editManu = new JMenu("Edit");
        helpManu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editManu);
        menuBar.add(helpManu);

        // submenus
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // set keyboard shortcuts for the submenu
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // exit for exit

        // set icons to menu
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // set shortcuts for menus
        fileMenu.setMnemonic(KeyEvent.VK_F); // ALT + f for file
        editManu.setMnemonic(KeyEvent.VK_E); // ALT + e for edit
        helpManu.setMnemonic(KeyEvent.VK_H); // ALT + h for help

        // add submenus to fileMenu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("beep boop you loaded a file");
        }
        if (e.getSource() == saveItem) {
            System.out.println("beep boop you saved a file");
        }
        if (e.getSource() == exitItem) {
            System.out.println("System exit");
            System.exit(0);
        }
    }

}
