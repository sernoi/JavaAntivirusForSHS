/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 *
 * @author John Rey Alipe
 */
public class Calculator 
{
    public static void main(String[] args)
    {
        //diri ko nag create sang object nga cv para maka display ta sang view naton
        CalculatorView cv = new CalculatorView();
        //gin call ko ni ang constructor sang Controller para mka pass kita sang object cv sa controller
        new CalculatorController(cv);
        //gin display ta na di ang aton nga view. 
        cv.setVisible(true);
    }
}
