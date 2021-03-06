/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbyte.me;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cam
 */
public class MenuFrame extends JFrame implements ActionListener{
    
    private final JMenuBar menuBar;
    private JMenuItem menuItem; //used for all menu items
    
    private final JMenu fileMenu;
    private final JMenu menuShip;
    private final JMenu menuPort;
    private final JMenu menuMonster;
    
    private final JMenuItem menuitemAbout;

    private JTextArea messageBox;
    
    // Constants defining the file menu name and items
    public final static String labelFile = "File";
    public final static String commandOpen = "Open";
    public final static String commandExit = "Exit";
    public final static String commandClose ="Close";
    public final static String commandSnapShot = "SnapShot";
    
    //Constants defining the ship menu name and items
    public final static String labelShip = "Ship";
    public final static String commandGenerateShips = "Generate Ships";
    public final static String commandUpdateShips = "Update Ships";
    public final static String commandDisplayAllShips ="Display All Ships";
    public final static String commandRemoveAllShips = "Remove All Ships";
    
    // Constants defining the port menu name and associated items
    public final static String labelPort = "Port";
    public final static String commandUnloadShip = "Unload Ship";
    public final static String commandUpdateDock = "Update Dock";
    public final static String commandDisplayAllDocks ="Display All Docks";
    public final static String commandDisplayAllCargo = "Display All Cargos";
    
    // constants defining the monster menu and associate items
    public final static String labelMonster = "Monster";
    public final static String commandGenerateMonsters = "Generate Monster";
    public final static String commandUpdateMonsters = "Update Monsters";
    public final static String commandDisplayAllMonsters ="Display All Monsters";
    public final static String commandRemoveAllMonsters = "Remove All Monsters";
    public final static String commandSummonGodzilla = "Summon Godzilla";
    
    public final static String commandAbout = "About";
    
    //used to create the menu items for the menu passed
    public final void createMenuItems(String[] items, JMenu menu){
        for(int i = 0; i < items.length; i++){
            this.menuItem = new JMenuItem(items[i]);
            this.menuItem.addActionListener(MenuFrame.this);
            menu.add(this.menuItem);
        }
    }
    
    
    public MenuFrame()
    {
        MenuFrame.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        MenuFrame.this.getContentPane().setBackground(Color.CYAN);
        
        
        //Creates teh menubar to hold the menus and items
        menuBar = new JMenuBar();
        
        //Creates the file menu
        fileMenu = new JMenu(labelFile);
        fileMenu.setMnemonic('F');
        
        //Creates the components for the file menu and adds them to the menu
        String[] menuItems = {commandOpen, commandClose, commandSnapShot, commandExit};
        createMenuItems(menuItems, fileMenu);
        
        
        //Creates the ship Menu
        menuShip = new JMenu(labelShip);
        menuShip.setMnemonic('S');
        
        //creates the components for the ship menu
        String[] shipItems = {commandGenerateShips, commandUpdateShips, commandDisplayAllShips, commandRemoveAllShips};
        createMenuItems(shipItems, menuShip);
        
        
        //Creates the port menu
        menuPort = new JMenu(labelPort);
        menuPort.setMnemonic('P');        
        
        //creates the components for the port menu
        String[] portItems = {commandUnloadShip, commandUpdateDock, commandDisplayAllDocks, commandDisplayAllCargo};
        createMenuItems(portItems, menuPort);
        
        //creates the monster menu
        menuMonster = new JMenu(labelMonster);
        menuMonster.setMnemonic('M');
        
        //creates the components for the monster menu
        String[] monsterItems = {commandGenerateMonsters, commandUpdateMonsters, commandDisplayAllMonsters, commandRemoveAllMonsters, commandSummonGodzilla};
        createMenuItems(monsterItems, menuMonster);
        
        menuitemAbout=new JMenuItem(commandAbout);
        menuitemAbout.addActionListener(MenuFrame.this);
                
        // Add the menus onto the menubar and the about button
        menuBar.add(fileMenu);
        menuBar.add(menuShip);
        menuBar.add(menuPort);
        menuBar.add(menuMonster);
        menuBar.add(menuitemAbout);
        this.setJMenuBar(menuBar);
        
        //Create the root Layout for the window
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        
        //Creates an textArea
        messageBox = new JTextArea(8,200);//text area being created with a set size
        messageBox.setEditable(false);// makes it uneditable for the user
        JScrollPane scrollbar = new JScrollPane (messageBox, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//puts it in a scrollpane with a vertical scrollbar
        this.add(scrollbar,BorderLayout.SOUTH);
        
        //Puts the group name on the window
        this.setTitle("Byte Me Project");
        
        // Sets the size of the main window        
        Dimension size = new Dimension(800,600);
        this.setSize(size);
        this.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        switch(command)
        {
            case commandOpen:
                System.out.println("open");
                break;
            case commandClose:
                System.out.println("close");
                break;
            case commandSnapShot:
                System.out.println("shap shot");
                break;
            case commandExit:
                System.exit(0);
                break;
            case commandGenerateShips:
                System.out.println("generate ships");
                break;
            case commandUpdateShips:
                System.out.println("update ships");
                break;
            case commandDisplayAllShips:
                System.out.println("display all ships");
                break;
            case commandUnloadShip:
                System.out.println("unload ship");
                break;
            case commandUpdateDock:
                System.out.println("update dock");
                break;
            case commandDisplayAllDocks:
                System.out.println("display all docks");
                break;
            case commandDisplayAllCargo:
                System.out.println("display all cargo");
                break;
            case commandGenerateMonsters:
                System.out.println("generate monsters");
                break;
            case commandUpdateMonsters:
                System.out.println("update monsters");
                break;
            case commandDisplayAllMonsters:
                System.out.println("display all monsters");
                break;
            case commandRemoveAllMonsters:
                System.out.println("remove all monsters");
                break;
            case commandSummonGodzilla:
                System.out.println("summon godzilla");
                break;
            case commandAbout:
                String about = "Byte Me\nCSE 1325-002\nApril 17,2015\n\nName: Cam Nguyen\nID: ?\n\nName: Pauline Nguyen\n ID: ?\n\nName: Zach Niemann\nID: 1000625866\n\n";
                JOptionPane.showMessageDialog(null, about, "About Us", JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }
}
