
package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class Arboles {

    
    public static void main(String[] args) {
        
        
        int opc,dato;
         Nodo R;
         
            String menu="Menú \n" +
                    "1.Mostrar en preorden\n" +
                    "2.Mostrar en Inorden\n" +
                    "3.Mostrar en Posorden\n" +
                    "4.Insertar un dato\n" +
                    "5.Mostrar hijos de un dato dado\n" +             
                    "0.Salir\n";

            BinarioBusqueda Ar = new BinarioBusqueda ();
            
            do{
                opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
                
                switch(opc){
                    
                    case 1: R=Ar.getRaiz();
                      if(R!=null)
                      {
                          System.out.println("\nRECORRIDO EN PREORDEN\n");
                          Ar.recPreOrden(R);
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"Árbol vacío");
                      }
                    break;
                    
                    case 2: if(Ar.getRaiz()!= null)
                    {
                        System.out.println("\nRECORRIDO EN INORDEN\n");
                        Ar.recInOrden(Ar.getRaiz());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Árbol vacío");
                    }
                    break;
                    
                    case 3: if(Ar.getRaiz()!= null)
                    {
                        System.out.println("\nRECORRIDO EN POSORDEN\n");
                        Ar.recPosOrden(Ar.getRaiz());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Árbol vacío");
                    }
                    break;
                    
                    case 4: dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a Insertar"));
                    Ar.insertar(dato);
                    break;
                    
                    case 5: dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a Insertar"));
                    
                    if(Ar.getRaiz()== null)
                    {
                        JOptionPane.showMessageDialog(null,"Árbol vacío"); 
                    }
                    else
                    {
                        Ar.mostrarHijosDato(Ar.getRaiz(),dato);
                    }
                    break;

                    case 0:System.exit(0);
                    break;
                }
            }while(opc!=0); 
            
    }
      
           

}

