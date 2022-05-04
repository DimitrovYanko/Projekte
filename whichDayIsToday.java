import javax.swing.JOptionPane;
import java.time.LocalDate;

public class whichDayIsToday {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        JOptionPane.showMessageDialog(null, "Welcher Tag ist heute ?");

        switch(now.getDayOfWeek()) {
            case MONDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Montag");
                break;
            case TUESDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Dienstag");
                break;
            case WEDNESDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Mittwoch");
                break;
            case THURSDAY :
                JOptionPane.showMessageDialog(null, "Heute ist Donnerstag");
                break;
            case FRIDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Freitag");
                break;
            case SATURDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Samstag");
                break;
            case SUNDAY:
                JOptionPane.showMessageDialog(null, "Heute ist Sonntag");
                break;
        }

    }
}
