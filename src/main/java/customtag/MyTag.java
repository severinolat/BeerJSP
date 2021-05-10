package customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTag extends SimpleTagSupport {

    String color;
    String size;

    public void doTag() throws JspException, IOException {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//        System.out.println("Current Date: " + ft.format(dNow));
        String currentDate = ft.format(dNow);
        JspWriter out = getJspContext().getOut();
        if (color != null) {
            out.write("<span style=\"color:" + color + "; font-size: " + size + "\"> "+currentDate+" </span>");
        } else {
            out.write(String.format("<span>%s</span>", '.'));
        }
    }

    // Need a setter for each attribute of custom tag
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
