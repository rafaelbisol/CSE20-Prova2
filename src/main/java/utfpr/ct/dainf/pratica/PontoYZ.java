/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author
 */
public class PontoYZ extends Ponto2D{
    
    public PontoYZ(){
        super();
    }
    
    public PontoYZ(double x, double z){
        super(x, 0, z);
    }
    
    @Override
    public String toString(){
        String res = this.getNome()+"("+this.getY()+","+this.getZ()+")";
        return res;
    }
    
}
