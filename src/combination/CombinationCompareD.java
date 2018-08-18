/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;

import Common.Values;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lolit
 */
public class CombinationCompareD {

    public static String Compare(String Input) {

        Values val = Values.getInstance();
        String Output = "";
        String Outputs = "";
        int l = Input.length();
        int i = val.Clenght;
        String Test = "";
        int t = 0;
        int p = 0;
        while (t < i) {
            Test = Test += '=';
            t = t + 1;
        }

        if (l != i) {
            Output = ("Proposition invalid it should be ") + i + (" operators long");
            return (Output);
        } else if ((Input).equals(Test) == true) {
            while (p < i) {
                Output = Output += val.CompareLast[p];
                p = p + 1;

            }
            Output = Output += " is the solution";
            return (Output);
        } else {
            int r = 0;
            while (r < i) {
                val.CompareIn[r] = Input.charAt(r);

                r++;
            }

            while (p < i) {
                if (val.CompareIn[p] == '=') {
                    Output = Output += val.CompareLast[p];
                    Outputs = Outputs += val.CompareIn[p] + " ";
                    p = p + 1;
                } else if (val.CompareIn[p] == '+') {
                    Output = Output += More.Compare(val.CompareLast[p]);
                    val.CompareLast[p] = More.Compare(val.CompareLast[p]);
                    Outputs = Outputs += val.CompareIn[p] + " ";
                    p = p + 1;
                } else if (val.CompareIn[p] == '-') {
                    Output = Output += Minus.Compare(val.CompareLast[p]);
                    val.CompareLast[p] = Minus.Compare(val.CompareLast[p]);
                    Outputs = Outputs += val.CompareIn[p] + " ";
                    p = p + 1;
                }

            }
        }
        if (val.Framestate == 12) {
            val.CompareAcutalNbft++;
        }
        val.VersusD++;
        Output = Output += " Your last answer was " + Outputs;
        return (Output);
    }

    public static String FirstA(String Input) {
        Values val = Values.getInstance();
        String Output = "";
        int i = val.Clenght;
        int p = 0;
        String Temp = "";
        List<Integer> list = new ArrayList<>();
        list.add(0, 4);
        list.add(1, 6);
        val.CompareAcutalNbft = val.CompareAcutalNbft + 1;
        while (p < i) {
            Random r = new Random();
            int index = r.nextInt(list.size());
            val.CompareLast[p] = list.get(index);
            Temp = Temp += list.get(index);
            p = p + 1;
        }
        Output = Temp;
        return (Output);
    }
}
