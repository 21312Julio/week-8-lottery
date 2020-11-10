package com.company;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Lottery {

    List<List<Integer>> lottery_panel = new ArrayList<List<Integer>>();
    public void quickpick() {
        int panel = new Random().nextInt(8 - 1) + 1;
        for (int a = 0; a < panel; a++) {
            List<Integer> tmp_lot = new ArrayList<Integer>();
            for (int b = 0; b < 6; b++) {
                tmp_lot.add(new Random().nextInt(50 - 1) + 1);
            }
            this.lottery_panel.add(tmp_lot);
        }
    }

    public String toString() {
        String output = "";
        for (int a = 0; a < this.lottery_panel.size(); a++) {
            Integer panel_number = a + 1;
            output += "Panel " + panel_number.toString() + "%n%n Numbers: ";
            for (int b = 0; b < 6; b++) {
                Integer result = this.lottery_panel.get(a).get(b);
                if (b < 5) {
                    output += result.toString() + " - ";
                }
                else {
                    output += result.toString();
                }
            }
            output += "%n%n%n";
        }
        return output;
    }


}
