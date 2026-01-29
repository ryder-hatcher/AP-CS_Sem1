/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
public static void main(String args[]) {
Warrior[] warriors = new Warrior[100];
Wizard[] wizards = new Wizard[100];
int currentWizard=0, currentWarrior=0;

for(int i=0;i<warriors.length;i++){
wizards[i]=new Wizard();
warriors[i]=new Warrior();
}

while(true){

wizards[currentWizard].attack(warriors[currentWarrior]);
if(warriors[currentWarrior].isDead()) {
if(currentWarrior==warriors.length-1){
System.out.println("Wizards have won!");
break;
}
currentWarrior++;
}

warriors[currentWarrior].attack(wizards[currentWizard]);
if(wizards[currentWizard].isDead()) {
if(currentWizard==wizards.length-1){
System.out.println("Warriors have won!");
break;
}
currentWizard++;
}
}

}
}
