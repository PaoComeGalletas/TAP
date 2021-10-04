package AcHilos;

class Tuberia {
    private Alumno buffer[] = new Alumno[15];
    private int siguiente = 0;  
    private boolean estaLlena = false;
    private boolean estaVacia = true;
    
    
    
    public synchronized Alumno recoger() {
        while( estaVacia == true )
            {
            try {
                wait(); 
            } catch( InterruptedException e ) {
                ;
                }
            }
        siguiente--;
        if( siguiente == 0 )
            estaVacia = true;
        estaLlena = false;
        notify();
        return( buffer[siguiente] );
        }
    
    
    
    public synchronized void lanzar( String nombre, String tel ) {
        while( estaLlena == true )
            {
            try {
                wait(); 
            } catch( InterruptedException e ) {
                ;
                }
            }      
        buffer[siguiente]=new Alumno(nombre, tel); 
        siguiente++;
        if( siguiente == 15 )
            estaLlena = true;
        estaVacia = false;
        notify();
        }
    }