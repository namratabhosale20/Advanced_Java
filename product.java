
import java.awt.*;
import java.awt.event.*;


 public class product extends Frame implements ActionListener
 {
    Label lb_title,lb_pname,lb_ptype,lb_cost,lb_qty,lb_area,lb_scost,lb_scom,lb_rcom,lb_net;
    TextField tf_pname,tf_cost,tf_scost,tf_rcom,tf_net,tf_qty,tf_scom;
    Button but_show,but_close,but_clear;
    Checkbox cb1,cb2,cb3;
    Checkbox rb1,rb2,rb3,rb4;
    CheckboxGroup cbg;

    product()
    {
        setSize(1200,800);
        setVisible(true);
        setLayout(null);
        lb_title =new Label("Zone-wise product sells form");
        lb_pname=new Label("product name");
        lb_ptype=new Label("product type");
        lb_qty=new Label("product quantity");
        lb_area=new Label("product sell area");
        lb_cost=new Label("product per cost");
        lb_scost=new Label("product sell cost");
        lb_scom=new Label("salemen commission");
        lb_rcom=new Label("retailer commission");
        lb_net=new Label("net cost");
        tf_pname=new TextField();
        tf_qty=new TextField();
        tf_net=new TextField();
        tf_scost=new TextField();
        tf_scom=new TextField();
        tf_rcom=new TextField();
    
        but_show=new Button("show result");
        but_close=new Button("Close Form");
        but_clear=new Button("Clear");
        cb1=new Checkbox("rural area");
        cb2=new Checkbox("urban area");
        cb3=new Checkbox("metropolitan area");
        rb1=new Checkbox("imported");
        rb1=new Checkbox("branded");
        rb1=new Checkbox("domestic");
        rb1=new Checkbox("local");
        Font f1 = new Font("Arial", Font.BOLD, 32);
        Font f2 = new Font("Times new romen", Font.BOLD, 24);
        Font f3 = new Font("times new romen", Font.BOLD, 18);
        lb_title.setFont(f1);
        lb_pname.setFont(f2);
        lb_ptype.setFont(f2);
        lb_qty.setFont(f2);
        lb_cost.setFont(f2);
        lb_scost.setFont(f2);
        lb_area.setFont(f2);
        lb_net.setFont(f2);
        lb_rcom.setFont(f2);
        lb_scom.setFont(f2);
      
        tf_pname.setFont(f3);
        tf_cost.setFont(f3);
        tf_qty.setFont(f3);
        tf_rcom.setFont(f3);
        tf_scom.setFont(f3);
        tf_net.setFont(f3);
        tf_scost.setFont(f3);
        cb1.setFont(f3);
        cb2.setFont(f3);
        cb3.setFont(f3);
        rb1.setFont(f3);
        rb2.setFont(f3);
        rb3.setFont(f3);
        rb4.setFont(f3);
        but_show.setFont(f3);
        but_clear.setFont(f3);
        but_close.setFont(f3);
        but_show.setBackground(Color.blue);
        but_clear.setBackground(Color.orange);
        but_close.setBackground(Color.red);
        but_show.setForeground(Color.white);
        but_clear.setForeground(Color.white);
        but_close.setForeground(Color.white);
        lb_title.setForeground(Color.gray);
        add(lb_title);
        add(lb_pname);
        add(tf_pname);
        add(lb_ptype);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(lb_cost);
        add(tf_cost);
        add(lb_qty);
        add(tf_qty);
        add(lb_area);
        add(cb1);
        add(cb2);
        add(cb3);
        add(lb_scost);
        add(tf_scost);
        add(lb_scom);
        add(tf_scom);
        add(lb_rcom);
        add(tf_rcom);
        add(lb_net);
        add(tf_net);
        add(but_show);
        add(but_close);
        add(but_clear);

        but_show.addActionListener(this);
        but_close.addActionListener(this);
        but_clear.addActionListener(this);

        lb_pname.setBounds(350, 230, 800, 35);
        // lb_pname.setBounds(200, 150, 300, 45);
        // tf_pname.setBounds(500, 150, 200, 35);
        // lb_ptype.setBounds(200, 250, 300, 35);
        // rb1.setBounds(600, 250, 100, 30);





    }
    public void actionPerformed(ActionEvent ae)
    {

    }
    public static void main(String args[])
    {
        product obj =new product();
    }
}
