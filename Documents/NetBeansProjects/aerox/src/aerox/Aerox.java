/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerox;

/**
 *
 * @author MOKLET-1
 */
public class Aerox {
    
    int jmlRoda;
    private long harga;
    protected String bahanBakar;
    
     public int getRoda(){
        return jmlRoda;
    }
    public void setRoda(int jmlRoda){
        this.jmlRoda=jmlRoda;
    }   
    public long getHarga(){
        return harga;
    }
    public void setHarga(long harga){
        this.harga = harga;
    }
    public void tampilkan(){
    System.out.println("Jumlah roda :"+getRoda());
    System.out.println("Harga motor :"+getHarga());
    
    }
        public static void main(String[] args) {
   SepedaMotor aerox=new SepedaMotor();
   honda.jmlRoda=2;
   honda.harga = 1000000;
   honda.tampilkan();
}       

    
}

 
    /**
     * @param args the command line arguments
     */
  
        // TODO code application logic here
    
