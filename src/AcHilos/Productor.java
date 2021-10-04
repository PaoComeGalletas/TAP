package AcHilos;

class Productor extends Thread {
    private Tuberia tuberia;
    
    private String[] nombres = {"Juan", "Maria", "Jose", "Pedro", "Luis", "Lupita", "Ramon", "Jorge", "Lucia", "Erika", "Fernando", "Daniela", 
    		"Fernanda", "Sergio", "Diana"};
    
    private String[] tel= {"00000000", "11111111", "22222222","33333333","44444444", "55555555", "66666666", "77777777","88888888",
    		"99999999", "12121212", "34343434", "45454545", "67676767", "78787878"};
    
    int posicion;
    int posiciones[]=new int[15];
    int contPos=0;

    public Productor( Tuberia t ) {        
        tuberia = t;
    }

    public void run() {
    	
    	String nombre;
    	String telefono;
        
        for( int i=0; i < 15; i++ )
            {
        	posicion= (int)(Math.random()*15 );
        	
        	//ESTE ES PARA QUE NO SE REPITAN NOMBRES PERO TARDA PARA ASIGNAR AL EQUIPO 5
        	/*
        	if(contPos!=0) {
        		if(seRepite(posicion)) {
        			while(seRepite(posicion)) {
        				posicion= (int)(Math.random()*15 );
        			}
        			posiciones[contPos]=posicion;
        		}
        		posiciones[contPos]=posicion;
        			
        	}else {
        		posiciones[contPos]=posicion;
        	}
        	contPos++;
        	*/
        	
        	nombre=nombres[posicion];
        	telefono=tel[posicion];
            tuberia.lanzar( nombre, telefono );
            
            try {
                sleep( (int)(Math.random() * 100 ) );
            } catch( InterruptedException e ) {;}
            }
       }
    
    
    public boolean seRepite(int pos) {
    	
    	boolean r=false;
    	for (int i = 0; i < posiciones.length; i++) {
			if(posiciones[i]==pos) 
				r=true;
			
		}
    	
    	return r;
    }
    }