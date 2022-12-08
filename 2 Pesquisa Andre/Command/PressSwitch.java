package Command;

public class PressSwitch {
    public static void main(String[] args){
       // Checa o número de argumentos
       if (args.length != 1) {
          System.err.println("Argumento \"ON\" or \"OFF\" é necessário.");
          System.exit(-1);
       }
 
       Light lamp = new Light();
       Command switchUp = new FlipUpCommand(lamp);
       Command switchDown = new FlipDownCommand(lamp);
 
       Switch mySwitch = new Switch();
 
       switch(args[0]) {
          case "ON":
             mySwitch.storeAndExecute(switchUp);
             break;
          case "OFF":
             mySwitch.storeAndExecute(switchDown);
             break;
          default:
             System.err.println("Argumento \"ON\" or \"OFF\" é necessário.");
             System.exit(-1);
       }
    }
 }
