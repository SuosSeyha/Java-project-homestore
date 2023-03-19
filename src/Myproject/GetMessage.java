package Myproject;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class GetMessage {
    private ImageIcon iconsuccess = new ImageIcon("D:\\Java Programming\\Button\\done.png");
    private ImageIcon iconserror = new ImageIcon("D:\\Java Programming\\Icon\\wrong.png");
    public void getSuccess(String text){
        JOptionPane.showMessageDialog(null, text, "HOME STORE", JOptionPane.PLAIN_MESSAGE,iconsuccess );
    }
    public void getError(Exception e){
        JOptionPane.showMessageDialog(null, e, "HOME STORE", JOptionPane.PLAIN_MESSAGE,iconserror );
    }
  
    public void getError(String text){
        JOptionPane.showMessageDialog(null, text, "HOME STORE", JOptionPane.PLAIN_MESSAGE,iconserror );
    }
   
}
