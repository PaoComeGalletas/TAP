package AcHilos;

class Consumidor extends Thread {
    private Tuberia tuberia;
    Alumno alum[]=new Alumno[3];

    public Consumidor( Tuberia t ) {       
        tuberia = t;
    }

    public void run() {

        for( int i=0; i < alum.length; i++ )
            {
            alum[i]= tuberia.recoger();
           

            try {
                sleep( (int)(Math.random() * 2000 ) );
            } catch( InterruptedException e ) {;}
            }
        
        	if(alum[2]!= null) {
        		for (int i = 0; i < alum.length; i++) {
					System.out.println(alum[i].nombre+"-"+alum[i].tel);
				}
        		System.out.println();
        	}
        }
    
    	
    }
