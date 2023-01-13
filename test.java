
package tpfinal;
//importamos la clase escaner
import javax.swing.JOptionPane;

/**
 *
 * @author joaquin
 */
public class tpfinal {
     public static void main(String[] args) {
        
 

  /*
Codigo origianlmente creado en Psint por el grupo tapita coca cola 1974
el programa tiene la funcionalidad de ser un conversor de distintas divisas.
 */


        
               
       //definimos nuestras variables que utilizaremos en el programa
        
        boolean salir = false;
        boolean salircomprar=false;
        boolean salirventa=false;
        boolean salirtabla=false;
        boolean salircreditos=false;                
        int opcion1,opcioncompra,opcionventa,opcioncreditos,opciontabla;
        float inicial,total;
        
        //haciendo uso del while comenzamos a crear nuestro menu principal
        
        while(!salir){
        salir = false;
        salircomprar=false;
         salirventa=false;
        salirtabla=false;
        salircreditos=false;   
           //creamos las opciones que se le presentaran al usuario 
           // en este caso lo haremos con la clase JOPtion pane
          opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Menu de Exchanges $"
                    + "\n1.Compra"
                    + "\n2.Venta"
                    + "\n3.Mostrar tabla de cambio"
                    + "\n4.Creditos"
                    + "\n5.Salir"
                    + "\n"
                  + "Digite una opcion del menu:"));
                   //le pedimos al usuario que digite una opcion con JOPtionpane
            //haciendo uso de switch es que presentamos diferentes opciones de compra
            switch (opcion1){
                case 1:
                    while(!salircomprar){
                    opcioncompra = Integer.parseInt(JOptionPane.showInputDialog("Menu de Compra"
                            + "\n1.Dolar"
                            + "\n2.Euro"
                            + "\n3.Libra esterlina"
                            + "\n4.Yuan"
                            + "\n5.Rublo"
                            + "\n6.Franco suizo"
                            + "\n7.Peso mexicano"
                            + "\n8.Dolar australiano"
                            + "\n9.Dolar canadiense"
                            + "\n10.Yen japones"
                            + "\n11.Real brasileño"
                            + "\n12.Dolar hongkones"
                            + "\n13.Volver"
                            + "\n¿Que moneda quiere comprar?"
                            ));    

                        //la opcion seleccionada le presentara diferentes opciones al usuario, en donde debera seguir interactuando
                        //especificamente en este caso 1  permitira hacer el cambio de divisas "comprando" o finalizar el bucle
                        switch (opcioncompra){
                            case 1:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de pesos"));
                                total = inicial /122;
                                JOptionPane.showMessageDialog(null,"El cambio a dolares es: "+total
                                +"");
                                break;
                            case 2:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = inicial /129;
                                JOptionPane.showMessageDialog(null,"El cambio a euros es: "+total
                                +"");
                                break;
                            case 3:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = inicial /129;
                                JOptionPane.showMessageDialog(null,"El cambio a libra es: "+total
                                +"");
                                break;
                            case 4: 
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = (float) (inicial /18.25);
                                JOptionPane.showMessageDialog(null,"El cambio a yuanes es: "+total
                                +"");
                                break;
                            case 5:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                               total = (float) (inicial /2.1);
                                JOptionPane.showMessageDialog(null,"El cambio a rublos es: "+total
                                +"");
                                break;
                            case 6:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = inicial /124;
                                JOptionPane.showMessageDialog(null,"El cambio a suizos es: "+total
                                +"");
                                break;
                            case 7:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = (float) (inicial /6.13);
                                JOptionPane.showMessageDialog(null,"El cambio a mexicanos es: "+total
                                +"");
                                break;
                            case 8:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                               total = (float) (inicial /86.23);
                                JOptionPane.showMessageDialog(null,"El cambio a australianos es: "+total
                                +"");
                                break;
                            case 9:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = (float) (inicial /95.11);
                                JOptionPane.showMessageDialog(null,"El cambio a canadienses es: "+total
                                +"");
                                break;
                            case 10:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = (float) (inicial /0.91);
                                JOptionPane.showMessageDialog(null,"El cambio a japoneses es: "+total
                                +"");
                                break;
                            case 11:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                 total = (float) (inicial /24.5);
                                JOptionPane.showMessageDialog(null,"El cambio a reales brasileros es: "+total
                                +"");
                                break;
                            case 12:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos"));
                                total = (float) (inicial /15.16);
                                JOptionPane.showMessageDialog(null,"El cambio a hongkones es: "+total
                                +"");
                                break;
                            case 13:
                                salircomprar=true;
                                break;
                        }
                    }
                    break;
                    // en caso de elegir la opcion 2 del menu principal ingresara a la opcion venta
                    //en este caso se ingresa a un bucle while donde se debera seleccionar que moneda se desea vender
                case 2:
                    while(!salirventa){
                     opcionventa= Integer.parseInt( JOptionPane.showInputDialog("Menu de Venta"
                            + "\n1.Dolar"
                            + "\n2.Euro"
                            + "\n3.Libra esterlina"
                            + "\n4.Yuan"
                            + "\n5.Rublo"
                            + "\n6.Franco suizo"
                            + "\n7.Peso mexicano"
                            + "\n8.Dolar australiano"
                            + "\n9.Dolar canadiense"
                            + "\n10.Yen japones"
                            + "\n11.Real brasileño"
                            + "\n12.Dolar hongkones"
                            + "\n13.Volver"
                             + "\n¿Que moneda quiere vender?"));
                    
                          
                  
                        //nuevamente una vez ingresada la opcion se ingresa a la estructura switch 
                        //donde de acuerdo a la opcion ingresada se ejecuta el programa "vendiendo"
                        //o cerrando el bucle
                        
                        switch(opcionventa){
                            case 1:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dolares"));
                                total = inicial *122;
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 2:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de euros"));
                                total = inicial *129;
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 3:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de libras esterlinas"));
                                total = inicial *150;
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 4:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de yuanes"));
                                total = (float) (inicial *18.25);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 5:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de rublos"));
                                total = (float) (inicial *2.1);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                               
                            case 6:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de francos suizos"));
                                total = inicial *124;
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 7:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pesos mexicanos"));
                                total = (float) (inicial *6.13);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 8:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dolares australianos"));
                                total = (float) (inicial *86.23);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 9:
                                  inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dolares canadiences"));
                                total = (float) (inicial *95.11);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 10:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de yenes japoneses"));
                                total = (float) (inicial *0.91);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 11:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de reales brasileros"));
                                total = (float) (inicial *24.5);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 12:
                                inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de hongkones"));
                                total = (float) (inicial *15.16);
                                JOptionPane.showMessageDialog(null,"El cambio a pesos es: "+total
                                +"");
                                break;
                            case 13:
                                salirventa=true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Esa opcion no existe");
                                
                        }
                    }
                    break;
                    //en el caso de seleccionar la opcion 3 del menu principal se accede a un tablero donde se ven los valores
                    //de compra y venta de las monedas
                case 3:
                    //se muestra la tabla de valores, y se da la opcion de volver
                    while(!salirtabla){
                    opciontabla= Integer.parseInt(JOptionPane.showInputDialog("COMPRA  USD(128.1)  EUR(135.45)  GBP(157.5)  CNY(19.16)  RUBL(2.2)  CHF(130.2 )  MEX(6.43 )  AUD(87.39)  CAD(99.86 )  JPY(0.95)  BRL(25.72 )  HKD(15.91)"
                            + "\nVENTA      USD(122)  EUR(129)  GBP(150)  CNY(18.25)  RUBL(2.1)  CHF(124)  MEX(6.13)  AUD(86.23)  CAD(95.11)  JPY(0.91)  BRL(24.5)  HKD(15.16) "
                            + "\n"
                            + "1.volver"));    
                        switch(opciontabla){
                            case 1:
                                salirtabla=true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"esa opcion no existe");
                        }
                    }
                    //por ultimo la opcion 4 del menu principal nos permite ver los participantes del grupo
                    //tambien nos permite volver
                    
                    break;
                case 4:
                    while(!salircreditos){
                    opcioncreditos = Integer.parseInt(JOptionPane.showInputDialog("Los creditos"
                            + ""
                            + "\nAcosta Joaquin Avaro"
                            + "\nBeluardi Emanuel"
                            + "\nGrande Victoria Josefina"
                            + "\nLopez Maximiliano Exequiel"
                            + "\nOrozco Cristian Emanuel"
                            + "\nRuiz Juan Ignacio"
                            + "\nYanten Alexis"
                            + "\nYebrin Pablo"
                            + "\nUriel Olguin"
                            + ""
                            + "\n1.Volver"));
                        switch(opcioncreditos){
                            case 1:
                                salircreditos=true;
                                break;
                            default:
                               JOptionPane.showMessageDialog(null,"esa opcion no existe");
                        }
                    }
                    break;
                    //la opcion 5 nos permite finalizar el programa
                case 5:
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"esa opcion no existe");
            }
            
        }
        
        JOptionPane.showMessageDialog(null,"gracias por usar este programa :)");
        
    }         
       
    
}
