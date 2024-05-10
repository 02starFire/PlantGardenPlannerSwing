import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
    JFrame frame;
    JPanel panelL;
    JPanel panelR;

    JPanel vegetablePanel = new JPanel();
    JPanel fruitPanel = new JPanel();
    JPanel flowerPanel = new JPanel();

    JLabel SelectedPlant;


    JTextArea FlowerPlan = new JTextArea();
    JTextArea VegetablePlan = new JTextArea();
    JTextArea FruitPlan = new JTextArea();


    JLabel VegetableLabel = new JLabel("Enter Vegetable Name:      ");
    JLabel VegetableLabel1 = new JLabel("Enter the color of the Vegetable:    ");

    JTextField VegetableName = new JTextField(10);
    JTextField VegetableColor = new JTextField(10);

    JLabel FruitLabel = new JLabel("Enter Fruit Name:       ");
    JLabel fruitLabel1 = new JLabel("Enter the color of the Fruit:         ");

    JTextField FruitName = new JTextField(10);
    JTextField FruitColor = new JTextField(10);

    JLabel FlowerLabel = new JLabel("Enter Flower name:     ");
    JLabel FlowerLabel1 = new JLabel("Enter the color of the flower:  ");
    JLabel FlowerLabel2 = new JLabel("Smell intensity of the flower:   ");
    JLabel FlowerLabel3 = new JLabel("Enter the duration time: ");
    JTextField FlowerName = new JTextField(10);
    JTextField FlowerColor = new JTextField(10);
    JTextField FlowerDuration = new JTextField(10);

    //Calendar
    String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"
            , "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    JComboBox CalendarDay = new JComboBox<>(days);
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    JComboBox CalendarMonth = new JComboBox<>(months);
    String[] years = {"2024", "2025", "2026", "2027", "2028", "2029", "2030"};
    JComboBox CalendarYear = new JComboBox<>(years);


    JButton Add = new JButton("Add");
    JButton Search = new JButton("Search");
    JButton VegetableSubmit = new JButton("Submit");
    JButton FlowerSubmit = new JButton("Submit");
    JButton FruitSubmit = new JButton("Submit");
    JButton Reset = new JButton("Reset");
    String[] plantArray = {"Fruit", "Vegetable", "Flower"};
    JComboBox<String> PlantSelect = new JComboBox<>(plantArray);

    String[] intensityArray = {"very weak", "weak", "medium", "strong", "very strong"};
    JComboBox<String> SmellSelect = new JComboBox<>(intensityArray);

    public GUI() {
    /*
    First 3 of the plans is given by this code
    */
        FlowerPlan.append("Rose,Red,weak,12,August,2024,45mins");
        FlowerPlan.append("\n");
        FlowerPlan.append("Lilac,Purple,strong,11,August,2024,60mins");
        FlowerPlan.append("\n");
        FlowerPlan.append("Jasmine,White,medium,10,August,2024,30mins");
        FlowerPlan.append("\n");
        FruitPlan.append("Apple,Red");
        FruitPlan.append("\n");
        FruitPlan.append("Tangerine,Orange");
        FruitPlan.append("\n");
        FruitPlan.append("Lemon,Yellow");
        FruitPlan.append("\n");
        VegetablePlan.append("Lettuce,Green");
        VegetablePlan.append("\n");
        VegetablePlan.append("Onion,White");
        VegetablePlan.append("\n");
        VegetablePlan.append("Cabbage,Green");

        frame = new JFrame("Gardening Planner");
        panelR = new JPanel();
        panelR.setLayout(new GridLayout(1, 1));
        panelL = new JPanel();
        SelectedPlant = new JLabel("Select Plant");
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(1, 2));
        panelL.setLayout(new GridLayout(2, 1));
        frame.add(panelL);
        frame.add(panelR);
        JPanel panelLN = new JPanel(new BorderLayout());
        JPanel panelLS = new JPanel(new BorderLayout());
        panelL.add(panelLN);
        panelL.add(panelLS);
        JPanel panelLNC = new JPanel();
        JPanel panelLSN = new JPanel();
        panelLN.add(panelLNC, BorderLayout.CENTER);
        panelLS.add(panelLSN, BorderLayout.CENTER);
        FlowerPlan.setEditable(false);
        panelLNC.add(SelectedPlant);
        panelLNC.add(PlantSelect);
        panelLSN.add(Add);
        panelLSN.add(Reset);
        Add.addActionListener(l);
        Reset.addActionListener(l);
        panelLSN.add(Search);
        Search.addActionListener(l);
        VegetableSubmit.addActionListener(l);
        FlowerSubmit.addActionListener(l);
        FruitSubmit.addActionListener(l);
    }

    ActionListener l = new ActionListener() { //ActionListener for use in constructor
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == CalendarDay || e.getSource() == CalendarMonth || e.getSource() == CalendarYear) {

            }
            if (e.getSource() == Add && PlantSelect.getSelectedItem().equals("Vegetable")) {
                JPanel vegetablePanel1 = new JPanel();
                JPanel vegetablePanel2 = new JPanel();
                JPanel vegetablePanel3 = new JPanel();
                vegetablePanel1.setLayout(new GridBagLayout());
                panelR.add(vegetablePanel);
                vegetablePanel.setLayout(new GridLayout(3, 1));
                vegetablePanel.add(vegetablePanel1);
                vegetablePanel.add(vegetablePanel2);
                vegetablePanel.add(vegetablePanel3);
                vegetablePanel1.add(VegetableLabel);
                VegetableName.setEditable(true);
                vegetablePanel1.add(VegetableName);
                VegetableName.setSize(50, 10);
                vegetablePanel2.add(VegetableLabel1);
                VegetableColor.setEditable(true);
                vegetablePanel2.add(VegetableColor);
                VegetableColor.setSize(50, 10);
                vegetablePanel3.add(VegetableSubmit);
                frame.revalidate();
                frame.repaint();
            }
            if (e.getSource() == Add && PlantSelect.getSelectedItem().toString() == "Flower") {
                panelR.add(flowerPanel);
                flowerPanel.setLayout(new GridLayout(6, 1));
                JPanel flowerPanel1 = new JPanel();
                JPanel flowerPanel2 = new JPanel();
                JPanel flowerPanel3 = new JPanel();
                JPanel flowerPanel4 = new JPanel();
                JPanel flowerPanel5 = new JPanel();
                JPanel flowerPanel6 = new JPanel();
                flowerPanel1.setLayout(new GridBagLayout());
                flowerPanel.add(flowerPanel1);
                flowerPanel1.setLayout(new GridBagLayout());
                flowerPanel.add(flowerPanel2);
                flowerPanel.add(flowerPanel3);
                flowerPanel.add(flowerPanel4);
                flowerPanel.add(flowerPanel5);
                flowerPanel.add(flowerPanel6);
                flowerPanel1.add(FlowerLabel);
                FlowerName.setEditable(true);
                flowerPanel1.add(FlowerName);
                FlowerName.setSize(50, 10);
                flowerPanel2.add(FlowerLabel1);
                FlowerColor.setEditable(true);
                flowerPanel2.add(FlowerColor);
                FlowerColor.setSize(50, 10);
                flowerPanel3.add(FlowerLabel2);
                flowerPanel3.add(SmellSelect);
                flowerPanel4.setLayout(new GridBagLayout());
                flowerPanel4.add(CalendarDay);
                flowerPanel4.add(CalendarMonth);
                flowerPanel4.add(CalendarYear);
                flowerPanel5.add(FlowerLabel3);
                flowerPanel5.add(FlowerDuration);
                flowerPanel6.add(FlowerSubmit);
                frame.revalidate();
                frame.repaint();


            } else if (e.getSource() == Add && PlantSelect.getSelectedItem().toString() == "Fruit") {
                JPanel fruitPanel1 = new JPanel();
                JPanel fruitPanel2 = new JPanel();
                JPanel fruitPanel3 = new JPanel();
                fruitPanel1.setLayout(new GridBagLayout());
                panelR.add(fruitPanel);
                fruitPanel.setLayout(new GridLayout(3, 1));
                fruitPanel.add(fruitPanel1);
                fruitPanel.add(fruitPanel2);
                fruitPanel.add(fruitPanel3);
                fruitPanel1.add(FruitLabel);
                FruitName.setEditable(true);
                fruitPanel1.add(FruitName);
                FruitName.setSize(50, 10);
                fruitPanel2.add(fruitLabel1);
                FruitColor.setEditable(true);
                fruitPanel2.add(FruitColor);
                FruitColor.setSize(50, 10);
                fruitPanel3.add(FruitSubmit);
                frame.revalidate();
                frame.repaint();
            } else if (e.getSource() == Search && PlantSelect.getSelectedItem().equals("Vegetable")) {
                panelR.remove(vegetablePanel);
                panelR.add(VegetablePlan, 0);
                frame.revalidate();
                frame.repaint();
                panelR.setVisible(true);
            } else if (e.getSource() == Search && PlantSelect.getSelectedItem().equals("Flower")) {
                panelR.remove(flowerPanel);
                panelR.add(FlowerPlan);
                frame.revalidate();
                frame.repaint();
                panelR.setVisible(true);
            } else if (e.getSource() == Search && PlantSelect.getSelectedItem().equals("Fruit")) {
                panelR.remove(fruitPanel);
                panelR.add(FruitPlan);
                frame.revalidate();
                frame.repaint();
                panelR.setVisible(true);

            } else if (e.getSource() == VegetableSubmit && PlantSelect.getSelectedItem().equals("Vegetable")) {
                String s = "";
                s = VegetableName.getText() + "," + VegetableColor.getText();
                VegetablePlan.setEditable(false);
                VegetablePlan.append(s);
                VegetablePlan.append("\n");
            } else if (e.getSource() == FlowerSubmit && PlantSelect.getSelectedItem().equals("Flower")) {
                String s = "";
                s = FlowerName.getText() + "," + FlowerColor.getText() + "," + SmellSelect.getSelectedItem() + ","
                        + CalendarDay.getSelectedItem() + "," + CalendarMonth.getSelectedItem() +
                        "," + CalendarYear.getSelectedItem() + "," + FlowerDuration.getText();
                FlowerPlan.setEditable(false);
                FlowerPlan.append(s);
                FlowerPlan.append("\n");
            } else if (e.getSource() == FruitSubmit && PlantSelect.getSelectedItem().equals("Fruit")) {
                String s = "";
                s = FruitName.getText() + "," + FruitColor.getText();
                FruitPlan.setEditable(false);
                FruitPlan.append(s);
                FruitPlan.append("\n");
            }


            if (e.getSource() == Reset) {
                panelR.removeAll();
                frame.revalidate();
                frame.repaint();
                panelR.setLayout(new GridLayout(1, 1));
                fruitPanel.removeAll();
                vegetablePanel.removeAll();
                flowerPanel.removeAll();
            }
        }
    };
}