import java.awt.*;
import java.awt.event.*;



public class Radio_demo1 extends Frame implements ActionListener {
    Label lb_title, lb_pname, lb_ptype, lb_price, lb_scost;
    TextField tf_pname, tf_price, tf_scost;
    Button but_show, but_close;
    Checkbox rb1, rb2, rb3;
    CheckboxGroup cbg;

    Radio_demo1() {
        setSize(1200, 800);
        setVisible(true);
        setLayout(null);
        lb_title = new Label("Implementation of Radio button for product form");
        lb_pname = new Label("Product name");
        lb_ptype = new Label("Product type");
        lb_price = new Label("Product base price");
        lb_scost = new Label("Product selling cost");
        tf_pname = new TextField();
        tf_price = new TextField();
        tf_scost = new TextField();
        cbg = new CheckboxGroup();
        rb1 = new Checkbox("Imported", cbg, false);
        rb2 = new Checkbox("Domestic", cbg, false);
        rb3 = new Checkbox("Local", cbg, false);
        but_show = new Button("Show Result");
        but_close = new Button("Close Form");
        lb_title.setForeground(Color.DARK_GRAY);

        but_show.addActionListener(this);
        but_close.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("Arial black", Font.BOLD, 36);
        f2 = new Font("Arial black", Font.BOLD, 26);
        f3 = new Font("Arial black", Font.BOLD, 18);
        lb_title.setFont(f1);
        lb_pname.setFont(f2);
        lb_ptype.setFont(f2);
        lb_price.setFont(f2);
        tf_pname.setFont(f3);
        tf_price.setFont(f3);
        lb_scost.setFont(f2);
        tf_scost.setFont(f3);
        rb1.setFont(f2);
        rb2.setFont(f2);
        rb3.setFont(f2);
        but_show.setFont(f3);
        but_close.setFont(f3);
        but_show.setBackground(Color.blue);
        but_show.setForeground(Color.white);
        but_close.setBackground(Color.orange);
        but_close.setForeground(Color.white);


        add(lb_title);
        add(lb_pname);
        add(tf_pname);
        add(lb_ptype);
        add(rb1);
        add(rb2);
        add(rb3);
        add(lb_price);
        add(tf_price);
        add(but_show);
        add(but_close);
        add(lb_scost);
        add(tf_scost);

        lb_title.setBounds(200, 150, 900, 35);
        lb_pname.setBounds(200, 250, 200, 35);
        tf_pname.setBounds(450, 250, 200, 35);
        lb_ptype.setBounds(200, 350, 200, 35);
        rb1.setBounds(450, 350, 200, 35);
        rb2.setBounds(650, 350, 200, 35);
        rb3.setBounds(850, 350, 200, 35);
        lb_price.setBounds(200, 450, 250, 35);
        tf_price.setBounds(450, 450, 200, 35);
        but_show.setBounds(400, 550, 200, 35);
        but_close.setBounds(700, 550, 200, 35);
        lb_scost.setBounds(200, 650, 300, 35);
        tf_scost.setBounds(550, 650, 200, 35);

        tf_pname.requestFocus();
        tf_scost.setEditable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == but_show) {
            double bp = Double.parseDouble(tf_price.getText());
            double ovr, prof, gst, sprice;
            if (rb1.getState() == true)
                ovr = 65 * bp / 100;
            else if (rb2.getState() == true)
                ovr = 45 * bp / 100;
            else if (rb3.getState() == true)
                ovr = 25 * bp / 100;
            else
                ovr = 0;
            prof = 20 * bp / 100;
            if (bp < 200)
                gst = 12 * bp / 100;
            else if (bp >= 200 && bp <= 500)
                gst = 15 * bp / 100;
            else
                gst = 18 * bp / 100;
            sprice = bp + ovr + prof + gst;
            tf_scost.setText(String.valueOf(sprice));

        } else if (ae.getSource() == but_close) {
            dispose();
        }
    }

    public static void main(String args[]) {
        Radio_demo1 obj = new Radio_demo1();
    }
}
