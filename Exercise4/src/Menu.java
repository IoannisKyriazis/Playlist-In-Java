/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.Scanner;


public class Menu {

    /**
     * @param args the command line arguments
     */
    
    
    static PlayList playlist=new PlayList(); //ΕΠΕΙΔΗ ΔΟΥΛΕΥΩ ΜΕ ΣΥΝΑΡΤΗΣΕΙΣ ΚΑΙ Η ΜΑΙΝ ΕΙΝΑΙ ΜΙΑ ΣΥΝΑΡΤΗΣΗ, ΔΗΛΩΝΩ ΕΝΑ ΑΝΤΙΚΕΙΜΕΝΟ ΕΞΩ ΑΠΟ ΤΗΝ ΜΑΙΝ ΓΙΑ ΤΗΝ ΣΩΣΤΗ ΛΕΙΤΟΥΡΓΙΑ ΤΩΝ ΣΥΝΑΡΤΗΣΕΩΝ
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int epilogh;
        
        do{ //ΕΠΑΝΑΛΗΨΗ ΣΕ ΠΕΡΙΠΤΩΣΗ ΛΑΘΟΥΣ ΣΤΟ ΜΕΝΟΥ
        System.out.print("***PLAYLIST TRAGOUDIWN***\n1. Prosthesh Tragoudiou\n2. Epeksergasia Tragoudiou\n3. Diagrafh Tragoudiou\n4. Provolh Playlist\n5. Anazhthsh Kallitexnh\n6. Emfanish twn Kallitexnwn\n7. Emfanish olwn twn Album\n8. Provolh tragoudiwn pou periexontai se sygkekrimeno album\n0. EXIT\n\nEisagete thn epilogh sas: ");
        epilogh=input.nextInt();
        
        
            if(epilogh==0){
                break;
            }
        if(epilogh==1){
            prostheshTragoudiou(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΠΡΟΣΘΕΣΗ ΤΡΑΓΟΥΔΙΟΥ ΣΤΟ PLAYLIST
        }
        
        else if(epilogh==2){
            editTragoudiou(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΕΠΕΞΑΡΓΑΣΙΑ ΤΡΑΓΟΥΔΙΟΥ
        }
        else if(epilogh==3){
            diagrafhTragoudiou(); //ΔΙΑΓΡΑΦΗ ΤΡΑΓΟΥΔΙΟΥ
        }
        else if(epilogh==4){
            emfanishPlaylist(); //ΛΕΙΤΟΥΡΓΙΑ ΕΜΦΑΝΙΣΗΣ PLAYLIST
        }
        else if(epilogh==5){
            anazhthshKallitexnh(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΑΝΑΖΗΤΗΣΗ ΚΑΛΛΙΤΕΧΝΗ
        }
        else if(epilogh==6){
            emfanishKallitexnwn(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΚΑΛΛΙΤΕΧΝΩΝ ΟΛΩΝ ΤΩΝ ΤΡΑΓΟΥΔΙΩΝ
        }
        else if(epilogh==7){
            emfanishAlbum(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΑΛΜΠΟΥΜ 
        }
        else if(epilogh==8){
            anazhthshAlbum(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΑΝΑΖΗΤΗΣΗ ΑΛΜΠΟΥΜ
        }
        
        }while(epilogh>0 || epilogh<6); 
        
     
    }
    
    
    
    
    
    
    
    static void prostheshTragoudiou() //ΜΕΘΟΔΟΣ ΓΙΑ ΠΡΟΣΘΕΣΗ ΤΡΑΓΟΥΔΙΩΝ
        {
            Tragoudi neoT=new Tragoudi(null,null,null,null); //ΔΗΜΩΣΗ ΑΝΤΙΚΕΙΜΕΝΟΥ ΚΑΙ ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ ΓΙΑ ΤΗΝ ΠΡΟΣΘΗΚΗ ΝΕΟΥ ΤΡΑΓΟΥΔΙΟΥ ΣΤΗΝ ΛΙΣΤΑ
            Scanner input1=new Scanner(System.in);
            
            System.out.print("\n\nEisagete ton kallitexnh: ");
            neoT.setKallitexnhs(input1.nextLine());
            System.out.print("Eisagete titlo tragoudiou: ");
            neoT.setTitlos(input1.nextLine());
            System.out.print("Eisagete thn diarkeia tou tragoudiou: ");      //ΠΛΗΚΤΡΟΛΟΓΗΣΗ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΚΑΙ ΑΠΟΘΗΚΕΥΣΗ ΜΕ ΤΗΝ ΒΟΗΘΕΙΑ ΤΩΝ SET ΣΥΝΑΡΤΗΣΕΩΝ ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ
            neoT.setDiarkeia(input1.nextLine());
            System.out.print("Eisagete to album tou tragoudiou: ");
            neoT.setAlbum(input1.nextLine());
            playlist.prostheshTragoudiou(neoT); //ΚΑΤΑΧΩΡΗΣΗ ΤΟΥ ΝΕΟΥ ΤΡΑΓΟΥΔΙΟΥ ΣΤΟ PLAYLIST
            System.out.print("\n\n\n\n");
        }
        
        
        static void emfanishPlaylist() //ΜΕΘΟΔΟΣ ΓΙΑ ΕΚΤΥΠΩΣΗ ΤΗΣ ΛΙΣΤΑΣ ΤΡΑΓΟΥΔΙΩΝ ΠΟΥ ΕΧΟΥΝ ΚΑΤΑΧΩΡΗΘΕΙ
        {
            Scanner input2=new Scanner(System.in);
            System.out.print("\n\n");
            if(playlist.getMegethosPlaylist()!=0){ //ΕΛΕΓΧΕΙ ΤΟ ΜΕΓΕΘΟΣ ΤΟΥ PLAYLIST 
                for(int i=0;i<playlist.getMegethosPlaylist();i++){
                    System.out.print("#"+(i+1)+"    TITLOS:  "+playlist.getTitlos(i)+"    KALLITEXNHS:  "+playlist.getKallitexnhs(i)+"    DIARKEIA:  "+playlist.getDiarkeia(i)+"    ALBUM:  "+playlist.getAlbum(i)+"\n");
                }
            }
            else
                System.out.print("H Playlist einai adeia!!");
            
            System.out.print("\n\n\n\n");
        }
        
        
        
         static void editTragoudiou() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΠΕΞΕΡΓΑΣΙΑ ΕΝΟΣ ΤΡΑΓΟΥΔΙΟΥ
        {
            Scanner input3=new Scanner(System.in);
            Scanner eisodos=new Scanner(System.in);
            String epilogh1;
            int epilogh12;
            if(playlist.getMegethosPlaylist()!=0){
                emfanishPlaylist(); //ΕΜΦΑΝΙΖΕΙ ΟΛΑ ΤΑ ΤΡΑΓΟΥΔΙΑ ΩΣΤΕ ΝΑ ΔΙΑΛΕΞΟΥΜΕ ΕΜΕΙΣ ΠΟΙΟ ΘΕΛΟΥΜΕ
                System.out.print("\n\nEpilekste to tragoudi pou thelete na kanete edit: ");
                epilogh1=input3.nextLine(); //ΠΛΗΚΤΡΟΛΟΓΗΣΗ ΤΙΤΛΟΥ
                
                System.out.print("Ti thelete na epeksergastite?\n1. Titlos\n2. Kallitexnhs\n3. Diarkeia\n4. Album\n\n\nEisagete thn epilogh sas: ");
                epilogh12=input3.nextInt(); //ΕΠΙΛΟΓΗ ΤΙ ΘΕΛΟΥΜΕ ΝΑ ΑΛΛΑΞΟΥΜΕ ΣΤΟ ΤΡΑΓΟΥΔΙ
                
                if(epilogh12==1){ //ΛΕΙΤΟΥΡΓΙΕΣ ΑΝΑΛΟΓΑ ΜΕ ΤΗΝ ΕΠΙΛΟΓΗ ΜΑΣ
                    System.out.print("Eisagete ton neo Titlo: ");
                    String titlos=eisodos.nextLine();
                    for(int i=0;i<playlist.getMegethosPlaylist();i++){ //ΣΕ ΟΛΗ ΤΗΝ ΛΙΣΤΑ ΘΑ ΨΑΞΕΙ ΝΑ ΒΡΕΙ ΤΟΝ ΤΙΤΛΟ ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΠΟΥ ΤΑΙΡΙΑΖΕΙ ΣΕ ΑΥΤΟ ΠΟΥ ΕΧΟΥΜΕ ΠΛΗΚΤΡΟΛΟΓΗΣΕΙ
                        if(epilogh1.equalsIgnoreCase(playlist.getTitlos(i))){ //ΕΑΝ ΤΑΙΡΙΑΖΕΙ ΤΟΤΕ ΘΑ ΑΠΟΘΗΚΕΥΣΕΙ ΤΟΝ ΝΕΟ ΤΙΤΛΟ ΠΟΥ ΒΑΛΑΜΕ ΣΤΟ ΕΚΑΣΤΟΤΕ ΤΡΑΓΟΥΔΙ
                             playlist.neosTitlos(i,titlos);
                             System.out.print("Allakse me epityxia!");
                        }
                    }
                }
                
                else if(epilogh12==2){
                    System.out.print("Eisagete ton neo Kallitexnh: ");
                    String kallitexnhs=eisodos.nextLine();
                    for(int i=0;i<playlist.getMegethosPlaylist();i++){
                         if(epilogh1.equalsIgnoreCase(playlist.getTitlos(i))){
                              playlist.neosKallitexnhs(i,kallitexnhs);
                              System.out.print("Allakse me epityxia!");
                         }
                    }
                }
                else if(epilogh12==3){
                    System.out.print("Eisagete thn nea diarkeia: ");
                    String diarkeia=eisodos.nextLine();
                    for(int i=0;i<playlist.getMegethosPlaylist();i++){
                         if(epilogh1.equalsIgnoreCase(playlist.getTitlos(i))){
                              playlist.neaDiarkeia(i,diarkeia);
                              System.out.print("Allakse me epityxia!");
                         }
                    }
                }
                else if(epilogh12==4){
                    System.out.print("Eisagete to neo album: ");
                    String album=eisodos.nextLine();
                    for(int i=0;i<playlist.getMegethosPlaylist();i++){
                        if(epilogh1.equalsIgnoreCase(playlist.getTitlos(i))){
                            playlist.neoAlbum(i,album);
                            System.out.print("Allakse me epityxia!");
                        }
                    }
                }
                
            }
            else
                System.out.print("H PlayList einai adeia!!");
            
            System.out.print("\n\n\n\n");
        }
        
        
        
         static void diagrafhTragoudiou() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΤΗΣ ΕΠΙΛΟΓΗΣ ΜΑΣ
        {
            Scanner input4=new Scanner(System.in);
            Tragoudi neoT=new Tragoudi(null,null,null,null);
            System.out.print("\n\n");
            if(playlist.getMegethosPlaylist()!=0){
                emfanishPlaylist();
                System.out.print("Poio tragoudi thelete na diagrapsete? Eisagete thn epilogh sas: ");
                String titlosgiadiagrafh=input4.nextLine(); //ΕΠΙΛΟΓΗ ΤΡΑΓΟΥΔΙΟΥ ΜΕ ΒΑΣΗ ΤΟΝ ΤΙΤΛΟ
              for(int i=0;i<playlist.getMegethosPlaylist();i++){ //ΣΕ ΟΛΗ ΤΗΝ ΛΙΣΤΑ ΘΑ ΨΑΞΕΙ ΝΑ ΒΡΕΙ ΤΟΝ ΤΙΤΛΟ ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΠΟΥ ΤΑΙΡΙΑΖΕΙ ΣΕ ΑΥΤΟ ΠΟΥ ΕΧΟΥΜΕ ΠΛΗΚΤΡΟΛΟΓΗΣΕΙ
                    if(titlosgiadiagrafh.equalsIgnoreCase(playlist.getTitlos(i))){ //ΕΑΝ ΤΑΙΡΙΑΖΕΙ ΤΟΤΕ ΘΑ ΑΠΟΘΗΚΕΥΣΕΙ ΤΟΝ ΝΕΟ ΤΙΤΛΟ ΠΟΥ ΒΑΛΑΜΕ ΣΤΟ ΕΚΑΣΤΟΤΕ ΤΡΑΓΟΥΔΙ
                         playlist.diagrafhTragoudiou(i); //ΕΠΙΚΟΙΝΩΝΙΑ ΜΕ ΤΗΝ ΜΕΘΟΔΟ ΔΙΑΓΡΑΦΗΣ ΠΟΥ ΒΡΙΣΚΕΤΑΙ ΣΤΗΝ ΚΛΑΣΗ ΤΟΥ PLAYLIST
                    }
            }
              }
            else
                System.out.print("H playlist einai adeia!!");
            
            System.out.print("\n\n\n\n");
           
        }
        
        
       static void anazhthshKallitexnh() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΑΝΑΖΗΤΗΣΗ ΕΝΟΣ ΚΑΛΛΙΤΕΧΝΗ ΜΕΣΑ ΣΤΟ PLAYLIST ΚΑΙ ΕΜΦΑΝΙΣΗ ΤΩΝ ΤΡΑΓΟΥΔΙΩΝ ΠΟΥ ΕΧΕΙ ΔΗΜΙΟΥΡΓΗΣΕΙ 
        {
           Tragoudi neoT=new Tragoudi(null,null,null,null);
            Scanner input5=new Scanner(System.in);
            System.out.print("\n\nEisagete ton Kallitexnh pou thelete na psaksete: ");
            String onomaKallitexnh=input5.nextLine();
            System.out.print("\n\nO KALLITEXNHS  **"+onomaKallitexnh+"**  EXEI GRAPSEI\n\n");
            for(int i=0;i<playlist.getMegethosPlaylist();i++){
            if(onomaKallitexnh.equalsIgnoreCase(playlist.getKallitexnhs(i))){ //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ ΚΑΙ ΕΜΦΑΝΙΣΗ ΤΗΣ ΛΙΣΤΑ ΜΕ ΤΑ ΤΡΑΓΟΥΔΙΑ ΠΟΥ ΕΧΕΙ ΓΡΑΨΕΙ
                    System.out.print("#"+(i+1)+"    TITLOS:  "+playlist.getTitlos(i)+"    KALLITEXNHS:  "+playlist.getKallitexnhs(i)+"    DIARKEIA:  "+playlist.getDiarkeia(i)+"    ALBUM:  "+playlist.getAlbum(i)+"\n");
                }
            }
            System.out.print("\n\n\n\n");
        }
       
       
       static void emfanishKallitexnwn() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΚΑΛΛΙΤΕΧΝΩΝ 
       {
           System.out.print("\n\n");
           for(int i=0;i<playlist.getMegethosPlaylist();i++){
               boolean diaxorismos=false; 
               for(int j=0;j<i;j++){
                   if(playlist.getKallitexnhs(i).equalsIgnoreCase(playlist.getKallitexnhs(j))){
                       diaxorismos=true; //ΕΛΕΓΧΟΣ ΑΝ ΕΙΝΑΙ TRUE Η ΔΗΛΩΣΗ ΕΝΤΟΣ ΤΗΣ IF
                       break;
                   }
               }
               if(!diaxorismos){
               System.out.print("#"+(i+1)+"  "+playlist.getKallitexnhs(i)+"\n"); //ΕΜΦΑΝΙΣΗ ΤΩΝ ΚΑΛΛΙΤΕΧΝΩΝ 
               }
           }
           
           System.out.print("\n\n\n\n");
       }
       
       
       
       static void emfanishAlbum() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΑΛΜΠΟΥΜ
       {
           System.out.print("\n\n");
           for(int i=0;i<playlist.getMegethosPlaylist();i++){
               boolean diaxorismos=false;
               for(int j=0;j<i;j++){
                   if(playlist.getAlbum(i).equalsIgnoreCase(playlist.getAlbum(j))){
                       diaxorismos=true;
                       break;
                   }
               }
               if(!diaxorismos){
               System.out.print("#"+(i+1)+"  "+playlist.getAlbum(i)+"\n");
               }
           }
           
           System.out.print("\n\n\n\n");
       }
       
       
       
       static void anazhthshAlbum() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΑΝΑΖΗΤΗΣΗ ΣΥΓΚΕΚΡΙΜΕΝΟΥ ΑΛΜΠΟΥΜ ΚΑΙ ΤΗΝ ΕΜΦΑΝΙΣΗ ΤΩΝ ΤΡΑΓΟΥΔΙΩΝ ΠΟΥ ΠΕΡΙΕΧΕΙ
        {
           Tragoudi neoT=new Tragoudi(null,null,null,null);
            Scanner input6=new Scanner(System.in);
            System.out.print("\n\nEisagete to album pou thelete na psaksete: ");
            String onomaAlbum=input6.nextLine();
            System.out.print("\n\nSTO ALBUM  **"+onomaAlbum+"**  YPARXOUN\n\n");
            for(int i=0;i<playlist.getMegethosPlaylist();i++){
            if(onomaAlbum.equalsIgnoreCase(playlist.getAlbum(i))){
                
                    System.out.print("#"+(i+1)+"    TITLOS:  "+playlist.getTitlos(i)+"    KALLITEXNHS:  "+playlist.getKallitexnhs(i)+"    DIARKEIA:  "+playlist.getDiarkeia(i)+"    ALBUM:  "+playlist.getAlbum(i)+"\n");
                }
            }
            System.out.print("\n\n\n\n");
        }

}