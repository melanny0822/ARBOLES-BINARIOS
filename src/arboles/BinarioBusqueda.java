
package arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class BinarioBusqueda {
    
    Nodo raiz;
    
    //Metodo constructor

    public BinarioBusqueda() {
        
        raiz=null;
    }
    
    //Metodo para obtener la raiz del arbol 
    
    public Nodo getRaiz()
    {
        return (raiz);
    }
   
    //Metodo para recorrer en preorden 
    
    public void recPreOrden(Nodo R) 
    {
        if (R!= null)
            
        {
            
            System.out.print(R.getDato()+" ");
            recPreOrden(R.getLi());
            recPreOrden(R.getLd());
        }
    }
    
    //Metodo para recorrer en inorden
    
    public void recInOrden (Nodo R) 
    {
         if (R!= null)
         
         {
             
             recInOrden(R.getLi());
             System.out.print(R.getDato()+" ");
             recInOrden(R.getLd());
         }
    }
    
    //Metodo para recorrer en postorden
    
    public void recPosOrden (Nodo R) 
    {
         if (R!= null)
         
         {
             
             recPosOrden(R.getLi()); 
             recPosOrden(R.getLd());
             System.out.print(R.getDato()+" ");
        }
    }
    
    
    //Metodo para insertar un dato 
    
    public void insertar (int dato)
    {
        Nodo p= raiz, ant= null, x; 
        boolean sw=false; 
        
        while (p!= null && sw== false)
        {
            ant=p; 
            
            if (dato>p.getDato())
                
            {
                p= p.getLd();
                
            } else 
            
            {
                if(dato<p.getDato())
                
                {
                    p.getLi();
                    
                } else 
                
                {
                   sw= true; 
                }
            }
        }
        
        if (sw==true)
        
        {
            JOptionPane.showMessageDialog(null, "EL DATO YA EXISTE");
            
        } else 
        
        {
            x = new Nodo(dato);
            
            if(raiz==null)
            
            {
                raiz = x;
                
            } else 
            
            {
                if (dato< ant.getDato()) 
                    
                {
                    ant.setLi(x);
                    
                } else 
                
                {
                   ant.setLd(x); 
                }
            }
             
        }
    }
    
    //Metodo para mostrar los hijos de un dato dado 
    
    public void mostrarHijosDato (Nodo R, int dato)
    {
        if (R!= null)
            
        {
            if (R.getDato()==dato)
                
            {
                if (R.getLi()!= null && R.getLd()!= null)
                    
                    {
                         JOptionPane.showMessageDialog(null, "HIJO IZQUIERDO" + R.getLi().getDato() + "HIJO DERECHO" +R.getLd().getDato());
                         
                    }
                if (R.getLi()!=null && R.getLd()==null) 
                        
                {
                        JOptionPane.showMessageDialog(null, "HIJO IZQUIERDO" + R.getLi().getDato() + "HIJO DERECHO, NO TIENE");
                }
                
                if (R.getLi()== null && R.getLd()!= null)
                {
                    JOptionPane.showMessageDialog(null,"HIJO IZQUIERDO NO TIENE" +"HIJO DERECHO" + R.getLd().getDato());
                }
                
                if (R.getLi()== null && R.getLd()==null)
                {
                    JOptionPane.showMessageDialog(null,"NO TIENE HIJOS");
                }
            }
            
            mostrarHijosDato(R.getLi(),dato);
            mostrarHijosDato(R.getLd(),dato);
            
        }
    }
    
}




