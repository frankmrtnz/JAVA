
package EjercicioRepaso_1;


public class Prueba {
    public static void main(String[] args) {

    /*
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/NOMBREDATABASE";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();

            //st.execute("drop table NOMBRETABLA");
            st.close();
            st1.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
---------------------        
        
        
        try {
            
            File f = new File("texto.txt");
            FileWriter fw = new FileWriter(f);

            //xxxxxxx       
            fw.close();            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
--------------------        
        
        
        try {            
            
        } catch (EOFException ex) {
            System.out.println("NO HAY MAS DATOS");
        }
        
        
-----------------------

        
        Statement st = con.createStatement();
        
        
--------------------        
        
        
        
        PreparedStatement ps1 = con.prepareStatement(cadena);
        
        
---------------------        
        
        
        ResultSet rs = st.executeQuery(cadena);
        
        
-----------------------------------
        
        
        FileWriter fw = new FileWriter(f);
        fw.close();        
        
        
---------------------------------        
        
        
        if (!f.exists()) {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.close();
            fos.close();
            System.out.println("Fichero " + f + " creado");
        } else {
            System.out.println("El fichero " + f + " ya existe");
        }
        
        
-------------------------        
        
        
        FileInputStream fis = new FileInputStream(f);  //Lectura
        DataInputStream dis = new DataInputStream(fis);
        
        
-------------------------------        
        
        
        FileOutputStream fos = new FileOutputStream(f); //Escritura
        DataOutputStream dos = new DataOutputStream(fos);
        
        
--------------------------------
        
        
        FileInputStream fis = new FileInputStream(f);  //Lectura
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        
------------------------------------        
        
        
        FileOutputStream fos = new FileOutputStream(f); //Escritura
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        
----------------------------------
  
    
        int opc;
        opc = Menu(teclado);
        while (opc != 6) {
            switch (opc) {
                case 1:
                    creaFichero(f);
                    break;
                case 2:
                    anadeFichero(teclado, f);
                    break;
                case 3:
                    listarFichero(teclado, f);
                    break;
                case 4:
                    consultarFichero(teclado, f);
                    break;
                case 5:
                    actualizarFichero(teclado, f);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            opc = Menu(teclado);
        }
        
    }
    
    static int Menu(Scanner t) {
        System.out.println("1. Crea fichero serializable ('datos.obj')");
        System.out.println("2. Añadir paises al fichero");
        System.out.println("3. Listar toda la información del fichero");
        System.out.println("4. Consultar registro por nombre de país");
        System.out.println("5. Actualizar información del fichero");
        System.out.println("6. Salir");
        int opc = t.nextInt();
        return opc;
    }
    

        
--------------------------------
        
        
*/ 

    }
}
