/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author John Rey Alipe
 */
public class CalculatorController 
{
    CalculatorView cv;
    public CalculatorController(CalculatorView cv)
    {
        //ang sa right nga cv amu ni sya halin sa aton nga main method
        //ang sa left nga cv amu ni sya ang pasahan ya nga object para 
        //magamit ta ang mga object sa aton View. especially ang 3 ka textfields
        this.cv = cv;
        
        //diri naton gin link ang addNumbers nga method from the view with the constructor
        //sang aton nga AddingCLass ara sa dalom
        this.cv.addNumbers(new AddingClass());
    }
    
    class AddingClass implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            int num1 = Integer.parseInt(cv.jTextField1.getText());
            int num2 = Integer.parseInt(cv.jTextField2.getText());
            cv.jTextField3.setText(CalculatorModel.addNow(num1, num2) + "");
        }
    }
}
