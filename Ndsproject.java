import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ndsproject {
    public static String alpha = "abcdefghijklmnopqrstuvwxyz !@#$%^&*_ABCDEFGHIJKLMNOPQRSTUVWXYZकखगघङचछजझञाटठडढणतथदधनपफबभमयरलवशषसहषरज्ञ";
    public static String cipher = " ";
    public static String dmessage = " ";


    public static void main(String[] args) {
        JFrame jf = new JFrame("CipherText");
        jf.setSize(700, 600);

        // for Encryption
        JLabel message = new JLabel("Message");
        message.setBounds(40, 50, 150, 40);
        jf.add(message);

        JTextField messageArea = new JTextField();
        messageArea.setBounds(110, 50, 150, 40);
        jf.add(messageArea);

        JLabel key = new JLabel("Key");
        key.setBounds(40, 130, 150, 40);
        jf.add(key);

        JTextField keyArea = new JTextField();
        keyArea.setBounds(110, 130, 150, 40);
        jf.add(keyArea);

        JButton encrypt = new JButton("Encrypt");
        encrypt.setBounds(40, 210, 220, 40);
        jf.add(encrypt);

        JTextArea e_message = new JTextArea();
        e_message.setBounds(40, 290, 220, 150);
        jf.add(e_message);

        

        // for Decryption
        JLabel cipherText = new JLabel("cipher Text");
        cipherText.setBounds(300, 50, 150, 40);
        jf.add(cipherText);

        JTextField c_message = new JTextField();
        c_message.setBounds(390, 50, 150, 40);
        jf.add(c_message);

        JLabel c_key = new JLabel("key");
        c_key.setBounds(300, 130, 150, 40);
        jf.add(c_key);

        JTextField c_keyArea = new JTextField();
        c_keyArea.setBounds(390, 130, 150, 40);
        jf.add(c_keyArea);

        JButton decrypt = new JButton("Decrypt");
        decrypt.setBounds(300, 210, 240, 40);
        jf.add(decrypt);

        JTextArea d_message = new JTextArea();
        d_message.setBounds(300, 290, 240, 150);
        jf.add(d_message);

        encrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String n1 = messageArea.getText();
                int n2 = Integer.parseInt(keyArea.getText());
                
                for (int i = 0; i < n1.length(); i++) {
                    int charPosition = alpha.indexOf(n1.charAt(i));
                    int keyVal = (n2 + charPosition) % 98;
                    char replaceVal = alpha.charAt(keyVal);
                    cipher += replaceVal;
                }
                e_message.setText(cipher);
                

            }
        });
        
        decrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent af) {
                String n1 = c_message.getText();
                int n2 = Integer.parseInt(c_keyArea.getText());
                for (int ii = 0; ii < n1.length(); ii++) {
                    int charPosition = alpha.indexOf(n1.charAt(ii));
                    int keyVal = (charPosition - n2) % 98;
                    if (keyVal < 0) {
                        keyVal = alpha.length() + keyVal;
                    }
                    char replaceVal = alpha.charAt(keyVal);
                    dmessage += replaceVal;
                }
                
                d_message.setText(dmessage);
            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setVisible(true);
    }

}