
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class course extends Frame implements ActionListener
{
    Label lb_title,lb_course;
    Choice ch_course;
    Button but_produce,but_close;
    course()
    {
        setSize(900,800);
        setVisible(true);
        setLayout(null);
        lb_title=new Label("Producing course wise student information");
        lb_course=new Label("Select course");
        ch_course=new Choice();
        ch_course.add("");
        ch_course.add("FE Comp");
        ch_course.add("FE Mech");
        ch_course.add("FE ETC");
        ch_course.add("FE Civil");
        ch_course.add("FE IT");
        ch_course.add("SE Comp");
        ch_course.add("SE Mech");
        ch_course.add("SE IT");
        ch_course.add("SE ETC");
        ch_course.add("FE Civil");
        ch_course.add("TY Comp");
        ch_course.add("TY Mech");
        but_produce=new Button("produce coursewise stud info");
        but_close=new Button("close form");
        but_produce.addActionListener(this);
        but_close.addActionListener(this);
        Font f1 = new Font("Arial", Font.BOLD, 32);
        Font f2 = new Font("Times new romen", Font.BOLD, 24);
        add(lb_title);
        add(lb_course);
        add(ch_course);
        add(but_produce);
        add(but_close);
        lb_title.setFont(f1);
        lb_course.setFont(f2);
        but_produce.setFont(f2);
        but_close.setFont(f2);
        ch_course.setFont(f2);
        
        lb_title.setBounds(150, 100, 650, 40);
        lb_course.setBounds(150, 250, 250, 35);
        ch_course.setBounds(425, 250, 250, 40);
        but_produce.setBounds(100, 400,350, 30);
        but_close.setBounds(650, 400,150, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==but_produce)
        {
            if(ch_course.getSelectedItem().length()==0)
            JOptionPane.showMessageDialog(this, "PLEASE SELECT CHOICE");

            else{
             //new coursewise_studinfo(ch_course.getSelectedItem());
            }
        }
        else if(ae.getSource()==but_close)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
    //    course obj= new course();
    new course();
    }
}
