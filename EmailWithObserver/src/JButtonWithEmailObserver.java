import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class JButtonWithEmailObserver extends JButton implements EmailObserver {

    public JButtonWithEmailObserver(String title) {
        super(title);
    }

    @Override
    public void validEmail() {
        setEnabled(true);
    }

    @Override
    public void notValidEmail() {
        setEnabled(false);
    }

}