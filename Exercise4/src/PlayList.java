/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.ArrayList;

public class PlayList {
    private ArrayList<Tragoudi> playlist;
    private Tragoudi tragoudi=new Tragoudi(null,null,null,null);
    
    
    public PlayList(){ //ΔΟΜΗΤΗΣ ΤΩΝ ΛΕΙΤΟΥΡΓΙΩΝ ΤΟΥ PLAYLIST ΜΕ ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ
        playlist=new ArrayList<Tragoudi>();
    }
    public void prostheshTragoudiou(Tragoudi tragoudi){ //ΣΥΑΝΡΤΗΣΗ ΓΙΑ ΠΡΟΣΘΕΣΗ ΤΡΑΓΟΥΔΙΟΥ ΣΤΟ PLAYLIST
        playlist.add(tragoudi);
    }
    public int getMegethosPlaylist(){ //ΑΠΟΘΗΚΕΥΣΗ ΤΟΥ ΜΕΓΕΘΟΥΣ ΤΟΥ PLAYLIST ΣΕ ΜΙΑ GET ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΕΥΚΟΛΗ ΧΡΗΣΙΜΟΤΗΤΑ ΤΗΣ
        return playlist.size();
    }
    public String getKallitexnhs(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getKallitexnhs ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΜΕ ΤΟ PLAYLIST
        return playlist.get(thesh).getKallitexnhs();
    }
    public String getTitlos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTitlos ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΜΕ ΤΟ PLAYLIST
        return playlist.get(thesh).getTitlos();
    }
    public String getDiarkeia(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getDiarkeia ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΜΕ ΤΟ PLAYLIST
        return playlist.get(thesh).getDiarkeia();
    }
    public String getAlbum(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getAlbum ΤΟΥ ΤΡΑΓΟΥΔΙΟΥ ΜΕ ΤΟ PLAYLIST
        return playlist.get(thesh).getAlbum();
    }
    public void neosKallitexnhs(int thesh,String kallitexnhs){ //ΓΙΑ ΤΗΝ ΕΙΣΑΓΩΓΗ ΝΕΟΥ ΚΑΛΛΙΤΕΧΝΗ ΣΤΟ ΤΡΑΓΟΥΔΙ
        playlist.get(thesh).setKallitexnhs(kallitexnhs);
    }
    public void neosTitlos(int thesh,String titlos){ //ΓΙΑ ΤΗΝ ΕΙΣΑΓΩΓΗ ΝΕΟΥ ΤΙΤΛΟΥ ΣΤΟ ΤΡΑΓΟΥΔΙ
        playlist.get(thesh).setTitlos(titlos);
    }
    public void neaDiarkeia(int thesh,String diarkeia){ //ΓΙΑ ΤΗΝ ΕΙΣΑΓΩΓΗ ΝΕΑΣ ΔΙΑΡΚΕΙΑΣ ΣΤΟ ΤΡΑΓΟΥΔΙ
        playlist.get(thesh).setDiarkeia(diarkeia);
    } 
    public void neoAlbum(int thesh,String album){ //ΓΙΑ ΤΗΝ ΕΙΣΑΓΩΓΗ ΝΕΟΥ ΑΛΜΠΟΥΜ ΣΤΟ ΤΡΑΓΟΥΔΙ
        playlist.get(thesh).setAlbum(album);
    }
    public void diagrafhTragoudiou(int thesh){ //ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΤΡΑΓΟΥΔΙΟΥ
         playlist.remove(thesh);
    }
   }
    

