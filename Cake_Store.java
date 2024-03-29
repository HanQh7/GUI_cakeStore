package h1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cake_Store {
JFrame frame; 
JPanel panel1Product,panelInfo;
JLabel Labelinfo,lb3addres,lb1,lb2;
JRadioButton Rd2;
JRadioButton Rd1;
JTextField cityField;
JTextField addressField;
JButton confirmBtn;
JButton cancelBtn;
public HaneenHussainStore() {
frame = new JFrame(" Haneen Hussain Ali ,section 2750");
frame.setLayout(new BorderLayout()
);
frame.setSize(400, 350);
Rd2 = new JRadioButton("Cake 1");
lb1=new JLabel();
lb1.setIcon( getImage("Cake1.jpg")
); 
lb2=new JLabel();
lb2.setIcon( getImage("Cake2.jpg")
);
Rd1 = new JRadioButton("Cake 2");
ButtonGroup group = new ButtonGroup();
group.add(Rd2);
group.add(Rd1);
panel1Product=new JPanel(new GridLayout(2,1)
);
panelInfo=new JPanel(new GridLayout(3,2)
);
panel1Product.setBorder(BorderFactory.createTitledBorder("Choose Of Type Prodcut"));
 
panelInfo.setBorder(BorderFactory.createTitledBorder("Add Info : ")
); 
cityField = new JTextField(10);
addressField = new JTextField(10);
confirmBtn = new JButton("Confirm");
cancelBtn = new JButton("Cancel");
Labelinfo=new JLabel("Enter Cety:");
lb3addres=new JLabel("Enter address:");
panel1Product.add(lb1);
panel1Product.add(Rd2);
panel1Product.add(lb2);
panel1Product.add(Rd1);
frame.add(panel1Product,BorderLayout.EAST);
panelInfo.add(lb3addres);
panelInfo.add(addressField);
panelInfo.add(Labelinfo);
panelInfo.add(cityField);
panelInfo.add(confirmBtn);
panelInfo.add(cancelBtn);
frame.add(panelInfo,BorderLayout.WEST);

confirmBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (!Rd1.isSelected() && !Rd2.isSelected()) {
            JOptionPane.showMessageDialog(null, "You must select one item.");
            return;
        }
        if (cityField.getText().isEmpty() || addressField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "You must write address info.");
            return;
        }
        String str="You have selected " +
            (Rd2.isSelected() ? "cake 1" : "cake 2")
            + " and your city is " + cityField.getText()+" and your Address "+ 
            addressField.getText();
        JOptionPane.showMessageDialog(null, str);
    }
});
cancelBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Are you sure you want to cancel your order?");
        Rd1.setSelected(false);
        Rd2.setSelected(false);
        cityField.setText("");
        System.exit(0); // Terminate the frame
    }
});
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
public ImageIcon getImage(String imag) {
int targetWidth = 100;
int targetHeight = 100;
ImageIcon logoIcon1 = new ImageIcon(imag);
Image image1 = logoIcon1.getImage();
Image resizedImage1 = image1.getScaledInstance(targetWidth, targetHeight, 
Image.SCALE_SMOOTH);
ImageIcon resizedIcon1 = new ImageIcon(resizedImage1);
return resizedIcon1;
}
public static void main(String[] args) {
new HaneenHussainStore();
}
}
